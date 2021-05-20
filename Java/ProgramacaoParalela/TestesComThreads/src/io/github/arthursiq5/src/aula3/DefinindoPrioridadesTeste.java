/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.aula3;

import io.github.arthursiq5.src.aula2.MinhaThreadRunnable;

/**
 *
 * @author arthur
 */
public class DefinindoPrioridadesTeste {

    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        // quanto maior o número maior a prioridade
        t1.setPriority(5);
        t2.setPriority(3);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}
