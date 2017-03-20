
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    private final GameController gamecontroller = new GameController();
    private final CounterController countercontroller = new CounterController();

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Nuevo Juego");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(4, 4));

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jButton2.setText("Solve");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Abandon");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        gamecontroller.startNewGame();
        newGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        gamecontroller.getPuzzle().solve();
        getjPanel1().removeAll();
        getjLabel2().setText(Integer.toString(countercontroller.getMovesCounter()));
        setButtonsListeners();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        displayAbandonScreen();
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void initAssets() {
        setSize(460, 250);
        setTitle("Puzzle");
        //setResizable(false);
        setLocationRelativeTo(null);
        getjLabel1().setText("Moves:");
        getjLabel2().setText(Integer.toString(countercontroller.getMovesCounter()));
        gamecontroller.getPuzzle().shuffle();
        //sets the buttons on its place 
        setButtonsListeners();
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }
    
    public void update() {
        Tile[][] puzzleState = gamecontroller.getPuzzle().getState();

        //sets the buttons on its place 
        getjPanel1().removeAll();
        getjLabel2().setText(Integer.toString(countercontroller.getMovesCounter()));
        setButtonsListeners();
        if(gamecontroller.getPuzzle().checkSolution(puzzleState)){
            displayWinScreen();
        }

    }

    public void newGame() {
        getjPanel1().removeAll();
        //sets the buttons on its place 
        getjLabel2().remove(this);
        countercontroller.initializeCounter();
        getjLabel2().setText(Integer.toString(countercontroller.getMovesCounter()));
        gamecontroller.getPuzzle().reinitialize();
        gamecontroller.getPuzzle().shuffle();
        setButtonsListeners();
    }

    
    public void setButtonsListeners(){
        
        Tile[][] puzzleState = gamecontroller.getPuzzle().getState();
        
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (puzzleState[i][j].isLastButton()) {
                    for (ActionListener al : puzzleState[i][j].getActionListeners()) {
                        puzzleState[i][j].removeActionListener(al);
                    }

                    puzzleState[i][j].setContentAreaFilled(false);
                } else {
                    for (ActionListener al : puzzleState[i][j].getActionListeners()) {
                        puzzleState[i][j].removeActionListener(al);
                    }
                    int iposition = i;
                    int jposition = j;
                    puzzleState[i][j].setText(Integer.toString(puzzleState[i][j].getId()));
                    puzzleState[i][j].addActionListener(new java.awt.event.ActionListener() {
                        @Override
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            gamecontroller.getPuzzle().checkMovement(iposition, jposition);
                            if (puzzleState[iposition][jposition].isLastButton()) {
                                countercontroller.increaseCounter();
                            }
                            update();
                        }
                    });
                }

                getjPanel1().add(puzzleState[i][j]);
            }
        }

        getjPanel1().validate();
    }
    
private void displayWinScreen() {
        String winmessage = "You won in " + countercontroller.getMovesCounter() + " moves. Congrats!";
        JOptionPane.showMessageDialog(null, winmessage);
        newGame();
    }

private void displayAbandonScreen(){
    String winmessage = "You are a LOSER!";
        JOptionPane.showMessageDialog(null, winmessage);
}
    
}
