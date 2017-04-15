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
            for(Display display: world.getObjects(Display.class)){
                if(display.getState()==0){
                    display.setState(1);
                }
                else if(display.getState()==1){
                    display.setState(2);
                }
                else if(display.getState()==2){
                    display.setState(0);
                }
                
            }
            //System.out.println("Testing");

            for(GasPumpMachine gm: world.getObjects(GasPumpMachine.class)){
               String s = getButtonVal();
               gm.receiveButton(s);
            }
        }
    }
}

