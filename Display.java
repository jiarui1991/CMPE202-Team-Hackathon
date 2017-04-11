import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Display extends Actor
{
    private static String text = "Welcome!";
    private static int size = 40;
    private static Color color = Color.BLACK;
    private static Color background = new Color(0, 0, 0, 0); 
    
    public Display(){
        GreenfootImage image = new GreenfootImage(300, 300);
        image.drawRect(0,0, 299, 299);
        GreenfootImage textImage = new GreenfootImage(text, size, color, background);
        image.drawImage(textImage, 90, 100);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image = getImage();
        image.clear();
        image.drawRect(0,0, 299, 299);
        GreenfootImage textImage = new GreenfootImage("Hello?", size, color, background);
        image.drawImage(textImage, 90, 100);
    }    
}
