/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui.ventanas;

import gui.jdialogs.DialogError;
import javax.swing.JDesktopPane;

/**
 *
 * @author DESKTOP-6A9B
 */
public class MezcladoraNombres extends javax.swing.JInternalFrame {

    
    private JDesktopPane desktopPane;
    
    public MezcladoraNombres(JDesktopPane desktopPane) {
        initComponents();
        jTextArea1.setEnabled(false);
        jButtonReiniciar.setEnabled(false);
        this.desktopPane = desktopPane;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMezclar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonReiniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelPrimero = new javax.swing.JLabel();
        jLabelIngrese1Nombre = new javax.swing.JLabel();
        jTextField1Nombre = new javax.swing.JTextField();
        jLabelIngrese2Nombre = new javax.swing.JLabel();
        jTextField2Nombre = new javax.swing.JTextField();

        setClosable(true);

        jButtonMezclar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonMezclar.setText("MEZCLAR");
        jButtonMezclar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMezclarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Estos son posibles nombres mezclados:");

        jButtonReiniciar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonReiniciar.setText("REINICIAR");
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabelPrimero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelPrimero.setText("Mezcladora de Nombres de Pareja");

        jLabelIngrese1Nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelIngrese1Nombre.setText("Ingresa el primer nombre:");

        jTextField1Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NombreActionPerformed(evt);
            }
        });

        jLabelIngrese2Nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelIngrese2Nombre.setText("Ingresa el segundo nombre:");

        jTextField2Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2NombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField2Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabelIngrese2Nombre)
                            .addComponent(jLabelPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelIngrese1Nombre)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMezclar)
                            .addGap(143, 143, 143))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelPrimero)
                .addGap(33, 33, 33)
                .addComponent(jLabelIngrese1Nombre)
                .addGap(18, 18, 18)
                .addComponent(jTextField1Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabelIngrese2Nombre)
                .addGap(18, 18, 18)
                .addComponent(jTextField2Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonMezclar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMezclarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMezclarActionPerformed
        String nombre1 = jTextField1Nombre.getText().trim();
        String nombre2 = jTextField2Nombre.getText().trim();
        DialogError dError = new DialogError();

        if (nombre1.length() < 4 || nombre2.length() < 4) {
            desktopPane.add(dError);
            dError.setErrorMessage("Los nombres de la pareja deben contener como mínimo 4 letras, sino, no habrá amor");
            dError.setVisible(true);

            jTextField1Nombre.setText("");
            jTextField2Nombre.setText("");

            return;
        }

        jTextField1Nombre.setEnabled(false);
        jTextField2Nombre.setEnabled(false);
        jButtonMezclar.setEnabled(false);
        
        int mitadNombre1 = nombre1.length() / 2;
        int mitadNombre2 = nombre2.length() / 2;

        String mezcla1 = nombre1.substring(0, mitadNombre1) + nombre2.substring(mitadNombre2);
        String mezcla2 = nombre2.substring(0, mitadNombre2) + nombre1.substring(mitadNombre1);
        String mezcla3 = nombre1.substring(0, mitadNombre1 + 1) + nombre2.substring(mitadNombre2 - 1);
        String mezcla4 = nombre2.substring(0, mitadNombre2 + 1) + nombre1.substring(mitadNombre1 - 1);

        jTextArea1.setText("1. " + mezcla1 + "\n2. " + mezcla2 + "\n3. " + mezcla3 + "\n4. " + mezcla4);
        jTextArea1.setEnabled(true); 
        jButtonReiniciar.setEnabled(true); 
    }//GEN-LAST:event_jButtonMezclarActionPerformed

    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReiniciarActionPerformed
        jTextField1Nombre.setText("");
        jTextField2Nombre.setText("");
        jTextField1Nombre.setEnabled(true);
        jTextField2Nombre.setEnabled(true);
        jButtonMezclar.setEnabled(true);
        jTextArea1.setText("");
        jTextArea1.setEnabled(false);
        jButtonReiniciar.setEnabled(false);
    }//GEN-LAST:event_jButtonReiniciarActionPerformed

    private void jTextField1NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1NombreActionPerformed

    private void jTextField2NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2NombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMezclar;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIngrese1Nombre;
    private javax.swing.JLabel jLabelIngrese2Nombre;
    private javax.swing.JLabel jLabelPrimero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1Nombre;
    private javax.swing.JTextField jTextField2Nombre;
    // End of variables declaration//GEN-END:variables
}
