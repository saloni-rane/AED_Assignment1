/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterList;
    
    public EncounterHistory(){
        this.encounterList = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }
    
    public void AddEncounter(Encounter en)
    {
        this.encounterList.add(en);
    }
    
    public void removeEncounterHistory(int index)
    {
        this.encounterList.remove(index);
    }
}
