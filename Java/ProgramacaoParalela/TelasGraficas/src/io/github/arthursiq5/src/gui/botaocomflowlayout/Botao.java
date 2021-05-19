/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.gui.botaocomflowlayout;

import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author arthur
 */
public class Botao extends JFrame {

    private JButton ok;
    private JButton cancelar;

    public Botao() {
        super("Criando botões");
        this.setLayout(new FlowLayout());
        
        Icon xicara = new ImageIcon(getClass().getResource("xicara.png"));
        this.ok = new JButton("Ok", xicara);
        this.cancelar = new JButton("Cancelar");
        
        this.add(this.ok);
        this.add(this.cancelar);
    }
}
