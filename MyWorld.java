import greenfoot.*;
import java.util.*;

public class MyWorld extends World {    
    int level = 1;
    private int platCount = 0;
    int pipeCounter = 0;
    public MyWorld world;
    public int scrollAmt=-1;
    private int score=0;
    private int newScore=0;
    private Score scoreObj=null;
    

    
    public MyWorld() {
        super(1200, 600, 1, false);
        //scaling the background image.
        GreenfootImage background = new GreenfootImage("forestbg.png");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        // Create the scubadiver object 
        Player player = new Player();
        addObject(player, 300, 250);
    
        //Obstacle obstacle = new Obstacle();
        
        scoreObj= new Score();
        scoreObj.setScore(0);
        addObject(scoreObj,100,100);
    
    }
    
    public void changeScore(double newScore){
        score+=newScore;
    }
    
    public void act(){
        
        pipeCounter++;
        
        if(pipeCounter%200==0){
            createObstacles();
        }
        if (pipeCounter%50==0){
            score++;
        }
        if (pipeCounter%100==0){
            Ball();
        }
        
        GreenfootImage bg = new GreenfootImage(getBackground());
        getBackground().drawImage(bg, scrollAmt, 0);
        getBackground().drawImage(bg, scrollAmt + getHeight(), 0);
        
        runBlockSpawnTimer();
        checkCollision();
    }
    public void checkCollision() {
        if (!getObjects(Player.class).isEmpty() && !getObjects(Ball.class).isEmpty()) {
            Player player = (Player)getObjects(Player.class).get(0);
            Ball ball = (Ball)getObjects(Ball.class).get(0);
    
            int px = player.getX();
            int py = player.getY();
            int bx = ball.getX();
            int by = ball.getY();
    
            if (Math.abs(px - bx) < 20 && Math.abs(py - by) < 20) {
                scrollAmt = -10;
                if(pipeCounter==pipeCounter+100){
                    scrollAmt=-1;
                }
            }
        }
    }
    

    
    public void Obstacles(){
        Random random= new Random();
        int verticalShift = random.nextInt(20,540);
        
        
        Obstacle obstacle= new Obstacle();
        GreenfootImage image= obstacle.getImage();
        addObject(obstacle, getWidth(), getHeight()-verticalShift);
        
    }
    
    public void Ball(){
        Random random = new Random();
        int verticalShift = random.nextInt(50,500);
        int horizontalShift= Greenfoot.getRandomNumber(100);
        
        Ball ball= new Ball();
        GreenfootImage image= ball.getImage();
        addObject(ball, getWidth()+horizontalShift, getHeight()-verticalShift);
        
    }
    
    public void createObstacles(){
        Obstacle big= new Obstacle();
        int heightShift  =  Greenfoot.getRandomNumber(1000);
    
        GreenfootImage image= big.getImage();
        addObject(big, getWidth(), getHeight()+ heightShift-400);
    }

    
    //timer for when the blocks should spawn.
    private int blockSpawnTimer = 0;
    //spawning block every 5 secs?
    
    private void runBlockSpawnTimer(){
        blockSpawnTimer = (blockSpawnTimer) % 100;
        if(blockSpawnTimer == 0)
        {
            createTopBlock();
        }
        else if(blockSpawnTimer == 3){
            createBottomBlock();
        }
        blockSpawnTimer++;
    }
    
    //method for spawning in the blocks.
    public void createTopBlock()
    {
        int xPos = 2000;
        
        int min = 100;
        int max = 200;
        int step = 100;
        
        int range = (max - min) / step + 1;
        int yPos = Greenfoot.getRandomNumber(range) * step + min;
        for(int i = 0; i < Greenfoot.getRandomNumber(5); i++)
        {
            Block block = new Block();
            addObject(block, xPos, yPos);
            //to spawn another block if it is touching it. 
            if(block.skibidi()) {
                if(i!=0) {
                    i--;
                } else{
                    i=0;
                }
            }
        }
    }
    
    public void createBottomBlock()
    {
        int xPos = 2000;
        
        int min = 300;
        int max = 500;
        int step = 100;
        
        int range = (max - min) / step + 1;
        int yPos = Greenfoot.getRandomNumber(range) * step + min;
        for(int i = 0; i < Greenfoot.getRandomNumber(5); i++)
        {
            Block block = new Block();
            addObject(block, xPos, yPos);
            //to spawn another block if it is touching it. 
            if(block.skibidi()) {
                if(i!=0) {
                    i--;
                } else{
                    i=0;
                }
            }
        }
    }
    
    
    
    
    
    /**
     * Increase score
     */
    //public void increaseScore()
    {
        //score++;
        //scoreLabel.setValue(score);
         
        //if(score % 5 == 0)
        //{
            //level += 1;
        //}
    }
    
    /**
     * End the game and draw game over
     */
    //public void gameOver()
    //{
        //Label gameOverLabel = new Label("Game Over", 100);
        //addObject(gameOverLabel, getWidth()/2, 200);
    //}
}
