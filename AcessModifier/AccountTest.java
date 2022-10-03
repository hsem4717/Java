package AcessModifier;


public class AccountTest{
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setBalance(1000);// 값 변경
		System.out.println(acc.getBalance());//값 출력
	}
}
class Account{

	private int balance;
	
	public int getBalance() { //게터 메소드
		return balance;
	}
	
	public void setBalance(int value) { // 세터 메소드
		balance = value;
	}
}