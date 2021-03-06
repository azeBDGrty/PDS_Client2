/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pds.mvc_customer;

import com.pds.entities.Client;
import com.pds.entities.MathHepler;
import com.pds.entities.SimulationPret;
import java.awt.Color;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author zouhairhajji
 */
public class PanelInfoSimPret extends javax.swing.JPanel {

    
    private SimulationPret simPret;
    
    
    public PanelInfoSimPret() {
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

        panelPointFort = new javax.swing.JPanel();
        titrePointFort = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lPosition = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelInformation = new javax.swing.JPanel();
        panelIndicateur = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lTauxEndettement = new javax.swing.JLabel();
        lTauxInteret = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        panelPointFort.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titrePointFort.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        titrePointFort.setText("Point fort");

        jLabel2.setText("Position :");

        lPosition.setText("1");

        panelInformation.setLayout(new javax.swing.BoxLayout(panelInformation, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(panelInformation);

        javax.swing.GroupLayout panelPointFortLayout = new javax.swing.GroupLayout(panelPointFort);
        panelPointFort.setLayout(panelPointFortLayout);
        panelPointFortLayout.setHorizontalGroup(
            panelPointFortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPointFortLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(titrePointFort, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lPosition)
                .addGap(10, 10, 10))
            .addGroup(panelPointFortLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelPointFortLayout.setVerticalGroup(
            panelPointFortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPointFortLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelPointFortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titrePointFort)
                    .addComponent(jLabel2)
                    .addComponent(lPosition))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        panelIndicateur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Taux d'endettement");

        lTauxEndettement.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lTauxEndettement.setText("...");

        lTauxInteret.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lTauxInteret.setText("...");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Taux d'emprunt");

        javax.swing.GroupLayout panelIndicateurLayout = new javax.swing.GroupLayout(panelIndicateur);
        panelIndicateur.setLayout(panelIndicateurLayout);
        panelIndicateurLayout.setHorizontalGroup(
            panelIndicateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIndicateurLayout.createSequentialGroup()
                .addGroup(panelIndicateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIndicateurLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(panelIndicateurLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lTauxEndettement))
                    .addGroup(panelIndicateurLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(panelIndicateurLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lTauxInteret)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panelIndicateurLayout.setVerticalGroup(
            panelIndicateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIndicateurLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTauxEndettement, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTauxInteret, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelPointFort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(panelIndicateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelIndicateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPointFort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setSimPret(SimulationPret simPret) {
        this.simPret = simPret;
    }
    

    public JLabel getlPosition() {
        return lPosition;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lPosition;
    private javax.swing.JLabel lTauxEndettement;
    private javax.swing.JLabel lTauxInteret;
    private javax.swing.JPanel panelIndicateur;
    private javax.swing.JPanel panelInformation;
    private javax.swing.JPanel panelPointFort;
    private javax.swing.JLabel titrePointFort;
    // End of variables declaration//GEN-END:variables

    


    void chargerInfoSimPret(Client client, SimulationPret simToShow, List<SimulationPret> listSimPret) throws CloneNotSupportedException {
        List<SimulationPret> clonedList = new LinkedList<>(listSimPret);
        
        
        if(simToShow.getTauxEndettement(client) > 0.33){
            panelIndicateur.setBackground(new Color(239, 214, 214));
            panelPointFort.setBackground(new Color(239, 214, 214));
            lPosition.setText(0+"");
            titrePointFort.setText("Pas de point fort !");
            
        }else{
            showAdvantage(client, simToShow, listSimPret);
        }
        
        lTauxEndettement.setText(MathHepler.ajustVirgule(simToShow.getTauxEndettement(client)*100, 2)+" %");
        lTauxInteret.setText(MathHepler.ajustVirgule(simToShow.getTauxInteret(), 2) +" %");
        panelIndicateur.repaint();
        panelIndicateur.validate();
    }
    
    private void showAdvantage(Client client, SimulationPret simToShow, List<SimulationPret> listSimPret) {
        // Pour le taux d'interet
        int cnt = 0;
        boolean isBestTauxInteret = true;
        boolean isBestTauxEndet = true;
        boolean isBestDuree = true;
        boolean isBestMensualite = true;
        boolean isBestMttTotalaRemb = true;
        
        for(SimulationPret simulation : listSimPret){
            if(simulation == simToShow)
                continue;
            
            if(simToShow.getTauxInteret() > simulation.getTauxInteret())
                isBestTauxInteret = false;
            
            
            if (simToShow.getTauxEndettement(client) > simulation.getTauxEndettement(client))
                isBestTauxEndet = false;
            
            if (simToShow.getDureePret() < simulation.getDureePret())
                isBestDuree = false;
            
            if (simToShow.getMensualite()> simulation.getMensualite())
                isBestMensualite = false;
            
            if(simToShow.getDureePret() * simToShow.getMensualite() > simulation.getDureePret() * simulation.getMensualite())
                isBestMttTotalaRemb = false;
        }
        
        if(isBestTauxInteret){
            cnt++;
            lTauxInteret.setForeground(new Color(78, 184 , 0));
            JLabel label = new JLabel(cnt+"- Meilleur taux d'interet : " +MathHepler.ajustVirgule(simToShow.getTauxInteret(), 2) +" %");
            label.setSize(label.getWidth(), 20);
            panelInformation.add(label);
        }
        
        if(isBestTauxEndet){
            cnt++;
            JLabel label = new JLabel(cnt+"- Meilleur taux d'endettement " + MathHepler.ajustVirgule(simToShow.getTauxEndettement(client)*100, 2)+" %");
            label.setSize(label.getWidth(), 20);
            panelInformation.add(label);
            lTauxEndettement.setForeground(new Color(78, 184 , 0));
        }
        
        if(isBestDuree){
            cnt++;
            JLabel label = new JLabel(cnt+"- Meilleure durée d'emprunt " + simToShow.getDureePret() +" mois");
            label.setSize(label.getWidth(), 20);
            panelInformation.add(label);
        }
        
        if(isBestMensualite){
            cnt++;
            JLabel label = new JLabel(cnt+"- Meilleure mensualité" + MathHepler.ajustVirgule(simToShow.getMensualite(), 3));
            label.setSize(label.getWidth(), 20);
            panelInformation.add(label);
        }
        
        if(isBestMttTotalaRemb){
            cnt++;
            JLabel label = new JLabel(cnt+"- Meilleure montant totale à rembourser" + MathHepler.ajustVirgule(simToShow.getMensualite()*simToShow.getDureePret(), 3));
            label.setSize(label.getWidth(), 20);
            panelInformation.add(label);
        }
        
        
        
        
        // pour le montant totale remboursé
        
    }
    
    
}

