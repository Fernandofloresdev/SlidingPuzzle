
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Puzzle {
    private ArrayList initialState = new ArrayList();
    private ArrayList state = new ArrayList();
    //Movements will be applied on the state list
    private final int columns, rows;
    
    public Puzzle(){
        this.columns = this.rows = 4;
    }
    
    public Puzzle(int columns, int rows){
        this.columns=columns;
        this.rows=rows;
    }
    
    
    public void initialState(){
        
        for(int i=0;i<=15;i++){
            initialState.add(new Tile(i));
        }
        state=initialState;
    }
    
    public ArrayList getState(){
        return state;
    }

    public ArrayList getInitialState() {
        return initialState;
    }
    
    public void checkMovement(int index){
        boolean movementUnperformed = true;
        int[] positions = {-4,-1,1,4};
        for(int i=0;i<=3;i++){
            if(movementUnperformed){
                if(indexInsideBounds(index,positions[i])){
                Tile tile =  (Tile)state.get(index+positions[i]);
                if(tile.isLastButton()){
                System.out.println("Movement done"+index);
                tile.updateIndex(index);
                Tile tile2 = (Tile)state.get(index);
                tile2.updateIndex(index+positions[i]);
                Collections.swap(state, index, index+positions[i]);
                movementUnperformed=false;
            }
            }
        }
        }
    }
    
    public boolean indexInsideBounds(int index,int position){
        return (index+position >=0 && index+position<=15);
    }
}
