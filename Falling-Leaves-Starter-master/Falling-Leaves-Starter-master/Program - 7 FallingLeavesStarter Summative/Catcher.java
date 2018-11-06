 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Catcher  extends Actor
{
    
    /**
     * 
     * act - things you want to do each time around go in here
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        checkKeys();
        checkForLeaf();
    } 
    /**
     * check keys checks if the user pressed any keys, if any of the arrow keys 
     * are pressed, the catcher moves the corrsponding way
     * 
     *    * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkKeys()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5, getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
        }
}


/**
 * checkForLeaf checks if the Catcehr caught any leaves, if they did, remove the leaf from the world
 * 
 * @param There are no parameters
 * @return Nothing is returned
 */
private void checkForLeaf()
{
            if(isTouching(Leaf.class))
        {
            removeTouching(Leaf.class);
            Greenfoot.playSound("au.wav");
            //call the method update from the KittyWorld class
            ( (AutumnWorld)getWorld()  ).update(); 
            
        }
}
}
