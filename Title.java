import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (Vivian Li) 
 * @version (June 2025)
 */
public class Title extends Actor
{
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
    
    public Title()
    {
        GreenfootImage title = new GreenfootImage("title.png");
        title.scale(500, 100);
        setImage(title);
    }
}
