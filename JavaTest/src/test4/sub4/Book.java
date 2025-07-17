package test4.sub4;

public class Book {
	public String title;
	public String author;
	public String isbn;
	public boolean isBorrowd;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false;
	}
	
	public void borrowBook() {
		if(this.isBorrowd) { //현재 isBorrowd 상태가 true이면
			System.out.println(this.title+"이미 대출됨"); //이미 대출됨 출력
		}else { //현재 isBorrowd 상태가 false이면
			this.isBorrowd = true; //isBorrowd의 상태를 ture로 변경
			System.out.println("도서대출 : "+ this.title); // 대출 출력
		}
	}
	
	public void returnBook() {
			this.isBorrowd = false; //isBorrowd의 상태를 false로 변경
			System.out.println("도서반납 : "+ this.title); //반납 출력
	}
	
	public void getBookInfo() {
		System.out.println("도서명 : "+this.title);
		System.out.println("저자 : "+this.author);
		System.out.println("ISBN : "+this.isbn);
		System.out.println("대출여부 : "+(this.isBorrowd?"불가능":"가능"));
	}
	
	public String getTitle() {
		return title;
	}
}
