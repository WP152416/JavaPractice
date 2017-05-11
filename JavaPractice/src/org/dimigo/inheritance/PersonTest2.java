/**
 * 
 */
package org.dimigo.inheritance;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

/**
 * <pre>
 * org.dimigo.inheritance
 *     |_ PersonTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author  : A
 * @version : 1.0
 */
public class PersonTest2 {
	
	private static void greeting(Person person){
		System.out.println(person);
		person.sayHello();
		person.sayBye();
	}

	public static void main(String[] args) {
		Person[] p = {
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍"),
		};
		
		for(Person person : p){
			greeting(person);
		}
		
	}

}
