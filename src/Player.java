/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
import java.util.ArrayList;

public class Player {
    private final ArrayList movementsLog = new ArrayList();
    
    Player(){
        
    }

    public ArrayList getMovementsLog() {
        return movementsLog;
    }
    
    public void saveMovement(Move movement){
        movementsLog.add(movement);
    }
   
}
