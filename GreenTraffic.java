import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenTraffic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenTraffic extends Actor
{
    /**
     * Act - do whatever the GreenTraffic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int cyclesRight;
    public GreenTraffic(int cycles)
    {
       cyclesRight = cycles;
    }
    public void act() 
    {
       cyclesRight--;
       if (cyclesRight == 0) getWorld().removeObject(this);
    }    
}
