/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.rede;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.swing.JPanel;

public class SujaRede extends JPanel {

    public static DatagramSocket socket = null;
    public static int porta = 8000;
    public static InetAddress address = null;
    public static DatagramPacket packet = null;
    public static byte[] buffer = null;

    public static void enviaMensagem(String s) {
        try {
            if (address == null) {address = InetAddress.getByName("localhost");}
             socket = new DatagramSocket();
            buffer = s.getBytes();
            packet = new DatagramPacket(buffer, buffer.length, address, porta);
            socket.send(packet);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {

            socket = new DatagramSocket();
            
            address = InetAddress.getByName("localhost");
            socket.setBroadcast(true);

            //int i = 0;
            //while (true) {
            //for (int i = 0; i < 4; i++) {
            String mensagem = "movePlayer(b,w)";

            enviaMensagem(mensagem);
            Thread.sleep(100);
            //}

            // }
            //socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
