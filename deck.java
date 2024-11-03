class Person {
int roll;
public Person(){
System.out.println("Roll number is " + roll);
}
void name (){
System.out.println(" Name is ... " );
} } 
class Student extends Person {
String namee;
public Student(){
System.out.println("Name is " + namee);
}
void roll (){
System.out.println (" Roll is ... " );
} } 
class FirstYear extends Student {
double avg;
public FirstYear(){
System.out.println("average is "+ avg);
}
void year (){
System.out.println (" 1 st year ... " );
} } 
class FirstSem extends FirstYear{
int marks;
public FirstSem(){
System.out.println("marks is " + marks);
}
void subjects(){
System.out.println("6 Theory courses and and 2 Lab courses ");
} } 
class SecondYear extends Student {
float number;
public SecondYear(){
System.out.println("number is " + number);
}
void year2(){
System.out.println("2nd year ");
} } 
class ThirdYear extends Student{
int grade;
public ThirdYear(){
System.out.println("Grade is " + grade);
}
void year3(){
System.out.println("3rd year ");
} } 
class FourthYear extends Student {
int cgpa;
public FourthYear(){
System.out.println("CGPA is " + cgpa);
}
void year4(){
System.out.println("4th year ");
} } 
class deck {
public static void main ( String args []) {
FirstYear stud = new FirstYear ();
Student s = new Student();
System.out.println("Ambrish Kalia 2230143 ");
stud.year ();
stud.roll ();
stud.name ();
SecondYear n = new SecondYear();
n.year2();
ThirdYear k = new ThirdYear();
k.year3();
FourthYear l = new FourthYear();
l.year4();
}}