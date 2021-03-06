/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pds.mvc_customer;

import com.pds.entities.Client;
import com.pds.entities.MathHepler;
import com.pds.entities.SimulationPret;
import com.pds.graphics.PanelGraphInfoSim;
import com.pds.implobs.AbstractObservable;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zouhairhajji
 */
public class PanelTableSimPret extends javax.swing.JInternalFrame implements com.pds.implobs.IObserver {

    private Client client;
    private List<SimulationPret> listSimPretConcerned;
    private Controller_GestClient controller;
    private PanelGraphInfoSim panelGraphComparaison;
    
    /**
     * @param _1 coefmensualite
     * @param _2 coefDuree
     * @param _3 coefTauxInteret
     * @param _4 coefMtTotal
     * @param _5 coefTypePret
     * @param _6 coefTauxEndettement
     * @param _7 coefDateFin
     */
    private int coefs[];
    private int selectedIndex;
    
    
    
    PanelTableSimPret(Controller_GestClient controller) {
        this.controller = controller;
        this.coefs = new int[]{7, 6, 5, 4, 3, 2, 1};
        this.selectedIndex = -1;
        initComponents();
        fillComboboxDefault();
    }
    
    public void fillComboboxwithValues(int valMIn, int valMax, int coMensualite, int coDuree, int coTauxInter, int coMt, int coTauxFixe, int coTauxEndettement, int coDateFin){
        remplirComboboxCoef(-5, 10, cMensualite, coMensualite);
        remplirComboboxCoef(-5, 10, cDuree, coDuree);
        remplirComboboxCoef(-5, 10, cTauxInter, coTauxInter);
        remplirComboboxCoef(-5, 10, cMt, coMt);
        remplirComboboxCoef(-5, 10, cTauxEndettement, coTauxEndettement);
        remplirComboboxCoef(-5, 10, cDateFin, coDateFin);
    }
    
    public void fillComboboxDefault(){
        this.coefs[0] = 7;
        this.coefs[1] = 1;
        this.coefs[2] = 10;
        this.coefs[3] = 3;
        this.coefs[4] = 2;
        this.coefs[5] = 8;
        this.coefs[6] = 2;
        fillComboboxwithValues(-5, 10, coefs[0], coefs[1], coefs[2], coefs[3], coefs[4], coefs[5], coefs[6]);
    }
    
