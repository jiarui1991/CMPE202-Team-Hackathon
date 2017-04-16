import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasPumpMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPumpMachine extends Actor
{
    private static int state = 0; //state detemines display content

    String buttonVal = "";
    public GasPumpMachine(){
        GreenfootImage image = getImage() ;
        image.scale( 400, 400 ) ;
    }
    /*illustration to receive value button*/
    public void receiveButton(String s){
        this.buttonVal = s;
        System.out.println("Button value received: " + buttonVal);
    }

    public void setState(int s){
        state = s;
    }
    
    public int getState(){
        return state;
    }
    
    /**
     * Act - do whatever the GasPumpMachine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
