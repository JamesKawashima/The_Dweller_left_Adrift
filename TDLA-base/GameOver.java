import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        super(900, 600, 1); 
        getBackground().drawImage(new GreenfootImage("gameOver.png"), 0, getHeight() / 2 - 75);
        Greenfoot.stop();
    }
}
