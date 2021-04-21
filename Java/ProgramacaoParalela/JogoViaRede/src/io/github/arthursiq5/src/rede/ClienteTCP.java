/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.rede;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClienteTCP {

    public static final int PORTA = 5000;

    public static void main(String[] args) {
        try {
            Socket cliente = new Socket("127.0.0.1", PORTA);

            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());

            String mens = (String) entrada.readObject();
            System.out.println("O servidor disse: " + mens);

            String aviso = "Meus pêsames";
            saida.writeObject(aviso);

            entrada.close();
            saida.close();
            cliente.close();

            System.out.println("Conexão encerrada");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
