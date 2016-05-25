/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.pds.graphics;

import com.pds.entities.CalculPret;
import com.pds.entities.SimulationPret;
import com.pds.entities.Taux_directeur;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nodaro
 */
public class LineChartTest {
    
    private CalculPret calculPret;
    private SimulationPret simPret;
    private List<Double> capAmorti=new ArrayList<>();
    private List<Double> capRestant=new ArrayList<>();
    private List<Double> evolutionInterets=new ArrayList<>();
    private XYSeriesCollection dataset;
    XYSeries series1;
    XYSeries series2;
    XYSeries series3;

    
    public LineChartTest() {
    }
    
    
    @Before
    public void setUp() {
        capAmorti=new ArrayList<>();
        capRestant=new ArrayList<>();
        evolutionInterets=new ArrayList<>();
        
        calculPret=new CalculPret();
        Taux_directeur td=new Taux_directeur();
        calculPret.setTauxDirecteur(td);
        simPret=new SimulationPret();
        simPret.setMtPret(10000);
        simPret.setDureePret(36);
        simPret.setCalcPret(calculPret);
        
        capAmorti=simPret.calcEvolutionCapAmmorti();
        capRestant=simPret.calcCapRestant();
        evolutionInterets=simPret.calcEvolutionInterets();
        
        dataset = new XYSeriesCollection();
        series1 = new XYSeries("Capital Remboursé");
        series2 = new XYSeries("Reste dû");
        series3 = new XYSeries("Interêts remboursés");
        for (int i=0; i<simPret.getDureePret();i++){
            series1.add(i,capAmorti.get(i) );
            series2.add(i, capRestant.get(i));
            series3.add(i, evolutionInterets.get(i));
            
        }
    }
    
    
    /**
     * Test of createChartPanel method, of class LineChart.
     */
    @Test
    public void testCreateChartPanel() {
        System.out.println("createChartPanel");
        for (int i=0; i<this.simPret.getDureePret();i++){
            assertEquals(this.series1.getY(i), capAmorti.get(i));
        }
        
        
    }
    
}
