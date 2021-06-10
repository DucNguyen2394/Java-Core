package studentManagement;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	static List<Student> studentList = new ArrayList<Student>();
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int choose;
		do{
			menu();
			System.out.println("Choose: ");
			choose = Integer.parseInt(scan.nextLine());
			switch(choose){
			case 1:
				inputStudent();
				break;
			case 2:
				editStudent();
				break;
			case 3:
				deleteStudent();
				break;
			case 4:
				sortStudentByGPA();
				break;
			case 5:
				sortStudentByName();
				break;
			case 6:
				for(int i = 0; i < studentList.size(); i++){
					studentList.get(i).display();
				}
				break;
			case 7:
				saveFile();
				break;
			case 8:
				readFile();
				break;
			case 9:
				System.err.println("Bye");
				break;
			default:
				System.err.println("Invalid");
			}
		}while(choose != 9);
		
	}
	public static void inputStudent(){
		int n;
		System.out.println("Enter number student input: ");
		n = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < n; i++){
			Student std = new Student();
			std.input(studentList);
			studentList.add(std);
		}
	}
	
	public static void editStudent(){
		System.out.println("Enter id student edit: ");
		String id = scan.nextLine();
		for(int i = 0; i < studentList.size(); i++){
			if(studentList.get(i).getId().equalsIgnoreCase(id)){
				studentList.get(i).edit();
				break;
			}else{
				System.out.println("Not found!");
			}
		}
	}
	
	public static void deleteStudent(){
		System.out.println("Enter id student delete: ");
		String id = scan.nextLine();
		for(int i = 0; i < studentList.size(); i++){
			if(studentList.get(i).getId().equalsIgnoreCase(id)){
				studentList.remove(i);
				System.out.println("Delete successfully!!!");
				break;
			}else{
				System.out.println("Not found!");
			}
		}
	}
	
	public static void sortStudentByGPA(){
		Collections.sort(studentList, new Comparator<Student>(){
			public int compare(Student o1, Student o2) {
				return o1.getId().compareToIgnoreCase(o2.getId());
			}
		});
		for(int i = 0; i < studentList.size(); i++){
			studentList.get(i).display();
		}
	}
	
	public static void sortStudentByName(){
		Collections.sort(studentList, new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});
		for(int i = 0; i < studentList.size(); i++){
			studentList.get(i).display();
		}
	}
	
	public static void saveFile(){
		System.out.println("Start save file");
		FileOutputStream fos = null; 
		
		try {
			fos = new FileOutputStream("student.txt");
			for(Student std : studentList){
				std.getFile().getBytes();
				fos.write(std.getFile().getBytes("UTF-8"));
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e){		
		}finally{
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void readFile(){
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader bis = null;
		
		try {
			fis = new FileInputStream("student.txt");
			isr = new InputStreamReader(fis,StandardCharsets.UTF_8);
			bis = new BufferedReader(isr);
			String line = null;
			
			while((line = bis.readLine()) != null){
				
				if(line.isEmpty()){
					continue;
				}
				
				Student std = new Student();
				std.parse(line);
				
				studentList.add(std);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e){	
		}
		
	}
	
	public static void menu(){
		System.out.println("1. Add student");
		System.out.println("2. Edit student by id");
		System.out.println("3. Delete student by id");
		System.out.println("4. Sort student by GPA");
		System.out.println("5. Sort student by name");
		System.out.println("6. Show student");
		System.out.println("7. Save");
		System.out.println("8. Read");
		System.out.println("9. Exit");
	}
}

