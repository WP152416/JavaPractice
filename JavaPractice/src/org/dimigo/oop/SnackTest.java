package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ SnackTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author  : A
 * @version : 1.0
 */
public class SnackTest {

	public static void main(String[] args) {
		Snack[] s = new Snack[3];
		int sum = 0;
		
		s[0]= new Snack("새우깡", "농심", 1100, 2);
		s[1]= new Snack("콘칲", "크라운", 1200, 1);
		s[2]= new Snack("허니버터칩", "해태", 1500, 4);
		for(int i = 0; i< 3 ; i++){
			System.out.println(s[i]);
			sum += s[i].clacPrice();
		}
		
		System.out.println("총 구매 금액 : " + String. format("%,d", sum));
		
	}

}
