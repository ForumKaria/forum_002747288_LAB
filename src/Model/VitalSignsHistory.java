/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public
        class VitalSignsHistory {
    ArrayList<Observation> vitalSignsHistory;
    

    public
    VitalSignsHistory() {
        this.vitalSignsHistory = new ArrayList<Observation>();
    }

    public
    ArrayList<Observation> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignsHistory = vitalSignHistory;
    }
    
    public Observation findObservation(int id) {
        for(Observation o: this.vitalSignsHistory) {
            if(o.getObservationID() == id) {
                return o;
            }
        }
        
        return null;
    }
public Observation createObservation    (int observationId, double bloodPressure, double temperature){
    Observation observation = new Observation();
    
    observation.setObservationID(observationId);
    observation.setTemperature(temperature);
    observation.setBloodPressure(bloodPressure);
    
    this.vitalSignsHistory.add(observation);
    
    return observation;
}
public boolean checkObservationIDUnique(int id){
    //
    for(Observation o: this.vitalSignsHistory){
        if(o.getObservationID() == id){
         
           return false;
        }
    }
    return true;
    }
}
