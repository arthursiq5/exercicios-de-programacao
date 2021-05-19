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
public class MinhaThreadRunnableTeste {

    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 600);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 900);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 100, "");
        
        Thread t1 = new Thread(thread1);
        t1.start();
        Thread t2 = new Thread(thread2);
        t2.start();
    }
}
