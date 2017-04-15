import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MonitorButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonitorButton extends Button
{
     public MonitorButton(String text){
        GreenfootImage image = new GreenfootImage(100, 50);
        image.drawRect(0, 0, 50, 30);
        setImage(image);
        getImage().drawString(text,10,20);
        setButtonVal(text);
    }

    public void act(){

        if(Greenfoot.mousePressed(this)){
            World world = getWorld();
            String s = getButtonVal();

            for(Display display: world.getObjects(Display.class)){
                int state = display.getState();

                switch(state){
                    case 0:
                        display.setState(5);
                        break;
                    case 1:
                        display.setState(2);
                        break;
                    case 2:
                        if(s.equals("yes"))
                            display.setState(3);
                        else if(s.equals("no"))
                            display.setState(4);
                        else
                            display.setState(2);
                        break;
                    case 3:
                        display.setState(0);
                        break;
                    case 4:
                        display.setState(0);
                        break;
                    default:
                        //display.setState(0);
                        break;

                }


 /*               if(display.getState()==0){
                    display.setState(1);
                }
                else if(display.getState()==1){
                    display.setState(2);
                }
                else if(display.getState()==2){

                    if(s.equals("yes"))
                        display.setState(3);
                    else if(s.equals("no"))
                        display.setState(4);
                    else
                        display.setState(2);
                }
                else
                    display.setState(0);
*/                
            }
            //System.out.println("Testing");

            for(GasPumpMachine gm: world.getObjects(GasPumpMachine.class)){
               
               gm.receiveButton(s);
            }
        }
    }
}

