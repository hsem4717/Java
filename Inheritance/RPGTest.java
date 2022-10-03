package Inheritance;

public class RPGTest {

	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		wizard.name = "간달프";
		wizard.hp = 100;
		wizard.mp=80;
		wizard.punch();
		wizard.fireball();
		Knight knight = new Knight();
		knight.spped = 3;
		knight.move();

	}

}

class Novice{
	String name;
	int hp;
	int spped;
	void punch() {
		System.out.printf("%s(HP: %d)의 공격\n", name, hp);
	}
	void move() {
		System.out.printf("%d 만큼 이동합니다\n", spped);
	}
}
class Wizard extends Novice{ //Wizard 클래스가  Novice클래스로 부터 확장
							//Novice의 모든 필드와 메소드를 가짐
	int mp;
	void fireball() {
		System.out.printf("%s(HP: %d, MP:%d)의 공격\n", name, hp, mp);
	}
}
class Knight extends Novice{
	int stamina;
	void slash() {
		System.out.printf("%s(HP: %d, ST:%d)의 공격\n", name, hp, stamina);
	}
	
}
