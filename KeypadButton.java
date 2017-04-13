import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeypadButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeypadButton extends Button
{
    public KeypadButton(String text){
        GreenfootImage image = new GreenfootImage(31, 31);
        image.drawRect(0, 0, 30, 30);
        setImage(image);
        getImage().drawString(text,10,20);
        setButtonVal(text);
    }
    
}
