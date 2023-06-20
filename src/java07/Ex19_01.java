package java07;

import com.naver.model01.IShapleClass;

import com.naver.model02.*;


public class Ex19_01 {

	public static void main(String[] args) {
		IShapleClass ref; 
		ref = new Circ2(); 
		ref.draw1(); 
		ref = new Rect2(); 
		ref.draw1(); 
		ref = new Tri2(); 
		ref.draw1();
		
	}

}
