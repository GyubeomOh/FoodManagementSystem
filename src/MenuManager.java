import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);

		while (num !=6) {
			System.out.println("1. Add food");
			System.out.println("2. Delete food");
			System.out.println("3. Edit food");
			System.out.println("4. View food");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 6:");
			num = input.nextInt();
			
			if (num == 1) {
				addFood();
			}
			if (num == 2) {
				deleteFood();
			}
			if (num == 3) {
				editFood();
			}
			if (num == 4) {
				viewFood();
			}
			else {
				continue;
			}
		}
	} 
	
	public static void addFood() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentID = input.nextInt();
		System.out.print("Student name:");
		String studentName = input.next();
		System.out.print("Email address:");
		String studentEmail = input.next();
		System.out.println(studentEmail);
		System.out.print("Phone number:");
		String studentPhone = input.next();
		
	}
	
	public static void deleteFood() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentID = input.nextInt();
	}
	
	public static void editFood() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentID = input.nextInt();
	}
	
	public static void viewFood() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentID = input.nextInt();
	}
}
