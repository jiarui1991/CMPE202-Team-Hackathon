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
        
        //demonstrate internally how to receive button value, you can remove it!
        GasPumpMachine gaspumpmachine = new GasPumpMachine();
        addObject(gaspumpmachine,723,87);
        
        //Initialize keypad
        KeypadButton[] keypadbuttons = new KeypadButton[12];
        for(int i=0;i<9;i++){
            keypadbuttons[i] = new KeypadButton(Integer.toString(i+1));
        }
        keypadbuttons[9] = new KeypadButton("*");
        keypadbuttons[10] = new KeypadButton("0");
        keypadbuttons[11] = new KeypadButton("#");
        for(int i=0;i<12;i++){
            addObject(keypadbuttons[i],350 +(i%3)*31,400+ (i/3)*31);
        }
        //Initialize monitor button;
        MonitorButton[] monitorbuttons = new MonitorButton[8];
        for(int i=0;i<4;i++){//op1-4
            monitorbuttons[i] = new MonitorButton("op" + Integer.toString(i+1));
            addObject(monitorbuttons[i],180, 100+ i*50);
        }
        monitorbuttons[4] = new MonitorButton("fake");
        monitorbuttons[5] = new MonitorButton("fake");
        monitorbuttons[6] = new MonitorButton("yes");
        monitorbuttons[7] = new MonitorButton("no");
        for(int i=0;i<4;i++){
           addObject(monitorbuttons[i+4],620, 100+ i*50);   
        }
    }
}
