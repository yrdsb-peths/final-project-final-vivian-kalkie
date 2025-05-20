import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    /**
     * Act - do whatever the block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Block(){
        GreenfootImage img = new GreenfootImage("ironblock.png");
        img.scale(20, 20);
        setImage(img);
    }
    
    int speed = 1;
    public void act()
    {
        int x = getX() - speed;
        int y = getY();
        setLocation(x, y);
    }
}
