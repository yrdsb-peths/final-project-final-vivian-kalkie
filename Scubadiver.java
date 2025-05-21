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
            turn(-90);
            move(-100);
            if(isTouching(Block.class))
            {
                setLocation(getX(), getY());
                turn(90);
            }
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            bubblepopSound.play();
            turn(90);
            move(-100);
            if(isTouching(Block.class))
            {
                setLocation(getX(), getY());
                turn(-90);
            }
        }
    }
    
}
