import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLable =new Label("Hungry Quest",75);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLable, getWidth()/2, getHeight()/2);

        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player icon = new Player();
        addObject(icon,504,75);
        icon.setLocation(75,103);
        Player player2 = new Player();
        addObject(player2,500,100);
        player2.setLocation(497,108);
        Player player3 = new Player();
        addObject(player3,285,103);
        Label L1 = new Label("Use WASD or Arrow keys to move",40);
        addObject(L1,250,250);
        Label L2 = new Label("Press SPACE to Start",40);
        addObject(L2,250,450);
        L1.setLocation(300,283);
        L2.setLocation(300,330);
    }
}
