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

            for(GasPumpMachine gm: world.getObjects(GasPumpMachine.class)){
                int state = gm.getState();

                switch(state){
                    case 0:
                        gm.setState(5);
                        break;
                    case 1:
                        gm.setState(2);
                        break;
                    case 2:
                        if(s.equals("yes"))
                            gm.setState(3);
                        else if(s.equals("no"))
                            gm.setState(4);
                        else
                            gm.setState(2);
                        break;
                    case 3:
                        gm.setState(0);
                        break;
                    case 4:
                        gm.setState(0);
                        break;
                    default:
                        //gm.setState(0);
                        break;

                }
               
            }

            for(GasPumpMachine gm: world.getObjects(GasPumpMachine.class)){
               
               gm.receiveButton(s);
            }
        }
    }
}

