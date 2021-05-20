/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.aula4;

/**
 *
 * @author arthur
 */
public class Teste {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ThreadSoma t1 = new ThreadSoma("#1", array);
        ThreadSoma t2 = new ThreadSoma("#2", array);
    }
}
