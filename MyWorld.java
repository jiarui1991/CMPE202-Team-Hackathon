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
        /*
         * GreenfootImage image = new GreenfootImage("gaspumpmachine.png");
        image.scale( 40, 40 );  
        image.drawRect(0,0,39,39);
        setImage(image);
         */
        Display display = new Display();
        addObject(display,310,149);
        display.setLocation(378,167);

        Creditcard creditcard = new Creditcard();
        addObject(creditcard, 677, 400);

        MemberCard membercard = new MemberCard();
        addObject(membercard, 677, 330);

        Gas87 gas87 = new Gas87();
        addObject(gas87, 320, 350);

        Gas89 gas89 = new Gas89();
        addObject(gas89, 380, 350);

        Gas91 gas91 = new Gas91();
        addObject(gas91, 440, 350);

        //demonstrate internally how to receive button value, you can remove it!
        GasPumpMachine gaspumpmachine = new GasPumpMachine();
        addObject(gaspumpmachine,723,87);

        //Initialize keypad
        KeypadButton[] keypadbuttons = new KeypadButton[12];
        for(int i=0;i<9;i++){
            int val = i + 1;
            String imgPath = "key_" + Integer.toString(val) + ".png";
            keypadbuttons[i] = new KeypadButton(Integer.toString(i+1), imgPath);
        }
        keypadbuttons[9] = new KeypadButton("cancel","key_cancel.png");
        keypadbuttons[10] = new KeypadButton("0","key_0.png");
        keypadbuttons[11] = new KeypadButton("enter","key_enter.png");
        for(int i=0;i<12;i++){
            addObject(keypadbuttons[i],325 +(i%3)*55,400+ (i/3)*36);
        }
        //Initialize monitor button;
        MonitorButton[] monitorbuttons = new MonitorButton[8];
        for(int i=0;i<4;i++){//op1-4
            monitorbuttons[i] = new MonitorButton("op" + Integer.toString(i+1));
            addObject(monitorbuttons[i],160, 90+ i*50);
        }
        monitorbuttons[4] = new MonitorButton("restart");
        monitorbuttons[5] = new MonitorButton("fake");
        monitorbuttons[6] = new MonitorButton("yes");
        monitorbuttons[7] = new MonitorButton("no");
        for(int i=0;i<4;i++){
            addObject(monitorbuttons[i+4],596, 90+ i*50);   
        }
        GasPumpMachine gaspumpmachine2 = new GasPumpMachine();
        addObject(gaspumpmachine2,392,292);
        gaspumpmachine2.setLocation(488,291);
        gaspumpmachine2.setLocation(120,389);
        removeObject(gaspumpmachine2);
        gaspumpmachine.refresh();
        removeObject(gaspumpmachine);
        GasPumpMachine gaspumpmachine3 = new GasPumpMachine();
        addObject(gaspumpmachine3,652,169);
        gaspumpmachine3.setLocation(598,207);
        gaspumpmachine3.setLocation(144,464);
    }
}
