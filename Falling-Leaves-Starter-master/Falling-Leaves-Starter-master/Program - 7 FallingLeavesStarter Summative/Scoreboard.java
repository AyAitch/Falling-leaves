import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);

    /**
     * adds the score board to the world and makes it green
     * @param There are no parameters
     * @return Nothing is returned
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setColor(Color.RED);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }

    /** adds the score to the score board
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        if(points < 10) {
            img.drawString("Score: " + points, 5,25); 
        } else {
            img.drawString("YOU WIN!!!  !!!   !!!   !!!   !!!", 5,25);
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
        }        
    }    
}