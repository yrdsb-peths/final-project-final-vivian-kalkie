import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    //Label scoreLabel;
    int level = 1;
    
    public MyWorld() {
        super(1300, 600, 1);
        
        // Create the scubadiver object 
        Scubadiver scubadiver = new Scubadiver();
        addObject(scubadiver, 300, 250);
        
        // Create a label 
        //scoreLabel = new Label(0, 80);
        //addObject(scoreLabel, 40, 40);
    
        //spawn random blocks of rows. 
        for(int i = 0; i < Greenfoot.getRandomNumber(15); i++)
        {
            createBlock();
        }
    }
    
    public void createBlock()
    {
        //to make the blocks into a row.
        int spacing = 20;
        int yPos = Greenfoot.getRandomNumber(600);
        int xInt = 500;
        
        for(int i = 0; i < 20; i++)
        {
            int xPos = xInt + i * spacing;
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
