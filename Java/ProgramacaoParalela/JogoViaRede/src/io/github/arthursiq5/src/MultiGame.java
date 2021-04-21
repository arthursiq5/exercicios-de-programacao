/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src;

import io.github.arthursiq5.src.rede.SujaRede;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.swing.JTextArea;

/**
 *
 * @author wolfi
 */
public class MultiGame {

    private static final int MAX_PAUSA = 500;
    private static final int LINHA_MAXIMA = 25;
    private static final int COLUNA_MAXIMA = 45;
    private static final char SIM_LIVRE = '.';
    private static final char SIM_BOLA = '@';
    private static final int NUN_PLAYERS = 2;

    private static final int PORTA = 8000;

    private static char campo[][] = new char[LINHA_MAXIMA][COLUNA_MAXIMA];

    private static char players[] = new char[NUN_PLAYERS * 2];

    private static DatagramSocket socket = null;
    private static DatagramPacket packet = null;

    private static void inicializaJogo() {
        for (int i = 0; i < LINHA_MAXIMA; i++) {
            for (int j = 0; j < COLUNA_MAXIMA; j++) {
                campo[i][j] = SIM_LIVRE;
            }
        }

        // simobols iniciais dos times
        char vetPos[] = {'A', 'a'};

        // sortear posicao inicial dos jogadores
        for (int p = 0; p < 2; p++) {
            for (int i = 0; i < NUN_PLAYERS; i++) {  // time 1
                players[i] = (char) (vetPos[p] + i);

                int lin = -1;
                int col = -1;
                do {
                    lin = (int) (Math.random() * LINHA_MAXIMA);
                    col = (int) (Math.random() * COLUNA_MAXIMA);

                } while (campo[lin][col] != SIM_LIVRE);
                campo[lin][col] = players[i];
            }
        }

        // posicao inicial da bola
        int lin = -1;
        int col = -1;
        do {
            lin = (int) (Math.random() * LINHA_MAXIMA);
            col = (int) (Math.random() * COLUNA_MAXIMA);

        } while (campo[lin][col] != SIM_LIVRE);
        campo[lin][col] = SIM_BOLA;

        try {

            socket = new DatagramSocket(PORTA);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    private static Boolean vitoria(boolean b) {
        if (b == true){
            System.out.println("\nVITÓRIA DO TIME DE CIMA\n");
        }else if(b == false) {
            System.out.println("\nVITÓRIA DO TIME DE BAIXO\n");   
        }
        return b;
    }

    private static void limpaTela() {
        for (int i = 0; i < 35; i++) {
            System.out.print("\n");
        }
    }

    private static void mostraCampo() {
        limpaTela();

        System.out.println();
        for (int i = 0; i < COLUNA_MAXIMA; i++) {
            System.out.print("a");
        }

        for (int i = 0; i < LINHA_MAXIMA; i++) {
            System.out.println();
            for (int j = 0; j < COLUNA_MAXIMA; j++) {
                System.out.print(campo[i][j]);
            }
        }
        System.out.println("");

        for (int i = 0; i < COLUNA_MAXIMA; i++) {
            System.out.print("A");
        }

        /*
        try {
            Thread.sleep(MAX_PAUSA);
        } catch (Exception e) {
            e.printStackTrace();
        }
         */
    }

    public static void movePlayer(char player, char movimento) {

        int lPlayer = getLinPlayer(player);
        int cPlayer = getColPlayer(player);

        int brow = lPlayer;
        int bcol = cPlayer;

        movimento = Character.toLowerCase(movimento);

        if (lPlayer == -1 || cPlayer == -1) {
            return;
        }

        int cOff = 0, rOff = 0;

        if (movimento == 'w' || movimento == 'x') {
            rOff = movimento == 'w' ? -1 : 1;
        } else {
            cOff = movimento == 'a' ? -1 : 1;
        }

        lPlayer += rOff;
        if (lPlayer <= 0 || lPlayer >= LINHA_MAXIMA) {
            return;
        }

        cPlayer = (cPlayer + cOff) % COLUNA_MAXIMA;
        if (cPlayer < 0) {
            cPlayer = COLUNA_MAXIMA - 1;
        }

        char celula = campo[lPlayer][cPlayer];

        if (celula == SIM_BOLA) {
            int bolaLinha = (lPlayer + rOff * 2);
            int bolaColuna = (cPlayer + cOff * 2);

            if (bolaLinha < 0) {
                vitoria(true);
                System.exit(0);
                return;
            } else if (bolaLinha >= LINHA_MAXIMA) {
                vitoria(false);
                System.exit(0);
                return;
            }

            if (bolaColuna < 0 || bolaColuna >= COLUNA_MAXIMA) {
                return;
            }
            SujaRede.enviaMensagem(String.format("ballCol %d, %d", bolaLinha, bolaColuna));

            if (campo[bolaLinha][bolaColuna] != SIM_LIVRE) {
                return;
            }

            campo[bolaLinha][bolaColuna] = SIM_BOLA;
        } else if (celula != SIM_LIVRE) {
            return;
        }

        campo[brow][bcol] = SIM_LIVRE;
        campo[lPlayer][cPlayer] = player;
    }
    // player, simbolo valido dos jogadores no campo
    // movimentos:
    //         w ou W --> para cima
    //         x ou X --> para baixo
    //         a ou A --> para esquerda
    //         d ou D --> para direita
    //         sempre que for para cima da bola ela vai para o mesmo lado do
    //         movimento, no caso da latera, atravessa e começa no outro lado
    //         sempre que chegar a um extremo, time inverso ganha.
    // aqui será recebida um pacote UDP com a movimentação de determinado jogador

    public static void aguardaPlayer() {
        try {

            byte[] buffer = new byte[50];

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            String efetiva = new String(buffer, 0, packet.getLength());
            if (efetiva.startsWith("movePlayer(") && efetiva.endsWith(")")) {
                movePlayer(efetiva.charAt(11), efetiva.charAt(13));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getColPlayer(char player) {
        int pos = -1;
        for (int i = 0; i < LINHA_MAXIMA; i++) {
            for (int j = 0; j < COLUNA_MAXIMA; j++) {
                if (campo[i][j] == player) {
                    pos = j;
                    i = LINHA_MAXIMA;  // matar o loop externo rapidamente ou usar return
                    break;
                }
            }
        }
        return pos;
    }

    public static int getLinPlayer(char player) {
        int pos = -1;
        for (int i = 0; i < LINHA_MAXIMA; i++) {
            for (int j = 0; j < COLUNA_MAXIMA; j++) {
                if (campo[i][j] == player) {
                    pos = i;
                    j = COLUNA_MAXIMA;  // matar o loop externo rapidamente ou usar return
                    break;
                }
            }
        }
        return pos;
    }

    public static int getColBola() {
        int k = -1;
        for (int i = 0; i < LINHA_MAXIMA; i++) {
            for (int j = 0; j < COLUNA_MAXIMA; j++) {
                if (campo[i][j] == SIM_BOLA) {
                    k = j;
                    i = LINHA_MAXIMA;  // matar o loop externo rapidamente ou usar return
                    break;
                }
            }
        }
        return k;
    }

    public static int getLinBola() {
        int pos = -1;
        for (int i = 0; i < LINHA_MAXIMA; i++) {
            for (int j = 0; j < COLUNA_MAXIMA; j++) {
                if (campo[i][j] == SIM_BOLA) {
                    pos = i;
                    j = COLUNA_MAXIMA;  // matar o loop externo rapidamente ou usar return
                    break;
                }
            }
        }
        return pos;
    }

    public static void main(String[] args) {

        inicializaJogo();

        while (true) {

            mostraCampo();

            aguardaPlayer();

        }

    }

}