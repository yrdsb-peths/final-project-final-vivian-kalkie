import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(1300, 600, 1);
<<<<<<< HEAD
        
        // Create the scubadiver object 
        Scubadiver scubadiver = new Scubadiver();
        addObject(scubadiver, 300, 250);
=======
    
        for(int i = 0; i < Greenfoot.getRandomNumber(15); i++)
        {
            createBlock();
        }
    }
    
    public void createBlock()
    {
        Block block = new Block();
        int x = 1300;
        int y = Greenfoot.getRandomNumber(600);
        addObject(block, x, y);
>>>>>>> main
    }
}
