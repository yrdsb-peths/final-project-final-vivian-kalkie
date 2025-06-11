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
    /*
    
    private int speed;
        
    public Obstacle(int scrollSpeed)
    {
        this.speed = scrollSpeed;
    }
    
    public void act()
    {
        moveLeft();
    }
    
    private void moveLeft()
    {
        setLocation(getX() - speed, getY());
    }
    */
   
   int OBSTACLE_SPEED= -4;
   
   public void act() 
   {
       setLocation(getX() + OBSTACLE_SPEED, getY());
   }
   public  void Obstacle()
    {
        
        GreenfootImage img = new GreenfootImage("obstacleblock.png");
        img.scale(15, 15);
        setImage(img);
    }
}
