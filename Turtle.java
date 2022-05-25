import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/**this class originaly had the image of a turtle but changed the sprite
i am conserneded that it i change the name of the actor it will break my game
*/
public class Turtle extends Actor
{
    GreenfootImage[] idleR = new GreenfootImage[4];
    GreenfootImage[] idleL = new GreenfootImage[4];
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Turtle()
    {
        for(int i = 0; i < idleR.length; i++)
        {
            idleR[i] = new GreenfootImage("images/Sprites/tile10"+ i +".png");
            idleR[i].scale(40,40);
        }
        for(int i = 0; i < idleL.length; i++)
        {
            idleL[i] = new GreenfootImage("images/SpriteLeft/tile00"+ i +".png");
            idleL[i].scale(40,40);
        }
        animationTimer.mark();
        // Inital sprite
        setImage(idleR[0]);
    }
    int imageIndex = 0;
    public void animateTurtle()
    {
        if(animationTimer.millisElapsed() < 400)
        {
            return;
        }
        animationTimer.mark();
        if(facing.equals("right"))
        {
            setImage(idleR[imageIndex]);
            imageIndex = (imageIndex + 1) % idleR.length;
        }
        else
        {
            setImage(idleL[imageIndex]);
            imageIndex = (imageIndex + 1) % idleL.length;
        }
    }
    public void act()
    {
        // Add your action code here.
        //Turtle.scale(50,50);
        if(Greenfoot.isKeyDown("left"))
        {
            facing = "left";
            move(-5);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            facing = "left";
            move(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            facing = "right";
            move(5);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            facing = "right";
            move(5);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+2);
        }
        eat();
        //dead();
        animateTurtle();
    }
    public void eat()
    {
         if(isTouching(orange.class)){
            removeTouching(orange.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnFruit();
        }
    }
    /**
    public void dead()
    {
         if(isTouching(hazard.class)){
            world.gameOver();
            removeTouching(hazard.class);
        }
    }*/
}

