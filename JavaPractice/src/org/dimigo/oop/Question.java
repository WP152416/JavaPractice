package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *     |_ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author  : A
 * @version : 1.0
 */
public class Question {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] questions = {"가장 좋아하는 가수는? ", "가장 좋아하는 배우는? ", "가장 좋아하는 과목은? "};
		String[] answers = {"빅뱅","원빈","응용프로그래밍"};
		for(int i=0;i<3;i++){
			System.out.println(questions[i]);
			String s = scanner.nextLine();
			System.out.println(answers[i].equals(s) ? "정답입니다" : "틀렸습니다");
		}
		
		System.out.println("<<결과출력>>");
		for(int i=0;i<3;i++){
			StringBuilder st = new StringBuilder(questions[i]);
			System.out.println(st.append(answers[i] + "입니다."));
		}
		
		
		
		
	}

	
}
