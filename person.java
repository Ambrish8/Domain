class main{
void name(){
System.out.println("Ambrish kalia 2230143 ");
System.out.println("Name is . . . ");
} 
void gender(){
System.out.println("Gender is . . . ");
} }
class student extends main{
void roll(){
System.out.println("Roll is . . . ");
} 
void branch(){
System.out.println("Branch is ECSc ");
} }
class Teacher extends main {
void empid(){
System.out.println (" ID is ... " );
} }
class person {
public static void main ( String args []) {
Teacher t = new Teacher ();
t.empid ();
t.name ();
t.gender();
student s = new student();
s.branch();
}}