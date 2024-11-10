/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui.ventanas;

/**
 *
 * @author DESKTOP-6A9B
 */
public class Imitador extends javax.swing.JInternalFrame {

    /**
     * Creates new form Imitador
     */
    public Imitador() {
        initComponents();
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

    }

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {
        Object value = jSpinner1.getValue();

        jSpinnerEspejo.setValue(value);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxOpcion4 = new javax.swing.JCheckBox();
        jCheckBoxEspejoOpcion5 = new javax.swing.JCheckBox();
        jCheckBoxOpcion5 = new javax.swing.JCheckBox();
        jRadioButtonOpcionEspejo3 = new javax.swing.JRadioButton();
        jCheckBoxOpcion6 = new javax.swing.JCheckBox();
        jCheckBoxEspejoOpcion6 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jTextFieldEspejo = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBoxEspejo = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinnerEspejo = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelOriginal = new javax.swing.JLabel();
        jLabelEspejo = new javax.swing.JLabel();
        jRadioButtonOpcion1 = new javax.swing.JRadioButton();
        jRadioButtonOpcionEspejo1 = new javax.swing.JRadioButton();
        jRadioButtonOpcion2 = new javax.swing.JRadioButton();
        jCheckBoxEspejoOpcion4 = new javax.swing.JCheckBox();
        jRadioButtonOpcion3 = new javax.swing.JRadioButton();
        jRadioButtonOpcioEspejo2 = new javax.swing.JRadioButton();

        setClosable(true);

        jCheckBoxOpcion4.setText("Opcion 4");
        jCheckBoxOpcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxOpcion4ActionPerformed(evt);
            }
        });

        jCheckBoxEspejoOpcion5.setText("Opcion 5");
        jCheckBoxEspejoOpcion5.setEnabled(false);

        jCheckBoxOpcion5.setText("Opcion 5");
        jCheckBoxOpcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxOpcion5ActionPerformed(evt);
            }
        });

        jRadioButtonOpcionEspejo3.setText("Opcion 3");
        jRadioButtonOpcionEspejo3.setEnabled(false);

        jCheckBoxOpcion6.setText("Opcion 6");
        jCheckBoxOpcion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxOpcion6ActionPerformed(evt);
            }
        });

        jCheckBoxEspejoOpcion6.setText("Opcion 6");
        jCheckBoxEspejoOpcion6.setEnabled(false);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextFieldEspejo.setEnabled(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBoxEspejo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxEspejo.setEnabled(false);

        jSpinnerEspejo.setEnabled(false);

        jLabelOriginal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelOriginal.setText("Original");

        jLabelEspejo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEspejo.setText("Espejo");

        jRadioButtonOpcion1.setText("Opcion 1");
        jRadioButtonOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOpcion1ActionPerformed(evt);
            }
        });

        jRadioButtonOpcionEspejo1.setText("Opcion 1");
        jRadioButtonOpcionEspejo1.setEnabled(false);
        jRadioButtonOpcionEspejo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOpcionEspejo1ActionPerformed(evt);
            }
        });

        jRadioButtonOpcion2.setText("Opcion 2");
        jRadioButtonOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOpcion2ActionPerformed(evt);
            }
        });

        jCheckBoxEspejoOpcion4.setText("Opcion 4");
        jCheckBoxEspejoOpcion4.setEnabled(false);

        jRadioButtonOpcion3.setText("Opcion 3");
        jRadioButtonOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOpcion3ActionPerformed(evt);
            }
        });

        jRadioButtonOpcioEspejo2.setText("Opcion 2");
        jRadioButtonOpcioEspejo2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButtonOpcion3)
                                        .addComponent(jRadioButtonOpcion2))
                                    .addComponent(jRadioButtonOpcion1))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxOpcion4)
                                    .addComponent(jCheckBoxOpcion5)
                                    .addComponent(jCheckBoxOpcion6))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelOriginal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButtonOpcionEspejo3)
                                        .addComponent(jRadioButtonOpcioEspejo2))
                                    .addComponent(jRadioButtonOpcionEspejo1))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxEspejoOpcion4)
                                    .addComponent(jCheckBoxEspejoOpcion5)
                                    .addComponent(jCheckBoxEspejoOpcion6))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxEspejo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSpinnerEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelEspejo))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelOriginal)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonOpcion1)
                        .addComponent(jCheckBoxOpcion4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonOpcion2)
                    .addComponent(jCheckBoxOpcion5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonOpcion3)
                        .addComponent(jCheckBoxOpcion6)))
                .addGap(49, 49, 49)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEspejo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCheckBoxEspejoOpcion4)
                                .addComponent(jRadioButtonOpcionEspejo1))
                            .addGap(18, 18, 18)
                            .addComponent(jCheckBoxEspejoOpcion5)
                            .addGap(18, 18, 18)
                            .addComponent(jCheckBoxEspejoOpcion6))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jRadioButtonOpcioEspejo2)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButtonOpcionEspejo3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextFieldEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxOpcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxOpcion4ActionPerformed
        if (jCheckBoxOpcion4.isSelected()) {
            jCheckBoxEspejoOpcion4.setSelected(true);
        } else if (!jCheckBoxOpcion4.isSelected()) {
            jCheckBoxEspejoOpcion4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBoxOpcion4ActionPerformed

    private void jCheckBoxOpcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxOpcion5ActionPerformed
        if (jCheckBoxOpcion5.isSelected()) {
            jCheckBoxEspejoOpcion5.setSelected(true);
        } else if (!jCheckBoxOpcion5.isSelected()) {
            jCheckBoxEspejoOpcion5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBoxOpcion5ActionPerformed

    private void jCheckBoxOpcion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxOpcion6ActionPerformed
        if (jCheckBoxOpcion6.isSelected()) {
            jCheckBoxEspejoOpcion6.setSelected(true);
        } else if (!jCheckBoxOpcion6.isSelected()) {
            jCheckBoxEspejoOpcion6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBoxOpcion6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String text = jTextField1.getText();
        jTextFieldEspejo.setText(text);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String selectedItem = (String) jComboBox1.getSelectedItem();

        for (int i = 0; i < jComboBoxEspejo.getItemCount(); i++) {
            if (jComboBoxEspejo.getItemAt(i).equals(selectedItem)) {
                jComboBoxEspejo.setSelectedIndex(i);
                break;
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButtonOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOpcion1ActionPerformed
        if (jRadioButtonOpcion1.isSelected()) {
            jRadioButtonOpcionEspejo1.setSelected(true);
        } else if (!jRadioButtonOpcion1.isSelected()) {
            jRadioButtonOpcionEspejo1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonOpcion1ActionPerformed

    private void jRadioButtonOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOpcion2ActionPerformed
        if (jRadioButtonOpcion2.isSelected()) {
            jRadioButtonOpcioEspejo2.setSelected(true);
        } else if (!jRadioButtonOpcion2.isSelected()) {
            jRadioButtonOpcioEspejo2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonOpcion2ActionPerformed

    private void jRadioButtonOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOpcion3ActionPerformed
        if (jRadioButtonOpcion3.isSelected()) {
            jRadioButtonOpcionEspejo3.setSelected(true);
        } else if (!jRadioButtonOpcion3.isSelected()) {
            jRadioButtonOpcionEspejo3.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonOpcion3ActionPerformed

    private void jRadioButtonOpcionEspejo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOpcionEspejo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonOpcionEspejo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxEspejoOpcion4;
    private javax.swing.JCheckBox jCheckBoxEspejoOpcion5;
    private javax.swing.JCheckBox jCheckBoxEspejoOpcion6;
    private javax.swing.JCheckBox jCheckBoxOpcion4;
    private javax.swing.JCheckBox jCheckBoxOpcion5;
    private javax.swing.JCheckBox jCheckBoxOpcion6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxEspejo;
    private javax.swing.JLabel jLabelEspejo;
    private javax.swing.JLabel jLabelOriginal;
    private javax.swing.JRadioButton jRadioButtonOpcioEspejo2;
    private javax.swing.JRadioButton jRadioButtonOpcion1;
    private javax.swing.JRadioButton jRadioButtonOpcion2;
    private javax.swing.JRadioButton jRadioButtonOpcion3;
    private javax.swing.JRadioButton jRadioButtonOpcionEspejo1;
    private javax.swing.JRadioButton jRadioButtonOpcionEspejo3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinnerEspejo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldEspejo;
    // End of variables declaration//GEN-END:variables
}
