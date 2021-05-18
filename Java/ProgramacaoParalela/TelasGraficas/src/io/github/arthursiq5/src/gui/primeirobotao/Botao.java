/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.gui.primeirobotao;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author arthur
 */
public class Botao extends JFrame {

    private JButton ok;

    public Botao() {
        super("Criando botões");

        this.ok = new JButton("OK");
        this.add(this.ok);
    }
}
