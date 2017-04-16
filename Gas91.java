import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gas91 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gas91 extends GasTypeButton
{
    /**
     * Act - do whatever the Gas91 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Gas91(){
        GreenfootImage image = getImage();
        image.scale( 40, 40 );  
        image.drawRect(0,0,39,39);
        setImage(image);
    }

    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            World world = getWorld();
            for(GasPumpMachine gm: world.getObjects(GasPumpMachine.class)){

                gm.receiveButton("#91");
                gm.refresh();
            }
        }
    }    
}
