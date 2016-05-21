/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pds.mvc_main;


import com.pds.serverhandler.AbstractHandle;
import com.pds.serverhandler.ConseillerHandle;
import com.pds.mvc_connection.Controller_Connection;
import com.pds.mvc_connection.View_Connection;
import com.pds.mvc_customer.Controller_GestClient;
import com.pds.mvc_customer.View_GestClient;
import com.pds.mvc_gestProspect.Controller_gestProspect;
import com.pds.mvc_gestProspect.View_SimProspect;
import com.pds.mvc_gestProspect.View_SimProspectVar;
import javax.swing.JInternalFrame;

/**
 *
 * @author zouhairhajji
 */
public class Controller_MDIForm {
    
    private AbstractHandle model;
    
    public Controller_MDIForm(AbstractHandle serverHandler) {
        this.model = serverHandler;
    }

    public void setModelConseiller(ConseillerHandle model) {
        this.model = model;
    }
    
    
    
    public JInternalFrame ouvrirConnection(){
        Controller_Connection controllerConnection = new Controller_Connection(model);
        View_Connection viewConnection = new View_Connection(controllerConnection);
        model.addObserver(viewConnection);
        return viewConnection;
    }
    
    public View_GestClient ouvrirListClient(){
        Controller_GestClient controllerGestClient = new Controller_GestClient((ConseillerHandle) model);
        View_GestClient viewGestClient = new View_GestClient(controllerGestClient);
        model.addObserver(viewGestClient);
        viewGestClient.chargerTable(model.getClients());
        return viewGestClient;
    }
    
    public View_SimProspect ouvrirListProspect(){
        Controller_gestProspect controllerGestprospect = new Controller_gestProspect(model);
        View_SimProspect viewGestProspect = new View_SimProspect(controllerGestprospect);
        model.addObserver(viewGestProspect);
        return viewGestProspect;
    }

    public View_SimProspectVar ouvrirListProspectEmpVar() {
        Controller_gestProspect controllerGestprospect = new Controller_gestProspect(model);
        View_SimProspectVar view = new View_SimProspectVar(controllerGestprospect);
        model.addObserver(view);
        return view;
        
    }
    
}
