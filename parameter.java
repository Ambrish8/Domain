class Student
{
      void Student()
      {
             System.out.println("I am a Student ");
      }
      Student()
      {
              System.out.println("I am an ECSc student"); 
      }
      Student(String n)
      {
              System.out.println("I am " + n);
      } 
      Student(int age)
      {
              System.out.println("My age is " + age);
      }
}     

class parameter
{
    public static void main(String[] args)
    {
            System.out.println("-----Ambrish kalia_2230143 -----");
            Student st = new Student();
            st.Student();
            Student st1=new Student("Ambrish");
            Student st2=new Student(21);
    }
}