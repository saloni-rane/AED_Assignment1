package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class CreatePerson {
    
    private String Role;
    private String FName;
    private String LName;
    private String Email;
    private int Age;
    private String Gender;
    private int UniqueId;
    private String Password;
    Housing housing;
    private int ZipCode;

    
    
    public CreatePerson(String Role,String FName,
            String LName, String Email, int Age, String Gender,int UniqueId,
            String Password,Housing housing,int ZipCode )
    {
        this.Role = Role;
        this.FName = FName;
        this.LName = LName;
        this.Email = Email;
        this.Age = Age;
        this.Gender = Gender;
        this.UniqueId = UniqueId;
        this.Password = Password;
        this.housing = housing;
        this.ZipCode = ZipCode;

        
        
        
        
        
    
    }
            
           

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getUniqueId() {
        return UniqueId;
    }

    public void setUniqueId(int UniqueId) {
        this.UniqueId = UniqueId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int ZipCode) {
        this.ZipCode = ZipCode;
    }
    public Housing getHousing() {
        return housing;
    }

    public void setHousing(Housing housing) {
        this.housing = housing;
    }
    
    
    
     @Override
    public String toString(){
        return Role;
    }
    
}
