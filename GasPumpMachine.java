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
                break;
            case "zipcode":
                if(buttonVal.equals("enter")){
                    setState("select_gas");
                    message = "";    
                }
                else if(buttonVal.equals("cancel")){
                    setState("welcome");
                    message = "";
                }
                else if(Integer.parseInt(buttonVal) >= 0 &&
                        Integer.parseInt(buttonVal) <= 9)
                {
                    message += buttonVal;
                    //System.out.println(message);
                }
                break;
            case "select_gas":
                if(buttonVal.equals("#87") || buttonVal.equals("#89") ||
                   buttonVal.equals("#91"))
                {
                    message += buttonVal;
                    setState("pump_gas");
                }
                break;
            case "pump_gas":
                if(buttonVal.equals("gas_pump"))
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
            case "thankyou_1":
                setState("welcome");
                break;
            case "thankyou_2":
                setState("welcome");
                break;
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
