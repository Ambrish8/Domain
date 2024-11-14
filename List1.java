 class Person {
void name (){
System .out. println (" Name is Ambrish Kalia ");}
void gender(){
System .out. println (" Gender is Male ");

} }
class Student extends Person {
void roll (){
System .out. println (" Roll is 2230143 "); }
void branch (){
System .out. println (" Branch is ECSc ");

 }}
class List1 {
public static void main ( String args []) {
Student stud = new Student ();
stud . roll ();
stud . name ();
stud.gender();
stud. branch();
}}