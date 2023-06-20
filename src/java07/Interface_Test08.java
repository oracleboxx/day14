package java07;
/*  인터페이스 특징)
 *  1.jdk 1.7까지는  인터페이스는 추상메서드만 올 수 있다. 하지만 jdk 1.8이후부터는 추상메서드 외에 
 *    static 정적 메소드나 디폴트 메서드가 추가적으로 만들 수 있다.
 * 
 */
interface MyInter{
	/* default 메서드 특징
	 *  1. 과거에는 부모 인터페이스에 추상메서드를 새롭게 추가하면 이 인터페이스를 구현 상속받은 모든
	 *     자손클래스에서 불필요한 추상메서드를 오버라이딩을 해야하는 불편함이 존재한다
	 *  2.그러므로 부모 인터페이스에 디폴트 메서드를 추가하면 이 인터페이스를 구현 상속받은 모든 자손에서 
	 *    사용하지 않는 디폴트 메서드를 굳이 오버라이딩을 하지 않아도 된다
	 *    
	 *  3. 디폴트 메서드 접근지정자도 public 이다. 생략가능
	 */
	public default void method01() {
		System.out.println("method01() in MyInter");
	}
	public default void method02() {
		System.out.println("method02() in MyInter");
	}
	static void staticMethod01() {
		System.out.println("staticMeyhod() MyInter01");
	}
	
}
interface MyInter02{
	/* 인터페이스에서 디폴트 메서드가 중복된 경우 이 인터페이스를 구현상속받은 자손클래에서 디폴트 메서드를
	 * 오버라이딩을 해야한다.
	 * 
	 */
	default void method01() {
		System.out.println("method02 in MyInter02");
	}
	static void staticMethod02() {
		System.out.println("staticMeyhod() MyInter02");
	}
}
class  Parent04 {
	public void method01() {
		System.out.println("method02 in MyInter02");
	
	}
	public void method02() {
		System.out.println("method02() in Myinter");
	}
}
class Child04 extends Parent04 implements MyInter,MyInter02{

	
	

}


public class Interface_Test08 {

	public static void main(String[] args) {
		Child04 ch = new Child04();
	
		ch.method01();
		ch.method02();
	}

}
