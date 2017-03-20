/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class ImageController {
    private BufferedImage source;
    private int width, height,cropwidth,cropheight;
    private final int DESIRED_WIDTH = 300;
    private BufferedImage resized;
    
    public ImageController() throws URISyntaxException{
        Initialize();
    }
    
    public void Initialize() throws URISyntaxException{
        
     try {
            source = loadImage();
            int h = getNewHeight(source.getWidth(), source.getHeight());
            resized = resizeImage(source, DESIRED_WIDTH, h,
                    BufferedImage.TYPE_INT_ARGB);

        } catch (IOException ex) {
            Logger.getLogger(Puzzle.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
        width = resized.getWidth(null);
        height = resized.getHeight(null);
        setCrop();
    }
        
    private int getNewHeight(int w, int h) {

        double ratio = DESIRED_WIDTH / (double) w;
        int newHeight = (int) (h * ratio);
        return newHeight;
    }
    
    private BufferedImage loadImage() throws IOException, URISyntaxException {
//new ImageIcon(getClass().getResource(imageName)).getImage()
       // BufferedImage bimg = ImageIO.read(new File("sid.jpg"));
        
        BufferedImage bimg = null;
        try {
            bimg = ImageIO.read(new File("cuyos.jpg"));

        } catch (IOException e) {
            System.out.println(""+e.getMessage());
        }

        return bimg;
    }
    
    private BufferedImage resizeImage(BufferedImage originalImage, int width,
            int height, int type) throws IOException {

        BufferedImage resizedImage = new BufferedImage(width, height, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();

        return resizedImage;
    }
    
    private void setCrop(){
        cropwidth=width/4;
        cropheight=height/4;
    }
    
    public Image getCroppedImage(int i, int j){
        Image croppedImageSlice = resized.getSubimage(cropwidth*j, cropheight*i, cropwidth,cropheight);
        return croppedImageSlice;
    }
        
}
