import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NoButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoButton extends MonitorButton
{
    private static String text = "No";
    public NoButton(){
        super();
        getImage().drawString(text,10,20);
        setButtonVal(text);
    }
}
