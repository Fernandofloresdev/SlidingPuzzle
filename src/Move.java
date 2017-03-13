/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class Move {
    //Start and End are 2-dimensional vectors, each one holds the coordinates from
    //the position where it started to the one where finalizes
    private final int[] start, end;
    
    public Move(int[] start, int[] end){
        this.start=start;
        this.end=end;
    }

    public int[] getStart() {
        return start;
    }

    public int[] getEnd() {
        return end;
    }
    
    
}
