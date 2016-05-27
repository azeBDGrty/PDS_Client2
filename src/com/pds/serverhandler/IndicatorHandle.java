/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pds.serverhandler;

import com.pds.entities.Client;
import com.pds.entities.Pays;
import com.pds.entities.Region;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author Poweriser
 */
public class IndicatorHandle {
    
    private List<Integer> resultats;

   
    public IndicatorHandle(){
        this.resultats = new ArrayList<>();
        resultats.add(70);
        resultats.add(50);
        resultats.add(60);
        resultats.add(10);
    }
    
       public List<Integer> getResultats() {
        return resultats;
    }

    public void setResultats(Document lastDocument) {
        System.out.println("set indicator");
        resultats.clear();
          Element eRoot =lastDocument.getRootElement();
        Element eResultat = eRoot.getChild("resultat");
        resultats.add(Integer.parseInt(eResultat.getChildText("tranche0")));
        resultats.add(Integer.parseInt(eResultat.getChildText("tranche2")));
         resultats.add(Integer.parseInt(eResultat.getChildText("tranche4")));
          resultats.add(Integer.parseInt(eResultat.getChildText("tranche6")));
        System.out.println("resultat indicator "+resultats.get(0));
    }
    
    
 
    
}
