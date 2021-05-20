/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.aula2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arthur
 */
public class TesteComIsAlive {
    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 600);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 900);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 100);
        
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        t1.start();
        t2.start();
        t3.start();
        
        while(t1.isAlive() || t2.isAlive() || t3.isAlive()){
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(TesteComIsAlive.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("Programa finalizado");
    }
}
