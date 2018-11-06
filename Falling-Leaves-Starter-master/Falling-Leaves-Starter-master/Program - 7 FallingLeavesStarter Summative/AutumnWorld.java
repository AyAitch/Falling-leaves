import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AutumnWorld  extends World
{

    private Scoreboard score;
    /**
     * Constructor for objects of class FallWorld.
     * 
     * @param There are no parameters
     * @return Nothing is returnes
     */
    public AutumnWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(750, 500, 1); 
        addCatcher(); 
        score = new Scoreboard();
        addObject( score, 80,10);
    }
    
   
   /** add the update for score board
    * 
    * @param There are no parameters
     * @return Nothing is returnes
    */ 
    public void update()
    {
        score.addToScore();
        }
   /**
    * act - things you want to do each time around go in here
    * 
    * @param There are no parameters
     * @return Nothing is returnes
    */
    public void act()
    {
       addLeaves();
    }
    
    /**
     * addCatcher adds a catcher to the world
     * 
     * @param There are no parameters
     * @return Nothing is returnes
     */
    public void addCatcher()
    {
       addObject( new Catcher(), 375 , 475 );
    }
    /**
     * addLeaves adds leaves to the world during the game
     * @param There are no parameters
     * @return Nothing is returned
     */
    
    private void addLeaves()
    {
    if ( Greenfoot.getRandomNumber(100) < 1)
        {
          addObject(new Leaf(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(3));  
        }
    }
    
    
}

