class Person {
void name (){
System.out.println(" Name is ... " );
} }
class Student extends Person {
void roll (){
System.out.println (" Roll is ... " );
} }
class FirstYear extends Student {
void year (){
System.out.println (" 1 st year ... " );
} }
class FirstSem extends FirstYear{
void subjects(){
System.out.println("6 Theory courses and and 2 Lab courses ");
} }
class SecondYear extends Student {
void year2(){
System.out.println("2nd year ");
} }
class ThirdYear extends Student{
void year3(){
System.out.println("3rd year ");
} }
class FourthYear extends Student {
void year4(){
System.out.println("4th year ");
} }
class main {
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