/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio8;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DESKTOP-6A9B
 */
public class CambiarPaneles extends javax.swing.JFrame {

    private int pulsacionesB1 = 0;
    private int pulsacionesB2 = 0;
    private int pulsacionesB3 = 0;
    private int pulsacionesB4 = 0;

    // Método para manejar la pulsación de un botón
    private void actualizarContador(String boton) {
        switch (boton) {
            case "B1":
                pulsacionesB1++;
                break;
            case "B2":
                pulsacionesB2++;
                break;
            case "B3":
                pulsacionesB3++;
                break;
            case "B4":
                pulsacionesB4++;
                break;
        }
        actualizarTabla();
    }

// Método para actualizar la tabla
    private void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) jTablePulsaciones.getModel();
        model.setRowCount(0); // Limpiar la tabla actual

        // Agregar filas a la tabla con los contadores actuales
        model.addRow(new Object[]{"B1", pulsacionesB1});
        model.addRow(new Object[]{"B2", pulsacionesB2});
        model.addRow(new Object[]{"B3", pulsacionesB3});
        model.addRow(new Object[]{"B4", pulsacionesB4});
    }

    public CambiarPaneles() {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        jPanelOpcionACCIONES1.setVisible(false);
        jPanelOpcionACCIONES2.setVisible(false);
    }

    private void actualizarTextoArea() {
        StringBuilder texto = new StringBuilder(); // Usar StringBuilder para eficiencia

        // Verifica cada JCheckBox y agrega su texto si está seleccionado
        if (jCheckBoxLEER.isSelected()) {
            texto.append(jCheckBoxLEER.getText()).append("\n");
        }
        if (jCheckBoxESCALADA.isSelected()) {
            texto.append(jCheckBoxESCALADA.getText()).append("\n");
        }
        if (jCheckBoxESQUIAR.isSelected()) {
            texto.append(jCheckBoxESQUIAR.getText()).append("\n");
        }
        if (jCheckBoxSUBMARINISMO.isSelected()) {
            texto.append(jCheckBoxSUBMARINISMO.getText()).append("\n");
        }

        // Establece el texto en el JTextArea
        jTextArea1.setText(texto.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotones = new javax.swing.ButtonGroup();
        jPanelConCardLayout = new javax.swing.JPanel();
        jPanelPrincipalJuegoDePaneles = new javax.swing.JPanel();
        jPanelCambiarAcciones1 = new javax.swing.JPanel();
        jLabelCambiarACCIONES1 = new javax.swing.JLabel();
        jRadioButtonACCIONES1 = new javax.swing.JRadioButton();
        jRadioButtonRESULTADOS1 = new javax.swing.JRadioButton();
        jLabelJuegoDePaneles = new javax.swing.JLabel();
        jPanelOpcionACCIONES1 = new javax.swing.JPanel();
        jPanelCambiarAcciones2 = new javax.swing.JPanel();
        jLabelCambiarACCIONES2 = new javax.swing.JLabel();
        jRadioButtonACCIONES2 = new javax.swing.JRadioButton();
        jRadioButtonRESULTADOS2 = new javax.swing.JRadioButton();
        jPanelBotones = new javax.swing.JPanel();
        jLabelCambiarAcciones1 = new javax.swing.JLabel();
        jComboBoxBotones1 = new javax.swing.JComboBox<>();
        jButtonB1 = new javax.swing.JButton();
        jButtonB2 = new javax.swing.JButton();
        jButtonB3 = new javax.swing.JButton();
        jButtonB4 = new javax.swing.JButton();
        jPanelOpcionACCIONES2 = new javax.swing.JPanel();
        jPanelCambiarAcciones3 = new javax.swing.JPanel();
        jLabelCambiarACCIONES3 = new javax.swing.JLabel();
        jRadioButtonACCIONES3 = new javax.swing.JRadioButton();
        jRadioButtonRESULTADOS3 = new javax.swing.JRadioButton();
        jPanelBotones1 = new javax.swing.JPanel();
        jLabelCambiarAcciones2 = new javax.swing.JLabel();
        jComboBoxBotones2 = new javax.swing.JComboBox<>();
        jCheckBoxLEER = new javax.swing.JCheckBox();
        jCheckBoxESCALADA = new javax.swing.JCheckBox();
        jCheckBoxESQUIAR = new javax.swing.JCheckBox();
        jCheckBoxSUBMARINISMO = new javax.swing.JCheckBox();
        jPanelOpcionACCIONES3 = new javax.swing.JPanel();
        jPanelCambiarAcciones4 = new javax.swing.JPanel();
        jLabelCambiarACCIONES4 = new javax.swing.JLabel();
        jRadioButtonACCIONES4 = new javax.swing.JRadioButton();
        jRadioButtonRESULTADOS4 = new javax.swing.JRadioButton();
        jPanelBotones2 = new javax.swing.JPanel();
        jLabelCambiarResultados1 = new javax.swing.JLabel();
        jComboBoxPulsaciones = new javax.swing.JComboBox<>();
        jLabelRECUENTOPULSACIONES = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePulsaciones = new javax.swing.JTable();
        jPanelOpcionACCIONES4 = new javax.swing.JPanel();
        jPanelCambiarAcciones5 = new javax.swing.JPanel();
        jLabelCambiarACCIONES5 = new javax.swing.JLabel();
        jRadioButtonACCIONES5 = new javax.swing.JRadioButton();
        jRadioButtonRESULTADOS5 = new javax.swing.JRadioButton();
        jPanelBotones3 = new javax.swing.JPanel();
        jLabelCambiarResultados2 = new javax.swing.JLabel();
        jComboBoxPulsaciones1 = new javax.swing.JComboBox<>();
        jLabelRECUENTOPULSACIONES2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelConCardLayout.setLayout(new java.awt.CardLayout());

        jPanelCambiarAcciones1.setBackground(new java.awt.Color(0, 0, 0));
        jPanelCambiarAcciones1.setForeground(new java.awt.Color(0, 0, 0));

        jLabelCambiarACCIONES1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCambiarACCIONES1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCambiarACCIONES1.setText("CAMBIAR ACCIONES:");

        GrupoBotones.add(jRadioButtonACCIONES1);
        jRadioButtonACCIONES1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonACCIONES1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonACCIONES1.setText("ACCIONES");
        jRadioButtonACCIONES1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonACCIONES1ActionPerformed(evt);
            }
        });

        GrupoBotones.add(jRadioButtonRESULTADOS1);
        jRadioButtonRESULTADOS1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonRESULTADOS1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonRESULTADOS1.setText("RESULTADOS");
        jRadioButtonRESULTADOS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRESULTADOS1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCambiarAcciones1Layout = new javax.swing.GroupLayout(jPanelCambiarAcciones1);
        jPanelCambiarAcciones1.setLayout(jPanelCambiarAcciones1Layout);
        jPanelCambiarAcciones1Layout.setHorizontalGroup(
            jPanelCambiarAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambiarAcciones1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelCambiarACCIONES1)
                .addGap(42, 42, 42)
                .addComponent(jRadioButtonACCIONES1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jRadioButtonRESULTADOS1)
                .addGap(56, 56, 56))
        );
        jPanelCambiarAcciones1Layout.setVerticalGroup(
            jPanelCambiarAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCambiarAcciones1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanelCambiarAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCambiarACCIONES1)
                    .addComponent(jRadioButtonACCIONES1)
                    .addComponent(jRadioButtonRESULTADOS1))
                .addGap(19, 19, 19))
        );

        jLabelJuegoDePaneles.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelJuegoDePaneles.setText("JUEGO DE PANELES");

        javax.swing.GroupLayout jPanelPrincipalJuegoDePanelesLayout = new javax.swing.GroupLayout(jPanelPrincipalJuegoDePaneles);
        jPanelPrincipalJuegoDePaneles.setLayout(jPanelPrincipalJuegoDePanelesLayout);
        jPanelPrincipalJuegoDePanelesLayout.setHorizontalGroup(
            jPanelPrincipalJuegoDePanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCambiarAcciones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelPrincipalJuegoDePanelesLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabelJuegoDePaneles)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalJuegoDePanelesLayout.setVerticalGroup(
            jPanelPrincipalJuegoDePanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalJuegoDePanelesLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabelJuegoDePaneles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(jPanelCambiarAcciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelConCardLayout.add(jPanelPrincipalJuegoDePaneles, "card2");

        jPanelCambiarAcciones2.setBackground(new java.awt.Color(0, 0, 0));
        jPanelCambiarAcciones2.setForeground(new java.awt.Color(0, 0, 0));

        jLabelCambiarACCIONES2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCambiarACCIONES2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCambiarACCIONES2.setText("CAMBIAR ACCIONES:");

        GrupoBotones.add(jRadioButtonACCIONES2);
        jRadioButtonACCIONES2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonACCIONES2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonACCIONES2.setText("ACCIONES");
        jRadioButtonACCIONES2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonACCIONES2ActionPerformed(evt);
            }
        });

        GrupoBotones.add(jRadioButtonRESULTADOS2);
        jRadioButtonRESULTADOS2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonRESULTADOS2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonRESULTADOS2.setText("RESULTADOS");
        jRadioButtonRESULTADOS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRESULTADOS2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCambiarAcciones2Layout = new javax.swing.GroupLayout(jPanelCambiarAcciones2);
        jPanelCambiarAcciones2.setLayout(jPanelCambiarAcciones2Layout);
        jPanelCambiarAcciones2Layout.setHorizontalGroup(
            jPanelCambiarAcciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambiarAcciones2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelCambiarACCIONES2)
                .addGap(42, 42, 42)
                .addComponent(jRadioButtonACCIONES2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jRadioButtonRESULTADOS2)
                .addGap(56, 56, 56))
        );
        jPanelCambiarAcciones2Layout.setVerticalGroup(
            jPanelCambiarAcciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCambiarAcciones2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanelCambiarAcciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCambiarACCIONES2)
                    .addComponent(jRadioButtonACCIONES2)
                    .addComponent(jRadioButtonRESULTADOS2))
                .addGap(19, 19, 19))
        );

        jPanelBotones.setBackground(new java.awt.Color(255, 153, 153));
        jPanelBotones.setForeground(new java.awt.Color(255, 153, 153));

        jLabelCambiarAcciones1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCambiarAcciones1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCambiarAcciones1.setText("Cambiar acciones:");

        jComboBoxBotones1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBoxBotones1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Botones", "Opciones" }));
        jComboBoxBotones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBotones1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCambiarAcciones1)
                .addGap(27, 27, 27)
                .addComponent(jComboBoxBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCambiarAcciones1)
                    .addComponent(jComboBoxBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jButtonB1.setText("B1");
        jButtonB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB1ActionPerformed(evt);
            }
        });

        jButtonB2.setText("B2");
        jButtonB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB2ActionPerformed(evt);
            }
        });

        jButtonB3.setText("B4");
        jButtonB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB3ActionPerformed(evt);
            }
        });

        jButtonB4.setText("B3");
        jButtonB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcionACCIONES1Layout = new javax.swing.GroupLayout(jPanelOpcionACCIONES1);
        jPanelOpcionACCIONES1.setLayout(jPanelOpcionACCIONES1Layout);
        jPanelOpcionACCIONES1Layout.setHorizontalGroup(
            jPanelOpcionACCIONES1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCambiarAcciones2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelOpcionACCIONES1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jButtonB1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonB2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonB4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonB3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOpcionACCIONES1Layout.setVerticalGroup(
            jPanelOpcionACCIONES1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcionACCIONES1Layout.createSequentialGroup()
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanelOpcionACCIONES1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonB1)
                    .addComponent(jButtonB3)
                    .addComponent(jButtonB2)
                    .addComponent(jButtonB4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(jPanelCambiarAcciones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelConCardLayout.add(jPanelOpcionACCIONES1, "card3");

        jPanelCambiarAcciones3.setBackground(new java.awt.Color(0, 0, 0));
        jPanelCambiarAcciones3.setForeground(new java.awt.Color(0, 0, 0));

        jLabelCambiarACCIONES3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCambiarACCIONES3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCambiarACCIONES3.setText("CAMBIAR ACCIONES:");

        GrupoBotones.add(jRadioButtonACCIONES3);
        jRadioButtonACCIONES3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonACCIONES3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonACCIONES3.setText("ACCIONES");
        jRadioButtonACCIONES3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonACCIONES3ActionPerformed(evt);
            }
        });

        GrupoBotones.add(jRadioButtonRESULTADOS3);
        jRadioButtonRESULTADOS3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonRESULTADOS3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonRESULTADOS3.setText("RESULTADOS");
        jRadioButtonRESULTADOS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRESULTADOS3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCambiarAcciones3Layout = new javax.swing.GroupLayout(jPanelCambiarAcciones3);
        jPanelCambiarAcciones3.setLayout(jPanelCambiarAcciones3Layout);
        jPanelCambiarAcciones3Layout.setHorizontalGroup(
            jPanelCambiarAcciones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambiarAcciones3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelCambiarACCIONES3)
                .addGap(42, 42, 42)
                .addComponent(jRadioButtonACCIONES3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jRadioButtonRESULTADOS3)
                .addGap(56, 56, 56))
        );
        jPanelCambiarAcciones3Layout.setVerticalGroup(
            jPanelCambiarAcciones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCambiarAcciones3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanelCambiarAcciones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCambiarACCIONES3)
                    .addComponent(jRadioButtonACCIONES3)
                    .addComponent(jRadioButtonRESULTADOS3))
                .addGap(19, 19, 19))
        );

        jPanelBotones1.setBackground(new java.awt.Color(255, 153, 153));
        jPanelBotones1.setForeground(new java.awt.Color(255, 153, 153));

        jLabelCambiarAcciones2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCambiarAcciones2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCambiarAcciones2.setText("Cambiar acciones:");

        jComboBoxBotones2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBoxBotones2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Botones", "Opciones" }));
        jComboBoxBotones2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBotones2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotones1Layout = new javax.swing.GroupLayout(jPanelBotones1);
        jPanelBotones1.setLayout(jPanelBotones1Layout);
        jPanelBotones1Layout.setHorizontalGroup(
            jPanelBotones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotones1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCambiarAcciones2)
                .addGap(27, 27, 27)
                .addComponent(jComboBoxBotones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanelBotones1Layout.setVerticalGroup(
            jPanelBotones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotones1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanelBotones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCambiarAcciones2)
                    .addComponent(jComboBoxBotones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jCheckBoxLEER.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jCheckBoxLEER.setText("Leer");
        jCheckBoxLEER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLEERActionPerformed(evt);
            }
        });

        jCheckBoxESCALADA.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jCheckBoxESCALADA.setText("Escalada");
        jCheckBoxESCALADA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxESCALADAActionPerformed(evt);
            }
        });

        jCheckBoxESQUIAR.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jCheckBoxESQUIAR.setText("Esquiar");
        jCheckBoxESQUIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxESQUIARActionPerformed(evt);
            }
        });

        jCheckBoxSUBMARINISMO.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jCheckBoxSUBMARINISMO.setText("Submarinismo");
        jCheckBoxSUBMARINISMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSUBMARINISMOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcionACCIONES2Layout = new javax.swing.GroupLayout(jPanelOpcionACCIONES2);
        jPanelOpcionACCIONES2.setLayout(jPanelOpcionACCIONES2Layout);
        jPanelOpcionACCIONES2Layout.setHorizontalGroup(
            jPanelOpcionACCIONES2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCambiarAcciones3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcionACCIONES2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelOpcionACCIONES2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxLEER)
                    .addComponent(jCheckBoxESQUIAR))
                .addGap(73, 73, 73)
                .addGroup(jPanelOpcionACCIONES2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxSUBMARINISMO)
                    .addComponent(jCheckBoxESCALADA))
                .addGap(119, 119, 119))
        );
        jPanelOpcionACCIONES2Layout.setVerticalGroup(
            jPanelOpcionACCIONES2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcionACCIONES2Layout.createSequentialGroup()
                .addComponent(jPanelBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanelOpcionACCIONES2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxLEER)
                    .addComponent(jCheckBoxESCALADA))
                .addGap(18, 18, 18)
                .addGroup(jPanelOpcionACCIONES2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxSUBMARINISMO)
                    .addComponent(jCheckBoxESQUIAR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jPanelCambiarAcciones3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelConCardLayout.add(jPanelOpcionACCIONES2, "card3");

        jPanelCambiarAcciones4.setBackground(new java.awt.Color(0, 0, 0));
        jPanelCambiarAcciones4.setForeground(new java.awt.Color(0, 0, 0));

        jLabelCambiarACCIONES4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCambiarACCIONES4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCambiarACCIONES4.setText("CAMBIAR ACCIONES:");

        GrupoBotones.add(jRadioButtonACCIONES4);
        jRadioButtonACCIONES4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonACCIONES4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonACCIONES4.setText("ACCIONES");
        jRadioButtonACCIONES4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonACCIONES4ActionPerformed(evt);
            }
        });

        GrupoBotones.add(jRadioButtonRESULTADOS4);
        jRadioButtonRESULTADOS4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonRESULTADOS4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonRESULTADOS4.setText("RESULTADOS");

        javax.swing.GroupLayout jPanelCambiarAcciones4Layout = new javax.swing.GroupLayout(jPanelCambiarAcciones4);
        jPanelCambiarAcciones4.setLayout(jPanelCambiarAcciones4Layout);
        jPanelCambiarAcciones4Layout.setHorizontalGroup(
            jPanelCambiarAcciones4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambiarAcciones4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelCambiarACCIONES4)
                .addGap(42, 42, 42)
                .addComponent(jRadioButtonACCIONES4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jRadioButtonRESULTADOS4)
                .addGap(56, 56, 56))
        );
        jPanelCambiarAcciones4Layout.setVerticalGroup(
            jPanelCambiarAcciones4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCambiarAcciones4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanelCambiarAcciones4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCambiarACCIONES4)
                    .addComponent(jRadioButtonACCIONES4)
                    .addComponent(jRadioButtonRESULTADOS4))
                .addGap(19, 19, 19))
        );

        jPanelBotones2.setBackground(new java.awt.Color(51, 153, 0));
        jPanelBotones2.setForeground(new java.awt.Color(255, 153, 153));

        jLabelCambiarResultados1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCambiarResultados1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCambiarResultados1.setText("Cambiar resultados");

        jComboBoxPulsaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBoxPulsaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pulsaciones", "Selecciones" }));
        jComboBoxPulsaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPulsacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotones2Layout = new javax.swing.GroupLayout(jPanelBotones2);
        jPanelBotones2.setLayout(jPanelBotones2Layout);
        jPanelBotones2Layout.setHorizontalGroup(
            jPanelBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotones2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCambiarResultados1)
                .addGap(27, 27, 27)
                .addComponent(jComboBoxPulsaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanelBotones2Layout.setVerticalGroup(
            jPanelBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotones2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanelBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCambiarResultados1)
                    .addComponent(jComboBoxPulsaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jLabelRECUENTOPULSACIONES.setBackground(new java.awt.Color(0, 0, 0));
        jLabelRECUENTOPULSACIONES.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelRECUENTOPULSACIONES.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRECUENTOPULSACIONES.setText("RECUENTO Nº PULSACIONES de los botones");

        jTablePulsaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Botón", "Pulsaciones"
            }
        ));
        jScrollPane1.setViewportView(jTablePulsaciones);

        javax.swing.GroupLayout jPanelOpcionACCIONES3Layout = new javax.swing.GroupLayout(jPanelOpcionACCIONES3);
        jPanelOpcionACCIONES3.setLayout(jPanelOpcionACCIONES3Layout);
        jPanelOpcionACCIONES3Layout.setHorizontalGroup(
            jPanelOpcionACCIONES3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCambiarAcciones4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotones2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelOpcionACCIONES3Layout.createSequentialGroup()
                .addGroup(jPanelOpcionACCIONES3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOpcionACCIONES3Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabelRECUENTOPULSACIONES))
                    .addGroup(jPanelOpcionACCIONES3Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOpcionACCIONES3Layout.setVerticalGroup(
            jPanelOpcionACCIONES3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcionACCIONES3Layout.createSequentialGroup()
                .addComponent(jPanelBotones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabelRECUENTOPULSACIONES)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanelCambiarAcciones4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelConCardLayout.add(jPanelOpcionACCIONES3, "card3");

        jPanelCambiarAcciones5.setBackground(new java.awt.Color(0, 0, 0));
        jPanelCambiarAcciones5.setForeground(new java.awt.Color(0, 0, 0));

        jLabelCambiarACCIONES5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCambiarACCIONES5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCambiarACCIONES5.setText("CAMBIAR ACCIONES:");

        GrupoBotones.add(jRadioButtonACCIONES5);
        jRadioButtonACCIONES5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonACCIONES5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonACCIONES5.setText("ACCIONES");
        jRadioButtonACCIONES5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonACCIONES5ActionPerformed(evt);
            }
        });

        GrupoBotones.add(jRadioButtonRESULTADOS5);
        jRadioButtonRESULTADOS5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonRESULTADOS5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonRESULTADOS5.setText("RESULTADOS");
        jRadioButtonRESULTADOS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRESULTADOS5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCambiarAcciones5Layout = new javax.swing.GroupLayout(jPanelCambiarAcciones5);
        jPanelCambiarAcciones5.setLayout(jPanelCambiarAcciones5Layout);
        jPanelCambiarAcciones5Layout.setHorizontalGroup(
            jPanelCambiarAcciones5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCambiarAcciones5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelCambiarACCIONES5)
                .addGap(42, 42, 42)
                .addComponent(jRadioButtonACCIONES5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jRadioButtonRESULTADOS5)
                .addGap(56, 56, 56))
        );
        jPanelCambiarAcciones5Layout.setVerticalGroup(
            jPanelCambiarAcciones5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCambiarAcciones5Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanelCambiarAcciones5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCambiarACCIONES5)
                    .addComponent(jRadioButtonACCIONES5)
                    .addComponent(jRadioButtonRESULTADOS5))
                .addGap(19, 19, 19))
        );

        jPanelBotones3.setBackground(new java.awt.Color(51, 153, 0));
        jPanelBotones3.setForeground(new java.awt.Color(255, 153, 153));

        jLabelCambiarResultados2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCambiarResultados2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCambiarResultados2.setText("Cambiar resultados");

        jComboBoxPulsaciones1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBoxPulsaciones1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pulsaciones", "Selecciones" }));
        jComboBoxPulsaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPulsaciones1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotones3Layout = new javax.swing.GroupLayout(jPanelBotones3);
        jPanelBotones3.setLayout(jPanelBotones3Layout);
        jPanelBotones3Layout.setHorizontalGroup(
            jPanelBotones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotones3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCambiarResultados2)
                .addGap(27, 27, 27)
                .addComponent(jComboBoxPulsaciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanelBotones3Layout.setVerticalGroup(
            jPanelBotones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotones3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanelBotones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCambiarResultados2)
                    .addComponent(jComboBoxPulsaciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jLabelRECUENTOPULSACIONES2.setBackground(new java.awt.Color(0, 0, 0));
        jLabelRECUENTOPULSACIONES2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelRECUENTOPULSACIONES2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRECUENTOPULSACIONES2.setText("OPCIONES SELECCIONADAS");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanelOpcionACCIONES4Layout = new javax.swing.GroupLayout(jPanelOpcionACCIONES4);
        jPanelOpcionACCIONES4.setLayout(jPanelOpcionACCIONES4Layout);
        jPanelOpcionACCIONES4Layout.setHorizontalGroup(
            jPanelOpcionACCIONES4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCambiarAcciones5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotones3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelOpcionACCIONES4Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanelOpcionACCIONES4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRECUENTOPULSACIONES2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOpcionACCIONES4Layout.setVerticalGroup(
            jPanelOpcionACCIONES4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcionACCIONES4Layout.createSequentialGroup()
                .addComponent(jPanelBotones3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabelRECUENTOPULSACIONES2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jPanelCambiarAcciones5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelConCardLayout.add(jPanelOpcionACCIONES4, "card3");

        getContentPane().add(jPanelConCardLayout, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonACCIONES4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonACCIONES4ActionPerformed
        if (jRadioButtonACCIONES4.isSelected()) {
            jPanelPrincipalJuegoDePaneles.setVisible(false);
            jPanelOpcionACCIONES3.setVisible(false);
            jPanelOpcionACCIONES1.setVisible(true);
        } else {
            jPanelOpcionACCIONES3.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButtonACCIONES4ActionPerformed

    private void jRadioButtonACCIONES5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonACCIONES5ActionPerformed
        if (jRadioButtonACCIONES5.isSelected()) {
            jPanelPrincipalJuegoDePaneles.setVisible(false);
            jPanelOpcionACCIONES4.setVisible(false);
            jPanelOpcionACCIONES1.setVisible(true);
        } else {
            jPanelOpcionACCIONES4.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButtonACCIONES5ActionPerformed

    private void jComboBoxPulsaciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPulsaciones1ActionPerformed
        String seleccion = (String) jComboBoxPulsaciones1.getSelectedItem();

        // Muestra el panel correspondiente según la selección
        switch (seleccion) {
            case "Pulsaciones":
                jPanelOpcionACCIONES2.setVisible(false); // Oculta Opciones
                jPanelOpcionACCIONES3.setVisible(true);  // Muestra Botones
                break;
            case "Selecciones":
                jPanelOpcionACCIONES3.setVisible(false); // Oculta Botones
                jPanelOpcionACCIONES4.setVisible(true);  // Muestra Opciones
                break;
            default:
                break;
        }

        // Asegura que el contenedor principal de ambos paneles se actualice
        jPanelOpcionACCIONES3.getParent().revalidate();
        jPanelOpcionACCIONES3.getParent().repaint();
    }//GEN-LAST:event_jComboBoxPulsaciones1ActionPerformed

    private void jRadioButtonACCIONES1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonACCIONES1ActionPerformed

        if (jRadioButtonACCIONES1.isSelected()) {
            jPanelPrincipalJuegoDePaneles.setVisible(false);
            jPanelOpcionACCIONES1.setVisible(true);
        } else {
            jPanelOpcionACCIONES1.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButtonACCIONES1ActionPerformed

    private void jComboBoxBotones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBotones1ActionPerformed

        String seleccion = (String) jComboBoxBotones1.getSelectedItem();

        // Muestra el panel correspondiente según la selección
        switch (seleccion) {
            case "Botones":
                jPanelOpcionACCIONES2.setVisible(false); // Oculta Opciones
                jPanelOpcionACCIONES1.setVisible(true);  // Muestra Botones
                break;
            case "Opciones":
                jPanelOpcionACCIONES1.setVisible(false); // Oculta Botones
                jPanelOpcionACCIONES2.setVisible(true);  // Muestra Opciones
                break;
            default:
                break;
        }

        // Asegura que el contenedor principal de ambos paneles se actualice
        jPanelOpcionACCIONES1.getParent().revalidate();
        jPanelOpcionACCIONES1.getParent().repaint();
    }//GEN-LAST:event_jComboBoxBotones1ActionPerformed

    private void jComboBoxBotones2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBotones2ActionPerformed
        String seleccion = (String) jComboBoxBotones2.getSelectedItem();

        // Muestra el panel correspondiente según la selección
        switch (seleccion) {
            case "Botones":
                jPanelOpcionACCIONES2.setVisible(false); // Oculta Opciones
                jPanelOpcionACCIONES1.setVisible(true);  // Muestra Botones
                break;
            case "Opciones":
                jPanelOpcionACCIONES1.setVisible(false); // Oculta Botones
                jPanelOpcionACCIONES2.setVisible(true);  // Muestra Opciones
                break;
            default:
                break;
        }

        // Asegura que el contenedor principal de ambos paneles se actualice
        jPanelOpcionACCIONES1.getParent().revalidate();
        jPanelOpcionACCIONES1.getParent().repaint();
    }//GEN-LAST:event_jComboBoxBotones2ActionPerformed

    private void jRadioButtonRESULTADOS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRESULTADOS1ActionPerformed
        if (jRadioButtonRESULTADOS1.isSelected()) {
            jPanelPrincipalJuegoDePaneles.setVisible(false);
            jPanelOpcionACCIONES3.setVisible(true);
        } else {
            jPanelOpcionACCIONES3.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButtonRESULTADOS1ActionPerformed

    private void jComboBoxPulsacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPulsacionesActionPerformed
        String seleccion = (String) jComboBoxPulsaciones.getSelectedItem();

        // Muestra el panel correspondiente según la selección
        switch (seleccion) {
            case "Pulsaciones":
                jPanelOpcionACCIONES2.setVisible(false); // Oculta Opciones
                jPanelOpcionACCIONES3.setVisible(true);  // Muestra Botones
                break;
            case "Selecciones":
                jPanelOpcionACCIONES3.setVisible(false); // Oculta Botones
                jPanelOpcionACCIONES4.setVisible(true);  // Muestra Opciones
                break;
            default:
                break;
        }

        // Asegura que el contenedor principal de ambos paneles se actualice
        jPanelOpcionACCIONES3.getParent().revalidate();
        jPanelOpcionACCIONES3.getParent().repaint();
    }//GEN-LAST:event_jComboBoxPulsacionesActionPerformed

    private void jRadioButtonACCIONES2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonACCIONES2ActionPerformed
        if (jRadioButtonACCIONES2.isSelected()) {
            jPanelPrincipalJuegoDePaneles.setVisible(false);
            jPanelOpcionACCIONES1.setVisible(true);
        } else {
            jPanelOpcionACCIONES1.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButtonACCIONES2ActionPerformed

    private void jRadioButtonRESULTADOS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRESULTADOS2ActionPerformed
        // Verifica si jRadioButtonRESULTADOS2 está seleccionado
        if (jRadioButtonRESULTADOS2.isSelected()) {
            jPanelOpcionACCIONES1.setVisible(false);
            jPanelOpcionACCIONES3.setVisible(true);
        } else {
            jPanelOpcionACCIONES3.setVisible(false);
        }
        jPanelPrincipalJuegoDePaneles.setVisible(false);

    }//GEN-LAST:event_jRadioButtonRESULTADOS2ActionPerformed

    private void jRadioButtonACCIONES3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonACCIONES3ActionPerformed
        if (jRadioButtonACCIONES3.isSelected()) {
            jPanelPrincipalJuegoDePaneles.setVisible(false);
            jPanelOpcionACCIONES1.setVisible(true);
        } else {
            jPanelOpcionACCIONES1.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButtonACCIONES3ActionPerformed

    private void jRadioButtonRESULTADOS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRESULTADOS3ActionPerformed
        if (jRadioButtonRESULTADOS3.isSelected()) {
            jPanelOpcionACCIONES2.setVisible(false);
            jPanelOpcionACCIONES3.setVisible(true);
        } else {
            jPanelOpcionACCIONES3.setVisible(false);
        }
        jPanelPrincipalJuegoDePaneles.setVisible(false);
    }//GEN-LAST:event_jRadioButtonRESULTADOS3ActionPerformed

    private void jRadioButtonRESULTADOS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRESULTADOS5ActionPerformed
        if (jRadioButtonRESULTADOS5.isSelected()) {
            jPanelOpcionACCIONES2.setVisible(false);
            jPanelOpcionACCIONES3.setVisible(true);
        } else {
            jPanelOpcionACCIONES3.setVisible(false);
        }
        jPanelPrincipalJuegoDePaneles.setVisible(false);
    }//GEN-LAST:event_jRadioButtonRESULTADOS5ActionPerformed

    private void jButtonB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB1ActionPerformed
        actualizarContador("B1");
    }//GEN-LAST:event_jButtonB1ActionPerformed

    private void jButtonB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB2ActionPerformed
        actualizarContador("B2");
    }//GEN-LAST:event_jButtonB2ActionPerformed

    private void jButtonB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB4ActionPerformed
        actualizarContador("B3");
    }//GEN-LAST:event_jButtonB4ActionPerformed

    private void jButtonB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB3ActionPerformed
        actualizarContador("B4");
    }//GEN-LAST:event_jButtonB3ActionPerformed

    private void jCheckBoxLEERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLEERActionPerformed
        actualizarTextoArea();

    }//GEN-LAST:event_jCheckBoxLEERActionPerformed

    private void jCheckBoxESCALADAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxESCALADAActionPerformed
        actualizarTextoArea();

    }//GEN-LAST:event_jCheckBoxESCALADAActionPerformed

    private void jCheckBoxESQUIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxESQUIARActionPerformed
        actualizarTextoArea();

    }//GEN-LAST:event_jCheckBoxESQUIARActionPerformed

    private void jCheckBoxSUBMARINISMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSUBMARINISMOActionPerformed
        actualizarTextoArea();

    }//GEN-LAST:event_jCheckBoxSUBMARINISMOActionPerformed

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
            java.util.logging.Logger.getLogger(CambiarPaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarPaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarPaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarPaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarPaneles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JButton jButtonB1;
    private javax.swing.JButton jButtonB2;
    private javax.swing.JButton jButtonB3;
    private javax.swing.JButton jButtonB4;
    private javax.swing.JCheckBox jCheckBoxESCALADA;
    private javax.swing.JCheckBox jCheckBoxESQUIAR;
    private javax.swing.JCheckBox jCheckBoxLEER;
    private javax.swing.JCheckBox jCheckBoxSUBMARINISMO;
    private javax.swing.JComboBox<String> jComboBoxBotones1;
    private javax.swing.JComboBox<String> jComboBoxBotones2;
    private javax.swing.JComboBox<String> jComboBoxPulsaciones;
    private javax.swing.JComboBox<String> jComboBoxPulsaciones1;
    private javax.swing.JLabel jLabelCambiarACCIONES1;
    private javax.swing.JLabel jLabelCambiarACCIONES2;
    private javax.swing.JLabel jLabelCambiarACCIONES3;
    private javax.swing.JLabel jLabelCambiarACCIONES4;
    private javax.swing.JLabel jLabelCambiarACCIONES5;
    private javax.swing.JLabel jLabelCambiarAcciones1;
    private javax.swing.JLabel jLabelCambiarAcciones2;
    private javax.swing.JLabel jLabelCambiarResultados1;
    private javax.swing.JLabel jLabelCambiarResultados2;
    private javax.swing.JLabel jLabelJuegoDePaneles;
    private javax.swing.JLabel jLabelRECUENTOPULSACIONES;
    private javax.swing.JLabel jLabelRECUENTOPULSACIONES2;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelBotones1;
    private javax.swing.JPanel jPanelBotones2;
    private javax.swing.JPanel jPanelBotones3;
    private javax.swing.JPanel jPanelCambiarAcciones1;
    private javax.swing.JPanel jPanelCambiarAcciones2;
    private javax.swing.JPanel jPanelCambiarAcciones3;
    private javax.swing.JPanel jPanelCambiarAcciones4;
    private javax.swing.JPanel jPanelCambiarAcciones5;
    private javax.swing.JPanel jPanelConCardLayout;
    private javax.swing.JPanel jPanelOpcionACCIONES1;
    private javax.swing.JPanel jPanelOpcionACCIONES2;
    private javax.swing.JPanel jPanelOpcionACCIONES3;
    private javax.swing.JPanel jPanelOpcionACCIONES4;
    private javax.swing.JPanel jPanelPrincipalJuegoDePaneles;
    private javax.swing.JRadioButton jRadioButtonACCIONES1;
    private javax.swing.JRadioButton jRadioButtonACCIONES2;
    private javax.swing.JRadioButton jRadioButtonACCIONES3;
    private javax.swing.JRadioButton jRadioButtonACCIONES4;
    private javax.swing.JRadioButton jRadioButtonACCIONES5;
    private javax.swing.JRadioButton jRadioButtonRESULTADOS1;
    private javax.swing.JRadioButton jRadioButtonRESULTADOS2;
    private javax.swing.JRadioButton jRadioButtonRESULTADOS3;
    private javax.swing.JRadioButton jRadioButtonRESULTADOS4;
    private javax.swing.JRadioButton jRadioButtonRESULTADOS5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePulsaciones;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
