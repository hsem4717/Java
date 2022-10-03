package API;

import java.util.Scanner;

public class ScannerAPI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// 스캐너 객체 생성
		System.out.print("이름: ");
		String name = input.next();//문자열 입력 받기
		System.out.print("학번: ");
		int number = input.nextInt();//정수 입력 받기
		System.out.print("학점: ");
		double grade = input.nextDouble();//실수 입력 받기
		System.out.printf("이름: %s 학변: %d 학점: %.2f", name, number, grade);
		
		

	}

}
