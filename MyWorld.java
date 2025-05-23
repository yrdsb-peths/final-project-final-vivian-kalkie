import greenfoot.*;
import java.util.*;

public class MyWorld extends World {
    public int score = 0;
    //Label scoreLabel;
    
    int level = 1;
    
    public MyWorld() {
        super(1200, 600, 1);
        //scaling the background image.
        GreenfootImage background = new GreenfootImage("forestbg.png");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        
        // Create the scubadiver object 
        Scubadiver scubadiver = new Scubadiver();
        addObject(scubadiver, 300, 250);
        
        
        // Create a label 
        //scoreLabel = new Label(0, 80);
        //addObject(scoreLabel, 40, 40);

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
    private int blockSpawnTimer;
    
    //spawning block every 5 secs?
    private void runBlockSpawnTimer(){
        blockSpawnTimer = (blockSpawnTimer + 1) % 200;
        if(blockSpawnTimer == 0)
        {
            createTopBlock();
        }
        else if(blockSpawnTimer == 3){
            createBottomBlock();
        }
    }
    
    //method for spawning in the blocks.
    private void createTopBlock()
    {
        int xPos = 1800;
        
        int min = 0;
        int max = 300;
        int step = 10;
        
        int range = (max - min) / step + 1;
        int yPos = Greenfoot.getRandomNumber(range) * step + min;
        for(int i = 0; i < Greenfoot.getRandomNumber(5); i++)
        {
            Block block = new Block();
            addObject(block, xPos, yPos);
        }
    }
    
    private void createBottomBlock()
    {
        int xPos = 1800;
        
        int min = 300;
        int max = 600;
        int step = 10;
        
        int range = (max-min) / step + 1;
        int yPos = Greenfoot.getRandomNumber(range) * step + min;
        for(int i = 0; i < Greenfoot.getRandomNumber(5); i++)
        {
            Block block = new Block();
            addObject(block, xPos, yPos);
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
