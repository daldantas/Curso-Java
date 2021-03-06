/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamponoffxor;

import java.awt.Color;

/**
 *
 * @author daldantas
 */
public class LampOnOffXor extends javax.swing.JFrame {

    /**
     * Creates new form OpLogRel
     */
    public LampOnOffXor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lamp = new javax.swing.JLabel();
        interruptor1 = new javax.swing.JButton();
        interruptor2 = new javax.swing.JButton();
        lblXor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.gray);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lamp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lamp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lampOff.png"))); // NOI18N
        lamp.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        interruptor1.setBackground(java.awt.Color.green);
        interruptor1.setText("ON");
        interruptor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interruptor1ActionPerformed(evt);
            }
        });

        interruptor2.setBackground(java.awt.Color.green);
        interruptor2.setText("ON");
        interruptor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interruptor2ActionPerformed(evt);
            }
        });

        lblXor.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        lblXor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXor.setText("XOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lamp)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(interruptor1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2))
                        .addComponent(interruptor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblXor, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(interruptor2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblXor)
                        .addGap(18, 18, 18)
                        .addComponent(interruptor1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lamp, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

// <//<editor-fold defaultstate="collapsed" desc="interruptor1">
    private void interruptor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interruptor1ActionPerformed
        
        boolean int1Inv, int2EstadoAtual;
        String lampada;
        
        int1Inv = !("ON".equals(interruptor1.getText()));
        int2EstadoAtual = "ON".equals(interruptor2.getText());
        
        lampada = (int1Inv ^ int2EstadoAtual) ? "/imagens/lampOn.png" : "/imagens/lampOff.png";
        
        interruptor1.setBackground(int1Inv ? Color.GREEN : Color.RED); 
        interruptor1.setText( int1Inv? "ON" : "OFF");
        lamp.setIcon(new javax.swing.ImageIcon(getClass().getResource(lampada)));
    }//GEN-LAST:event_interruptor1ActionPerformed
//</editor-fold>
    
// <//<editor-fold defaultstate="collapsed" desc="interruptor2">
    private void interruptor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interruptor2ActionPerformed
                
        boolean int2Inv, int1EstadoAtual;
        String lampada;
        
        int2Inv = !("ON".equals(interruptor2.getText()));
        int1EstadoAtual = "ON".equals(interruptor1.getText());
        
        lampada = (int2Inv ^ int1EstadoAtual) ? "/imagens/lampOn.png" : "/imagens/lampOff.png";
        
        interruptor2.setBackground(int2Inv ? Color.GREEN : Color.RED); 
        interruptor2.setText( int2Inv ? "ON" : "OFF");
        lamp.setIcon(new javax.swing.ImageIcon(getClass().getResource(lampada)));
        
    }//GEN-LAST:event_interruptor2ActionPerformed
//</editor-fold>
    
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
            java.util.logging.Logger.getLogger(LampOnOffXor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LampOnOffXor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LampOnOffXor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LampOnOffXor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LampOnOffXor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton interruptor1;
    private javax.swing.JButton interruptor2;
    private javax.swing.JLabel lamp;
    private javax.swing.JLabel lblXor;
    // End of variables declaration//GEN-END:variables
}
