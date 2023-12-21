import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyCar1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyCar1 extends Actor
{
    private int speed;
    
    public EnemyCar1(int newSpeed)
    {
        speed = newSpeed;
    }
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/11;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewHeight, myNewWidth);
    }
    public void act()
    {
        setLocation(getX(), getY() + speed);
        if( getY() >= getWorld().getHeight() - 1 )
        {
            Road juego = (Road) getWorld();
            juego.removeObject(this);
            Road.enemyCars -= 1;
        }
    }
}
