import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YesButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YesButton extends MonitorButton
{
    private static String text = "Yes";
    public YesButton(){
        super();
        getImage().drawString("YES",10,20);
    }
    public String getButtonValue(){
        return this.text;
    }
    /**
     * Act - do whatever the YesButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.mousePressed(this)){
           getButtonValue();
        } // Add your action code here.
    }    
}
