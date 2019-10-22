import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YellowTraffic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YellowTraffic extends Actor
{
    /**
     * Act - do whatever the YellowTraffic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int cyclesLeft;
    public YellowTraffic(int cycles)
    {
        cyclesLeft = cycles;
    }
    public void act() 
    {
         cyclesLeft--;
        if (cyclesLeft == 0) getWorld().removeObject(this);
    }    
}
