import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scroll here.
 * 
 * @author (Vivian) 
 * @version (June 2025)
 */
public class Scroll extends Actor
{
    private int timeCounter;
    
    public void act()
    {
        if(timeCounter > 0)
        {
            timeCounter--;
        }
        else
        {
            getWorld().removeObject(this);
            return;
        }
    }
    
    public Scroll()
    {
        GreenfootImage scroll = new GreenfootImage("scroll.png");
        setImage(scroll);
        
        timeCounter = 600;
    }
}
