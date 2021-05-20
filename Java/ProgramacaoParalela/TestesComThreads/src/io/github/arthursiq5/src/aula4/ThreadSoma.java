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
public class ThreadSoma implements Runnable {

    private String nome;
    private int[] nums;
    private static Calculadora calc = new Calculadora();

    public ThreadSoma(String nome, int[] nums) {
        this.nome = nome;
        this.nums = nums;
        new Thread(this, this.nome).start();
    }

    public void run() {

        System.out.println(this.nome + " iniciada");

        int soma = ThreadSoma.calc.somaArray(this.nums);

        System.out.println("Resultado da soma para thread " + this.nome + " é: " + soma);

        System.out.println(this.nome + " terminada");
    }

}
