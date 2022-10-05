package Constructor;

class Hero{
String name;
int power;
int speed;
Hero(String n, int p, int s){
	name = n;
	power = p;
	speed = s;
}
String toStr() {
	return String.format("Hero name : %s, power: %d, speed: %d", name, power, speed);
}
}

public class HeroTest {
public static void main(String[] args) {
	Hero Hulk = new Hero("Hulk", 200, 80);
	System.out.println(Hulk.toStr());
	
}
}
