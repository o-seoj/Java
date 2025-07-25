package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
	private List<Account> accounts = new ArrayList<>(); // 계좌 리스트
	private Scanner scanner = new Scanner(System.in); // 입력 스캐너 객체
	
	public static void main(String[] args) { //프로그램 메인 메서드
		BankApp app = new BankApp(); // BankApp 객체 app 생성
		app.start(); // start 메서드 호출
		
		System.out.println("프로그램 종료");
	}
	public void start() {
		boolean running = true; // running = true인 동안 strat()메서드 실행
		
		while(running) {
			printMenu();
			System.out.print("선택> ");
			int choice = Integer.parseInt(scanner.next()); // 선택할 번호 입력 받음
			
			switch(choice) {
				case 1 -> createAccount(); // 1을 입력받으면 createAccount()메서드 호출
				case 2 -> listAccount(); // 2를 입력받으면 listAccount()메서드 호출
				case 3 -> depositAccount(); // 3을 입력받으면 depositAccount()메서드 호출
				case 4 -> withdrawAccount(); // 4를 입력받으면 withdrawAccount()메서드 호출
				case 5 -> {
					running = false; // 5를 입력받으면 running = false가 되어 start()메서드 종료
				}
			default -> System.out.println("올바른 번호를 선택하세요."); // 잘못된 번호 입력 시
			}
		}
	}
	
	public void printMenu() { // 메뉴(start()메서드의 choice 선택 가능) 보여줌
		System.out.println("--------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------------");
	}
	
	// 메서드 구현해서 프로그램 완성하기
	public void createAccount() { // 계좌생성
		System.out.println("-------------------- 계좌생성 -----------------------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next(); // 계좌번호 입력 받음
		System.out.print("계좌주 : ");
		String owner = scanner.next(); // 계좌주 입력 받음
		System.out.print("초기입금액 : ");
		int firstmoney = scanner.nextInt(); // 초기입금액 입력 받음
		// 앞에서 입력받은 인자들로 Account 객체를 생성해서 accounts 리스트에 저장
		accounts.add(new Account(ano, owner, firstmoney));
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
	
	public void listAccount() { // 계좌목록
		System.out.println("-------------------- 계좌목록 -----------------------");
		for(Account account : accounts) { // accounts의 리스트에 있는 account 객체들의 ano, owner, balance 호출
			System.out.println(account.getAno()+" "+account.getOwner()+" "+account.getBalance());
		}
	}
	
	public void depositAccount() { //입금
		System.out.println("--------------------- 예금 ------------------------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next(); // 계좌번호 입력 받음
		System.out.print("예금액 : ");
		int add = scanner.nextInt(); // 예금액 입력 받음
		Account account = findAccount(ano); // findAccount() 메서드 호출해서 계좌 검색 해옴
		if(account!=null) { // 계좌가 존재하면
			account.setBalance(account.getBalance()+add); // 계좌 잔고에 예금액을 더한다.
			System.out.println("결과 : 예금이 성공되었습니다.");
		}else { // 계좌가 존재하지 않으면
			System.out.println("결과 : 계좌가 없습니다.");
		}		
	}

	public void withdrawAccount() { // 출금
		System.out.println("--------------------- 예금 ------------------------");
		System.out.print("계좌번호 : "); // 계좌번호 입력 받음
		String ano = scanner.next();
		System.out.print("출금액 : ");
		int minus = scanner.nextInt(); // 출금액 입력 받음
		Account account = findAccount(ano); // findAccount() 메서드 호출해서 계좌 검색 해옴
		if(account!=null) {  // 계좌가 존재하면
			account.setBalance(account.getBalance()-minus); // 계좌 잔고에 출금액을 뺀다.
			System.out.println("결과 : 출금이 성공되었습니다.");
		}else { // 계좌가 존재하지 않으면
			System.out.println("결과 : 계좌가 존재하지 않습니다.");
		}
	}
	
	public Account findAccount(String ano) { //계좌 검색
		for(Account account : accounts) { // accounts 리스트의 account 객체들
			if(ano.equals(account.getAno())) // account 객체에서 getAno()를 호출해와서 
											//findAccount() 메서드에 매개변수로 입력받은 ano와 같은 이름이면
				return account; // account 객체를 return
		}
		return null; //findAccount() 메서드에 매개변수로 입력받은 ano와 같은 이름이 없으면 null을 return
	}
}
