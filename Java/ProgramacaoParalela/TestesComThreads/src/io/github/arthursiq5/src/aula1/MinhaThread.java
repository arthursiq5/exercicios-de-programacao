/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.aula1;

/**
 *
 * @author arthur
 */
public class MinhaThread extends Thread {

    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        this.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(this.nome + " - contador " + i);
                Thread.sleep(this.tempo);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
