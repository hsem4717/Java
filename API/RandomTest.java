package API;

import java.util.Random;

public class RandomTest{

	public static void main(String[] args) {
		Random random = new Random();
		int n = 10;
		
		System.out.printf("랜덤 정수: %d\n", random.nextInt());
		System.out.printf("0이상 N()%d미만의 랜덤정수: %d\n",n,  random.nextInt(n));
		System.out.printf("랜덤 실수: %f\n", random.nextDouble());
		System.out.printf("랜덤 참/거짓: %b\n", random.nextBoolean());

	}

}
