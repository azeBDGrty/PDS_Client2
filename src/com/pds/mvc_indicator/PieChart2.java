/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pds.mvc_indicator;


import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Nodaro
 */
public class PieChart2 extends ApplicationFrame{
    
  
    
    

    public PieChart2( ) {
        super("Répartion des remboursements");
        
        //setContentPane(createDemoPanel( ));
        //this.setSize( 560 , 367 );    
      //RefineryUtilities.centerFrameOnScreen( this);    
      //this.setVisible( true ); 
    }
    public static PieDataset createDataset( )  
   {
      
      
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue( "Capital" , 5 );  
      dataset.setValue( "Interets" , 6);   
      dataset.setValue( "Assurance" , 7 );    
      return dataset;         
   }
   private static JFreeChart createChart( PieDataset dataset )
   {
      JFreeChart chart = ChartFactory.createPieChart(      
         "Répartion des remboursements",  // chart title 
         dataset,        // data    
         true,           // include legend   
         true, 
         false);

      return chart;
   }
   
  
   
   public static JPanel createDemoPanel( ) 
   {
      JFreeChart chart = createChart(createDataset( ) );  
      return new ChartPanel( chart ); 
   }

}
