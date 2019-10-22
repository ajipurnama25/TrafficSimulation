import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mobil extends Actor
{
    
    MyWorld world;
    Rintangan rintangan = new Rintangan();
    public void act() 
    {
        world = (MyWorld) getWorld();
        kanKir();
    }
    
    private void kanKir(){
        
        /* Cara mengambil koordinat dari actor lain yang tidak 
        terdapat pada world, yang dapat menyebabkan Exception */
        if(! getWorld().getObjects(Rintangan.class).isEmpty()){
            Actor rintangan = (Actor)getWorld().getObjects(Rintangan.class).get(0);
            int RintanganX = rintangan.getX();
            
            // world.getPasti = 1 (mengambil nilainya di world, jadi semua sama)
            
            //Belok kiri jika menyentuh object tengah kekanan
            if(isTouching(Rintangan.class)&&RintanganX>400){
                setRotation(350);//rotasi untuk hindar
                setLocation(getX()-world.getPasti(), getY());
                //Meluruskan kembali mobil jika tidak bersentuhan
                if(isTouching(Rintangan.class)==false){
                    setRotation(0);//untuk mengembalika posisi utama
                    setLocation(getX()-world.getPasti(), getY());
                }
            }
            //Belok kanan jika menyentuh object tengah kekiri
            else if(isTouching(Rintangan.class)&&RintanganX<=400){
                setRotation(15);
                setLocation(getX()+world.getPasti(), getY());
                //Meluruskan kembali mobil jika tidak bersentuhan
                if(isTouching(Rintangan.class)==false){
                    setRotation(0);
                    setLocation(getX()+world.getPasti(), getY());
                }
            }
        }
    }
}
