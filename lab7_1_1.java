class Student {
private int age ;
private String name ;
private String gender ;
public Student () { // constructor 1 -- default
age = 0; name = gender = " " ;
}
public Student ( int a ) { // constructor 2
age = a ; name = gender = " " ;

}
public Student ( int a , String n ) { // constructor 3

age = a ; name = n ; gender = " " ;

}
// constructor 4
public Student ( int a , String n , String g ) {
age = a ; name = n ; gender = g ;

}
void displayData () {

System . out . println (" Name : " + name );
System . out . println (" Gender : " + gender );
System . out . println (" Age : " + age );
System . out . println (" ----------------" );
}}
class lab7_1_1 {

public static void main ( String args []) {
Student s1 = new Student ();
Student s2 = new Student (21);
Student s3 = new Student (21 , " XYZ " );
Student s4 = new Student (21 , " XYZ " , " Male " );
s1 . displayData ();
s2 . displayData ();
s3 . displayData ();
s4 . displayData ();

}}