/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pds.mvc_customer;


import com.pds.entities.SimulationPret;
import com.pds.graphics.MainGraphics;
import com.pds.implobs.IObserver;

import javax.swing.JFrame;

/**
 *
 * @author zouhairhajji
 */
public class PanelPlusInfoSimPret extends javax.swing.JInternalFrame implements IObserver{

    private Controller_GestClient controller;
    private SimulationPret simulation;
    
    
    public PanelPlusInfoSimPret(Controller_GestClient controller) {
        this.controller = controller;
        initComponents();
    }

    public void chargerSimulation(SimulationPret simulation) {
        this.simulation = simulation;
        MainGraphics m=new MainGraphics (simulation.getIdSimPret(), simulation);
        this.getContentPane().add(m);
        this.setSize(1350,670);
       
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public boolean update(com.pds.implobs.AbstractObservable sender, String message, Object... data) {
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
