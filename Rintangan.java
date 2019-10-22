import greenfoot.*; 

public class Rintangan extends Actor
{
    public void act() 
    {
        tambah();
    }    
    
    private void tambah(){
     // world.getPasti = 1 (mengambil nilainya di world, jadi semua sama)   
     
     MyWorld world = (MyWorld) getWorld();
     setLocation(getX(), getY()+world.getPasti());
        //Rintangan akan hilan jika melebihi sumbu Y/Height
        if(getY()>=599){
            getWorld().removeObject(this); 
        }
    }
}
