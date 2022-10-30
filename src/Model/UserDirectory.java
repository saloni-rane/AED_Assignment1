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
public class UserDirectory {
    
    private ArrayList<CreatePerson> createSysAdminHistory;
    private ArrayList<CreatePerson> createHospAdminHistory;
    private ArrayList<CreatePerson> createCommunityAdminHistory;
    private ArrayList<CreatePerson> createDoctorAdminHistory;
    private ArrayList<CreatePerson> createPatientHistory;
            

    public ArrayList<CreatePerson> getCreateSysAdminHistory() {
        return createSysAdminHistory;
    }

    public void setCreateSysAdminHistory(ArrayList<CreatePerson> createSysAdminHistory) {
        this.createSysAdminHistory = createSysAdminHistory;
    }

    public ArrayList<CreatePerson> getCreateHospAdminHistory() {
        return createHospAdminHistory;
    }

    public void setCreateHospAdminHistory(ArrayList<CreatePerson> createHospAdminHistory) {
        this.createHospAdminHistory = createHospAdminHistory;
    }

    public ArrayList<CreatePerson> getCreateCommunityAdminHistory() {
        return createCommunityAdminHistory;
    }

    public void setCreateCommunityAdminHistory(ArrayList<CreatePerson> createCommunityAdminHistory) {
        this.createCommunityAdminHistory = createCommunityAdminHistory;
    }

    public ArrayList<CreatePerson> getCreateDoctorAdminHistory() {
        return createDoctorAdminHistory;
    }

    public void setCreateDoctorAdminHistory(ArrayList<CreatePerson> createDoctorAdminHistory) {
        this.createDoctorAdminHistory = createDoctorAdminHistory;
    }

    public ArrayList<CreatePerson> getCreatePatientHistory() {
        return createPatientHistory;
    }

    public void setCreatePatientHistory(ArrayList<CreatePerson> createPatientHistory) {
        this.createPatientHistory = createPatientHistory;
    }
    public CreatePerson addNewSysAdmin(){
        
        CreatePerson newSysAdminRecord = new CreatePerson();
        createSysAdminHistory.add(newSysAdminRecord);
        return newSysAdminRecord;
        
    }
    public CreatePerson addNewHospAdmin(){
        
        CreatePerson newHospAdminRecord = new CreatePerson();
        createHospAdminHistory.add(newHospAdminRecord);
        return newHospAdminRecord;
        
    }
    
    public CreatePerson addNewCommunityAdmin(){
        
        CreatePerson newCommunityAdminRecord = new CreatePerson();
        createCommunityAdminHistory.add(newCommunityAdminRecord);
        return newCommunityAdminRecord;
        
    }
    public CreatePerson addNewDoctor(){
        
        CreatePerson newDoctorRecord = new CreatePerson();
        createDoctorAdminHistory.add(newDoctorRecord);
        return newDoctorRecord;
        
    }
    public CreatePerson addNewPatient(){
        
        CreatePerson newPatientRecord = new CreatePerson();
        createPatientHistory.add(newPatientRecord);
        return newPatientRecord;
        
    }
    
     public void deleteSysAdminRecords(CreatePerson sa){
    
        createSysAdminHistory.remove(sa);
        
    }
     
     public void deleteHospAdminRecords(CreatePerson ha){
    
        createHospAdminHistory.remove(ha);
        
    }
      public void deleteCommunityAdminRecords(CreatePerson ca){
    
        createCommunityAdminHistory.remove(ca);
        
    }
      public void deleteDoctorRecords(CreatePerson d){
    
        createDoctorAdminHistory.remove(d);
        
    }
      public void deletePatientRecords(CreatePerson p){
    
        createPatientHistory.remove(p);
        
    }
    
    public CreatePerson updateSysAdminRecord(){
        
        CreatePerson updateSysAdminRecord = new CreatePerson();
        createSysAdminHistory.replaceAll((UnaryOperator<CreatePerson>) updateSysAdminRecord);
        return updateSysAdminRecord;
        
    }
    
    public CreatePerson updateHospAdminRecord(){
        
        CreatePerson updateHospAdminRecord = new CreatePerson();
        createHospAdminHistory.replaceAll((UnaryOperator<CreatePerson>) updateHospAdminRecord);
        return updateHospAdminRecord;
        
    }
    public CreatePerson updateCommAdminRecord(){
        
        CreatePerson updateCommAdminRecord = new CreatePerson();
        createCommunityAdminHistory.replaceAll((UnaryOperator<CreatePerson>) updateCommAdminRecord);
        return updateCommAdminRecord;
       
        
    }
    
    public CreatePerson updateDoctorRecord(){
        
        CreatePerson updateDoctorRecord = new CreatePerson();
        createCommunityAdminHistory.replaceAll((UnaryOperator<CreatePerson>) updateDoctorRecord);
        return updateDoctorRecord;
       
        
    }
    
    public CreatePerson updatePatientRecord(){
        
        CreatePerson updatePatientRecord = new CreatePerson();
        createCommunityAdminHistory.replaceAll((UnaryOperator<CreatePerson>) updatePatientRecord);
        return updatePatientRecord;
           
    }
    
    
    
    
}
