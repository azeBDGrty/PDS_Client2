/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pds.mvc_indicator;

import com.pds.serverhandler.AbstractHandle;
import org.jdom2.Element;

/**
 *
 * @author Poweriser
 */
public class Controller_Indicator {
    
      private AbstractHandle model;

    public Controller_Indicator(AbstractHandle model) {
        this.model = model;
    }
    

    public void sendIndicatorInfo() {
        
        System.out.println("sendIndicator");
        
        Element root = new Element("InfoIndicator");
            
            Element eAnnee = new Element("annee");
            eAnnee.setText("2017");
            
            Element eAgeDebut = new Element("ageDebut");
            eAgeDebut.setText("20");
            
            Element eAgeFin = new Element("ageFin");
            eAgeFin.setText("25");
            
            Element eLibelle = new Element("libelle");
            eLibelle.setText("_Credit_IMMO_");
            
            Element eTypeTaux = new Element("typeTaux");
            eTypeTaux.setText("_fixe_");
            
            Element eId_agence = new Element("Id_agence");
            eId_agence.setText("2");
            
            root.addContent(eAnnee);
            root.addContent(eAgeDebut);
            root.addContent(eAgeFin);
            root.addContent(eLibelle);
            root.addContent(eTypeTaux);
            root.addContent(eId_agence);
            
            model.getOut().askIndicatorInfo(root);
    }
}
