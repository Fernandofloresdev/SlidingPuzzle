/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando 
 */

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

class Tile extends JButton {

    private boolean isLastButton, isLastMoved;
    private int i,j,id,index;

    public Tile(int id, int i, int j) {
        super();
        this.id=id;
        this.i=i;
        this.j=j;
        initUI();
    }

    public Tile(Image image) {

        super(new ImageIcon(image));

        initUI();
    }

    private void initUI() {

        isLastButton = false;
        isLastMoved = false;
        BorderFactory.createLineBorder(Color.gray);

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.yellow));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.gray));
            }
        });
        
        
    }

    public void setLastButton() {
        
        this.isLastButton = true;
    }

    public void setNoLastButton(){
        this.isLastButton = false;
    }
    
    public boolean isLastButton() {

        return isLastButton;
    }

    public int getId() {
        return id;
    }
    
    public void updateIndex(int ind){
        this.index=ind;
    }

    public int getIndex() {
        return index;
    }

    public boolean isLastMoved() {
        return isLastMoved;
    }

    public void setIsLastMoved(boolean isLastMoved) {
        this.isLastMoved = isLastMoved;
    }

    public final int getI() {
        return i;
    }

    public final int getJ() {
        return j;
    }
    
}