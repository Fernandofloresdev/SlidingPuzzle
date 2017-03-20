/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class CounterController {
    private int movesCounter;
    
    public CounterController(){
        this.movesCounter=0;
    }

    public int getMovesCounter() {
        return movesCounter;
    }

    public void setMovesCounter(int movesCounter) {
        this.movesCounter = movesCounter;
    }
    
    public void increaseCounter(){
        movesCounter+=1;
    }
    
    public void initializeCounter(){
        movesCounter=0;
    }
    
    
    
    
}
