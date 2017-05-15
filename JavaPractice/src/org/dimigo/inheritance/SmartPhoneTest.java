/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *     |_ SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author  : A
 * @version : 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone [] s = {
			new IPhone("iPhone 7","애플",900000),
			new Galaxy("갤럭시 8","삼성",800000)
		};
		
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
			s[i].turnOn();
			s[i].pay();
			s[i].useSpecialFunction(s[i]);
			s[i].turnOff();
		}
		
	}

}
