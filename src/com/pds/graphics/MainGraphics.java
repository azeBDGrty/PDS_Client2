/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pds.graphics;


import com.pds.entities.SimulationPret;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Nodaro
 */
public class MainGraphics extends JPanel{
    
    

    public MainGraphics ( SimulationPret simPret) {
        
        LineChart l = new LineChart(simPret);
        PieChart p=new PieChart( simPret);

        JPanel panelLineChart=l.createChartPanel();
        JPanel panelPieChart=p.createDemoPanel( );
        AmortisationTablePanel atp = new AmortisationTablePanel(simPret);
        ParametresSimulation ps=new ParametresSimulation(simPret);
                
        GridLayout gl=new GridLayout(2,0);
        BorderLayout gl2=new BorderLayout();
        gl2.setHgap(20);
        JPanel main=new JPanel();
        JPanel main2=new JPanel();
        
        main.setLayout(gl);
        main2.setLayout(gl2);
        
        //gl.setVgap(20); //20 pixels d'espace entre les lignes (V comme Vertical) 
        //gl.setHgap(20);     //20 pixels d'espace entre les colonnes

        //this.add(ps);
        //this.add(atp);
        main.add(panelLineChart);
        main.add(panelPieChart);
        main2.add(ps, BorderLayout.NORTH);
        main2.add(atp, BorderLayout.SOUTH);
        
        this.add(main2);
        this.add(main);
        
        this.setLayout(new BorderLayout());
        this.add(main,BorderLayout.EAST);
        this.add(main2, BorderLayout.WEST);
        setSize(1330, 640);
        
        this.setVisible(true);
    }
    
  
}
