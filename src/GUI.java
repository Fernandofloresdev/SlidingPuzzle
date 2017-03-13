
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URISyntaxException;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class GUI extends javax.swing.JFrame {

    private int width, height;
    private final int DESIRED_WIDTH = 600;
    private GameController gamecontroller = new GameController();
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        initAssets();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Nuevo Juego");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(4, 4));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jButton1)
                .addContainerGap(143, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        gamecontroller.startNewGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        boolean playing = true;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
    private void initAssets() {
        setSize(400,250);
        setTitle("Puzzle");
        //setResizable(false);
        setLocationRelativeTo(null);
        
        ArrayList puzzleState = gamecontroller.getPuzzle().getState();
        
        getjPanel1().removeAll();
        //sets the buttons on its place 
        for(int i=0;i<=puzzleState.size()-1;i++){
            
            Tile tile = (Tile)puzzleState.get(i);
            if(i==15){
                tile.setContentAreaFilled(false);
                tile.setLastButton();
            } else{tile.setText(Integer.toString(tile.getId()));
                    tile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamecontroller.getPuzzle().checkMovement(tile.getIndex());
            }
        });
            }
            
            getjPanel1().add(tile);
        }
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }
    
    public void displayBoard(){
        
    }
    
    public void displaySolution(){
        
    }
    
    public void displayInitialState(){
        
        getjPanel1().removeAll();
        ArrayList initialState = gamecontroller.getPuzzle().getInitialState();
        
        for(int i=0;i<=initialState.size()-1;i++){
            
            Tile tile = (Tile)initialState.get(i);
            if(i==15){
                tile.setContentAreaFilled(false);
            } else{tile.setText(Integer.toString(i));}
            
            getjPanel1().add(tile);
            
        }
    }
    
    public void update(){
        ArrayList puzzleState = gamecontroller.getPuzzle().getState();
        
        getjPanel1().removeAll();
        //sets the buttons on its place 
        for(int i=0;i<=puzzleState.size()-1;i++){
            
            Tile tile = (Tile)puzzleState.get(i);
            if(i==15){
                tile.setContentAreaFilled(false);
                tile.setLastButton();
            } else{tile.setText(Integer.toString(tile.getId()));
                    tile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamecontroller.getPuzzle().checkMovement(tile.getIndex());
            }
        });
            }
            
            getjPanel1().add(tile);
        }
    }
    
  
    
}