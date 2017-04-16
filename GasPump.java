import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasPump here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPump extends Actor
{
    public GasPump(){
        GreenfootImage image = getImage();
        image.scale( 120, 120 );  
        image.drawRect(0,0,119,119);
        setImage(image);
    }
    /**
     * Act - do whatever the GasPump wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            World world = getWorld();
            for(GasPumpMachine gm: world.getObjects(GasPumpMachine.class)){
                if(gm.getState()==0){
                    gm.setState(1);
                }
                else if(gm.getState()==1){
                    gm.setState(2);
                }
                else if(gm.getState()==2){
                    gm.setState(0);
                }
                //System.out.println("Testing");
            }
        }
    }    
}
