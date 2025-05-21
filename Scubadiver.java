import greenfoot.*;  

public class Scubadiver extends Actor
{
    GreenfootSound bubblepopSound = new GreenfootSound("bubblepop.mp3");
    
    public void act()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            move(-1);
            bubblepopSound.play();
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            move(1);
            bubblepopSound.play();
        }
    }
    
}
