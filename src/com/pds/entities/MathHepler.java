/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pds.entities;

import java.text.DecimalFormat;

/**
 *
 * @author zouhairhajji
 */
public class MathHepler {
    
    private static DecimalFormat df;
    
    static{
        df = new DecimalFormat();
        df.setDecimalSeparatorAlwaysShown ( true ) ; 
    }
    
    public static String ajustVirgule ( Number nbr, int nbrAfterVirgule){
        df.setMaximumFractionDigits ( nbrAfterVirgule ) ; //arrondi à 2 chiffres apres la virgules 
        df.setMinimumFractionDigits ( nbrAfterVirgule ) ; 
        return df.format(nbr);
    }
    
    
    public static int compareToWithTauxEndet(Client client, SimulationPret sim, SimulationPret sim2, boolean desc){
        
        if(sim.getTauxEndettement(client) > sim2.getTauxEndettement(client))
                return (desc) ? 1 : -1;
        
        else if (sim.getTauxEndettement(client) == sim2.getTauxEndettement(client))
            return 0;
        
        return (desc) ? -1 : 1;
    }
}
