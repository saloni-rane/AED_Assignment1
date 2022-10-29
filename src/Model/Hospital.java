/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rutuj
 */
public class Hospital {
    
    private String HospitalName;
    private String HospCity;
    private String HospCommunity;
    private int HospZipCode;
    private int HospNo;

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public String getHospCity() {
        return HospCity;
    }

    public void setHospCity(String HospCity) {
        this.HospCity = HospCity;
    }

    public String getHospCommunity() {
        return HospCommunity;
    }

    public void setHospCommunity(String HospCommunity) {
        this.HospCommunity = HospCommunity;
    }

    public int getHospZipCode() {
        return HospZipCode;
    }

    public void setHospZipCode(int HospZipCode) {
        this.HospZipCode = HospZipCode;
    }

    public int getHospNo() {
        return HospNo;
    }

    public void setHospNo(int HospNo) {
        this.HospNo = HospNo;
    }
   @Override
    public String toString(){
        return HospitalName;
    }
    
}
