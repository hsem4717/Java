package Constructor;

public class AvengerTest {
public static void main(String[] args) {
	Avenger thor = new Avenger("토르", 100);
	Avenger thanos = new Avenger("타노스", 160);
	thor.punch(thanos);
	thanos.punch(thor);
	thor.punch(thanos);
	
	
}
}
class Avenger{
String name;
int hp;
Avenger(String s, int i){
	name = s;
	hp = i;
}
void punch(Avenger enemy) {
	System.out.printf("[%s]의 공격\n 나의 체력:[%d]", name, hp);
	enemy.hp -= 10;
	System.out.printf(" -> %s의 체력: %d\n", enemy.name, enemy.hp);
	
}
}