    public void fillComboboxZero(){
        this.coefs[0] = this.coefs[1] = this.coefs[2] = this.coefs[3] = this.coefs[4] = this.coefs[5] = this.coefs[6] = 0;
        fillComboboxwithValues(-5, 10, coefs[0], coefs[1], coefs[2], coefs[3], coefs[4], coefs[5], coefs[6]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        afficherSimulation = new javax.swing.JButton();
        panelGraph = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cMensualite = new javax.swing.JComboBox<>();
        cDuree = new javax.swing.JComboBox<>();
        cTauxInter = new javax.swing.JComboBox<>();
        cMt = new javax.swing.JComboBox<>();
        cTauxEndettement = new javax.swing.JComboBox<>();
        cDateFin = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        afficherSimulation2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {
                    ""

                }},
                new String [] {
                    "Identifiant de la simulation", "Mensualité", "Durée", "Taux d'interet", "Montant totale", "Type de prêt", "Taux d'endettement", "Date fin du contrat", "Resultat", "Position"
                }
            ));
            jScrollPane1.setViewportView(jTable1);

            jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
            jLabel1.setText("Le tri intelligent des simulations");

            afficherSimulation.setText("Modifier les coefficients et retrier");
            afficherSimulation.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    afficherSimulationActionPerformed(evt);
                }
            });

            panelGraph.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            javax.swing.GroupLayout panelGraphLayout = new javax.swing.GroupLayout(panelGraph);
            panelGraph.setLayout(panelGraphLayout);
            panelGraphLayout.setHorizontalGroup(
                panelGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 1006, Short.MAX_VALUE)
            );
            panelGraphLayout.setVerticalGroup(
                panelGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 260, Short.MAX_VALUE)
            );

            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "les coefficients"));

            jLabel2.setText("coef : Mensualité ");

            jLabel3.setText("coef : Durée ");
            jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel3MouseClicked(evt);
                }
            });

            jLabel4.setText("coef : Taux d'intérêt");

            jLabel5.setText("coef : Montant total  ");

            jLabel7.setText("coef : Taux d'endettement ");

            jLabel8.setText("coef : Date fin");
            jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel8MouseClicked(evt);
                }
            });
            jLabel8.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    jLabel8KeyPressed(evt);
                }
            });

            jButton2.setBackground(new java.awt.Color(243, 241, 249));
            jButton2.setText("Par défaut");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            jButton3.setBackground(new java.awt.Color(243, 241, 249));
            jButton3.setText("remise à 0");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cTauxInter, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cMensualite, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cDuree, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cTauxEndettement, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cDateFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cMt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)
                            .addGap(28, 28, 28))))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(cMensualite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(cDuree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(cTauxEndettement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(cDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cTauxInter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(cMt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(18, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jButton3)))))
            );

            afficherSimulation2.setText("fermer");
            afficherSimulation2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    afficherSimulation2ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(266, 266, 266)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(panelGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 63, Short.MAX_VALUE)))
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(250, 250, 250))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(afficherSimulation)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(afficherSimulation2)
                            .addGap(318, 318, 318))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel1)
                    .addGap(32, 32, 32)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panelGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(afficherSimulation2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(afficherSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents
    
    
    /**
     * @param _1 coefmensualite
     * @param _2 coefDuree
     * @param _3 coefTauxInteret
     * @param _4 coefMtTotal
     * @param _5 coefTypePret
     * @param _6 coefTauxEndettement
     * @param _7 coefDateFin
     */
    private void afficherSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherSimulationActionPerformed
        this.coefs[0] = Integer.parseInt(cMensualite.getSelectedItem().toString());
        this.coefs[1] = Integer.parseInt(cDuree.getSelectedItem().toString());
        this.coefs[2] = Integer.parseInt(cTauxInter.getSelectedItem().toString());
        this.coefs[3] = Integer.parseInt(cMt.getSelectedItem().toString());
        this.coefs[5] = Integer.parseInt(cTauxEndettement.getSelectedItem().toString());
        this.coefs[6] = Integer.parseInt(cDateFin.getSelectedItem().toString());
        try {
            chargerSimulations(client, listSimPretConcerned);
            
        } catch (CloneNotSupportedException ex) {
            JOptionPane.showMessageDialog(this, "L'opération s'est déroulé avec un echec");
        }
    }//GEN-LAST:event_afficherSimulationActionPerformed

    private void jLabel8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel8KeyPressed
        
    }//GEN-LAST:event_jLabel8KeyPressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        JOptionPane.showMessageDialog(this, "Si le client est sensible à la date de fin, ça veut dire qu'il préfère que la date fin ne soit pas prolongée, il faut augmenter le coefficient, sinon il faut le diminuer (valeur négative si possible).");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void afficherSimulation2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherSimulation2ActionPerformed
        controller.fermerFenetre(this);
    }//GEN-LAST:event_afficherSimulation2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       JOptionPane.showMessageDialog(this, "Si le client est sensible à la durée du prêt <( Il souhaite payer dans un délai plus court )>, il faut augmenter le coefficient, sinon il vaut mieux mettre une valeur négative");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            fillComboboxDefault();
            chargerSimulations(client, listSimPretConcerned);
        } catch (CloneNotSupportedException ex) {
            JOptionPane.showMessageDialog(this, "Une exception s'est declanchée lors du remise à 0");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            fillComboboxZero();
            chargerSimulations(client, listSimPretConcerned);
        } catch (CloneNotSupportedException ex) {
            JOptionPane.showMessageDialog(this, "Une exception s'est declanchée lors du remise à 0");
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    
    void chargerSimulations(Client client, List<SimulationPret> listSimPret) throws CloneNotSupportedException {
        this.client = client;
        this.listSimPretConcerned = listSimPret;
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        
        int pMensualite = -1;
        int pDuree = -1;
        int pTauxInteret = -1;
        int pMtTotal = -1;
        int pTypePret = -1;
        int pTauxEndettement = -1;
        int pDateFin = -1;
        double resultat = -1;
        int position = 0;
        
        List<Object[]> dataSimulations = new LinkedList<>();
        
        for(int i = 0; i<listSimPret.size() ;i++){  
            // We get the position of each criterion, that will be helfull to get the result of the comparaison
            pMensualite = getPosMtTotal(listSimPret, listSimPret.get(i), client, 6, true);
            pDuree = getPosMtTotal(listSimPret, listSimPret.get(i), client, 5, true);
            pTauxInteret = getPosMtTotal(listSimPret, listSimPret.get(i), client, 4, true);
            pMtTotal = getPosMtTotal(listSimPret, listSimPret.get(i), client, 1, true);
            pTypePret = getPosMtTotal(listSimPret, listSimPret.get(i), client, 2, true);
            pTauxEndettement = getPosMtTotal(listSimPret, listSimPret.get(i), client, 3, true);
            pDateFin = getPosMtTotal(listSimPret, listSimPret.get(i), client, 7, true);
            resultat =   getResultat(pMensualite, pDuree, pTauxInteret, pMtTotal, pTauxEndettement, pDateFin);
            System.out.println(listSimPret.get(i).getIdSimPret()+" > : "+ pMensualite+1 + "-" + coefs[0]+ " : " + pDuree+1 + "-" + coefs[1]+ " : " + pTauxInteret+1 + "-" + coefs[2]+ " : " + pMtTotal+1 + "-" + coefs[3]+ " : " + pTauxEndettement+1 + "-" + coefs[5]+ " : " + pDateFin+1 + "-" + coefs[6]+ " =>  "+ resultat );
            // we put all objects the this list, to add them in the JtableModel of the Jtable
            dataSimulations.add(new Object[]{
                listSimPret.get(i).getIdSimPret(),
                MathHepler.ajustVirgule(listSimPret.get(i).getMensualite(), 2)+ " €",
                listSimPret.get(i).getDureePret()+ " mois",
                MathHepler.ajustVirgule(listSimPret.get(i).getTauxInteret(), 2)+" %",
                MathHepler.ajustVirgule(listSimPret.get(i).getMensualite()*listSimPret.get(i).getDureePret(), 2)+ " €",
                listSimPret.get(i).getTypePret().getAbv(),
                MathHepler.ajustVirgule(listSimPret.get(i).getTauxEndettement(client)*100, 2)+" %",
                MathHepler.addMouthToDate(listSimPret.get(i).getDateContraction(), listSimPret.get(i).getDureePret()),
                resultat, 
                -1}); 
        }
        
        
        // we sort the list with the criteion : result
        Collections.sort(dataSimulations, new Comparator<Object[]>(){
            @Override
            public int compare(Object[] o1, Object[] o2) {
                return MathHepler.compareToResSimulation(o1, o2, true);
            }
        });
        
        
        // we add the result into the Jtable
        for(int i = 0; i<dataSimulations.size() ;i++){
            dataSimulations.get(i)[0] = "Numero "+dataSimulations.get(i)[0];
            dataSimulations.get(i)[7] = MathHepler.formatTimeStamp((Timestamp)dataSimulations.get(i)[7], "dd-MM-yyyy");
            dataSimulations.get(i)[9] = (i+1);
            tableModel.addRow(dataSimulations.get(i));
        }
        
        // we add the graph into the frame
        this.panelGraphComparaison = new PanelGraphInfoSim("", "", listSimPret, client);
        panelGraphComparaison.getChartPanel().setBounds(0, 0, panelGraph.getWidth(), panelGraph.getHeight());
        this.panelGraph.add(panelGraphComparaison.getChartPanel());
        
        // we refresh our view
        this.repaint();
        this.validate();
        JOptionPane.showMessageDialog(this, "Le tri s'est déroulé avec un succée");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afficherSimulation;
    private javax.swing.JButton afficherSimulation2;
    private javax.swing.JComboBox<String> cDateFin;
    private javax.swing.JComboBox<String> cDuree;
    private javax.swing.JComboBox<String> cMensualite;
    private javax.swing.JComboBox<String> cMt;
    private javax.swing.JComboBox<String> cTauxEndettement;
    private javax.swing.JComboBox<String> cTauxInter;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelGraph;
    // End of variables declaration//GEN-END:variables

    
    public  double getResultat(double pMensualite, double pDuree, double pTauxInteret, double pMtTotal, double pTauxEndettement, double pDateFin){
        //System.out.println( ((pMensualite+1) * coefs[0]) + " : " + ((pDuree+1)* coefs[1]) + " : " + ((pTauxInteret+1)* coefs[2]) + " : " + ((pMtTotal+1)* coefs[3]) + " : " + ((pTauxEndettement+1)* coefs[5])+ " : "+ ((pDateFin+1)* coefs[6])  )  ;
        return ( ((pMensualite+1) * coefs[0]) + ((pDuree+1)* coefs[1]) + ((pTauxInteret+1)* coefs[2]) + ((pMtTotal+1)* coefs[3]) +  ((pTauxEndettement+1)* coefs[5])+ ((pDateFin+1)* coefs[6]));
    
    }
    
    
    /**
     * 
     * cette methode permet de retourner la position de l'element concerné dans la liste
     * 
     * @param  listSimulation liste des simulations
     * @param simulationConcerned  la simulation Conerne
     * @param client le client, ceci sera utile pour trier la liste en fonction du taux d'endettement
     * @param codeRole sera le critere de trie
     * codeRole = 1 : comparer Montant total
     * codeRole = 2 : comparer type pret
     * codeRole = 3 : comparer Taux d'endettement
     * codeRole = 4 : comparer Taux d'interet
     * codeRole = 5 : comparer La duree du pret
     * codeRole = 6 : comparer La mensualite
     * codeRole = 7 : comparer Date fin du prêt
     */
    
    public int getPosMtTotal(List<SimulationPret> listSimulation, SimulationPret simulationConcerned, Client client, int codeRole, boolean order){
        int position = 1;
        List<SimulationPret> simulations = new LinkedList<>();
        
        listSimulation.stream()
                .sorted(
                        (e1, e2) -> {
                            switch(codeRole){
                                case 1 : 
                                    return MathHepler.compareToMtTotale(e1, e2, !order);
                                    
                                case 2 : 
                                    return MathHepler.compareToTypePret(e1, e2, order);
                                    
                                case 3 : 
                                    return MathHepler.compareToWithTauxEndet(client, e1, e2, order);
                                
                                case 4 : 
                                    return MathHepler.compareToInteret(e1, e2, order);
                                    
                                case 5 : 
                                    return MathHepler.compareToWithDuree(e1, e2, order);
                                    
                                case 6 : 
                                    return MathHepler.compareToWithMensualite(e1, e2, order);
                                    
                                case 7 : 
                                    return MathHepler.compareToDateFin(e1, e2, order);
                                    
                                default : 
                                    return -1;
                            }
                            
                        }
                            
                ).forEach(e -> simulations.add(e));
        
        return simulations.indexOf(simulationConcerned);
    }
    
    
    
    
    /**
     * La méthode update permet de recharger la vue 
     */
    @Override
    public boolean update(AbstractObservable sender, String message, Object... data) {
        return true;
    }

    
    
    
    
    
    public class TableSelecterListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            /*
            if (!e.getValueIsAdjusting()) {
                if (!((ListSelectionModel) e.getSource()).isSelectionEmpty()) {
                    selectedIndex = ((ListSelectionModel) e.getSource()).getMinSelectionIndex();
                    afficherSimulation.setEnabled(true);
                }else{
                    selectedIndex = -1;
                    afficherSimulation.setEnabled(false);
                }   
            }
            */
        }
    }
    
    /**
     * Cette méthode permet de remplir une combobox avec des coefficients allant de min au max.
     *  @param min  le nombre de depart
     *  @param max   le nombre de fin
     *  @param combo  la combobox concernée
     *  @param indexToSelect Idenfiaant de l'element à selectionner
     * 
     */
    public void remplirComboboxCoef(int min, int max, JComboBox combo, int indexToSelect){
        for(int i = min; i<max+1; i++)
            combo.addItem(i);      
        combo.setSelectedIndex((max-min*-1)+indexToSelect);
    }
          
    
    
    
    
    
}
