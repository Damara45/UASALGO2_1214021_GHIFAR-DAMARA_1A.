import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Actor
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    if (Greenfoot.isKeyDown("W"))
    {
        setRotation(270);
        move(1);
    }
    if (Greenfoot.isKeyDown("S"))
    {
        setRotation(90);
        move(1);
    }
    if (Greenfoot.isKeyDown("A"))
    {
        setRotation(180);
        move(1);
    }
    if (Greenfoot.isKeyDown("D"))
    {
        setRotation(0);
        move(1);
    }
}
}
