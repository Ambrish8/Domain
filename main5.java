class Student{
String name;
int roll;
public Student(){
String n=name;
int a = roll;
}
void info(){
System.out.println("name is "+ name);
System.out.println("roll is "+ roll);
} }
class FirstSem extends Student {
int SGPA;
public FirstSem(){
int b= SGPA;
}
void info(){
System.out.println("name is "+ name);
System.out.println("roll is "+ roll);
System.out.println("SGPA is "+ SGPA);
} } 
class SecondSem extends Student {
int SGPA;
public SecondSem(){
int c= SGPA;
}
void info(){
System.out.println("name is "+ name);
System.out.println("roll is "+ roll);
System.out.println("SGPA is "+ SGPA);
} } 
class ThirdSem extends Student {
int SGPA;
public ThirdSem(){
int d= SGPA;
}
void info(){
System.out.println("name is "+ name);
System.out.println("roll is "+ roll);
System.out.println("SGPA is "+ SGPA);
} }
class main5{
  public static void main(String args[]){
    Student s = new Student();
    FirstSem i = new FirstSem();
    SecondSem j = new SecondSem();
    ThirdSem k = new ThirdSem();
    System.out.println("-----Ambrish Kalia 2230143----- ");
    s.info();
    i.info();
    j.info();
    k.info();
} }