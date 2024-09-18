class Human
{
    private int age;
    private String name;

    public Human()
    {
        age=30;
        name="Jon";
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}
public class constructor1
{
    public static void main(String args[])
    {
        Human ob1= new Human();
        /* ob1.setAge(35);
        ob1.setName("Aman"); */

        System.out.println(ob1.getName() + " : " + ob1.getAge());

        //System.out.println(ob1.getAge()+" :"+ob1.getName());
    }
}