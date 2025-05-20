import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(1300, 600, 1);
        createBlock();
    
    }
    
    public void createBlock()
    {
        int numActors = 100;
        int startingX = 500;
        int startingY = 100;
        int spacing = 20;
        
        for(int i = 0; i < numActors; i++)
        {
            Block block = new Block();
            addObject(block, startingX + i*spacing, startingY);
        }
    }
}
