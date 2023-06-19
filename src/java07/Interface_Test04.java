package java07;


interface IHello13{
	
	void sayHello(String name);
}
abstract class GoodBye13{
	public abstract void sayGoodBye(String name);
	
}
class SubClass13 extends GoodBye13 implements IHello13{

	@Override
	public void sayHello(String name) {
		System.out.println(name+"안녕");
	}

	@Override
	public void sayGoodBye(String name) {
		System.out.println(name+"잘가");
	}
	
}
public class Interface_Test04 {

	public static void main(String[] args) {
		SubClass13 s13 =new SubClass13();
		s13.sayGoodBye("lee");
		s13.sayHello("pack");
	}

}
