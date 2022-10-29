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
public class PersonHistory {
    
    private ArrayList<Person> personhistory;
    
    public PersonHistory(){
    
        this.personhistory = new ArrayList<Person>();
       
    
    }

    public ArrayList<Person> getHistory() {
        return personhistory;
    }

    public void setHistory(ArrayList<Person> personhistory) {
        this.personhistory = personhistory;
    }
    
    public Person addNewPerson(){
        
        Person newRecord = new Person();
        personhistory.add(newRecord);
        return newRecord;
        
    }
    
    /**
     *
     * @param p
     */
    public void deleteRecords(Person p){
    
        personhistory.remove(p);
        
    }
    
    
    
    public Person updateNewRecord(){
        
        Person updateRecord = new Person();
        personhistory.replaceAll((UnaryOperator<Person>) updateRecord);
        return updateRecord;
        
    }
}
