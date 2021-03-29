import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);

		while (num !=6) { // 6번이 아니면 실행하도록 유도
			System.out.println("1. Add food");
			System.out.println("2. Delete food");
			System.out.println("3. Edit food");
			System.out.println("4. View food");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 6:");
			num = input.nextInt();
			
			if (num == 1) {
				addFood(); // 1을 입력하면 public static void addFood() 에서 내용을 가져옴
			}
			if (num == 2) {
				deleteFood(); // 2을 입력하면 public static void deleteFood() 에서 내용을 가져옴
			}
			if (num == 3) {
				editFood(); // 3을 입력하면 public static void editFood() 에서 내용을 가져옴
			}
			if (num == 4) {
				viewFood(); // 4을 입력하면 public static void viewFood() 에서 내용을 가져옴
			}
			else { // 6번은 while에서 이미 배제했기에 else에는 5번인 경우만 포함되는데 5번인 경우엔 continue를 실행하게함
				continue;
			}
		}
	} 
	
	public static void addFood() { // addFood 함수 정의
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentID = input.nextInt(); // studentID 를 입력받음
		System.out.print("Student name:");
		String studentName = input.next(); // studentName 을 입력받음
		System.out.print("Email address:"); 
		String studentEmail = input.next(); // studentEmail 을 입력받음
		System.out.println(studentEmail);
		System.out.print("Phone number:"); 
		String studentPhone = input.next(); // studentPhone 을 입력받음
		
	}
	
	public static void deleteFood() { // deleteFood 함수 정의
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentID = input.nextInt();
	}
	
	public static void editFood() { // editFood 함수 정의
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentID = input.nextInt();
	}
	
	public static void viewFood() { // viewFood 함수 정의
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentID = input.nextInt();
	}
}
