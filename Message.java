import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    public Message(){
        GreenfootImage textImage = new GreenfootImage("Welcome!", 40, Color.BLACK, new Color(0, 0, 0, 0));
        setImage(textImage);
    }
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage textImage = getImage();
        //textImage.clear();
        //textImage.drawString("!!!",0,0);
        setImage(textImage);
    }    
}
