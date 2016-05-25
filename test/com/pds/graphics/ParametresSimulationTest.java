/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pds.graphics;

import com.pds.entities.CalculPret;
import com.pds.entities.SimulationPret;
import com.pds.entities.Taux_directeur;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
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
public class ParametresSimulationTest {
    
    
    SimulationPret simPret;
    private CalculPret calculPret;
    ParametresSimulation param;
    
    public ParametresSimulationTest() {
    }
    

    @Before
    public void setUp() {
        
        calculPret=new CalculPret();
        Taux_directeur td=new Taux_directeur();
        calculPret.setTauxDirecteur(td);
        simPret=new SimulationPret();
        simPret.setMtPret(10000);
        simPret.setDureePret(36);
        simPret.setCalcPret(calculPret);
        simPret.setDateSimulation(null);
        simPret.setDateContraction(null);
        param=new ParametresSimulation(simPret);
    }
    
    @Test
    public void testConstructor() {
        assertEquals(param.getjTextField1(), simPret.getMtPret() );
        assertEquals(param.getjTextField2(), simPret.getDureePret() );
        assertEquals(param.getjTextField9(), simPret.getTauxInteret() );
        
        
    }
    
}
