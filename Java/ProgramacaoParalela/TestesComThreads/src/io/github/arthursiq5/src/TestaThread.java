/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src;

/**
 *
 * @author arthur
 */
public class TestaThread extends Thread {
    
    private String m = null;
    private int n = 0;
    
    public TestaThread(String m, int n)
    {
        this.m = m;
        this.n = n;
        run();
    }
    
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.n + "principal" + i + "" + this.m);
        }
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new TestaThread("vaca", i);
        }
    }
}
