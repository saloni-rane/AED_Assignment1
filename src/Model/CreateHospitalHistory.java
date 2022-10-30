/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

/**
 *
 * @author LENOVO
 */
public class CreateHospitalHistory {
    
    private ArrayList<CreateHospital> createHospitalHistory;
    
    public CreateHospitalHistory(){
    
        this.createHospitalHistory = new ArrayList<CreateHospital>();
       
    
    }

    public ArrayList<CreateHospital> getHospHistory() {
        return createHospitalHistory;
    }

    public void setHospHistory(ArrayList<CreateHospital> createHospitalHistory) {
        this.createHospitalHistory = createHospitalHistory;
    }
    
    public CreateHospital addNewHosp(){
        
        CreateHospital newHospRecord = new CreateHospital();
        createHospitalHistory.add(newHospRecord);
        return newHospRecord;
        
    }
    
    /**
     *
     * @param h
     */
    public void deleteHospRecords(CreateHospital h){
    
        createHospitalHistory.remove(h);
        
    }
    
    
    
    public CreatePerson updateHospRecord(){
        
        CreatePerson updateHospRecord = new CreatePerson();
        createHospitalHistory.replaceAll((UnaryOperator<CreateHospital>) updateHospRecord);
        return updateHospRecord;
        
    }
    
}
