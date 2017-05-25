/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *     |_ SybaseDB
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author  : A
 * @version : 1.0
 */
public class SybaseDB implements IDBManager{

	public void insert(){
		System.out.println("SybaseDB 저장");
	}
	public void search(){
		System.out.println("SybaseDB 조회");
	}
	public void update(){
		System.out.println("SybaseDB 변경");
	}
	public void delete(){
		System.out.println("SybaseDB 삭제");
	}
}
