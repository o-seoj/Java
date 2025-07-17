package test4.sub4;
/*
 * 날짜 : 2025/07/17
 * 이름 : 오서정
 * 내용 : 자바 클래스 문제 
 */
public class Main {
	public static void main(String[] args) {
		//도서 생성
		Book book = new Book("자바 프로그래밍", "제임스 고슬링","101-1234-1001");
		
		//회원 생성
		Member member = new Member("홍길동", "A001");
		
		//도서 정보 출력
		book.getBookInfo();
		
		System.out.println("------------------");
		
		//도서 대출
		member.borrowBook(book);
		System.out.println("------------------");
		
		//도서 정보 출력
		book.getBookInfo();
		System.out.println("------------------");
		
		//회원 정보 출력
		member.getMemberInfo();
		System.out.println("------------------");
		
		//도서 대출
		member.borrowBook(book); //앞서 대출을 했었기 때문에 더이상 대출 못함.
		System.out.println("------------------");
		
		//도서 반납
		member.returnBook(book);
		System.out.println("------------------");
		
		//회원 정보 출력
		member.getMemberInfo();
		System.out.println("------------------");
	}
}
