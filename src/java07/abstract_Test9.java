package java07;


 
abstract class Abs1{ 
int a=10; 
String str="Test"; 
public abstract int getA( ); 


public abstract String getStr( );




} 
 class Abs2 extends Abs1{ 
int b=100; 

public int getA() {
	return super.a;
}
public int getB() { 
 	return this.b;
}
public String getStr() {
	return super.str;
}

}
public class abstract_Test9 {

	public static void main(String[] args) {
		Abs2 a =new Abs2();
		System.out.println(a.getA());
		
		System.out.println(a.getB());
		System.out.println(a.getStr());
		
	}


}
