/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImageAvatar;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class ImgAva extends JComponent{
private Icon icon;
private int borderSize;

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public int getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
    }


    @Override
    protected void paintComponent(Graphics g) {
       
        super.paintComponent(g); 
    
    }
    
    public Dimension getAutoSize(Icon image, int size){
int w = size;
int h = size;
int iw = image.getIconWidth();
int ih = image.getIconHeight();
double xScale = (double) w/iw;
double yScale = (double) h/iw;
double scale = Math.max(xScale,yScale);
int width = (int) (scale*iw);
int height = (int) (scale*ih);

return new Dimension(width,height);
}
    
    private Image toImage(Icon icon){
        if(icon != null){
        
        }
        
       return ((ImageIcon) icon).getImage();
    }
      
}
