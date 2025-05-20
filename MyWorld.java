import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(1300, 600, 1);
        
        // Create the scubadiver object 
        Scubadiver scubadiver = new Scubadiver();
        addObject(scubadiver, 300, 250);
    }
}
