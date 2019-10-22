import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Traffic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Traffic extends Actor
{
    /**
     * Act - do whatever the Traffic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int rectangleLeft;
    
    public Traffic (int rectangle){
        rectangleLeft = rectangle;
    }
    
    public void act() 
    {
        rectangleLeft--;
        if(rectangleLeft == 0)getWorld().removeObject(this);
        rectangleLeft++;
        if(rectangleLeft == 500){
            getWorld().addObject(this, 70, 100);
            getWorld().addObject(this, 540, 100);
            getWorld().addObject(this, 240, 100);
            getWorld().addObject(this, 480, 50);
        }
        rectangleLeft--;
    }    
}
