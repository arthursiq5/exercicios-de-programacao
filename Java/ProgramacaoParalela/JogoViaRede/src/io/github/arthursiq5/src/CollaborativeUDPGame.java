/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src;

import java.net.DatagramPacket;

import java.net.DatagramSocket;



public class CollaborativeUDPGame {



    private static final int MAX_X = 15;

    private static final int MAX_Y = 15;

    private static final int MAX_M = 10;



    private static final int PORTA = 5000;

    private static final int TAM_BUFFER = 10;



    public static void main(String[] args) {

        try {



            DatagramSocket serverSocket = new DatagramSocket(PORTA);



            byte[] bufferEntrada = new byte[TAM_BUFFER];



            char matGame[][] = new char[MAX_X][MAX_Y];



            for (int i = 0; i < matGame.length; i++) {

                for (int j = 0; j < matGame[0].length; j++) {

                    matGame[i][j] = '.';

                }

            }

            for (int i = 0; i < MAX_M; i++) {

                int x = (int) (Math.random() * MAX_X);

                int y = (int) (Math.random() * MAX_Y);

                matGame[x][y] = '*';

            }



            int heroX = (int) (Math.random() * MAX_X);

            int heroY = (int) (Math.random() * MAX_Y);



            int portalX = (int) (Math.random() * MAX_X);

            int portalY = (int) (Math.random() * MAX_Y);

            matGame[portalX][portalY] = '#';



            while (!(heroX == portalX && heroY == portalY)) {

                matGame[heroX][heroY] = 'X';

                for (int i = 0; i < matGame.length; i++) {

                    System.out.println("");

                    for (int j = 0; j < matGame[0].length; j++) {

                        System.out.print(matGame[i][j] + " ");

                    }

                }



                Thread.sleep(100);



                DatagramPacket receivePacket = new DatagramPacket(bufferEntrada, bufferEntrada.length);

                serverSocket.receive(receivePacket);

                String recebido = new String(receivePacket.getData());



                if (recebido.startsWith("C")) {

                    if (heroY > 1) {

                        heroY--;

                    }

                }

                if (recebido.startsWith("B")) {

                    if (heroY < matGame.length - 1) {

                        heroY++;

                    }

                }

                if (recebido.startsWith("E")) {

                    if (heroX > 1) {

                        heroX--;

                    }

                }

                if (recebido.startsWith("D")) {

                    if (heroX < matGame[0].length - 1) {

                        heroX++;

                    }

                }

                if (matGame[heroX][heroY] == '*') {

                    System.out.println("Voce morreu!!!!");

                    break;

                }

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}