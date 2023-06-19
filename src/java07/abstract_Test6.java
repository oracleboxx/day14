package java07;
import com.naver.model02.Circ1;
import com.naver.model02.Rect;
import com.naver.model02.Tri;
import com.naver.model01.ShapleClass;

public class abstract_Test6 {
	static void income(ShapleClass ref) { // 매개 변수 다형성= 상속 + 업캐스팅 .
				ref.draw();
										  // 결국 모든 자손타입을 다 받을 수 있다
										  // 그만큼 코드라인을 줄이고 불필요한 메서드 오버로딩을 안하게 해준다
	}
	public static void main(String[] args) {
		ShapleClass[] arr =new ShapleClass[3];
			
			Circ1 c =  new Circ1();
			Rect r = new Rect();
			Tri t = new Tri();
			income(c); income(r);income(t);
		
	}

}
