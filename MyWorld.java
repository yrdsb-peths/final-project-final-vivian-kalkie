import greenfoot.*;
import java.util.*;

public class MyWorld extends World {
    public int score = 0;
    //Label scoreLabel;
    
    int level = 1;
    
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
    }
    
    public void act(){
        //making a scrolling bg
        int scrollAmt = -1;
        GreenfootImage bg = new GreenfootImage(getBackground());
        getBackground().drawImage(bg, scrollAmt, 0);
        getBackground().drawImage(bg, scrollAmt + getHeight(), 0);
        
        runBlockSpawnTimer();
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
