package java07;
/* 1.인터페이스는 interface 예악어로 정의 한다
 * 2.인터페이에는 public abstract으로 인식되는 추상메서드가 올 수 있다
 * 3.부모 인터페이스를 자손클래스에서 implements 키워드로 구현 상속을 받는다.
 * 4.부모 인터페이스에 오는 추상메서드를 상속받은 자손클래스에서 모두 오버라이딩을
 *   해야 자손 클래스 객체 생성이 가능하다.
 */
interface IHello{
	public abstract void sayHello(String name);
}
interface IGoodBye{
	public abstract void sayGoodBye(String name);
}
interface ITotal extends IHello,IGoodBye{
	public abstract void greeting(String name);
}
class SubClass2 implements ITotal {

	@Override
	public void sayGoodBye(String name) {
		System.out.println(name +"안녕히가세요");
	}

	@Override
	public void sayHello(String name) {
		System.out.println(name+"안녕하세요");
	}
	public void greeting(String name) {
		System.out.println(name+"안녕");
	}
}

public class Interface_Test01 {

	public static void main(String[] args) {
		IHello s1 =new SubClass2();
		if(s1 instanceof SubClass2) {
			SubClass2 i = (SubClass2)s1;
			i.sayGoodBye("pack");
			i.greeting("chol");
			i.sayHello("lee");
		}
		
		
		
	}

}
