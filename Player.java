import greenfoot.*;  

public class Player extends Actor
{
    GreenfootSound bubblepopSound = new GreenfootSound("bubblepop.mp3");
    GreenfootImage[] idle = new GreenfootImage[5];
    
    private int speed = 5;
    private int moveSpeed = 4;
    private int maxSpeed = 10;
    private int dir = 0;
    
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
        player.scale(55,55);
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
        
        if(dir == 0){
            fall();
        } else {
            rise();
        }
        //animatePlayer();
    }
    
    public void fall(){
        setLocation(getX(), getY() + speed);
        dir = 0;
        Actor obj = getOneObjectAtOffset(0, 17, Block.class);
        
        if(obj != null){
            speed = 0;
        } else {
            speed = 5;
        }
    }
    
    public void rise(){
        setLocation(getX(), getY() - speed);
        dir = 1;
        Actor obj = getOneObjectAtOffset(0, -23, Block.class);
        
        if(obj != null){
            speed = 0;
        } else {
            speed = 5;
        }
    }
    
    /**public void fall(){
        setLocation(getX(), getY() + speed);
        dir = 0;
        if(isTouching(Block.class)){
            setLocation(getX(), getY() - speed);
        }
    }
    
    public void rise(){
        setLocation(getX(), getY() - speed);
        dir = 1;
        if(isTouching(Block.class)){
            setLocation(getX(), getY() + speed);
        }
    }**/
    
    //increasing the speed (powerup code cont'd)
    public void increaseSpeed()
    {
        if (moveSpeed < maxSpeed)
        {
            moveSpeed += 2;
        }
    }
    
}
