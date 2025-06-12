import greenfoot.*; 
/**
 * A powerup that the player can run over and it will increase speed for a few seconds
 * 
 * @author Kalkie
 * @version May 2025
 */
public class Ball extends Actor
{
    int SPEED= -8;
    
    public void act(){
        setLocation(getX() + SPEED, getY());
    }
}
