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
        buttonVal = val;
    }
    public String getButtonVal(){
        return buttonVal;
    }
    /**
     * Act - do whatever the MonitorButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            String s = getButtonVal();
            System.out.println(s);
        }
    }    
}
