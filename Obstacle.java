import greenfoot.*; 

public class Obstacle extends Actor
{
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
    
    //private void checkCollision();
    //{
      //   Player player = getOneIntersectingObject(Player.class);
        // if (player =! null)
         //{
           //  Greenfoot.stop();
             //fix game over here and add proper game over label
         //}
    //}
}
