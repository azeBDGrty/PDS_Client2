/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pds.entities;

import com.pds.networkprotocol.RoleUser;
import java.sql.Timestamp;
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
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdAccount method, of class Account.
     */
    @Test
    public void testGetIdAccount() {
        System.out.println("getIdAccount");
        Account instance = new Account();
        int expResult = 0;
        int result = instance.getIdAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAccount method, of class Account.
     */
    @Test
    public void testSetIdAccount() {
        System.out.println("setIdAccount");
        int idAccount = 0;
        Account instance = new Account();
        instance.setIdAccount(idAccount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNdc method, of class Account.
     */
    @Test
    public void testGetNdc() {
        System.out.println("getNdc");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getNdc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNdc method, of class Account.
     */
    @Test
    public void testSetNdc() {
        System.out.println("setNdc");
        String ndc = "";
        Account instance = new Account();
        instance.setNdc(ndc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionSecrete method, of class Account.
     */
    @Test
    public void testGetQuestionSecrete() {
        System.out.println("getQuestionSecrete");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getQuestionSecrete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestionSecrete method, of class Account.
     */
    @Test
    public void testSetQuestionSecrete() {
        System.out.println("setQuestionSecrete");
        String questionSecrete = "";
        Account instance = new Account();
        instance.setQuestionSecrete(questionSecrete);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class Account.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        Account instance = new Account();
        RoleUser expResult = null;
        RoleUser result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRole method, of class Account.
     */
    @Test
    public void testSetRole() {
        System.out.println("setRole");
        RoleUser role = null;
        Account instance = new Account();
        instance.setRole(role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreation method, of class Account.
     */
    @Test
    public void testGetDateCreation() {
        System.out.println("getDateCreation");
        Account instance = new Account();
        Timestamp expResult = null;
        Timestamp result = instance.getDateCreation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreation method, of class Account.
     */
    @Test
    public void testSetDateCreation() {
        System.out.println("setDateCreation");
        Timestamp dateCreation = null;
        Account instance = new Account();
        instance.setDateCreation(dateCreation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Account.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Account instance = new Account();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
