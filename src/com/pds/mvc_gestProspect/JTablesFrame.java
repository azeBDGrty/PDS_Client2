/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.pds.mvc_gestProspect;

import com.pds.entities.CalculPret;
import com.pds.entities.MathHepler;
import com.pds.entities.SimulationPret;
import com.pds.entities.Taux_directeur;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nodaro
 */
public class JTablesFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form JTablesFrame
     */
    public JTablesFrame(double indice, int duree, double tauxInit, double montant, double capet) {
        SimulationPret sp=new SimulationPret();
        sp.setMtPret(montant);
        Taux_directeur td=new Taux_directeur();
        td.setValue(tauxInit);
        CalculPret cp=new CalculPret();
        cp.setT_marge(0d);
        sp.setCalcPret(cp);
        sp.setDureePret(duree);
        cp.setTauxDirecteur(td);
        initComponents();
        
        {
            String col[] = {"Année", "nombre de mois", "Indice", "Taux", "Mensualité", "Montant restant"};
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            dtm.setColumnIdentifiers(col);

            double tauxTmp = tauxInit;
            double remaining=montant;

            double montantTotal = 0;
            List<infoMensualite> listeTable = new LinkedList<>();

            for (int j=0;j<duree;j++){      //affichage des valeurs dans les cellules

                //montantTotal +=  sp.calcMensualiteTauxVariable(tauxTmp,remaining);
                sp.getCalcPret().getTauxDirecteur().setValue(tauxTmp);
                montantTotal +=  sp.getMensualite();
                listeTable.add(new infoMensualite(j+1, indice, tauxTmp, sp.getMensualite(), 0));          
                //dtm.addRow(data);

                if( (tauxTmp + indice) <  tauxInit+capet)
                    tauxTmp += indice;
                else
                    tauxTmp = (tauxInit+capet);
            }


            for(infoMensualite info : listeTable){
                montantTotal -= info.mensualite;
                info.montantRestant = montantTotal;
                dtm.addRow(new Object[]{info.annee, 12, info.indice, MathHepler.ajustVirgule(info.taux, 2), MathHepler.ajustVirgule(info.mensualite/12, 2), MathHepler.ajustVirgule(info.montantRestant, 2)});
            }
        }
        
        
        
        
        
        // ici .... il faut faire copier coller
        // en baisse 
        
        {
            String col[] = {"Année", "nombre de mois", "Indice", "Taux", "Mensualité", "Montant restant"};
            DefaultTableModel dtm = (DefaultTableModel) jTable3.getModel();
            dtm.setRowCount(0);
            dtm.setColumnIdentifiers(col);

            double tauxTmp = tauxInit;
            double remaining=montant;

            double montantTotal = 0;
            List<infoMensualite> listeTable = new LinkedList<>();

            for (int j=0;j<duree;j++){      //affichage des valeurs dans les cellules

                //montantTotal +=  sp.calcMensualiteTauxVariable(tauxTmp,remaining);
                sp.getCalcPret().getTauxDirecteur().setValue(tauxTmp);
                montantTotal +=  sp.getMensualite();
                listeTable.add(new infoMensualite(j+1, indice, tauxTmp, sp.getMensualite(), 0));          
                //dtm.addRow(data);

                if( (tauxTmp - indice) >  2)
                    tauxTmp -= indice;
                else
                    tauxTmp = 2;
            }


            for(infoMensualite info : listeTable){
                montantTotal -= info.mensualite;
                info.montantRestant = montantTotal;
                dtm.addRow(new Object[]{info.annee, 12, info.indice, MathHepler.ajustVirgule(info.taux, 2), MathHepler.ajustVirgule(info.mensualite/12, 2), MathHepler.ajustVirgule(info.montantRestant, 2)});
            }
        }
        
        
        
        // stable
        
        {
            String col[] = {"Année", "nombre de mois", "Indice", "Taux", "Mensualité", "Montant restant"};
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            dtm.setColumnIdentifiers(col);

            double tauxTmp = tauxInit;
            double remaining=montant;

            double montantTotal = 0;
            List<infoMensualite> listeTable = new LinkedList<>();

            for (int j=0;j<duree;j++){      //affichage des valeurs dans les cellules

                //montantTotal +=  sp.calcMensualiteTauxVariable(tauxTmp,remaining);
                sp.getCalcPret().getTauxDirecteur().setValue(tauxTmp);
                montantTotal +=  sp.getMensualite();
                listeTable.add(new infoMensualite(j+1, indice, tauxTmp, sp.getMensualite(), 0));          
                //dtm.addRow(data);

            }


            for(infoMensualite info : listeTable){
                montantTotal -= info.mensualite;
                info.montantRestant = montantTotal;
                dtm.addRow(new Object[]{info.annee, 12, info.indice, MathHepler.ajustVirgule(info.taux, 2), MathHepler.ajustVirgule(info.mensualite/12, 2), MathHepler.ajustVirgule(info.montantRestant, 2)});
            }
        }
        
        this.setVisible(true);
        this.setSize(650, 500);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Année", "Indice", "Taux", "Mensualité", "Montant Restant"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Année", "Indice", "Taux", "Mensualité", "Montant Restant"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Année", "Indice", "Taux", "Mensualité", "Montant Restant"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel1.setText("Baisse du taux:");

        jLabel2.setText("Augmentation du taux: ");

        jLabel3.setText("Stabilité du taux:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
            java.util.logging.Logger.getLogger(JTablesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTablesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTablesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTablesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        
    }
    
    
    
    public class infoMensualite{
        int annee;
        double indice, taux, mensualite, montantRestant;

        public infoMensualite(int annee, double indice, double taux, double mensualite, double montantRestant) {
            this.annee = annee;
            this.indice = indice;
            this.taux = taux;
            this.mensualite = mensualite;
            this.montantRestant = montantRestant;
        }
        
        
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
