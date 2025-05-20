import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(1300, 600, 1);
<<<<<<< HEAD
        createBlock();
        
=======
    
        for(int i = 0; i < Greenfoot.getRandomNumber(15); i++)
        {
            createBlock();
        }
>>>>>>> 799964846a27b0bdc930435eeb399610f7c92ea2
    }
    
    public void createBlock()
    {
        int numActors = 100;
        int startingX = 1000;
        int startingY = 50;
        int spacing = 20;
        
        for(int i = 0; i < numActors; i++)
        {
            Block block = new Block();
            addObject(block, startingX + i*spacing, startingY);
        }
    }
}
