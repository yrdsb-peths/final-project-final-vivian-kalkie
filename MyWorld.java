import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(1300, 600, 1);
        
        // Create the scubadiver object 
        Scubadiver scubadiver = new Scubadiver();
        addObject(scubadiver, 300, 250);
    
        for(int i = 0; i < Greenfoot.getRandomNumber(15); i++)
        {
            createBlock();
        }
    }
    
    public void createBlock()
    {
        int spacing = 20;
        int yPos = Greenfoot.getRandomNumber(600);
        int xInt = 1000;
        
        for(int i = 0; i < 20; i++)
        {
            int xPos = xInt + i * spacing;
            Block block = new Block();
            addObject(block, xPos, yPos);
        }
    }
}
