import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
import java.util.concurrent.TimeUnit;
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
    private static double price = 0;
    private static double bill = 0;
    private static long starttime = 0;
    private static long endtime = 0;
    private static double elapsed = 0;
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
    public void refresh() {
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
                    starttime = System.currentTimeMillis();
                    price = gm.getType();
                    textImage = new GreenfootImage("Pumping Gas...\n" + message, size, color, background);
                    image.drawImage(textImage, 30, 100);
                    break;
                case "fueling_start":
                    endtime = System.currentTimeMillis();
                    elapsed = (endtime - starttime)/10000.0;// second counter  
                    double n = (elapsed*100*price); //count price
                    bill = n/100;
                    textImage = new GreenfootImage("   This Sale\n$ " + String.format("%.2f", bill) + "\n  --------\n   " + String.format("%.2f", elapsed) + "\n   Gallons", size, color, background);
                    image.drawImage(textImage, 30, 60); 
                    break;
                case "car_wash": 
                    textImage = new GreenfootImage("Totally is: $" + String.format("%.2f", bill) +"\n in $"+ price +"/Gallon", 25, Color.BLUE, background);
                    image.drawImage(textImage, 5, 50);
                    textImage = new GreenfootImage("Need a car wash?", size, color, background);
                    image.drawImage(textImage, 10, 100);
                    textImage = new GreenfootImage("Yes", 20, color, background);
                    image.drawImage(textImage, 260, 165);
                    textImage = new GreenfootImage("No", 20, color, background);
                    image.drawImage(textImage, 260, 210);
                    break;
                case "print_receipt":
                    textImage = new GreenfootImage("Print Receipt?", size, color, background);
                    image.drawImage(textImage, 40, 100);
                    textImage = new GreenfootImage("Yes", 20, color, background);
                    image.drawImage(textImage, 260, 165);
                    textImage = new GreenfootImage("No", 20, color, background);
                    image.drawImage(textImage, 260, 210);
                    break;
                case "thankyou_1":
                    Calendar calendar = Calendar.getInstance();
                    int date = calendar.get(Calendar.DATE);
                    int month = calendar.get(Calendar.MONTH);
                    int year = calendar.get(Calendar.YEAR);
                    String content = "GAS STATION\nBRAND \nSALE RECEIPT \n\nADDRESS 1 \nADDRESS 2";
                    content +="\n\n\nDATE:" + month +"/"+ date +"/"+year +"\n\nINVOICE# 10101010"+ "\n      CREDIT CARD\n";
                    String gallon = String.format("%.2f", bill/price);
                    content +="**************************\n"+"PUMP    GALLONS    TOTAL\n" + message+ "        "+ gallon + "           $" + String.format("%.2f", bill);
                    content += "\n Thank You! ";
                    JOptionPane.showMessageDialog(new JInternalFrame(), content,"Gas Receipt", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                    textImage = new GreenfootImage("Thank you!\nPlease take\nyour receipt.", size, color, background);
                    image.drawImage(textImage, 40, 100);
                    break;
                case "thankyou_2":
                    textImage = new GreenfootImage("Thank you!", size, color, background);
                    image.drawImage(textImage, 40, 100);
                    break;
                case "thankyou_3":
                    Calendar calendar2 = Calendar.getInstance();
                    int date2 = calendar2.get(Calendar.DATE);
                    int month2 = calendar2.get(Calendar.MONTH);
                    int year2 = calendar2.get(Calendar.YEAR);
                    String content2 = "GAS STATION\nBRAND \nSALE RECEIPT \n\nADDRESS 1 \nADDRESS 2";
                    content2 +="\n\n\nDATE:" + month2 +"/"+ date2 +"/"+year2 +"\n\nINVOICE# 10101010"+ "\n      CREDIT CARD\n";
                    String gallon2 = String.format("%.2f", bill/price);
                    content2 +="*******************************\n"+"PUMP    GALLONS   CAR_WASH   TOTAL\n" + message+ "      "+ gallon2 + "           "+ "  $5.00" +"           $" + String.format("%.2f", bill+5);
                    content2 += "\n Thank You! ";
                    JOptionPane.showMessageDialog(new JInternalFrame(), content2,"Gas Receipt", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                    textImage = new GreenfootImage("Thank you!\n Enjoy your\n car wash", size, color, background);
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
