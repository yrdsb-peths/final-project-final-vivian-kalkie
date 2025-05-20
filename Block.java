import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    //resizing the block.
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
