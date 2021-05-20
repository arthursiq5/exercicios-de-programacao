/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.aula4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arthur
 */
public class Calculadora {

    public int soma;

    public synchronized int somaArray(int[] array) {
        this.soma = 0;

        for (int i = 0; i < array.length; i++) {
            this.soma += array[i];

            System.out.println("Executando a soma " + Thread.currentThread().getName()
                    + " somando o valor " + array[i] + " com total de " + soma);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return this.soma;
    }
}
