abstract class Car 
{
    public abstract void drive(); //for method to be abstract,class must also be abstract

    public void PlayMusic()
    {
        System.out.println("Playing Music" );
    }
}
class WagonR extends Car 
{
    public void drive()
    {
        System.out.println("Driving . .  ");  //subclass must implement every abstract class' methods 
    }
}
public class abstract1 
{
    public static void main(String args[])
    {
        Car ob = new WagonR();   //we can't create object of abstract class
        ob.drive();
        ob.PlayMusic();       
    }
}