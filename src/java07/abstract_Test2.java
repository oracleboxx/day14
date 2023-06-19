package java07;
/* 추상클래스 특징)
 * 1. 추상클래스를 상속받은 자손 클래스에서는 반드시 부모 추상클래스의 추상메서드를 오버라이딩을 해야 
 *    자손클래스로 객체 생성이 가능하다.
 * 
 */
abstract class abs02 {
	public abstract void method(); 
}
class JavaAbs extends abs02{
	public void method() {
		System.out.println("추상메서드를 오버라이딩 한 메서드");
	}
}


public class abstract_Test2 {

	public static void main(String[] args) {
		abs02 abs = new JavaAbs();
		if(abs instanceof JavaAbs) {
			JavaAbs ja = (JavaAbs)abs;
			ja.method();
		}
	}

}
