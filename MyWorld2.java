import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Traffic(100), 70, 100);
        addObject(new Traffic(100), 534, 164);
        addObject(new Traffic(700), 234, 162);
        addObject(new Traffic(700), 480, 50);
        addObject(new Traffic(1000), 181, 48);
        addObject(new Traffic(700), 414, 216);
        addObject(new LongTraffic(), 37, 48);
        addObject(new LongTraffic(), 563, 218);
        addObject(new LongTraffic(), 259, 216);
        addObject(new Panjang(), 244, 33);
        addObject(new Panjang(), 545, 33);
        addObject(new Panjang(), 355, 237);
        addObject(new RedBlur(), 56, 48);
        addObject(new RedBlur(), 244, 52);
        addObject(new RedBlur(), 546, 52);
        addObject(new RedBlur(), 542, 219);
        addObject(new RedBlur(), 354, 216);
        addObject(new RedBlur(), 237, 216);
        addObject(new RedTraffic(15), 57, 49);
        addObject(new RedTraffic(500), 245, 53);
        addObject(new RedTraffic(300), 547, 52);
        addObject(new RedTraffic(15), 542, 219);
        addObject(new RedTraffic(300), 355, 217);
        addObject(new RedTraffic(500), 237, 216);
        addObject(new YellowBlur(), 36, 48);
        addObject(new YellowBlur(), 244, 32);
        addObject(new YellowBlur(), 546, 32);
        addObject(new YellowBlur(), 562, 219);
        addObject(new YellowBlur(), 354, 235);
        addObject(new YellowBlur(), 257, 216);
        addObject(new YellowTraffic(55), 35, 49);
        addObject(new YellowTraffic(800), 244, 32);
        addObject(new YellowTraffic(500), 546, 30);
        addObject(new YellowTraffic(40), 563, 219);
        addObject(new YellowTraffic(500), 355, 235);
        addObject(new YellowTraffic(600), 258, 216);
        addObject(new GreenBlur(), 16, 48);
        addObject(new GreenBlur(), 244, 13);
        addObject(new GreenBlur(), 546, 13);
        addObject(new GreenBlur(), 582, 219);
        addObject(new GreenBlur(), 354, 255);
        addObject(new GreenBlur(), 277, 216);
        addObject(new GreenTraffic(1000), 15, 49);
        addObject(new GreenTraffic(1500), 243, 13);
        addObject(new GreenTraffic(1000), 545, 11);
        addObject(new GreenTraffic(1000), 583, 219);
        addObject(new GreenTraffic(1000), 355, 256);
        addObject(new GreenTraffic(1200), 278, 216);
        addObject(new belok(), 140, 100);
        addObject(new belok(), 179, 390);
        addObject(new biruh(), 20, 100);
        addObject(new RedCar(), 584, 168);
        addObject(new GreenCar(), 480, 3);
        addObject(new turn(), 100, 390);
        addObject(new BlueCar(), 185, 9);
        addObject(new Mobil1(), 413, 265);
    }
}
