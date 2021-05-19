/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.gui.botaocomflowlayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author arthur
 */
public class ButtonHandler implements ActionListener {
    
    private JButton ok;
    private JButton cancelar;

    public ButtonHandler(JButton ok, JButton cancelar) {
        this.ok = ok;
        this.cancelar = cancelar;
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.ok) {
            JOptionPane.showMessageDialog(null, "O botão OK foi clicado");
        }

        if (evento.getSource() == this.cancelar) {
            JOptionPane.showMessageDialog(null, "O botão CANCELA foi clicado");
        }
    }
    
}
