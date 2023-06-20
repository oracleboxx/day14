package java07;
/* 인터페이스 간의 상속문법 형식)
 * interface 인터페이스명 extends 부모인터페이스명,부모인터페이스명{
 * 
 *  }
 * 
 */
interface IHello14{
	void hello(String name);

	
}
interface IGoodBye12{
	public abstract void bye(String name);

	void hello(String name);
}
interface ITotal12 extends IHello14,IGoodBye12{
	void greeting(String name);
}
class SubClass15 implements ITotal12{

	@Override
	public void bye(String name) {
		System.out.println(name+"잘가");
	}

	@Override
	public void hello(String name) {
		System.out.println(name+"안녕");
	}

	@Override
	public void greeting(String name) {
		System.out.println(name+"재미 없다");
	}
	
}
public class Interface_Test05 {

	public static void main(String[] args) {
		SubClass15 sub =new SubClass15();
		sub.hello("a");
		sub.bye("b");
		sub.greeting("z");
	}

}
