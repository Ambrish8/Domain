class Person {
void name (){
System .out. println (" Name is Ambrish ");
} }
class Student extends Person {
void roll (){
System .out. println (" Roll is 2230143 ");
} }
class FirstYear extends Student {
void year (){
System .out. println ("1st year ");
} }
class FirstSem extends FirstYear {
void sub() {
System.out.println (" 6 theory subjects nad  2 labs");
}}

class List2 {
public static void main ( String args []) {
    System.out.println("Ambrish Kalia 2230143");
FirstSem subj = new FirstSem ();
subj . year ();
subj . roll ();
subj . name ();
subj . sub();
}}