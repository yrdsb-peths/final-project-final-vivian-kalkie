import greenfoot.*;  

public class Player extends Actor
{
    GreenfootSound bubblepopSound = new GreenfootSound("bubblepop.mp3");
    GreenfootImage[] idleUp = new GreenfootImage[5];
    GreenfootImage[] idleDown = new GreenfootImage[5];

    
    double dy=0;
    private int speed = 5;
    private int moveSpeed = 4;
    private int maxSpeed = 10;
    private int dir = 0;
    private int imgCount = 0;
    

    public Player()
    {
        for(int i = 0; i < idleUp.length; i++)
        {
            idleUp[i] = new GreenfootImage("images/player_idle/idle" + i + ".png");
            idleDown[i] = new GreenfootImage("images/player_idle/idle" + i + ".png");
            idleUp[i].scale(55, 55);
            idleDown[i].scale(55, 55);
            
            idleUp[i].mirrorHorizontally();
        }
        setImage(idleDown[0]);
    }
   
    
    //GreenfootImage up = new GreenfootImage();
    //GreenfootImage down = new GreenfootImage();

    public void act()
    {
    private Score scoreObj=null;
    private Block lastBlock = null;
    
    //GreenfootImage up = new GreenfootImage();
    //GreenfootImage down = new GreenfootImage();
    public void act(){
        checkLandingOnBlock();

        setLocation (getX(), (int)(getY()+dy));
        
        if(getY() > getWorld().getHeight()-20){
                gameOver gameOver= new gameOver();
                getWorld().addObject (gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
                Greenfoot.stop();
        }

    }
         
    public void gameplay(){
        if(getOneIntersectingObject(Obstacle.class)!=null){
            gameOver gameOver= new gameOver();
            getWorld().addObject (gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        
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
        if(imgCount == 5)
        {
            animatePlayer();
            imgCount = 0;
        }
        else
        {
            imgCount++;
        }
        
        if(getOneIntersectingObject(Ball.class) !=null){
            getWorld().removeObject(getOneIntersectingObject(Ball.class));
        }
    }

    
    //animating the player.
    
    int imageIndex = 0; 
    public void animatePlayer(){
        if(dir == 0)
        {
            setImage(idleDown[imageIndex]);
        }
        else
        {
            setImage(idleUp[imageIndex]);
        }   
        imageIndex = (imageIndex + 1) % idleUp.length;
    }
    
    public void fall(){
        setLocation(getX(), getY() + speed);
        dir = 0;
        Actor obj = getOneObjectAtOffset(0, 17, Block.class);
        ((MyWorld)getWorld()).changeScore(2);
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
    
    private void checkLandingOnBlock()
    {
        Block currentBlock = (Block) getOneObjectAtOffset(0, getImage().getHeight()/2 + 1, Block.class);
        if (currentBlock != null && currentBlock != lastBlock)
        {
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore(2);
            lastBlock = currentBlock;
        }
        //if not on any block
        if (currentBlock == null)
        {
            lastBlock = null;
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