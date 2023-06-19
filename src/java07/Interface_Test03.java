package java07;
/* 1.클래스 or 추상클래스는 하나의 부모로부터 단일 상속만 가능하다.
 * 2.인터페이스는 하나 이상의 부모로부터 다중 상속이 가능하다.
 * 
 */
interface IHello12{
	void sayHello(String name);
}
interface IBye12{
	public abstract void sayBye(String name);
	
}
class SubClass12 implements IHello12,IBye12{

	@Override
	public void sayBye(String name) {
		System.out.println(name+"잘가");
	}

	@Override
	public void sayHello(String name) {
		System.out.println(name+"안녕");
	}
	
}
public class Interface_Test03 {

	public static void main(String[] args) {
		SubClass12 sub =new SubClass12();
		sub.sayHello("lee");
		sub.sayBye("pack");
	}

}
