import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueCar extends biruh
{
    /**
     * Act - do whatever the BlueCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer;
    public void act() 
    {
        setRotation(-180);
       if(!isTouching(Traffic.class)){
           setLocation(getX(),getY()+1);
           move(0);
        }
       if(isTouching(Traffic.class)){
           move(0);
       }
       if(isTouching(belok.class)){
           Greenfoot.delay(100);
           turn(-90);
           for(timer = 0; timer<200; timer++){
           Greenfoot.delay(10); 
           setLocation(getX()+timer,getY());
        }
        if(isAtEdge())
           getWorld().removeObject(this);
        }
    }    
}
