package book;

import java.util.Scanner;

public class Author {
	private String name;
	private int old;
	private String nickName;
	private String birthday;
	private String address;
	
	public Author(){
		
	}
	public Author(String name, int old, String nickName, String birthday, String address) {
		this.name = name;
		this.old = old;
		this.nickName = nickName;
		this.birthday = birthday;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void input(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter author name: ");
		name = scan.nextLine();
		System.out.println("Enter author old: ");
		old = Integer.parseInt(scan.nextLine());
		System.out.println("Enter author nick name: ");
		nickName = scan.nextLine();
		System.out.println("Enter author birthday: ");
		birthday = scan.nextLine();
		System.out.println("Enter author address: ");
		address = scan.nextLine();
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", old=" + old + ", nickName=" + nickName + ", birthday=" + birthday
				+ ", address=" + address + "]";
	}
	public void display(){
		System.out.println(toString());
	}
	
	
}
