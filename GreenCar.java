import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenCar extends biruh
{
    /**
     * Act - do whatever the GreenCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(-180);
       if(!isTouching(Traffic.class))
            setLocation(getX(), getY()+1);
       if(isTouching(Traffic.class))
            setLocation(getX(), getY());
       if(isAtEdge())
            getWorld().removeObject(this);
    }    
}
