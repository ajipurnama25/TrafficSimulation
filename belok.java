import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class belok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class belok extends Actor
{
    /**
     * Act - do whatever the belok wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(BlueCar.class))
        getWorld().removeObject(this);
        
    }    
}
