/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.gui.gui1;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author arthur
 */
public class Rotulo extends JFrame {
    private JLabel texto;
    
    public Rotulo(){
        super("Usando rótulos em JFrame");
        
        this.texto = new JLabel("Meu primeiro JLabel");
        this.add(this.texto);
    }
}
