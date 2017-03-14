
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
    int[] positions = {-4,-1,1,4};
    
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
        
        for(int i=0;i<=3;i++){
                if(indexInsideBounds(index,positions[i])){
                Tile tile =  (Tile)state.get(index+positions[i]);
                System.out.println("aqui");
                if(tile.isLastButton()){
                Collections.swap(state, index, index+positions[i]);
                tile.updateIndex(index);
                Tile selectedTile = (Tile)state.get(index+positions[i]);
                selectedTile.updateIndex(index+positions[i]);
                
                printPuzzleState();
                System.out.println(index+positions[i]);
            }
        }
        }
    }
    
    public boolean indexInsideBounds(int index,int position){
        
        if(index+position >-1 && index+position<=16){
            for(int i=0;i<=3;i++){
                for(int j=0;j<=3;j++){
                    if(tileSet[i][j]==index){
                        switch(position){
                            case -4:
                                return i-4>0;
                            case -1:
                                return j-1>0;
                            case 1:
                                return j+1<4;
                            case 4:
                                return i+4<4;
                        }
                               
                    } 
                }
            }
        }
        
        return false;
    }
    
    public void printPuzzleState(){
        int count=0;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                Tile tile = (Tile)state.get(count);
                System.out.print(tile.isLastButton());
                count++;
            }
            System.out.println("");
        }
    }
}
