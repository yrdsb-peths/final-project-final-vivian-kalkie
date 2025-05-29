import greenfoot.*; 
/**
 * A powerup that the player can run over and it will increase speed for a few seconds
 * 
 * @author Kalkie
 * @version May 2025
 */
public class SpeedPowerUp extends Actor
{
    public SpeedPowerUp()
    {
        GreenfootImage img = new GreenfootImage("powerup.png");
    }
    
    public void act()
    {
        if(isTouching(Player.class))
        {
            Player player = (Player) getOneIntersectingObject(Player.class);
            player.increaseSpeed();
            getWorld().removeObject(this);
        }
    }
}
