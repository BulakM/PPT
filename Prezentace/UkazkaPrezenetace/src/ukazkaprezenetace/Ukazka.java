/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukazkaprezenetace;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Ukazka extends javax.swing.JFrame {

    /**
     * Creates new form Ukazka
     */
    public Ukazka() {
        setTitle("Ukázky pro prezentaci");
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

        tpHlavni = new javax.swing.JTabbedPane();
        pnKalkulacka = new javax.swing.JPanel();
        tbPrvniCislo = new javax.swing.JTextField();
        lbPrvniCislo = new javax.swing.JLabel();
        lbDruheCislo = new javax.swing.JLabel();
        tbDruheCislo = new javax.swing.JTextField();
        btSecist = new javax.swing.JButton();
        btOdecist = new javax.swing.JButton();
        btNasobit = new javax.swing.JButton();
        btDelit = new javax.swing.JButton();
        lbVysledekPopisek = new javax.swing.JLabel();
        lbVysledek = new javax.swing.JLabel();
        lbKalkulackaZadani = new javax.swing.JLabel();
        pnFaktorial = new javax.swing.JPanel();
        lbFaktorialCislo = new javax.swing.JLabel();
        tbFaktorial = new javax.swing.JTextField();
        lbZadavaniFaktorial = new javax.swing.JLabel();
        btFaktorial = new javax.swing.JButton();
        lbFaktorialVysledek = new javax.swing.JLabel();
        pnMichaniBarev = new javax.swing.JPanel();
        slRed = new javax.swing.JSlider();
        lbMinRed = new javax.swing.JLabel();
        lbMaxRed = new javax.swing.JLabel();
        lbMinGreen = new javax.swing.JLabel();
        lbMinBlue = new javax.swing.JLabel();
        lbMaxBlue = new javax.swing.JLabel();
        lbMaxGreen = new javax.swing.JLabel();
        slBlue = new javax.swing.JSlider();
        slGreen = new javax.swing.JSlider();
        tbRed = new javax.swing.JTextField();
        tbBlue = new javax.swing.JTextField();
        tbGreen = new javax.swing.JTextField();
        pnBarva = new javax.swing.JPanel();
        lbRed = new javax.swing.JLabel();
        lbGreen = new javax.swing.JLabel();
        lbBlue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tpHlavni.setToolTipText("Aplika pro prezentaci");
        tpHlavni.setName("tpHlavni"); // NOI18N

        pnKalkulacka.setName("tpKalkulacka"); // NOI18N

        lbPrvniCislo.setText("První číslo:");

        lbDruheCislo.setText("Druhé číslo:");

        btSecist.setBackground(new java.awt.Color(0, 0, 204));
        btSecist.setText("+");
        btSecist.setMaximumSize(new java.awt.Dimension(41, 23));
        btSecist.setMinimumSize(new java.awt.Dimension(41, 23));
        btSecist.setPreferredSize(new java.awt.Dimension(41, 31));
        btSecist.setRequestFocusEnabled(false);
        btSecist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSecistActionPerformed(evt);
            }
        });

        btOdecist.setBackground(new java.awt.Color(255, 0, 0));
        btOdecist.setText("-");
        btOdecist.setMaximumSize(new java.awt.Dimension(41, 23));
        btOdecist.setMinimumSize(new java.awt.Dimension(41, 23));
        btOdecist.setPreferredSize(new java.awt.Dimension(41, 31));
        btOdecist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOdecistActionPerformed(evt);
            }
        });

        btNasobit.setBackground(new java.awt.Color(51, 255, 0));
        btNasobit.setText("*");
        btNasobit.setMaximumSize(new java.awt.Dimension(41, 23));
        btNasobit.setMinimumSize(new java.awt.Dimension(41, 23));
        btNasobit.setPreferredSize(new java.awt.Dimension(41, 31));
        btNasobit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNasobitActionPerformed(evt);
            }
        });

        btDelit.setBackground(new java.awt.Color(255, 255, 0));
        btDelit.setText("/");
        btDelit.setMaximumSize(new java.awt.Dimension(41, 31));
        btDelit.setMinimumSize(new java.awt.Dimension(41, 31));
        btDelit.setPreferredSize(new java.awt.Dimension(41, 31));
        btDelit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelitActionPerformed(evt);
            }
        });

        lbVysledekPopisek.setText("Výsledek:");

        lbKalkulackaZadani.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbKalkulackaZadani.setText("Zadávejte celá čísla");

        javax.swing.GroupLayout pnKalkulackaLayout = new javax.swing.GroupLayout(pnKalkulacka);
        pnKalkulacka.setLayout(pnKalkulackaLayout);
        pnKalkulackaLayout.setHorizontalGroup(
            pnKalkulackaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKalkulackaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnKalkulackaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnKalkulackaLayout.createSequentialGroup()
                        .addComponent(lbVysledekPopisek)
                        .addGap(30, 30, 30)
                        .addComponent(lbVysledek))
                    .addGroup(pnKalkulackaLayout.createSequentialGroup()
                        .addGroup(pnKalkulackaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnKalkulackaLayout.createSequentialGroup()
                                .addComponent(lbDruheCislo)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnKalkulackaLayout.createSequentialGroup()
                                .addComponent(lbPrvniCislo)
                                .addGap(23, 23, 23)))
                        .addGroup(pnKalkulackaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnKalkulackaLayout.createSequentialGroup()
                                .addComponent(btSecist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btOdecist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btNasobit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btDelit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnKalkulackaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tbDruheCislo, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addComponent(tbPrvniCislo))))
                    .addComponent(lbKalkulackaZadani))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        pnKalkulackaLayout.setVerticalGroup(
            pnKalkulackaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKalkulackaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbKalkulackaZadani)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnKalkulackaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrvniCislo)
                    .addComponent(tbPrvniCislo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnKalkulackaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDruheCislo)
                    .addComponent(tbDruheCislo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnKalkulackaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSecist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOdecist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNasobit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnKalkulackaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVysledekPopisek)
                    .addComponent(lbVysledek))
                .addGap(196, 196, 196))
        );

        lbPrvniCislo.getAccessibleContext().setAccessibleName("lbPrvniCislo");

        tpHlavni.addTab("Kalkulačka", pnKalkulacka);

        lbFaktorialCislo.setText("Vypočítat faktoriál z čísla:");

        lbZadavaniFaktorial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbZadavaniFaktorial.setText("Zadávejte celá čísla v rozmezí 0 až 25");

        btFaktorial.setText("Vypočítat");
        btFaktorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFaktorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnFaktorialLayout = new javax.swing.GroupLayout(pnFaktorial);
        pnFaktorial.setLayout(pnFaktorialLayout);
        pnFaktorialLayout.setHorizontalGroup(
            pnFaktorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFaktorialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFaktorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFaktorialLayout.createSequentialGroup()
                        .addComponent(lbFaktorialCislo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbFaktorial, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btFaktorial))
                    .addComponent(lbZadavaniFaktorial)
                    .addComponent(lbFaktorialVysledek))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        pnFaktorialLayout.setVerticalGroup(
            pnFaktorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFaktorialLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbZadavaniFaktorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFaktorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFaktorialCislo)
                    .addComponent(tbFaktorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFaktorial))
                .addGap(18, 18, 18)
                .addComponent(lbFaktorialVysledek)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        tpHlavni.addTab("Výpočet faktoriálu", pnFaktorial);

        slRed.setMaximum(255);
        slRed.setValue(150);
        slRed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slRedStateChanged(evt);
            }
        });

        lbMinRed.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbMinRed.setText("0");

        lbMaxRed.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbMaxRed.setText("255");

        lbMinGreen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbMinGreen.setText("0");

        lbMinBlue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbMinBlue.setText("0");

        lbMaxBlue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbMaxBlue.setText("255");

        lbMaxGreen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbMaxGreen.setText("255");

        slBlue.setMaximum(255);
        slBlue.setValue(150);
        slBlue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slBlueStateChanged(evt);
            }
        });

        slGreen.setMaximum(255);
        slGreen.setValue(150);
        slGreen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slGreenStateChanged(evt);
            }
        });

        tbRed.setEditable(false);
        tbRed.setText("150");
        tbRed.setToolTipText("");

        tbBlue.setEditable(false);
        tbBlue.setText("150");
        tbBlue.setToolTipText("");

        tbGreen.setEditable(false);
        tbGreen.setText("150");
        tbGreen.setToolTipText("");

        pnBarva.setBackground(new java.awt.Color(150, 150, 150));

        javax.swing.GroupLayout pnBarvaLayout = new javax.swing.GroupLayout(pnBarva);
        pnBarva.setLayout(pnBarvaLayout);
        pnBarvaLayout.setHorizontalGroup(
            pnBarvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnBarvaLayout.setVerticalGroup(
            pnBarvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        lbRed.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbRed.setText("Červená");

        lbGreen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbGreen.setText("Zelená");

        lbBlue.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbBlue.setText("Modrá");

        javax.swing.GroupLayout pnMichaniBarevLayout = new javax.swing.GroupLayout(pnMichaniBarev);
        pnMichaniBarev.setLayout(pnMichaniBarevLayout);
        pnMichaniBarevLayout.setHorizontalGroup(
            pnMichaniBarevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMichaniBarevLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMichaniBarevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMichaniBarevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnBarva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnMichaniBarevLayout.createSequentialGroup()
                            .addGroup(pnMichaniBarevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnMichaniBarevLayout.createSequentialGroup()
                                    .addComponent(lbMinBlue)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(slBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnMichaniBarevLayout.createSequentialGroup()
                                    .addComponent(lbMinRed)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(slRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lbBlue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnMichaniBarevLayout.createSequentialGroup()
                                    .addComponent(lbMinGreen)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(slGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnMichaniBarevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMichaniBarevLayout.createSequentialGroup()
                                    .addComponent(lbMaxGreen)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tbGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMichaniBarevLayout.createSequentialGroup()
                                    .addComponent(lbMaxRed)
                                    .addGap(37, 37, 37)
                                    .addComponent(tbRed, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMichaniBarevLayout.createSequentialGroup()
                                    .addComponent(lbMaxBlue)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tbBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lbRed)
                    .addComponent(lbGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMichaniBarevLayout.setVerticalGroup(
            pnMichaniBarevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMichaniBarevLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbRed)
                .addGap(4, 4, 4)
                .addGroup(pnMichaniBarevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnMichaniBarevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(slRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbMinRed, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(pnMichaniBarevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbMaxRed)
                        .addComponent(tbRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(lbGreen)
                .addGap(13, 13, 13)
                .addGroup(pnMichaniBarevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMinGreen)
                    .addGroup(pnMichaniBarevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbMaxGreen)
                        .addComponent(tbGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(slGreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbBlue)
                .addGap(13, 13, 13)
                .addGroup(pnMichaniBarevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMichaniBarevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbMaxBlue)
                        .addComponent(tbBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(slBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMinBlue))
                .addGap(28, 28, 28)
                .addComponent(pnBarva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        tpHlavni.addTab("Míchání barev", pnMichaniBarev);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpHlavni)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpHlavni)
        );

        tpHlavni.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public long faktorial(int cislo){
        if(cislo == 0){
            return 1;
        }
        long fact = 1;
        for (int i = 1; i <= cislo; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public void zmenaBarvy(){
        int red = slRed.getValue();
        int green = slGreen.getValue();
        int blue = slBlue.getValue();
        pnBarva.setBackground(new Color(red, green, blue));
    }
    
    private void btSecistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSecistActionPerformed
        try{
            int cislo1 = Integer.parseInt(tbPrvniCislo.getText());
            int cislo2 = Integer.parseInt(tbDruheCislo.getText());
            lbVysledek.setText(Integer.toString(cislo1 + cislo2));
        }catch (NumberFormatException ex){
            lbVysledek.setText("");
            JOptionPane.showMessageDialog(pnKalkulacka, "Některé číslo bylo špatně zadáno", "Chyba při převodu čísla", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSecistActionPerformed

    private void btOdecistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOdecistActionPerformed
        try{
            int cislo1 = Integer.parseInt(tbPrvniCislo.getText());
            int cislo2 = Integer.parseInt(tbDruheCislo.getText());
            lbVysledek.setText(Integer.toString(cislo1 - cislo2));
        }catch (NumberFormatException ex){
            lbVysledek.setText("");
            JOptionPane.showMessageDialog(pnKalkulacka, "Některé číslo bylo špatně zadáno", "Chyba při převodu čísla", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btOdecistActionPerformed

    private void btNasobitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNasobitActionPerformed
        try{
            int cislo1 = Integer.parseInt(tbPrvniCislo.getText());
            int cislo2 = Integer.parseInt(tbDruheCislo.getText());
            lbVysledek.setText(Integer.toString(cislo1 * cislo2));
        }catch (NumberFormatException ex){
            lbVysledek.setText("");
            JOptionPane.showMessageDialog(pnKalkulacka, "Některé číslo bylo špatně zadáno", "Chyba při převodu čísla", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btNasobitActionPerformed

    private void btDelitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelitActionPerformed
        try{
            double cislo1 = Double.parseDouble(tbPrvniCislo.getText());
            double cislo2 = Double.parseDouble(tbDruheCislo.getText());
            if (cislo2 == 0){
                lbVysledek.setText("");
                JOptionPane.showMessageDialog(pnKalkulacka, "Nelze dělit nulou", 
                        "Chyba při dělení", JOptionPane.ERROR_MESSAGE);
                return;
            }
            lbVysledek.setText(Double.toString(cislo1/cislo2));
        }catch (NumberFormatException ex){
            lbVysledek.setText("");
            JOptionPane.showMessageDialog(pnKalkulacka, "Některé číslo bylo špatně zadáno", 
                    "Chyba při převodu čísla", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btDelitActionPerformed

    private void btFaktorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFaktorialActionPerformed
        try{
            int cislo = Integer.parseInt(tbFaktorial.getText());
            if ((cislo > 25) || (cislo < 0)){
                lbFaktorialVysledek.setText("");
                JOptionPane.showMessageDialog(pnFaktorial, "Zadávejte čísla v rozmezí 0 až 25", "Chyba rozsahu čísla", JOptionPane.ERROR_MESSAGE);
                return;
            }
            lbFaktorialVysledek.setText("Faktoriál z čísla " + cislo + " je: " + Long.toString(faktorial(cislo)));
        }catch (NumberFormatException ex){
            lbFaktorialVysledek.setText("");
            JOptionPane.showMessageDialog(pnFaktorial, "Číslo k výpočtu faktoriálu bylo špatně zadáno", "Chyba při zadání čísla", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btFaktorialActionPerformed

    private void slRedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slRedStateChanged
        zmenaBarvy();
        tbRed.setText(Integer.toString(slRed.getValue()));
    }//GEN-LAST:event_slRedStateChanged

    private void slGreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slGreenStateChanged
        zmenaBarvy();
        tbGreen.setText(Integer.toString(slGreen.getValue()));
    }//GEN-LAST:event_slGreenStateChanged

    private void slBlueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slBlueStateChanged
        zmenaBarvy();
        tbBlue.setText(Integer.toString(slBlue.getValue()));
    }//GEN-LAST:event_slBlueStateChanged

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
            java.util.logging.Logger.getLogger(Ukazka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ukazka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ukazka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ukazka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ukazka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelit;
    private javax.swing.JButton btFaktorial;
    private javax.swing.JButton btNasobit;
    private javax.swing.JButton btOdecist;
    private javax.swing.JButton btSecist;
    private javax.swing.JLabel lbBlue;
    private javax.swing.JLabel lbDruheCislo;
    private javax.swing.JLabel lbFaktorialCislo;
    private javax.swing.JLabel lbFaktorialVysledek;
    private javax.swing.JLabel lbGreen;
    private javax.swing.JLabel lbKalkulackaZadani;
    private javax.swing.JLabel lbMaxBlue;
    private javax.swing.JLabel lbMaxGreen;
    private javax.swing.JLabel lbMaxRed;
    private javax.swing.JLabel lbMinBlue;
    private javax.swing.JLabel lbMinGreen;
    private javax.swing.JLabel lbMinRed;
    private javax.swing.JLabel lbPrvniCislo;
    private javax.swing.JLabel lbRed;
    private javax.swing.JLabel lbVysledek;
    private javax.swing.JLabel lbVysledekPopisek;
    private javax.swing.JLabel lbZadavaniFaktorial;
    private javax.swing.JPanel pnBarva;
    private javax.swing.JPanel pnFaktorial;
    private javax.swing.JPanel pnKalkulacka;
    private javax.swing.JPanel pnMichaniBarev;
    private javax.swing.JSlider slBlue;
    private javax.swing.JSlider slGreen;
    private javax.swing.JSlider slRed;
    private javax.swing.JTextField tbBlue;
    private javax.swing.JTextField tbDruheCislo;
    private javax.swing.JTextField tbFaktorial;
    private javax.swing.JTextField tbGreen;
    private javax.swing.JTextField tbPrvniCislo;
    private javax.swing.JTextField tbRed;
    private javax.swing.JTabbedPane tpHlavni;
    // End of variables declaration//GEN-END:variables
}
