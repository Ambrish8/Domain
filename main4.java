class Person {
String name ;
 void info(){
 System.out.println(" Name is ... " + name );
} }
class Student extends Person {
int roll ;
   void info(){
   System.out.println(" Roll is ... " + roll );
} }
class main4 {
      public static void main ( String args []) {
         Student stud = new Student ();
         stud.info();
} }