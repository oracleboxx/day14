package java07;

import com.naver.model02.Circ1;
import com.naver.model02.Rect;
import com.naver.model02.Tri;
import com.naver.model01.ShapleClass;

public class abstract_Test5 {

	public static void main(String[] args) {
		Circ1 c =  new Circ1();
		Rect r = new Rect();
		Tri t = new Tri();
		c.draw();
		r.draw();
		t.draw();
		ShapleClass ref;
		ref = new Circ1();
		ref.draw();
		ref = new Rect();
		ref.draw();
		ref = new Tri();
		ref.draw(); 
		
		
	
	}

}
