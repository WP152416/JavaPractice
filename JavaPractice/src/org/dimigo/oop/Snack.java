package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ Snack
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author  : A
 * @version : 1.0
 */
public class Snack {
	
	private String name;
	private String company;
	private int price;
	private int number;
	
	
	public Snack(){
		
	}
	
	public Snack(String name, String company, int price, int number){
		this.setName(name);
		this.company = company;
		this.price = price;
		this.number = number;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	public String toString() {
		return "이름 : " + name + "\n" + "제조사 : " + company  + "\n"+ "가격 : " + String. format("%,d", price) + "원" + "\n"+ "개수 : " + number  + "개"+ "\n";
	}

	public int clacPrice() {
		return price * number;
	}
	
}
