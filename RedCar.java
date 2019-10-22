import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedCar extends biruh
{
    /**
     * Act - do whatever the RedCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(-180);
        if(!isTouching(Traffic.class))
            move(1);
        if(isTouching(Traffic.class))
            move(0);
        if(isAtEdge())
            getWorld().removeObject(this);
    }    
}
