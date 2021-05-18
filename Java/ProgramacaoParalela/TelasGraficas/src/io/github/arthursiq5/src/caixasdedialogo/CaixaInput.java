/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.caixasdedialogo;

import javax.swing.JOptionPane;

/**
 *
 * @author arthur
 */
public class CaixaInput {

    public static void main(String[] args) {
        String nome;

        nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, 
                nome + "? Que nome horrível\n"
                     + "Mas ao menos você sabe programar"
        );
    }
}
