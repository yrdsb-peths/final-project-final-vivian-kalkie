import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Score(){
        
        GreenfootImage newImage = new GreenfootImage(100,100);
        
        setImage(newImage);
        newImage.setColor(Color.WHITE); //font color white
        newImage.fill();
    }
    
    public void setScore (int score){
        
        GreenfootImage newImage = getImage();
        newImage.clear();
        //newImage.setColor(Color.BLACK);
        Font f = new Font("Comic Sans Ms",32); //font of the score
        newImage.setFont(f);
        
        newImage.drawString("" + score,30,30); //shows the score
        setImage(newImage);
        
        
    }
}
