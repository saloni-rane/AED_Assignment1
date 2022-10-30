 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;


/**
 *
 * @author LENOVO
 */
public class CreatePersonHistory {
    
    private ArrayList<CreatePerson> createPersonHistory;
    
    public CreatePersonHistory(){
    
        this.createPersonHistory = new ArrayList<CreatePerson>();
       
    
    }

    public ArrayList<CreatePerson> getHistory() {
        return createPersonHistory;
    }

    public void setHistory(ArrayList<CreatePerson> createPersonHistory) {
        this.createPersonHistory = createPersonHistory;
    }
    
    public CreatePerson addNewPerson(){
        Housing housing= new Housing();
        CreatePerson newRecord = new CreatePerson("","","","",0,"",0,"",housing,0);
        createPersonHistory.add(newRecord);
        return newRecord;
        
    }
    
    /**
     *
     * @param index
     */
    public void deleteRecords(int index){
    
        createPersonHistory.remove(index);
        
    }
   
      
    
    
    
    
    
    
}
