/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pds.mvc_gestProspect;

import com.pds.entities.CalculPret;
import com.pds.entities.SimulationPret;
import com.pds.entities.Taux_directeur;
import com.pds.enums.TypeEmprunt;
import com.pds.graphics.MainGraphics;
import com.pds.implobs.AbstractObservable;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JIHANE
 */
public class View_SimProspect extends javax.swing.JInternalFrame implements com.pds.implobs.IObserver {

    private Controller_gestProspect controller;
    private double mtPret;
    private double TEAG;
    private double tauxAssurance;
    private SimulationPret simPret;
    private CalculPret calculPret;

    public View_SimProspect(Controller_gestProspect controller) {
        this.controller = controller;
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

        jLabel9 = new javax.swing.JLabel();
        iDureePret = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        iMtPret = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        iTauxInteret = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        iDateContraction = new com.toedter.calendar.JDateChooser();
        iTauxAssurance = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        iTTPret = new javax.swing.JTextField();
        iTTInteret = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        iTTAssurance = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        iRembourssement = new javax.swing.JTextField();
        cbTypeEmprunt = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        iRevenu = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        iAge = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        iTypeContrat = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLabel9.setText("Type d'emprunt     :");

        iDureePret.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iDureePretKeyPressed(evt);
            }
        });

        jLabel11.setText("Durée de prêt (en mois)  :");

        jLabel12.setText("Date de référence  :");

        jLabel13.setText("Le montant du prêt :");

        jLabel14.setText("Taux D'intérêt (TAEG) :");

        jLabel15.setText("Taux d'assurance   :");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 204));
        jLabel1.setText("Simulation de prêt ");

        jButton1.setText("Afficher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Résultat"));

        jLabel19.setText("Cout total de prêt   :");

        iTTInteret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iTTInteretActionPerformed(evt);
            }
        });

        jLabel16.setText("Mt total des intérêts :");

        jLabel17.setText("Mt total de l'assurance:");

        jLabel18.setText("Mt de rembourssement :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iTTPret)
                            .addComponent(iRembourssement, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iTTAssurance)
                            .addComponent(iTTInteret))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(iTTInteret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(iTTAssurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(iRembourssement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iTTPret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(34, 34, 34))
        );

        cbTypeEmprunt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prêt immobilier", "Prêt consomateur", " " }));
        cbTypeEmprunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypeEmpruntActionPerformed(evt);
            }
        });

        jButton2.setText("Simuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel20.setText("Age  : ");

        iRevenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iRevenuMouseClicked(evt);
            }
        });
        iRevenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iRevenuKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iRevenuKeyReleased(evt);
            }
        });

        jLabel21.setText("Revenu : ");

        iAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iAgeMousePressed(evt);
            }
        });

        jLabel22.setText("Type contrat :");

        iTypeContrat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iTypeContratMouseClicked(evt);
            }
        });
        iTypeContrat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iTypeContratKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iTypeContratKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(iTauxAssurance)
                                .addComponent(iTauxInteret, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(iMtPret, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(iDateContraction, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbTypeEmprunt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iDureePret, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iRevenu, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iAge, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iTypeContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTypeEmprunt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iDureePret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(iAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(iRevenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(iTypeContrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(iDateContraction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iMtPret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iTauxInteret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iTauxAssurance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iTTInteretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iTTInteretActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iTTInteretActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controller.showFrameTableAmmort(chargerSimulation());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbTypeEmpruntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypeEmpruntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTypeEmpruntActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        chargerSimulation();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void iRevenuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iRevenuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_iRevenuKeyPressed

    private void iRevenuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iRevenuKeyReleased

    }//GEN-LAST:event_iRevenuKeyReleased

    private void iTypeContratKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iTypeContratKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_iTypeContratKeyPressed

    private void iTypeContratKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iTypeContratKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_iTypeContratKeyReleased

    private void iDureePretKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iDureePretKeyPressed
        chargerTauxInteret();
    }//GEN-LAST:event_iDureePretKeyPressed

    private void iAgeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iAgeMousePressed
        chargerTauxInteret();
    }//GEN-LAST:event_iAgeMousePressed

    private void iTypeContratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iTypeContratMouseClicked
        chargerTauxInteret();
    }//GEN-LAST:event_iTypeContratMouseClicked

    private void iRevenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iRevenuMouseClicked
        chargerTauxInteret();
    }//GEN-LAST:event_iRevenuMouseClicked

    public void chargerTauxInteret() {
        try {
            int age = Integer.parseInt(iAge.getText());
            boolean isClient = false;
            double revenu = Double.parseDouble(iRevenu.getText());
            TypeEmprunt typeEmprunt = (cbTypeEmprunt.getSelectedIndex() == 0) ? TypeEmprunt._Credit_IMMO_ : TypeEmprunt._CREDIT_CONSO_;
            String typeContrat = "NON";
            if ("cdd".equalsIgnoreCase(iTypeContrat.getText().trim().toLowerCase())) 
                typeContrat = "cdd";
            else if ("cdi".equalsIgnoreCase(iTypeContrat.getText().trim().toLowerCase())) 
                typeContrat = "cdi";
            
            controller.askTauxInteret(age, revenu, typeContrat, typeEmprunt, isClient);
        } catch (Exception e) {
            System.out.println("formulaire mal rempli" + e.getMessage());
        }

        
    }

    @Override
    public boolean update(AbstractObservable sender, String message, Object... data) {
        System.out.println("j'ai recu " + message);
        if ("setTauxInteretProspect".equalsIgnoreCase(message)) {
            iTauxInteret.setText(data[0].toString());
        }
        return true;
    }

    public SimulationPret chargerSimulation() {

        try {
            int dureePret = Integer.parseInt(iDureePret.getText());
            mtPret = Double.parseDouble(iMtPret.getText());
            TEAG = Double.parseDouble(iTauxInteret.getText());
            tauxAssurance = Double.parseDouble(iTauxAssurance.getText());

            double mtTTInteret = (mtPret * dureePret * TEAG) / 1200;
            double mtTTAssurance = (mtPret * dureePret * tauxAssurance) / 1200;

            this.iTTInteret.setText(mtTTInteret + "");
            this.iTTAssurance.setText(mtTTAssurance + "");
            //this.iTTAssurance.setText(Double.toString(simPret.getMtPret()));
            double mensualite = (mtTTInteret + mtTTAssurance + mtPret) / dureePret;
            this.iRembourssement.setText(mensualite + "");
            this.iTTPret.setText(mensualite * dureePret + "");

            Timestamp timestamp = new Timestamp(iDateContraction.getDate().getTime());

            SimulationPret simPret = new SimulationPret();

            simPret.setDureePret(dureePret);
            simPret.setMtPret(mtPret);
            simPret.setDateContraction(timestamp);
            if (this.cbTypeEmprunt.getSelectedIndex() == 0) {
                simPret.setTypeEmprunt(TypeEmprunt._Credit_IMMO_);
            } else {
                simPret.setTypeEmprunt(TypeEmprunt._CREDIT_CONSO_);
            }

            CalculPret calculPret = new CalculPret();
            calculPret.setCoef_assurance(tauxAssurance);
            calculPret.setT_marge(TEAG);
            Taux_directeur tauxDir = new Taux_directeur(0);
            calculPret.setTauxDirecteur(tauxDir);
            simPret.setCalcPret(calculPret);
            this.iTTInteret.setText(Double.toString(simPret.calcSum(simPret.calcInterets())));

            return simPret;
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Le formulaire est mal rempli");
            return null;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbTypeEmprunt;
    private javax.swing.JTextField iAge;
    private com.toedter.calendar.JDateChooser iDateContraction;
    private javax.swing.JTextField iDureePret;
    private javax.swing.JTextField iMtPret;
    private javax.swing.JTextField iRembourssement;
    private javax.swing.JTextField iRevenu;
    private javax.swing.JTextField iTTAssurance;
    private javax.swing.JTextField iTTInteret;
    private javax.swing.JTextField iTTPret;
    private javax.swing.JTextField iTauxAssurance;
    private javax.swing.JTextField iTauxInteret;
    private javax.swing.JTextField iTypeContrat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
