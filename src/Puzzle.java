
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
    Tile[][] tileSet;
    int[] positions = {-1,-1,1,1};
    int[] lastPositionMoved = {3,3};
    public Puzzle(){
        this.columns = this.rows = 4;
    }
    
    public Puzzle(int columns, int rows){
        this.columns=columns;
        this.rows=rows;
    }
    
    
    public void initialState(){
        int counter=0;
        tileSet = new Tile[4][4];
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                tileSet[i][j]=new Tile(counter, i,j);
                counter++;
            }
        }
        
        
        /*for(int i=0;i<=15;i++){
            initialState.add(new Tile(i,i));
        }
        state=initialState;*/
    }
    
    public Tile[][] getState(){
        return tileSet;
    }

    public ArrayList getInitialState() {
        return initialState;
    }
    
    public void checkMovement(int i, int j){
        
        for(int k=0;k<=3;k++){
                if(positionInsideBounds(i,j,k)){
                        System.out.println(k);
                        performMovement(i,j,k);
                }
        }
    }
        
    
    public boolean positionInsideBounds(int i, int j,int k){
        
            switch(k){
                case 0:
                    return i+positions[k]>=0;
                case 1:
                    return j+positions[k]>=0;
                case 2:
                    return i+positions[k]<=3;
                case 3:
                    return j+positions[k]<=3;
            }
            
        return false;
    }
    
    public void printPuzzleState(){
        int count=0;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                System.out.print(i+""+j);
                count++;
            }
            System.out.println("");
        }
        
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                System.out.print(tileSet[i][j].isLastButton());
                count++;
            }
            System.out.println("");
        }
    }
    
    public void setState(Tile[][] state){
        this.tileSet=state;
    }
    
    
    public void performMovement(int i, int j, int k){
        
        switch(k){
            case 0:
                if(tileSet[i+positions[k]][j].isLastButton()){
                    tileSet[i][j].setNoLastButton();
                    Tile tile = tileSet[i+positions[k]][j];
                    tile.setLastButton();
                    tileSet[i+positions[k]][j]=tileSet[i][j];
                    tileSet[i][j]=tile;
                    setLastPositionMoved(i,j);
                    printPuzzleState();
                }
                break;
            case 1:
                if(tileSet[i][j+positions[k]].isLastButton()){
                    tileSet[i][j].setNoLastButton();
                    Tile tile = tileSet[i][j+positions[k]];
                    tile.setLastButton();
                    tileSet[i][j+positions[k]]=tileSet[i][j];
                    tileSet[i][j]=tile;
                    setLastPositionMoved(i,j);
                    printPuzzleState();
                }
                break;
            case 2:
                if(tileSet[i+positions[k]][j].isLastButton()){
                    tileSet[i][j].setNoLastButton();
                    Tile tile = tileSet[i+positions[k]][j];
                    tile.setLastButton();
                    tileSet[i+positions[k]][j]=tileSet[i][j];
                    tileSet[i][j]=tile;
                    setLastPositionMoved(i,j);
                    printPuzzleState();
                }
                break; 
            case 3:
                if(tileSet[i][j+positions[k]].isLastButton()){
                    tileSet[i][j].setNoLastButton();
                    Tile tile = tileSet[i][j+positions[k]];
                    tile.setLastButton();
                    tileSet[i][j+positions[k]]=tileSet[i][j];
                    tileSet[i][j]=tile;
                    setLastPositionMoved(i,j);
                    printPuzzleState();
                }
                break;
        }
    }

    public int[] getLastPositionMoved() {
        return lastPositionMoved;
    }

    public void setLastPositionMoved(int i, int j) {
        lastPositionMoved[0]=i;
        lastPositionMoved[1]=j;
    }
    
    
}
