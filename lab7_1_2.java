class Student {
private int age ;
private String name ;
private String gender ;
public Student () { // constructor 1 -- default
age = 0; name = gender = " " ;
}
void showData () {

System . out . println (" Name : " + name );
System . out . println (" Gender : " + gender );
System . out . println (" Age : " + age );

}
void showData ( String name ) {

System . out . println (" Name : " + name );

}
void showData ( String name , String gender ) {
System . out . println (" Name : " + name );
System . out . println (" Gender : " + gender );

}
void showData ( String name , String gender , int age ) {
System . out . println (" Name : " + name );
System . out . println (" Gender : " + gender );
System . out . println (" Age : " + age );

}}
class lab7_1_2 {

public static void main ( String args []) {
Student s = new Student ();
s . showData ();
s . showData ( " ABC " );
s . showData ( " ABC " , " MALE " );
s . showData ( " ABC " , " MALE " , 21);

}}