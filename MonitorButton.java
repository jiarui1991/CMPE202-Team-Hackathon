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
       // GreenfootImage image = new GreenfootImage(100, 50);
      //  image.drawRect(0, 0, 50, 30);
       // setImage(image);
       // getImage().drawString(text,10,20);
        setButtonVal(text);
        GreenfootImage image = getImage();
        image.scale( 60, 30 ); 
        setImage(image);
    }

    public void act(){

        if(Greenfoot.mousePressed(this)){
            World world = getWorld();
            String s = getButtonVal();

            for(GasPumpMachine gm: world.getObjects(GasPumpMachine.class)){
               gm.receiveButton(s);
               gm.refresh();
            }
        }
    }
}

