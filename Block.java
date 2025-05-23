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
        
        if(isCompletelyOffScreen() || this.isTouching(Block.class)){
            getWorld().removeObject(this);
        }
        setLocation(x, y);
    }
    
    //if the block is touching another block, remove the block.
    public boolean skibidi() {
        if(this.isTouching(Block.class)) {
            getWorld().removeObject(this);
            return true;
        }
        else {
            return false;
        }
    }
    
    //remove the block once it moves off the screen.
    public boolean isCompletelyOffScreen(){
        if(getX() < 0 - getImage().getWidth() / 2)
        {
            System.out.println("remove");
            return true;
        }
        return false;
    }
}
