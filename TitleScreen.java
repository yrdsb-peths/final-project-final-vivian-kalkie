import greenfoot.*; 

/**
 * Titlescreen
 * 
 * @author Kalkie
 * @version May 2025 
 */
public class TitleScreen extends World
{   
    Label titleLabel = new Label("Runner", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }
    
    /**
     * Preparing the world for the starting program
     * That is: creating the initial objects and adding them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player, 479, 87);
        Obstacle obstacle = new Obstacle();
    }
    
    /**
     * Main world act loop
     */
    public void act()
    {
        // Starting the game if the user presses the space bar 
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
