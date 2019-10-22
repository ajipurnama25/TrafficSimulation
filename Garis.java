import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Garis extends Actor
{
    public void act() 
    {
        // world.getPasti = 1 (mengambil nilainya di world, jadi semua sama)
        MyWorld world = (MyWorld) getWorld();
        setLocation(getX(), getY()+world.getPasti());//kecepatan garis
        //Jika melebihi batas sumbu Y / Height maka akan hilang
        if(getY()>=599){
            setLocation(400, 0);
        }
    }    
}
