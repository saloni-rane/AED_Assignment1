/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

/**
 *
 * @author rutuj
 */
public class HospitalHistory {
    
    private ArrayList<Hospital> createHospitalHistory;
    
    public HospitalHistory(){
    
        this.createHospitalHistory = new ArrayList<Hospital>();
       
    
    }

    public ArrayList<Hospital> getHospHistory() {
        return createHospitalHistory;
    }

    public void setHospHistory(ArrayList<Hospital> createHospitalHistory) {
        this.createHospitalHistory = createHospitalHistory;
    }
    
    public Hospital addNewHosp(){
        
        Hospital newHospRecord = new Hospital();
        createHospitalHistory.add(newHospRecord);
        return newHospRecord;
        
    }
    
    /**
     *
     * @param h
     */
    public void deleteHospRecords(Hospital h){
    
        createHospitalHistory.remove(h);
        
    }
    
    
    
    public Person updateHospRecord(){
        
        Person updateHospRecord = new Person();
        createHospitalHistory.replaceAll((UnaryOperator<Hospital>) updateHospRecord);
        return updateHospRecord;
        
    }
    
}
