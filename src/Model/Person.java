package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rutuj
 */
public class Person {
    
    private String Member;
    private String First_Name;
    private String Last_Name;
    private String Email;
    private int Age;
    private String Gender;
    private int Primary_ID;
    private String password;
    private String City;
    private String Community;
    private String Address;
    private int Zip_Code;
    private int House_Number;

    public String getMember() {
        return Member;
    }

    public void setMember(String Member) {
        this.Member = Member;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
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

    public int getPrimary_ID() {
        return Primary_ID;
    }

    public void setPrimary_ID(int Primary_ID) {
        this.Primary_ID = Primary_ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getZip_Code() {
        return Zip_Code;
    }

    public void setZip_Code(int Zip_Code) {
        this.Zip_Code = Zip_Code;
    }

    public int getHouse_Number() {
        return House_Number;
    }

    public void setHouse_Number(int House_Number) {
        this.House_Number = House_Number;
    }
    
    @Override
    public String toString(){
        
        return Member;
    }
}
