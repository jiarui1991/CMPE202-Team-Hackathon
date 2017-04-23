import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Display extends Actor
{
    private static String text = "Welcome to Gas Station\n Please insert your membership\n card or insert your credit card";
    private static int size = 40;
    private static Color color = Color.BLACK;
    private static Color background = new Color(0, 0, 0, 0); 
    /**Display constructor**/
    public Display(){
        GreenfootImage image = new GreenfootImage(300, 300);
        image.drawRect(0,0, 299, 299);
        GreenfootImage textImage = new GreenfootImage(text, 20, color, background);
        image.drawImage(textImage, 20, 100);
        setImage(image);
        
    }
    
    /**refresh and redraw the display box and text message **/
    public void refresh(){
        GreenfootImage image = getImage();
        image.clear();
        image.drawRect(0,0, 299, 299);
        GreenfootImage textImage = new GreenfootImage("", size, color, background);
        
        World world = getWorld();
        for(GasPumpMachine gm: world.getObjects(GasPumpMachine.class))
        {
            String state = gm.getState();
            String message = gm.getMessage();
            switch(state){
                case "welcome":
                    textImage = new GreenfootImage(text, 20, color, background);
                    image.drawImage(textImage, 20, 100);
                    break;
                case "membership":
                    textImage = new GreenfootImage("Welcome Dear Customer!\n Insert your credit card\n and enjoy your rewards", 20, color, background);
                    image.drawImage(textImage, 50, 120);
                    textImage = new GreenfootImage("Cancel", 20, color, background);
                    image.drawImage(textImage, 240, 60);
                    break;
                case "zipcode":
                    textImage = new GreenfootImage("Enter Zipcode\n" + message, size, color, background);
                    image.drawImage(textImage, 40, 120);
                    textImage = new GreenfootImage("Cancel", 20, color, background);
                    image.drawImage(textImage, 240, 60);
                    break;
                case "select_gas":
                    textImage = new GreenfootImage("Select Gas Type" + message, size, color, background);
                    image.drawImage(textImage, 20, 120);
                    break;
                case "pump_gas":
                    textImage = new GreenfootImage("Pumping Gas...\n" + message, size, color, background);
                    image.drawImage(textImage, 30, 100);
                    break;
                case "car_wash":
                    textImage = new GreenfootImage("Need a car wash?", size, color, background);
                    image.drawImage(textImage, 10, 100);
                    break;
                case "print_receipt":
                    textImage = new GreenfootImage("Print Receipt?", size, color, background);
                    image.drawImage(textImage, 40, 100);
                    break;
                case "thankyou_1":
                    textImage = new GreenfootImage("Thank you!\nPlease take\nyour receipt.", size, color, background);
                    image.drawImage(textImage, 40, 100);
                    break;
                case "thankyou_2":
                    textImage = new GreenfootImage("Thank you!", size, color, background);
                    image.drawImage(textImage, 40, 100);
                    break;
                
                default:
                    break;
            }
        }
    }
  
    /**
     * Act - do whatever the Display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        refresh();
    }    
}
