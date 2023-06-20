package java07;
/* 1. 인터페이스에 오는 모든 변수는 public static final로 인식하는 정적상수만이 올 수 있다
 *  상수의 특징
 *  1. 일반 변수를 final로 선언하면 상수가 된다.
 *  2. 상수명은 관례적으로 영문대문자로 하고 , 선언과 동시에 최초값을 저장하는 초기화를 반드시 해야한다
 */
interface IColor{
	static final int RED = 1;
	static final int GREEN =2;
	int BLUE =3;
	void setColor(int c);
		public abstract int getColor();
	
}
abstract class AbsColor implements IColor{
	int color =GREEN; //추상클래스에는 COLOR라는 일반 변수가 올 수 있다
	public void setColor(int c) {
		
		color =c;
	}
}
class SubClass16 extends AbsColor{

	@Override
	public int getColor() {
		
		return color;
	}


	
}

public class Interface_Test06 {

	public static void main(String[] args) {
		SubClass16 sub =new SubClass16();
		sub.setColor(IColor.BLUE);
		System.out.println(sub.getColor());
	}

}
