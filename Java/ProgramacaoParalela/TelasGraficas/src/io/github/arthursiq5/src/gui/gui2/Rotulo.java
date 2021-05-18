/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.gui.gui2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/**
 *
 * @author arthur
 */
public class Rotulo extends JFrame {
    private JLabel label;
    
    public Rotulo(){
        super("Usando rótulos em JFrame");
        
        Icon xicara = new ImageIcon(getClass().getResource("xicara.png"));
        this.label = new JLabel("Símbolo do Java", xicara, SwingConstants.CENTER);
        this.label.setHorizontalTextPosition(SwingConstants.CENTER);
        this.label.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        this.add(this.label);
    }
}
