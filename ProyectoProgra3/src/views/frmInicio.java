/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.BorderLayout;
import java.awt.Cursor;

/**
 *
 * @author Ever Vásquez
 */
public class frmInicio extends javax.swing.JFrame {

    /**
     * Creates new form frmInicio
     */
    public frmInicio() {
        initComponents();
        jpInicio panel = new jpInicio();
        panel.setSize(pnlContenedor.getWidth(), pnlContenedor.getHeight());
        panel.setLocation(0, 0);
        pnlContenedor.removeAll();
        pnlContenedor.add(panel, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLateral = new javax.swing.JPanel();
        btnAgregarTallerPonencia = new javax.swing.JButton();
        btnInscribirEnTaller = new javax.swing.JButton();
        btnAgregarEstudiante = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnLogo = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        pnlContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(24, 30, 54));
        setResizable(false);

        pnlLateral.setBackground(new java.awt.Color(24, 30, 54));

        btnAgregarTallerPonencia.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAgregarTallerPonencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/servicios-digitales.png"))); // NOI18N
        btnAgregarTallerPonencia.setText("Nuevo taller - ponencia");
        btnAgregarTallerPonencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarTallerPonencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTallerPonenciaActionPerformed(evt);
            }
        });

        btnInscribirEnTaller.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnInscribirEnTaller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/nuevo-documento.png"))); // NOI18N
        btnInscribirEnTaller.setText("Inscribir taller - ponencia");
        btnInscribirEnTaller.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInscribirEnTaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirEnTallerActionPerformed(evt);
            }
        });

        btnAgregarEstudiante.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAgregarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/nuevo.png"))); // NOI18N
        btnAgregarEstudiante.setText("Nuevo estudiante");
        btnAgregarEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEstudianteActionPerformed(evt);
            }
        });

        btnInicio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/home.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnLogo.setBackground(new java.awt.Color(24, 30, 54));
        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Logo2_1.png"))); // NOI18N
        btnLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoActionPerformed(evt);
            }
        });

        btnEstadisticas.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/estadisticas.png"))); // NOI18N
        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLateralLayout = new javax.swing.GroupLayout(pnlLateral);
        pnlLateral.setLayout(pnlLateralLayout);
        pnlLateralLayout.setHorizontalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInscribirEnTaller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAgregarTallerPonencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAgregarEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLateralLayout.createSequentialGroup()
                .addComponent(btnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarTallerPonencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInscribirEnTaller, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        pnlContenedor.setBackground(new java.awt.Color(88, 88, 160));

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 954, Short.MAX_VALUE)
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstudianteActionPerformed
        // TODO add your handling code here:
        btnAgregarEstudiante.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        jpNuevoEstudiante nEstudiante = new jpNuevoEstudiante();
        nEstudiante.setSize(pnlContenedor.getWidth(), pnlContenedor.getHeight());
        nEstudiante.setLocation(0, 0);
        pnlContenedor.removeAll();
        pnlContenedor.add(nEstudiante, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
        btnAgregarEstudiante.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnAgregarEstudianteActionPerformed

    private void btnAgregarTallerPonenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTallerPonenciaActionPerformed
        // TODO add your handling code here:
        btnAgregarTallerPonencia.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        jpTalleresPonencias nTallerPonencia = new jpTalleresPonencias();
        nTallerPonencia.setSize(pnlContenedor.getWidth(), pnlContenedor.getHeight());
        nTallerPonencia.setLocation(0, 0);
        pnlContenedor.removeAll();
        pnlContenedor.add(nTallerPonencia, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
        btnAgregarTallerPonencia.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnAgregarTallerPonenciaActionPerformed

    private void btnInscribirEnTallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirEnTallerActionPerformed
        // TODO add your handling code here:
        btnInscribirEnTaller.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        jpInscribir inscribir = new jpInscribir();
        inscribir.setSize(pnlContenedor.getWidth(), pnlContenedor.getHeight());
        inscribir.setLocation(0, 0);
        pnlContenedor.removeAll();
        pnlContenedor.add(inscribir, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
        btnInscribirEnTaller.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnInscribirEnTallerActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        btnInicio.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        jpInicio panel = new jpInicio();
        panel.setSize(pnlContenedor.getWidth(), pnlContenedor.getHeight());
        panel.setLocation(0, 0);
        pnlContenedor.removeAll();
        pnlContenedor.add(panel, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
        btnInicio.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoActionPerformed
        // TODO add your handling code here:
        btnLogo.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        jpInicio panel = new jpInicio();
        panel.setSize(pnlContenedor.getWidth(), pnlContenedor.getHeight());
        panel.setLocation(0, 0);
        pnlContenedor.removeAll();
        pnlContenedor.add(panel, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
        btnLogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnLogoActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        // TODO add your handling code here:
        btnEstadisticas.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        jpEstaditicas panel = new jpEstaditicas();
        panel.setSize(pnlContenedor.getWidth(), pnlContenedor.getHeight());
        panel.setLocation(0, 0);
        pnlContenedor.removeAll();
        pnlContenedor.add(panel, BorderLayout.CENTER);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
        btnEstadisticas.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnEstadisticasActionPerformed

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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEstudiante;
    private javax.swing.JButton btnAgregarTallerPonencia;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInscribirEnTaller;
    private javax.swing.JButton btnLogo;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlLateral;
    // End of variables declaration//GEN-END:variables


}