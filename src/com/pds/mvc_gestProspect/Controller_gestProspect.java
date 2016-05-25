/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pds.mvc_gestProspect;

import com.pds.entities.SimulationPret;
import com.pds.enums.TypeEmprunt;
import com.pds.mvc_customer.PanelPlusInfoSimPret;
import com.pds.serverhandler.AbstractHandle;
import com.pds.serverhandler.ConseillerHandle;

/**

 * @author JIHANE


 */
public class Controller_gestProspect {

    private ConseillerHandle model;
    
    
    public Controller_gestProspect(ConseillerHandle model) {
        this.model = model;
    }
    
       void showFrameTableAmmort(SimulationPret simPret) {
        PanelPlusInfoSimPret view = new PanelPlusInfoSimPret(null);
        model.getDeskTopPane().add(view);
        
        model.addObserver(view);
        view.chargerSimulation(simPret);
        view.setVisible(true);
    }

    void askTauxInteret(int age, double revenu, String typeContrat, TypeEmprunt typeEmprunt, boolean client) {
        this.model.askTauxInteret(age, revenu, typeContrat, typeEmprunt, client);
    }
    
}
