/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LENOVO
 */
public class Patient extends CreatePerson{
    
    private VitalSigns vs;
    private int PatientId;
    private boolean isNormal;

    public boolean isIsNormal() {
        return isNormal;
    }

    public void setIsNormal(boolean isNormal) {
        this.isNormal = isNormal;
    }
    
    public Patient(String Role,String FName,
            String LName, String Email, int Age, String Gender,int UniqueId,
            String Password,Housing housing,int ZipCode,VitalSigns vs){
        super( Role, FName,
             LName,  Email,  Age,  Gender, UniqueId,
             Password, housing, ZipCode);
        this.vs = vs;
    }

    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }
    
   public boolean isPatientNormal(int personAge){
       boolean isNormalPatient = true;
       if(personAge < 50)
       {
           if(vs.getBloodPressure()<80 || vs.getBloodPressure()>120)
           {
               isNormalPatient = false;
           }
       }
       else
       {
           if(vs.getBloodPressure()<75 || vs.getBloodPressure()>125)
           {
               isNormalPatient = false;
           }
       }
       return isNormalPatient;
   }
    
}
