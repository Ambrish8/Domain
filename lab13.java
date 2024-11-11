class BoolPattern {
private int a;
private int b ;
private int c  ;
void showData ( int a ) {
System . out . println ("{"+a +","+b+"}");
}
void showData (int a,int b ) {
System . out . print(" { " );
for( a=0;a<=1;a++){
	for( b=0;b<=1;b++){
		System . out . print (a);
		System . out . print (b+",");
}}
System . out . println(" } " );
}
void showData (int a,int b,int c ) {
System . out . print(" { " );
for( a=0;a<=1;a++){
	for( b=0;b<=1;b++){
		for ( c=0;c<=1;c++){
		System . out . print(a);
		System . out . print(b);
		System . out . print(c+",");
}}}
System . out . println(" } " );
}
}
class lab13 {
public static void main ( String args []) {
System.out.println("-----Ambrish Kalia 2230143------");	
BoolPattern b = new BoolPattern ();
b . showData (0);
b . showData  (0,0);
b . showData (0,0,0);
}}