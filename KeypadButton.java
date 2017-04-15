import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeypadButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeypadButton extends Button
{
    public KeypadButton(String text){
        GreenfootImage image = new GreenfootImage(31, 31);
        image.drawRect(0, 0, 30, 30);
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
                    case 5:
                        if(s.equals("*"))
                            display.setState(1);
                        break;
                    default:
                        //display.setState(0);
                        break;

                }
            }
            for(GasPumpMachine gm: world.getObjects(GasPumpMachine.class)){
               
               gm.receiveButton(s);
            }
        }    
  }

    
}
