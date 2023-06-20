package java07;

class A17{
	void autoPlay(I17 i17) { // 매개변수 다형성=> 상속+업캐스팅
		i17.Play();// 업캐스팅 이후 오버라이딩 한 메서드를 호출
	}
}
interface I17{
	public abstract void Play();
}
class B17 implements I17{

	@Override
	public void Play() {
		System.out.println("play in B17");
	}
	
}
class C17 implements I17{
	public void Play(){
		System.out.println("play in C17");
	}
}

public  class Interface_Test07 {

	public static void main(String[] args) {
		A17 a =new A17();
		a.autoPlay(new B17());
		a.autoPlay(new C17());
	}

}
