import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mobil1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mobil1 extends biruh
{
    /**
     * Act - do whatever the Mobil1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!isTouching(Traffic.class))
           setLocation(getX(), getY()-1);
       if(isTouching(Traffic.class))
           setLocation(getX(), getY()+1);
           move(0);
       if(isAtEdge())
           getWorld().removeObject(this);
    }    
}
