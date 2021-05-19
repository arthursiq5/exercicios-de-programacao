/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.aula2;

/**
 *
 * @author arthur
 */
public class MinhaThreadRunnable implements Runnable {

    private String nome;
    private int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }
    
    /**
     * se for passado algo como terceiro parâmetro, a thread é automaticamente iniciada
     * @param nome
     * @param tempo
     * @param run 
     */
    public MinhaThreadRunnable(String nome, int tempo, String run) {
        this.nome = nome;
        this.tempo = tempo;
        
        Thread t = new Thread(this);
        t.start();
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
