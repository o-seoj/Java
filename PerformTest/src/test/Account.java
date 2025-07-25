package test;

public class Account {
	private String ano; // 계좌번호
	private String owner; // 입금주
	private int balance; // 잔고
	
	//생성자(ano, owner, balance 매개변수로 속성을 초기화)
	public Account(String ano, String owner, int balance) { 
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() { //속성 ano의 Getter
		return ano;
	}
	public String getOwner() { //속성 owner의 Getter
		return owner;
	}
	public int getBalance() { //속성 balance의 Getter
		return balance;
	}
	public void setBalance(int balance) { //속성 balance의 Setter
		this.balance = balance;
	}
	
	
}
