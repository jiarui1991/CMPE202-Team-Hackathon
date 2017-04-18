import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creditcard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creditcard extends Actor
{
    /**
     * Act - do whatever the Creditcard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Creditcard(){
        GreenfootImage image = new GreenfootImage("credit_card.png");
        image.scale( 100, 60 );  
        image.drawRect(0,0,99,59);
        setImage(image);
    }

    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            World world = getWorld();
            for(GasPumpMachine gm: world.getObjects(GasPumpMachine.class)){

                gm.receiveButton("credit_card");
                gm.refresh();
            }
        }
    }    
}
