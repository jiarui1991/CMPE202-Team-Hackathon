import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private String buttonVal = "";
    public void setButtonVal(String val){
        this.buttonVal = val;
    }
    public String getButtonVal(){
        return this.buttonVal;
    }
     /**
     * Act - do whatever the YesButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       // if(Greenfoot.mousePressed(this)){
       //     World world = getWorld();
       //     for(GasPumpMachine gm: world.getObjects(GasPumpMachine.class)){
       //         String s = getButtonVal();
       //         gm.receiveButton(s);
       //     }
       //  } // Add your action code here.
    }        
}

