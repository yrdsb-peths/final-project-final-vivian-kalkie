import greenfoot.*;  

public class Player extends Actor
{
    GreenfootSound bubblepopSound = new GreenfootSound("bubblepop.mp3");
    GreenfootImage[] idle = new GreenfootImage[5];
    
    private int speed = 5;
    private int moveSpeed = 4;
    private int maxSpeed = 10;
    
    //GreenfootImage up = new GreenfootImage();
    //GreenfootImage down = new GreenfootImage();
    
    public Player()
    {
        /**for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/player_idle/idle" + i + ".png");
            idle[i].scale(40, 30);
        }
        */
        GreenfootImage player = new GreenfootImage("firstrun.png");
        player.scale(40,40);
        setImage(player);
    }
    
    //animating the player.
    /**
     * 
    int imageIndex = 0; 
    public void animatePlayer(){
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    */
    
    public void act()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            turnTowards(1600, getY());
            fall();
            bubblepopSound.play();
        }
        
        
        if(Greenfoot.isKeyDown("up"))
        {
            turnTowards(0, getY());
            rise();
            bubblepopSound.play();
        }
        //animatePlayer();
    }
    
    public void fall(){
        setLocation(getX(), getY() + speed);
        if(isTouching(Block.class)){
            setLocation(getX(), getY() - speed);
        }
    }
    
    public void rise(){
        setLocation(getX(), getY() - speed);
        if(isTouching(Block.class)){
            setLocation(getX(), getY() + speed);
        }
    }
    
    //increasing the speed (powerup code cont'd)
    public void increaseSpeed()
    {
        if (moveSpeed < maxSpeed)
        {
            moveSpeed += 2;
        }
    }
    
}
