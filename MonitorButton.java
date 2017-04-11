import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MonitorButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonitorButton extends Button
{
     public MonitorButton(){
        GreenfootImage image = new GreenfootImage(100, 50);
        image.drawRect(0, 0, 50, 30);
        setImage(image);
    }
}

