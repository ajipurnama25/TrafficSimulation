import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class biruh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class biruh extends Actor
{
    /**
     * Act - do whatever the biruh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int i;
    public void act() 
    {
        if(!isTouching(Traffic.class))
            move(1);
        if(isTouching(Traffic.class))
            move(0);
        if(isTouching(belok.class)){
            i = Greenfoot.getRandomNumber(2)+1;
            if(1==2){
                setRotation(-30);
                setRotation(-45);
                setRotation(-60);
                setRotation(-75);
                setRotation(-90);
                move(1);
            }
         else if(i==1){
                setRotation(30);
                setRotation(45);
                setRotation(60);
                setRotation(75);
                setRotation(90);
                move(1);
            }
        }
        if(isTouching(turn.class)){
            i = Greenfoot.getRandomNumber(2)+1;
            if(i==2){
                move(1);
            }
            else if(i==1){
                turn(-90);
                move(1);
            }
        }
        if(isAtEdge())
            getWorld().removeObject(this);
    }    
}
