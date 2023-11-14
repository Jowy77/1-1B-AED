package pkg1.pkg1b.aed.vistas;

import pkg1.pkg1b.aed.modelos.PiscinaQuimica;
import pkg1.pkg1b.aed.execeptions.DeficitDeAguaExcepcion;
import pkg1.pkg1b.aed.execeptions.PiscinaDesbordadaExcepcion;
import java.util.Random;
import javax.swing.JOptionPane;

public class PiscinaView extends javax.swing.JFrame {

    PiscinaQuimica nuevaPiscinaQuimica;
    boolean simulacionStarted = false;

    public PiscinaView() {
        initComponents();
        this.setLocationRelativeTo(null);
        //-----------------------------------------
        capacidadJSlider.setMinimum(0);
        capacidadJSlider.setMaximum(2000);
        //-----------------------------------------
        capacidadJSlider.setMajorTickSpacing(100);
        capacidadJSlider.setMinorTickSpacing(10);
        //-----------------------------------------
        capacidadJSlider.setValue(0);
        capacidadJSlider.setPaintTicks(true);
        capacidadJSlider.setPaintLabels(true);
        capacidadJSlider.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        piscinaQuimicaJPanel = new javax.swing.JPanel();
        capacidadJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMetrosCubicosJList = new javax.swing.JList<>();
        simulacionJButton = new javax.swing.JButton();
        capacidadJSlider = new javax.swing.JSlider();
        vaciarPiscinaJButton = new javax.swing.JButton();
        llenarPiscinaJButton = new javax.swing.JButton();
        panelInformacionJScrollPanel = new javax.swing.JScrollPane();
        informacionDeLaPiscinaJTextArea = new javax.swing.JTextArea();
        litrosMaximoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 450));
        setResizable(false);

        piscinaQuimicaJPanel.setMaximumSize(new java.awt.Dimension(650, 450));
        piscinaQuimicaJPanel.setMinimumSize(new java.awt.Dimension(650, 450));

        capacidadJLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        capacidadJLabel.setText("Capacidad en metros cúbicos:");

        listaMetrosCubicosJList.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listaMetrosCubicosJList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1.0", "1.1", "1.2", "1.3", "1.4", "1.5", "1.6", "1.7", "1.8", "1.9", "2.0" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaMetrosCubicosJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaMetrosCubicosJList);

        simulacionJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        simulacionJButton.setText("SIMULACIÓN");
        simulacionJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simulacionJButtonMouseClicked(evt);
            }
        });

        vaciarPiscinaJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vaciarPiscinaJButton.setText("VACIAR");
        vaciarPiscinaJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vaciarPiscinaJButtonMouseClicked(evt);
            }
        });

        llenarPiscinaJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        llenarPiscinaJButton.setText("LLENAR");
        llenarPiscinaJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                llenarPiscinaJButtonMouseClicked(evt);
            }
        });

        informacionDeLaPiscinaJTextArea.setColumns(20);
        informacionDeLaPiscinaJTextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        informacionDeLaPiscinaJTextArea.setRows(5);
        panelInformacionJScrollPanel.setViewportView(informacionDeLaPiscinaJTextArea);

        litrosMaximoTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        litrosMaximoTextField.setText("2000 LITROS MÁXIMO");

        javax.swing.GroupLayout piscinaQuimicaJPanelLayout = new javax.swing.GroupLayout(piscinaQuimicaJPanel);
        piscinaQuimicaJPanel.setLayout(piscinaQuimicaJPanelLayout);
        piscinaQuimicaJPanelLayout.setHorizontalGroup(
            piscinaQuimicaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(piscinaQuimicaJPanelLayout.createSequentialGroup()
                .addGroup(piscinaQuimicaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(piscinaQuimicaJPanelLayout.createSequentialGroup()
                        .addGroup(piscinaQuimicaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(piscinaQuimicaJPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(capacidadJLabel))
                            .addGroup(piscinaQuimicaJPanelLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(simulacionJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(litrosMaximoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(piscinaQuimicaJPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(piscinaQuimicaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(piscinaQuimicaJPanelLayout.createSequentialGroup()
                                .addComponent(vaciarPiscinaJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(llenarPiscinaJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(capacidadJSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelInformacionJScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        piscinaQuimicaJPanelLayout.setVerticalGroup(
            piscinaQuimicaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(piscinaQuimicaJPanelLayout.createSequentialGroup()
                .addGroup(piscinaQuimicaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(piscinaQuimicaJPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(piscinaQuimicaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(piscinaQuimicaJPanelLayout.createSequentialGroup()
                                .addComponent(capacidadJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(simulacionJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(piscinaQuimicaJPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(litrosMaximoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(piscinaQuimicaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaciarPiscinaJButton)
                    .addComponent(llenarPiscinaJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(capacidadJSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInformacionJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(piscinaQuimicaJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(piscinaQuimicaJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simulacionJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simulacionJButtonMouseClicked

        simulacionStarted = true;
        String seleccion = listaMetrosCubicosJList.getSelectedValue();
        capacidadJSlider.setValue(0);

        if (seleccion != null) {
            switch (seleccion) {

                case "1.0":
                    this.nuevaPiscinaQuimica = new PiscinaQuimica(1000);
                    capacidadJSlider.setMaximum(nuevaPiscinaQuimica.NIVEL_MAXIMO);
                    litrosMaximoTextField.setText("1000 LITROS M�XIMO");
                    break;
                case "1.1":
                    this.nuevaPiscinaQuimica = new PiscinaQuimica(1100);
                    capacidadJSlider.setMaximum(nuevaPiscinaQuimica.NIVEL_MAXIMO);
                    litrosMaximoTextField.setText("1100 LITROS M�XIMO");
                    break;
                case "1.2":
                    this.nuevaPiscinaQuimica = new PiscinaQuimica(1200);
                    capacidadJSlider.setMaximum(nuevaPiscinaQuimica.NIVEL_MAXIMO);
                    litrosMaximoTextField.setText("1200 LITROS M�XIMO");
                    break;
                case "1.3":
                    this.nuevaPiscinaQuimica = new PiscinaQuimica(1300);
                    capacidadJSlider.setMaximum(nuevaPiscinaQuimica.NIVEL_MAXIMO);
                    litrosMaximoTextField.setText("1300 LITROS M�XIMO");
                    break;
                case "1.4":
                    this.nuevaPiscinaQuimica = new PiscinaQuimica(1400);
                    capacidadJSlider.setMaximum(nuevaPiscinaQuimica.NIVEL_MAXIMO);
                    litrosMaximoTextField.setText("1400 LITROS M�XIMO");
                    break;
                case "1.5":
                    this.nuevaPiscinaQuimica = new PiscinaQuimica(1500);
                    capacidadJSlider.setMaximum(nuevaPiscinaQuimica.NIVEL_MAXIMO);
                    litrosMaximoTextField.setText("1500 LITROS M�XIMO");
                    break;
                case "1.6":
                    this.nuevaPiscinaQuimica = new PiscinaQuimica(1600);
                    capacidadJSlider.setMaximum(nuevaPiscinaQuimica.NIVEL_MAXIMO);
                    litrosMaximoTextField.setText("1600 LITROS M�XIMO");
                    break;
                case "1.7":
                    this.nuevaPiscinaQuimica = new PiscinaQuimica(1700);
                    capacidadJSlider.setMaximum(nuevaPiscinaQuimica.NIVEL_MAXIMO);
                    litrosMaximoTextField.setText("1700 LITROS M�XIMO");
                    break;
                case "1.8":
                    this.nuevaPiscinaQuimica = new PiscinaQuimica(1800);
                    capacidadJSlider.setMaximum(nuevaPiscinaQuimica.NIVEL_MAXIMO);
                    litrosMaximoTextField.setText("1800 LITROS M�XIMO");
                    break;
                case "1.9":
                    this.nuevaPiscinaQuimica = new PiscinaQuimica(1900);
                    capacidadJSlider.setMaximum(nuevaPiscinaQuimica.NIVEL_MAXIMO);
                    litrosMaximoTextField.setText("1900 LITROS M�XIMO");
                    break;
                case "2.0":
                    this.nuevaPiscinaQuimica = new PiscinaQuimica(2000);
                    capacidadJSlider.setMaximum(nuevaPiscinaQuimica.NIVEL_MAXIMO);
                    litrosMaximoTextField.setText("2000 LITROS M�XIMO");
                    break;

                default:

            }
            informacionDeLaPiscinaJTextArea.setText("");
            informacionDeLaPiscinaJTextArea.append("[i] Piscina vacia: 0");
            informacionDeLaPiscinaJTextArea.append("\n----------------------------------\n");

        } else {

            JOptionPane.showMessageDialog(null, "METROS CUBICOS NO SELECCIONADOS\nSelecciona los metros cubicos en la lista antes de generar la simulacion", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_simulacionJButtonMouseClicked

    private void llenarPiscinaJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llenarPiscinaJButtonMouseClicked

        if (!simulacionStarted) {
            JOptionPane.showMessageDialog(null, "DEBES EMPEZAR LA SIMULACION PRIMERO.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int numeroAleatorio = numeroAleatorio();

            if ((numeroAleatorio + nuevaPiscinaQuimica.getNivel()) > nuevaPiscinaQuimica.NIVEL_MAXIMO) {

                try {
                    throw new PiscinaDesbordadaExcepcion();
                } catch (PiscinaDesbordadaExcepcion ex) {
                    informacionDeLaPiscinaJTextArea.append("Llenado: " + numeroAleatorio + " [i] Exceso de agua: se fija en " + nuevaPiscinaQuimica.getNivel() + " Litros");

                }
            } else {

                nuevaPiscinaQuimica.setNivel(nuevaPiscinaQuimica.getNivel() + numeroAleatorio);
                informacionDeLaPiscinaJTextArea.append("Llenado: " + numeroAleatorio + " Nivel: " + nuevaPiscinaQuimica.getNivel());
                capacidadJSlider.setValue(nuevaPiscinaQuimica.getNivel());
            }

            informacionDeLaPiscinaJTextArea.append("\n----------------------------------\n");
        }
    }//GEN-LAST:event_llenarPiscinaJButtonMouseClicked

    private void vaciarPiscinaJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaciarPiscinaJButtonMouseClicked

        if (!simulacionStarted) {
            JOptionPane.showMessageDialog(null, "DEBES EMPEZAR LA SIMULACION PRIMERO.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {

            int numeroAleatorio = numeroAleatorio();

            if ((nuevaPiscinaQuimica.getNivel() - numeroAleatorio) < 0) {

                try {
                    throw new DeficitDeAguaExcepcion();
                } catch (DeficitDeAguaExcepcion ex) {

                    informacionDeLaPiscinaJTextArea.append("Vaciado: " + numeroAleatorio + " [i] Deficit de agua: se fija en " + nuevaPiscinaQuimica.getNivel() + " Litros");

                }

            } else {

                nuevaPiscinaQuimica.setNivel(nuevaPiscinaQuimica.getNivel() - numeroAleatorio);
                informacionDeLaPiscinaJTextArea.append("Vaciado: " + numeroAleatorio + " Nivel: " + nuevaPiscinaQuimica.getNivel());
                capacidadJSlider.setValue(nuevaPiscinaQuimica.getNivel());

            }

            informacionDeLaPiscinaJTextArea.append("\n----------------------------------\n");
        }
    }//GEN-LAST:event_vaciarPiscinaJButtonMouseClicked

    private int numeroAleatorio() {

        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(1000 - 1 + 1) + 1;

        return numeroAleatorio;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel capacidadJLabel;
    private javax.swing.JSlider capacidadJSlider;
    private javax.swing.JTextArea informacionDeLaPiscinaJTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaMetrosCubicosJList;
    private javax.swing.JTextField litrosMaximoTextField;
    private javax.swing.JButton llenarPiscinaJButton;
    private javax.swing.JScrollPane panelInformacionJScrollPanel;
    private javax.swing.JPanel piscinaQuimicaJPanel;
    private javax.swing.JButton simulacionJButton;
    private javax.swing.JButton vaciarPiscinaJButton;
    // End of variables declaration//GEN-END:variables
}
