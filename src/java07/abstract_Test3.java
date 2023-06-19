package java07;
/* 1. 부모 추상클래스를 상속받은 자손에서 부모의 추상메서드를 오버라이딩을 하지 않으면 자손도 일반 클래스가 아닌 
 * 	   추상클래스 이어야한다
 * 
 */
abstract class Abs04{
	
	abstract void m01();
	void m02() {
		System.out.println("일반 메서드 m02()");
	}
}
abstract class MiddleClass extends Abs04{
	void m03() {
		System.out.println("일반 메서드 m03()");
	}
}
class SubClass extends MiddleClass{

	
	@Override
	void m01() {
		System.out.println("부모의 추상메서드를 오버라이딩한 m01() 메서드");
	}
	
}
public class abstract_Test3 {

	public static void main(String[] args) {
	
		
	}

}
