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
            int x = getX();
            int y = getY() + speed;
            setLocation(x, y);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            bubblepopSound.play();
            int x = getX();
            int y = getY() - speed;
            setLocation(x, y);
        }
    }
    
}
