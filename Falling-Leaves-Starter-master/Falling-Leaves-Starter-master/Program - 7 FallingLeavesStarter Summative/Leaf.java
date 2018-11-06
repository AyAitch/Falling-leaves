import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Leaf  extends Actor
{
        private GreenfootImage leaf0 = new GreenfootImage("cutoutleaf0.png");
        private GreenfootImage leaf1 = new GreenfootImage("cutoutleaf1.png");
        private GreenfootImage leaf2 = new GreenfootImage("cutoutleaf2.png");
        private GreenfootImage leaf3 = new GreenfootImage("cutoutleaf3.png");
        private int speed;
        private int wind;
        
        /**  
         * Leaf adds the leafs speed and wind speed and image to the actor
         * 
         * @param There are no parameters
     * @return Nothing is returned
         * 
         */
    public Leaf()
    {
        /* Change the image of the leaf depending on whether the random
         * number is 0, 1, 2, or 3. 
         */ 
        speed = Greenfoot.getRandomNumber(1)+4;
        wind = Greenfoot.getRandomNumber(1)+1;
        // get a random number that will correspond to the image is shown for food
        int randomImage = Greenfoot.getRandomNumber(4);
        //if the random number is 0...
        
        if( randomImage == 0 )
        {
            // set the image to the first option (burger)
            setImage( "cutoutleaf0.png");
        }
        // otherwise, if the random number is 1
        else if ( randomImage == 1 )
        {
            //set the image to the second option(cupcake)
            setImage( "cutoutleaf1.png");
        }
        
        else if ( randomImage == 2 )
        {
            setImage("cutoutleaf2.png");       }
        //otherwise...
        else
        {
            //set the image to the last option ( pizza )
            setImage( "cutoutleaf3.png" );
        }
     }
     
     
     /**
      * 
      * act - things you want to do each time around go in here
      * 
      * @param There are no parameters
     * @return Nothing is returned
      * 
      */
    public void act() 
    {      
        moveDown();
        wind();
        if (isAtEdge() == true)
        {
         getWorld().removeObject(this);
        }
    }   
       
    /**
     * moveDown allows the leaf to fall down the scrren and turn at the same time
     * 
     * 
     * @param There are no parameters
     * @return Nothing is returned
     * 
     */
    public void moveDown()
    {   
        setLocation( getX(), getY()+speed);
        turn(5);
    }     
    
    
    /**
     * wind blows the leaf to the left as it falls down
     * 
     * @param There are no parameters
     * @return Nothing is returned
     * 
     */
    public void wind()
    {
     setLocation( getX()+wind, getY() );  
    }
}
