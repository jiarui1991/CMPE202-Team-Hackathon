import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private static int w=800; //set width of world
    private static int h=600; //set height of world
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GasPump gaspump = new GasPump();
        addObject(gaspump,594,422);
        gaspump.setLocation(677,509);
        Display display = new Display();
        addObject(display,310,149);
        display.setLocation(378,167);
        YesButton yesbutton = new YesButton();
        addObject(yesbutton,104,253);
        yesbutton.setLocation(196,278);
        NoButton nobutton = new NoButton();
        addObject(nobutton,175,229);
        nobutton.setLocation(197,318);
        yesbutton.setLocation(203,250);
        nobutton.setLocation(203,298);
    }
}
