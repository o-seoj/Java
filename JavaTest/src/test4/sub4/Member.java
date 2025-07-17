package test4.sub4;

public class Member {
	private String name;
	private String memberId;
	private Book borrowedBook;
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}
	
	public void borrowBook(Book book) {
		borrowedBook = book; //인자 값으로 받은 Book book을 Book borrowedBook로. 현재 Member클래스에서 borrowedBook가 된다.
		book.borrowBook(); //Book클래스의 borrowBook 호출해서 매개변수 book을 넘겨줌
	}
	
	public void returnBook(Book book) {
		borrowedBook = null; //현재 Member 클래스의 borrowedBook 상태를 null로 변경
		book.returnBook();  //Book클래스의 returnBook 호출해서 매개변수 book을 넘겨줌
	}
	
	public void getMemberInfo() {
		System.out.println("회원명 : "+this.name);
		System.out.println("아이디 : "+this.memberId);
		if(borrowedBook != null) { //borrowedBook이 있으면
			System.out.println("대출한 도서 : " + borrowedBook.getTitle()); //대출 도서명 출력	
		}else {
			System.out.println("대출한 도서 : 없음"); //borrowedBook이 없음
		}
	}
}
