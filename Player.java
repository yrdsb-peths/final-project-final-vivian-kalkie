import greenfoot.*;  

public class Player extends Actor
{
    GreenfootSound bubblepopSound = new GreenfootSound("bubblepop.mp3");
    GreenfootImage[] idle = new GreenfootImage[5];
    
    int speed = 100;
    //GreenfootImage up = new GreenfootImage();
    //GreenfootImage down = new GreenfootImage();
    
    public Player()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/player_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    
    //animating the player.
    int imageIndex = 0; 
    public void animatePlayer(){
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            bubblepopSound.play();
            setLocation(getX(), 1300);
            if(isTouching(Block.class))
            {
                setLocation(getX(), getY());
                turn(90);
            }
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            bubblepopSound.play();
            setLocation(getX(), 0);
            if(isTouching(Block.class))
            {
                setLocation(getX(), getY());
                turn(-90);
            }
        }
        
        animatePlayer();
    }
    
}
