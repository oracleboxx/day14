package java07;
/* final 
 * 1. 메서드를 final로 정의하면 더 이상 자손에서 오버라이딩을 허용하지 않는다.
 * 2. 클래스를 final로 선언하면 더 이상 송속을 허락하지 않는다.
 */
final class FinalClass08{
	public /*final*/ void pr() {}
} // 메서드에 final을 붙이면 메서드 상속이 안된다
class SubClass08 extends FinalClass08{ // 클래스에 final을 붙이면 상속을 못한다
	public void pr() {
		
	}
}
public class abstract_Test8 {

	public static void main(String[] args) {

	}

}
