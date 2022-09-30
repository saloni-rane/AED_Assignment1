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
   
    private ArrayList<Data> history;
    
    public DataHistory(){
        
        this.history = new ArrayList<Data>();
        
    }

    public ArrayList<Data> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Data> history) {
        this.history = history;
    }
    
}
