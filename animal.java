import java.util.*;
public class animal
{
     int a;
     public static void main(String[] args)
     {
      System.out.println("Animal");
      Dog robin = new Dog();
      robin.eat();
     }
}
class Dog
{
     public void eat()
     {
      System.out.println("I am eating");
     }
}