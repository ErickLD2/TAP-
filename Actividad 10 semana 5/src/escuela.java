/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class escuela extends javax.swing.JFrame {

    /**
     * Creates new form escuela
     */
    public escuela() {
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

        si = new javax.swing.JButton();
        no = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        holint = new javax.swing.JLabel();
        holi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        si.setText("picale ");
        si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siActionPerformed(evt);
            }
        });
        getContentPane().add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 90, -1));

        no.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 160, 38));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("te gustan las montañas?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, 40));

        holint.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        holint.setForeground(new java.awt.Color(204, 204, 0));
        holint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(holint, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 180, 40));

        holi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/montañas/2020091113001900-75A32021BE3512D7AA96B2D72F764411.jpg"))); // NOI18N
        getContentPane().add(holi, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 510, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siActionPerformed
        holint.setText(no.getText());
    }//GEN-LAST:event_siActionPerformed

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
            java.util.logging.Logger.getLogger(escuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(escuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(escuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(escuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new escuela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel holi;
    private javax.swing.JLabel holint;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField no;
    private javax.swing.JButton si;
    // End of variables declaration//GEN-END:variables
}