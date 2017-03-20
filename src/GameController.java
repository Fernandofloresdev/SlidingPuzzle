
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *.
 * @author Fernando
 */
public class GameController {
    private boolean gameState=false;
    private int gameResult;
    Puzzle puzzle;

    public GameController() throws URISyntaxException{
        onGameInit();
    }
    
    public void onGameInit() throws URISyntaxException{
        puzzle = new Puzzle();
        puzzle.initialState();
        gameState=true;
        System.out.println("Nuevo Juego Iniciado");
    }
    
    public boolean isGameState() {
        return gameState;
    }

    public int getGameResult() {
        return gameResult;
    }
    
    public void startNewGame() throws URISyntaxException{
        onGameInit();
    }
    
    public void abandonGame(){
        
    }
    
    public void restartGame(){
        
    }

    public Puzzle getPuzzle() {
        return puzzle;
    }
    
    
}
