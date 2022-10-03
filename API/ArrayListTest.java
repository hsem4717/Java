package API;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Kim");
		names.add("Lee");
		names.add("Park");
		names.add("Choi");
		
		names.set(0,  "Han");//0번 인덱스 변경
		String remove = names.remove(1);//1번 인덱스 제거후 반환

		for(int i = 0; i<names.size(); i++){//size() 담긴 데이터의 갯수 반환
			System.out.printf("%s ", names.get(i));// get(i) i인덱스 값을 반환
		}
	}

}
