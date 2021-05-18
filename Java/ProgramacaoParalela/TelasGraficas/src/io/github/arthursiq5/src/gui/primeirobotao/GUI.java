/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.gui.primeirobotao;

import javax.swing.JFrame;

/**
 *
 * @author arthur
 */
public class GUI {

    public static void main(String[] args) {
        Botao botao = new Botao();

        botao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        botao.setSize(300, 100);
        botao.setVisible(true);
    }
}
