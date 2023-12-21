import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerCar extends Actor
{
    private int x,y;
    private int speed;
    
    
    public PlayerCar(int speed)
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/11;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewHeight, myNewWidth);
    }
    
    public void act()
    {
        checkKeypress();
        checkCollision();
    }
    
    public void checkKeypress()
    {
        x=getX();
        y=getY();
        
        if (Greenfoot.isKeyDown("left")) 
        {
            move(-12);
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            move(12);
        }
        if(Greenfoot.isKeyDown("up"))
        { 
            setLocation(x,y-12 + speed); 
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x,y+12 + speed);
        }         
    }
    
    
    public void checkCollision()
    {
        Actor collided = getOneIntersectingObject(EnemyCar1.class);
        if (collided != null)
        {
          Greenfoot.stop();
        }
    }
    
}
