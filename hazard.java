import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hazard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hazard extends Actor
{
    /**
     * Act - do whatever the hazard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        GreenfootImage hazard = new GreenfootImage("images/enemy sprite/hazardFlame.png");
        int x = getX();
        int y = getY();
        setLocation(x, y + 1);
        
        MyWorld world = (MyWorld) getWorld();
    
        
        if(isTouching(Turtle.class) || getY() >= world.getHeight()){
            world.gameOver();
            world.removeObject(this);
        }
    }
}
