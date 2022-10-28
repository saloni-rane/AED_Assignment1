
import java.util.ArrayList;
import java.util.function.UnaryOperator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class MemberHistory {
    private ArrayList<Member> history;
    
    public MemberHistory(){
    
        this.history = new ArrayList<Member>();
       
    
    }

    public ArrayList<Member> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Member> history) {
        this.history = history;
    }
    
    public Member addNewRecord(){
        
        Member newRecord = new Member();
        history.add(newRecord);
        return newRecord;
        
    }
    
    /**
     *
     * @param e
     */
    public void deleteRecords(Member m){
    
        history.remove(m);
        
    }
    
    
    
    public Member updateNewRecord(){
        
        Member updateRecord = new Member();
        history.replaceAll((UnaryOperator<Member>) updateRecord);
        return updateRecord;
        
    }
    
}
