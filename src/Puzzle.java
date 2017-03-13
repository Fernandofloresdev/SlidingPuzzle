
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
    int[][] tileSet;
    
    public Puzzle(){
        this.columns = this.rows = 4;
    }
    
    public Puzzle(int columns, int rows){
        this.columns=columns;
        this.rows=rows;
    }
    
    
    public void initialState(){
        int counter=0;
        tileSet = new int[4][4];
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                tileSet[i][j]=counter;
                counter++;
            }
        }
        
        
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
                tile.updateIndex(index);
                tile.setNoLastButton();
                Tile tile2 = (Tile)state.get(index);
                tile2.updateIndex(index+positions[i]);
                tile2.setLastButton();
                tile2.updateIndex(index+positions[i]);
                Collections.swap(state, index, index+positions[i]);
                movementUnperformed=false;
            }
            }
        }
        }
    }
    
    public boolean indexInsideBounds(int index,int position){
        
        
        if(index+position >=0 && index+position<=15){
            for(int i=0;i<=3;i++){
                for(int j=0;j<=3;j++){
                    if(tileSet[i][j]==index){
                        switch(position){
                            case -4:
                                return i-1>0;
                            case -1:
                                return j-1>0;
                            case 1:
                                return j+1<4;
                            case 4:
                                return i+1<4;
                        }
                               
                    } 
                }
            }
        }
        
        return false;
    }
}
