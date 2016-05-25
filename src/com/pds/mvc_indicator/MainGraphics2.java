/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pds.mvc_indicator;


import com.pds.entities.SimulationPret;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Nodaro
 */
public class MainGraphics2 extends JPanel{
    
String s;
Controller_Indicator controller;
    public MainGraphics2 (Controller_Indicator controller,String s ) {
        this.controller = controller;
        this.s=s;
       panelPieChart p= new panelPieChart(this.controller,this.s);
                
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
       
        main.add(p);
        
        
        this.add(main2);
        this.add(main);
        
        this.setLayout(new BorderLayout());
        this.add(main,BorderLayout.EAST);
        this.add(main2, BorderLayout.WEST);
        setSize(1330, 640);
        
        this.setVisible(true);
    }
    
  
}
