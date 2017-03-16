/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *     |_ Loop
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 *
 * @author : A
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		int gong = 100;
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("--------------------");
			System.out.println("<<게임 메뉴>>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("--------------------");
			System.out.println("메뉴 입력 => ");
			
			num = scanner.nextInt();
		
		switch(num){
		case 1 :
			gong+=10;
			System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n",gong);
			break;
		case 2 :
			gong-=10;
			System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n",gong);
			break;
		case 3 :
			switch(new Random().nextInt(4)+1){
			case 1 :
				System.out.println("마법사(으)로 설정되었습니다.");
				break;
			case 2 :
				System.out.println("영주(으)로 설정되었습니다.");
				break;
			case 3 :
				System.out.println("기사(으)로 설정되었습니다.");
				break;
			case 4 :
				System.out.println("농민(으)로 설정되었습니다.");
				break;
			}
			break;
		case 9 :
			System.out.println("이제 공부하세요!");
			break;
		default : 
			System.out.println("없는 메뉴입니다!!");
		}
	}while(num!=9);
	}
}
	
