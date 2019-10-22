import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedTraffic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedTraffic extends Actor
{
    /**
     * Act - do whatever the RedTraffic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int cyclesLeft;
 
    public RedTraffic(int cycles)
    {
        cyclesLeft = cycles;
    }
    
    public void act() 
    {
        cyclesLeft--;
        if (cyclesLeft == 0) getWorld().removeObject(this);
    }    
}
