/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ CarTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author  : A
 * @version : 1.0
 */
public class CarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car = new Car2("현대자동차", "제네시스", "검은색", 225, 50000000);
		System.out.println(car.getCompany());
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		System.out.println(car.getMaxSpeed()+"km");
		System.out.printf("%,d원",car.getPrice());
		
		Car2 car2 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		
		System.out.println(car2.getCompany());
		System.out.println(car2.getModel());
		System.out.println(car2.getColor());
		System.out.println(car2.getMaxSpeed()+"km");
		System.out.printf("%,d원",car.getPrice());
		
		Car2 car3 = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		
		System.out.println(car3.getCompany());
		System.out.println(car3.getModel());
		System.out.println(car3.getColor());
		System.out.println(car3.getMaxSpeed()+"km");
		System.out.printf("%,d원",car.getPrice());
		
		
		
	}

}
