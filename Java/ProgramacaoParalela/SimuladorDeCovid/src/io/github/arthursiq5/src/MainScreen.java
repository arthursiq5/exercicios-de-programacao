/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author arthur
 */
public class MainScreen extends JFrame implements Runnable {
    
    private static final String IMG_PATH = "/io/github/arthursiq5/img/";
    private static final String IMG_EXTENSION = ".gif";
    private JLabel pessoas[] = new JLabel[this.MAX_PESSOAS];
    private final int MAX_PESSOAS = 30;
    private int vel = 50;
    

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        
        for(int i = 0; i < this.MAX_PESSOAS; i++){
            int icone = (int) (Math.random() * 4);
            this.pessoas[i] = new JLabel();
            this.pessoas[i].setIcon(new ImageIcon(getClass().getResource(IMG_PATH + "im" + icone + this.IMG_EXTENSION)));
            
            int xIni = (int) (Math.random() * this.gamePanel.getWidth());
            int yIni = (int) (Math.random() * this.gamePanel.getHeight());
            
            this.pessoas[i].setBounds(xIni, yIni, 32, 32);
            this.gamePanel.add(this.pessoas[i]);
            
        }
        pack();
        
        Thread thread = new Thread(this);
        thread.start();
    }
    
    @Override
    public void run() {
         int x[] = new int[this.MAX_PESSOAS];
        int y[] = new int[this.MAX_PESSOAS];

        for (int i = 0; i < this.MAX_PESSOAS; i++) {
            x[i] = 1;
            y[i] = 1;
        }

        while (true) {
            for (int i = 0; i < this.MAX_PESSOAS; i++) {

                int o = 1;

                if (Math.random() > 0.95) {
                    x[i] *= -1;
                }

                if (Math.random() > 0.95) {
                    y[i] *= -1;
                }

                int s = (int) (Math.random() * 10);
                if (s > 8) {
                    o = (int) (Math.random() * 4);
                    if (Math.random() > 0.95) {
                        o *= -1;
                    }
                }

                if (pessoas[i].getX() + pessoas[i].getWidth() > gamePanel.getWidth()) {
                    x[i] *= -o;
                }

                if (pessoas[i].getX() + x[i] < 0) {
                    x[i] *= -o;
                }

                if (pessoas[i].getY() + pessoas[i].getHeight() > gamePanel.getHeight()) {
                    y[i] *= -o;
                }

                if (pessoas[i].getY() + y[i] < 0) {
                    y[i] *= -o;
                }

                // buscar pela mulher ideal
                if (Math.random() > 0.5) {
                    this.pessoas[0].setIcon(new javax.swing.ImageIcon(getClass().getResource(this.IMG_PATH + "im4" + this.IMG_EXTENSION)));
                    if (x[0] < x[i]) {
                        x[i]-=1;
                    } else {
                        x[i]+=1;
                    }
                    
                    if (y[0] < y[i]) {
                        y[i]-=1;
                    } else {
                        y[i]+=1;
                    }
                }

                this.pessoas[i].setLocation(pessoas[i].getX() + x[i], pessoas[i].getY() + y[i]);
            }

            try {

                Thread.sleep(vel);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamePanel = new javax.swing.JPanel();
        paStatus = new javax.swing.JPanel();
        paConfig = new javax.swing.JPanel();
        increaseSpeedButton = new javax.swing.JButton();
        decreaseSpeedButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        aboutButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gamePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout paStatusLayout = new javax.swing.GroupLayout(paStatus);
        paStatus.setLayout(paStatusLayout);
        paStatusLayout.setHorizontalGroup(
            paStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );
        paStatusLayout.setVerticalGroup(
            paStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        increaseSpeedButton.setText("Vel+");
        increaseSpeedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseSpeedButtonActionPerformed(evt);
            }
        });

        decreaseSpeedButton.setText("Vel -");
        decreaseSpeedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseSpeedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paConfigLayout = new javax.swing.GroupLayout(paConfig);
        paConfig.setLayout(paConfigLayout);
        paConfigLayout.setHorizontalGroup(
            paConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(increaseSpeedButton)
                    .addComponent(decreaseSpeedButton))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        paConfigLayout.setVerticalGroup(
            paConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(increaseSpeedButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decreaseSpeedButton)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        jMenu1.setText("Ajuda");

        aboutButton.setText("Sobre");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });
        jMenu1.add(aboutButton);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addComponent(paStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void increaseSpeedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increaseSpeedButtonActionPerformed
        this.vel--;
    }//GEN-LAST:event_increaseSpeedButtonActionPerformed

    private void decreaseSpeedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreaseSpeedButtonActionPerformed
        this.vel++;
    }//GEN-LAST:event_decreaseSpeedButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Aplicação de simulação de COVID-19 "
                + "desenvolvida durante as aulas de programação paralela\n\n"
                + "Por: Arthur Siqueira\n"
                + "Ano: 2021",
                "About",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutButton;
    private javax.swing.JButton decreaseSpeedButton;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JButton increaseSpeedButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel paConfig;
    private javax.swing.JPanel paStatus;
    // End of variables declaration//GEN-END:variables
}
