import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasPumpMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPumpMachine extends Actor
{
    private static int state = 0; //state detemines display content

    String buttonVal = "";
    public GasPumpMachine(){
        GreenfootImage image = getImage() ;
        image.scale( 400, 400 ) ;
    }
    /*illustration to receive value button*/
    public void receiveButton(String s){
        this.buttonVal = s;
        System.out.println("Button value received: " + buttonVal);
    }

    public void setState(int s){
        state = s;
    }
    
    public int getState(){
        return state;
    }

    public void refresh(){

        System.out.println("current state is: " + state);

        switch(state){
            case 0:
                setState(5);
                break;
            case 1:
                setState(2);
                break;
            case 2:
                if(buttonVal.equals("yes"))
                    setState(3);
                else if(buttonVal.equals("no"))
                    setState(4);
                else
                    setState(2);
                break;
            case 3:
                setState(0);
                break;
            case 4:
                setState(0);
                break;
            case 5:
                if(buttonVal.equals("*"))
                    setState(1);
                    break;
            default:
                setState(0);
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
