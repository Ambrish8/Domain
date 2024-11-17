class TimeFormat {
int hour,minutes,seconds;
public TimeFormat(){
hour=0;
minutes=0;
seconds=0;
}
public TimeFormat(int a){
hour=a;
minutes=0;
seconds=0;
}
public TimeFormat(int a,int b){
hour=a;
minutes=b;
seconds=0;
}
public TimeFormat(int a, int b, int c){
hour=a;
minutes=b;
seconds=c;
}
void display(){
System.out.println("HH : " + hour);
System.out.println("MM : " + minutes);
System.out.println("SS : " + seconds);
} }
class main3{
   public static void main(String args[]){
   System.out.println("-----Ambrish kalia 2230143-----");
   TimeFormat t1 = new TimeFormat();
   TimeFormat t2 = new TimeFormat(21);
   TimeFormat t3 = new TimeFormat(21,11);
   TimeFormat t4 = new TimeFormat(21,11,12 );
   t1.display();
   t2.display();
   t3.display();
   t4.display();
} }