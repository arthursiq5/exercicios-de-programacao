/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.gui.gui2;

import javax.swing.JFrame;

/**
 *
 * @author arthur
 */
public class GUI {
    public static void main(String[] args) {
        Rotulo rotulo = new Rotulo();
        
        rotulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rotulo.setSize(300, 100);
        rotulo.setVisible(true);
    }
}
