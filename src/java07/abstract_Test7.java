package java07;
/* 1. 변수를 final로 선언하면 수정할 수 없는 변수 즉 상수가 된다.
 * 2. 상수명은 관례적으로 엉문대문자로 해야 하고 선언과 동시에 초기화를 해야 한다.
 * 
 */
 class Final07{
	 final int ABC= 100;
	public void setAbc(int a) {
		ABC = a; // 상수명 ABC는 수정못한
	}
}

public class abstract_Test7 {

	public static void main(String[] args) {

	}

}
