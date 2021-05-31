package book;

import java.util.Scanner;

public class Book {
	String bookName;
	String createAt;
	String nickName;
	
	public Book(){
		
	}
	public Book(String bookName, String createAt, String nickName) {
		this.bookName = bookName;
		this.createAt = createAt;
		this.nickName = nickName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void input(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter book's name: ");
		bookName = scan.nextLine();
		System.out.println("Enter book's name: ");
		createAt = scan.nextLine();
		System.out.println("Enter book's name: ");
		nickName = scan.nextLine();
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", createAt=" + createAt + ", nickName=" + nickName + "]";
	}
	public void Display(){
		System.out.println(toString());
	}
	
}
