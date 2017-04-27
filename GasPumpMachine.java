import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasPumpMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPumpMachine extends Actor
{
    private static String state = "welcome"; //state detemines display content
    private static String message = "";
    private static double gas_type = 0; //set the gas unit price 
    private static long starttime =0;
    String buttonVal = "";
    public GasPumpMachine(){
        GreenfootImage image = getImage() ;
        image.scale( 400, 400 ) ;
        message = "";
        state = "welcome";
    }
    /*illustration to receive value button*/
    public void receiveButton(String s){
        this.buttonVal = s;
        System.out.println("Button value received: " + buttonVal);
    }

    public void setState(String s){
        state = s;
    }
    
    public String getState(){
        return state;
    }
   
    public double getType(){
        return gas_type;
    }

    public String getMessage(){
        return message;
    }

    public void refresh(){

        switch(state){
            case "welcome":
                if(buttonVal.equals("credit_card")){
                    setState("zipcode");
                    message = "";
                }
                else if(buttonVal.equals("member_card")){
                    setState("membership");
                    message = "";
                }
                break;

            case "membership":
                if(buttonVal.equals("credit_card"))
                      setState("zipcode");
                else if(buttonVal.equals("restart"))
                      setState("welcome");
                break;

            case "zipcode":
                //if (buttonVal.equals("enter") || buttonVal.equals("cancel") || buttonVal.matches("[-+]?\\d*\\.?\\d+")) {
                if(buttonVal.equals("enter") && (message.length() == 5)){
                    setState("select_gas");
                    message = "";    
                }
                else if(buttonVal.equals("cancel")){
                    setState("zipcode");
                    message = "";
                }
                else if(buttonVal.matches("[-+]?\\d*\\.?\\d+")){
                    if(Integer.parseInt(buttonVal) >= 0 &&
                            Integer.parseInt(buttonVal) <= 9)
                    {
                        if (message.length() != 5)
                            message += buttonVal;
                        // System.out.println(message);
                    }
                }
                else if(buttonVal.equals("restart"))
                      setState("welcome");
                break;

            case "select_gas":
                if(buttonVal.equals("#87") || buttonVal.equals("#89") ||
                   buttonVal.equals("#91"))
                {
                    message += buttonVal;
                    setState("pump_gas");
                    if (buttonVal.equals("#87"))
                        gas_type = 0.77;
                    if (buttonVal.equals("#89"))
                        gas_type = 0.97;
                    if (buttonVal.equals("#91"))
                        gas_type = 1.2;
                }
                break;

            case "pump_gas":
                if(buttonVal.equals("gas_pump")) {
                    setState("fueling_start");
                }
                break;
               
            case "fueling_start":
                if(buttonVal.equals("gas_pump")) {
                    setState("car_wash");
                }
                break;
       
            case "car_wash":
                if(buttonVal.equals("yes"))
                    setState("thankyou_3");
                else if(buttonVal.equals("no"))
                    setState("print_receipt");
                break;
            
            case "print_receipt":
                if(buttonVal.equals("yes")) 
                    setState("thankyou_1");
                else if(buttonVal.equals("no"))
                    setState("thankyou_2");
                else
                    setState("print_receipt");
                break;

            case "thankyou_1":       // with print receipt
                setState("welcome");
                break;

            case "thankyou_2":       // don't print receipt
                setState("welcome");
                break;

            case "thankyou_3":      // with card wash and print receipt
                setState("welcome");

            default:
                setState("welcome");
                break;
        }
    }

    /**
     * Act - do whatever the GasPumpMachine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //refresh();
    }    
}
