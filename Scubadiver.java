import greenfoot.*;  

public class Scubadiver extends Actor
{
    GreenfootSound bubblepopSound = new GreenfootSound("bubblepop.mp3");
    
    int speed = 100;
    //GreenfootImage up = new GreenfootImage();
    //GreenfootImage down = new GreenfootImage();
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
    }
    
}
