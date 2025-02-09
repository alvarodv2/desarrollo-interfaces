/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DESKTOP-6A9B
 */
public class EncuestaDialog extends javax.swing.JDialog {

    private DefaultTableModel tableModel;

    public EncuestaDialog(java.awt.Frame parent, boolean modal, DefaultTableModel tableModel) {
        super(parent, modal);
        this.tableModel = tableModel;
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        jComboBoxDeportes.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldProfesion = new javax.swing.JTextField();
        jLabelProfesion = new javax.swing.JLabel();
        jLabelNHermanos = new javax.swing.JLabel();
        jSpinnerEdad = new javax.swing.JSpinner();
        jLabelEdad = new javax.swing.JLabel();
        jComboBoxEdades = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonHombre = new javax.swing.JRadioButton();
        jRadioButtonMujer = new javax.swing.JRadioButton();
        jCheckBoxDeporte = new javax.swing.JCheckBox();
        jLabelCual = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jSliderTelevision = new javax.swing.JSlider();
        jSliderCompras = new javax.swing.JSlider();
        jSliderCine = new javax.swing.JSlider();
        jComboBoxDeportes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextFieldProfesion.setToolTipText("Escriba su profesión");

        jLabelProfesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelProfesion.setText("Profesión:");

        jLabelNHermanos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelNHermanos.setText("Nº Hermanos");

        jSpinnerEdad.setToolTipText("Número de hermanos");

        jLabelEdad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelEdad.setText("Edad:");

        jComboBoxEdades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entre 18 y 30", "Entre 31 y 50", "Entre 51 y 65", "Mayor de 65" }));
        jComboBoxEdades.setToolTipText("Seleccione su rango de edad");
        jComboBoxEdades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEdadesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Sexo");

        jRadioButtonHombre.setText("Hombre");

        jRadioButtonMujer.setText("Mujer");

        jCheckBoxDeporte.setText("¿Practica algún deporte?");
        jCheckBoxDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDeporteActionPerformed(evt);
            }
        });

        jLabelCual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCual.setText("¿Cuál?");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Marque del 1 al 10 su grado de afición a:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Compras:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Ver televisión:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ir al cine:");
        jLabel5.setToolTipText("");

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jSliderTelevision.setMajorTickSpacing(1);
        jSliderTelevision.setMaximum(10);
        jSliderTelevision.setMinimum(1);
        jSliderTelevision.setPaintLabels(true);
        jSliderTelevision.setPaintTicks(true);
        jSliderTelevision.setToolTipText("Grado de aficción de ver la tv");

        jSliderCompras.setMajorTickSpacing(1);
        jSliderCompras.setMaximum(10);
        jSliderCompras.setMinimum(1);
        jSliderCompras.setPaintLabels(true);
        jSliderCompras.setPaintTicks(true);
        jSliderCompras.setToolTipText("Grado de aficción a las compras");

        jSliderCine.setMajorTickSpacing(1);
        jSliderCine.setMaximum(10);
        jSliderCine.setMinimum(1);
        jSliderCine.setPaintLabels(true);
        jSliderCine.setPaintTicks(true);
        jSliderCine.setToolTipText("Grado de aficción de ir al cine");

        jComboBoxDeportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tenis", "Fútbol", " " }));
        jComboBoxDeportes.setToolTipText("Indicar el deporte que practica");
        jComboBoxDeportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDeportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxDeporte)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButtonAceptar)
                        .addGap(77, 77, 77)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelProfesion)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelNHermanos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(74, 74, 74)
                                    .addComponent(jLabelEdad))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel1)
                                    .addGap(78, 78, 78)
                                    .addComponent(jRadioButtonHombre)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxEdades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButtonMujer)
                                        .addComponent(jLabelCual)
                                        .addComponent(jComboBoxDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSliderCine, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(jSliderCompras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSliderTelevision, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelProfesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldProfesion))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNHermanos)
                    .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEdad)
                    .addComponent(jComboBoxEdades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButtonHombre)
                    .addComponent(jRadioButtonMujer))
                .addGap(29, 29, 29)
                .addComponent(jLabelCual)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jCheckBoxDeporte))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSliderCompras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jSliderTelevision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel4)))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSliderCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEdadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEdadesActionPerformed

    }//GEN-LAST:event_jComboBoxEdadesActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed

        String profesion = jTextFieldProfesion.getText();
        int numHermanos = (int) jSpinnerEdad.getValue();
        String edad = (String) jComboBoxEdades.getSelectedItem();
        String sexo = jRadioButtonHombre.isSelected() ? "Hombre" : "Mujer";
        String deporte = jCheckBoxDeporte.isSelected() ? (String) jComboBoxDeportes.getSelectedItem() : "No practica deporte";

        int aficionCompras = jSliderCompras.getValue();
        int aficionTV = jSliderTelevision.getValue();
        int aficionCine = jSliderCine.getValue();

        tableModel.addRow(new Object[]{profesion, numHermanos, edad, sexo, deporte, aficionCompras, aficionTV, aficionCine});

        // Guardamos los datos en un fichero .txt 
        StringBuilder datos = new StringBuilder();
        datos.append("1. PROFESIÓN: ").append(profesion).append("\n")
                .append("2. Nº HERMANOS: ").append(numHermanos).append("\n")
                .append("3. EDAD: ").append(edad).append("\n")
                .append("4. SEXO: ").append(sexo).append("\n")
                .append("5. PRACTICA DEPORTE: ").append(deporte.equals("No practica deporte") ? "No" : "Sí").append("\n")
                .append("6. DEPORTE: ").append(deporte).append("\n")
                .append("7. NIVEL COMPRAS: ").append(aficionCompras).append("\n")
                .append("8. NIVEL TV: ").append(aficionTV).append("\n")
                .append("9. NIVEL CINE: ").append(aficionCine).append("\n\n"); // Añade dos líneas para separar entradas

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt", true))) {
            writer.write(datos.toString());
        } catch (IOException e) {
            e.printStackTrace(); 
        }

        dispose();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jCheckBoxDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDeporteActionPerformed
        if (jCheckBoxDeporte.isSelected()) {
            jComboBoxDeportes.setEnabled(true);
        } else {
            jComboBoxDeportes.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBoxDeporteActionPerformed

    private void jComboBoxDeportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDeportesActionPerformed

    }//GEN-LAST:event_jComboBoxDeportesActionPerformed

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
            java.util.logging.Logger.getLogger(EncuestaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncuestaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncuestaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncuestaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Profesión", "Nº Hermanos", "Edad", "Sexo", "Deporte", "Afición Compras", "Afición TV", "Afición Cine"}, 0);

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EncuestaDialog dialog = new EncuestaDialog(new javax.swing.JFrame(), true, tableModel);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JCheckBox jCheckBoxDeporte;
    private javax.swing.JComboBox<String> jComboBoxDeportes;
    private javax.swing.JComboBox<String> jComboBoxEdades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCual;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelNHermanos;
    private javax.swing.JLabel jLabelProfesion;
    private javax.swing.JRadioButton jRadioButtonHombre;
    private javax.swing.JRadioButton jRadioButtonMujer;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSliderCine;
    private javax.swing.JSlider jSliderCompras;
    private javax.swing.JSlider jSliderTelevision;
    private javax.swing.JSpinner jSpinnerEdad;
    private javax.swing.JTextField jTextFieldProfesion;
    // End of variables declaration//GEN-END:variables
}
