 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainCredits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainCredits extends World
{
    public static final int WIDTH = 900; 
    public static final int HEIGHT = 600;
    /**
     * Constructor for objects of class MainCredits.
     * 
     */
    public MainCredits()
    {    
         super(WIDTH ,HEIGHT ,1);
    }
    
    public void act() 
    {
        addObject(new MenuArrow("MainScreen"), 50, HEIGHT - 50);
        showText("Credits:", getWidth() / 2, 100);
        showText("James K. : Part programmer, Lead artist ", getWidth() / 2, 150);
        showText("Philip D. : Part artist part programmer ", getWidth() / 2, 200);
        showText("Vinh M. : Lead programmer ", getWidth() / 2, 250);
        showText("GNU General Public License v2.0", getWidth() / 2, 300);
    }
}
