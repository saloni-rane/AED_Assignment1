/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class DataHistory {
   
    private ArrayList<Employee> history;
    
    public DataHistory(){
        
        this.history = new ArrayList<Employee>();
        
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
  public Employee addNewEmployee(){

Employee newEmployee = new Employee();
history.add(newEmployee);
return newEmployee;  
}
  
  public void deleteEmployee(Employee ep){
      history.remove(ep);
  }


}