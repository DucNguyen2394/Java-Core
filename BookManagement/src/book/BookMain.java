package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		ArrayList<Author> authorList = new ArrayList<>();
		int choose;
		Scanner scan = new Scanner(System.in);
		
		do{
			menu();
			System.out.println("Choose: ");
			choose = Integer.parseInt(scan.nextLine());
			switch(choose){
			case 1:
				
				break;
			case 2:
							
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				System.out.println("Bye! ");
				break;
			default:
				System.out.println("Invalid!!! ");
				break;
			
			}
		}while(choose != 5);
	}
	
	public static void menu(){
		System.out.println("1.Enter book infomation ");
		System.out.println("2.Display ");
		System.out.println("3.Enter author infomation ");
		System.out.println("4.Search book by nick name  ");
		System.out.println("5.Exit ");
	}
}
