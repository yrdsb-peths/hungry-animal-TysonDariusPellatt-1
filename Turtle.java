import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    GreenfootImage[] idle = new GreenfootImage[4];
    GreenfootImage[] idle2 = new GreenfootImage[4];
    String facing = "right";
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Turtle()
    {
        for(int i = 0; i < idle.length;i++)
        {
            idle[i] = new GreenfootImage("images/Sprites/tile10"+ i +".png");
        }
        for(int i = 0; i < idle2.length;i++)
        {
            idle2[i] = new GreenfootImage("images/SpriteLeft/tile00"+ i +".png");
        }
        setImage(idle[0]);
    }
    int imageIndex =0;
    public void animateTurtle()
    {
        if(facing.equals("right"))
        {
            setImage(idle[imageIndex]);
            imageIndex = (imageIndex + 1) % idle.length;
        }
        else{
            setImage(idle2[imageIndex]);
            imageIndex = (imageIndex + 1) % idle2.length;
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
}

