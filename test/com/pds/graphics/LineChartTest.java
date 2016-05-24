/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.pds.graphics;

import com.pds.entities.CalculPret;
import com.pds.entities.SimulationPret;
import com.pds.entities.Taux_directeur;
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
    private SimulationPret simulationPret;
    
    public LineChartTest() {
    }
    
    
    @Before
    public void setUp() {
        calculPret=new CalculPret();
        Taux_directeur td=new Taux_directeur();
        calculPret.setTauxDirecteur(td);
        SimulationPret simPret=new SimulationPret();
        simPret.setMtPret(10000);
        simPret.setDureePret(36);
        simPret.setCalcPret(calculPret);
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series1 = new XYSeries("Capital Remboursé");
        XYSeries series2 = new XYSeries("Reste dû");
        XYSeries series3 = new XYSeries("Interêts remboursés");
    }
    
    
    /**
     * Test of createChartPanel method, of class LineChart.
     */
    @Test
    public void testCreateChartPanel() {
        System.out.println("createChartPanel");
        LineChart instance = null;
        JPanel expResult = null;
        JPanel result = instance.createChartPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
