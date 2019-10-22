import greenfoot.*;  

public class MyWorld extends World
{
    int pasti = 2; //Static agar tidak merubah satu2
    private boolean spaceDown; 
    private int spaceCount=0;
    
    public MyWorld()
    {    
        super(800, 600, 1); 
        siap();
    }
    
    public void act(){
        tambahMobil();
        randomRintangan();
    }
    
    private void siap(){
        //Koordinat tengah 400
        addObject(new Garis(),400, 40);
        addObject(new Garis(),400, 140);
        addObject(new Garis(),400, 240);
        addObject(new Garis(),400, 340);
        addObject(new Garis(),400, 440);
        addObject(new Garis(),400, 540);
    }
    
    public int getPasti(){
        return pasti; 
    }
    
    public void tambahMobil(){
        if (!spaceDown && Greenfoot.isKeyDown("z")){
            spaceDown= true; 
            spaceCount++;
            if (spaceCount == 1) addObject(new Mobil(),450, 550);
            else if (spaceCount == 2) addObject(new Mobil(),450, 475);
            else if (spaceCount == 3) addObject(new Mobil(), 450, 400);
            else if (spaceCount > 3) Greenfoot.stop();//jika sdh bagian 3 mka
        }
        if (spaceDown && !Greenfoot.isKeyDown("z"))
        {
            spaceDown = false;
        } 
    }
    
    
      
    public void randomRintangan(){
        if(Greenfoot.getRandomNumber((11-getPasti())*100)==10){
            addObject(new Rintangan(), Greenfoot.getRandomNumber(160)+320, 0);
            //RUMUS RANDOM DENGAN INTERVAL 320-480
            //getRandomNumber(max-min)+min "max = 480, min = 320"
            //Jadi = getRandomNumber(160)+320
        }
    }
}
