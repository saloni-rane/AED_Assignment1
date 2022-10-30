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
public class VitalSigns {
    
    private int bloodPressure;
    private int tempreture;
    private int pulese;
    private String bloodGroup;

    public int getTempreture() {
        return tempreture;
    }

    public void setTempreture(int tempreture) {
        this.tempreture = tempreture;
    }

    public int getPulese() {
        return pulese;
    }

    public void setPulese(int pulese) {
        this.pulese = pulese;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    
}
