/**
 * 
 */
package org.dimigo.abstractclass;

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
		
		for(SmartPhone phone : s){
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction();
			phone.turnOff();
		}
		
	}

}
