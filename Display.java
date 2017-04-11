import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Display extends Actor
{
<<<<<<< HEAD
=======
    private static String text = "Welcome!";
    private static int size = 40;
    private static Color color = Color.BLACK;
    private static Color background = new Color(0, 0, 0, 0); 
    private static int state = 0; //0= default state, 1=state 1, 2=state 2
    
    /**Display constructor**/
>>>>>>> origin/master
    public Display(){
        GreenfootImage image = new GreenfootImage(300, 300);
        image.drawRect(0,0, 299, 299);
        setImage(image);
    }
<<<<<<< HEAD
=======
    
    /**refresh and redraw the display box and text message **/
    public void refresh(){
        GreenfootImage image = getImage();
        image.clear();
        image.drawRect(0,0, 299, 299);
        GreenfootImage textImage = new GreenfootImage("Pumping Gas...", size, color, background);
        image.drawImage(textImage, 90, 100);
    }
    
    public void setState(){
        state = 1;
    }
       
>>>>>>> origin/master
    /**
     * Act - do whatever the Display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
<<<<<<< HEAD
=======
        if(state==1){
            refresh();
            state=0;
        }
>>>>>>> origin/master
    }    
}
