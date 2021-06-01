package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		ArrayList<Author> authorList = new ArrayList<>();
		int choose,n;
		Scanner scan = new Scanner(System.in);
		
		do{
			menu();
			System.out.println("Choose: ");
			choose = Integer.parseInt(scan.nextLine());
			switch(choose){
			case 1:
				System.out.println("Enter author number: ");
				n = Integer.parseInt(scan.nextLine());
				for(int i = 0; i < n; i++){
					Author author = new Author();
					author.input(authorList);
					
					authorList.add(author);
				}
				break;
			case 2:
				for(int i = 0; i < authorList.size(); i++){
					authorList.get(i).display();
				}
				break;
			case 3:
				System.out.println("Enter number book: ");
				n = Integer.parseInt(scan.nextLine());
				for(int i = 0; i < n; i++){
					Book book = new Book();
					book.input();
					boolean isCheck = false;
					for(int j = 0; j < authorList.size(); j++){
						if(authorList.get(j).getNickName().equalsIgnoreCase(book.getNickName())){
							isCheck = true;
							break;
						}
					}
					if(!isCheck){
						int y;
						System.out.println("Do you want create author? 1/2");
						y = Integer.parseInt(scan.nextLine());
						if(y == 1){
							Author author = new Author(book.getNickName());
							author.input();
							authorList.add(author);
						}else if(y == 2){
							System.out.println("ok bye!");
						}else{
							System.out.println("invalid!!!");
						}
					}
					
					bookList.add(book);
				}
				break;
			case 4:
				for(Book book : bookList){
					book.Display();
				}
				break;
			case 5:
				System.out.println("Enter nickname you need ");
				String nick = scan.nextLine();
				for(int i = 0; i < authorList.size(); i++){
					if(authorList.get(i).getNickName().equalsIgnoreCase(nick)){
						authorList.get(i).display();
						break;
					}
				}
				break;
			case 6:
				System.out.println("Bye! ");
				break;
			default:
				System.out.println("Invalid!!! ");
				break;
			
			}
		}while(choose != 6);
	}
	
	public static void menu(){
		System.out.println("1.Enter author infomation ");
		System.out.println("2.Display author");
		System.out.println("3.Enter book infomation ");
		System.out.println("4.Display book");
		System.out.println("5.Search book by nick name  ");
		System.out.println("6.Exit ");
	}
}
