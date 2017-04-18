/**
 * 
 */
package org.dimigo.oop;

import sun.applet.Main;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ FamilyMember
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author  : A
 * @version : 1.0
 */
public class FamilyMember {
	
	private static int memberCnt;
	
	private String memberName;
	
	public FamilyMember(String memberName){		//생성자
		this.memberName = memberName;
		memberCnt++;		//명 수
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원수 : " + memberCnt + "명");
	}
	
	
}
