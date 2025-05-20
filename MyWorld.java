import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(1300, 600, 1);
    }
    
    public void createBlock()
    {
        Block block = new Block();
        int x = 1300;
        int y = Greenfoot.getRandomNumber(600);
        addObject(block, x, y);
    }
}
