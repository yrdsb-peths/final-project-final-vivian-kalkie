import greenfoot.*; 

/**
 * obstacle like the blocks in g switch which will hold back the player, ending the game 
 * 
 * @author Kalkie 
 * @version May 2025
 */

public class Obstacle extends Actor
{
    //resizing the block.
    public Obstacle()
    {
        GreenfootImage img = new GreenfootImage("obstacleblock.png");
        img.scale(35, 35);
        setImage(img);
    }
    
    private int speed;
        
    public Obstacle(int scrollSpeed)
    {
        this.speed = scrollSpeed;
    }
    
    public void act()
    {
        moveLeft();
        //checkCollision();
    }
    
    private void moveLeft()
    {
        setLocation(getX() - speed, getY());
    }
    
    //private void checkCollision()
    //{
         //Player player = getOneIntersectingObject(//greenfoot.Actor);
         //if (player =! null)
         //{
         //    Greenfoot.stop();
             //fix game over here and add proper game over label
         //}
    //}
}
