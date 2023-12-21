import greenfoot.*;

public class Road extends World
{
    private GreenfootImage road;
    private int y = 0;
    static int enemyCars;
    private PlayerCar myCar;
    private int speed_car;

    public Road()
    {    
        super(400, 700, 1); 
        road = new GreenfootImage("road.png");
        
        myCar = new PlayerCar(speed_car);
        addObject(myCar, 80, 640);

        addEnemyCars();
        speed_car = 29;
    }
    
    public void act()
    {
        if (enemyCars == 0)
        {
            addEnemyCars();
        }
        
    } 
    
    public int getRandomNumber(int start, int end)
    {
       int normal = Greenfoot.getRandomNumber(end - start + 1);
       return normal + start;
    }
    
    public void addEnemyCars()
    {
        addObject(new EnemyCar1(8), getRandomNumber(80, 320), 0); // Pasa la referencia de score
        addObject(new EnemyCar1(6), getRandomNumber(80, 320), 0); // Pasa la referencia de score
        
        enemyCars += 2;
    }
}
