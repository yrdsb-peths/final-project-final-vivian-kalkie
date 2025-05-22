import greenfoot.*;  

public class Block extends Actor
{
    //resizing the block.
    public Block(){
        GreenfootImage img = new GreenfootImage("grass001.png");
        img.scale(img.getWidth(), 20);
        setImage(img);
    }
    
    int speed = 1;
    public void act()
    {
        int x = getX() - speed;
        int y = getY();
        setLocation(x, y);
    }
}
