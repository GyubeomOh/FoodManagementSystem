import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);

		while (num !=6) { // 6���� �ƴϸ� �����ϵ��� ����
			System.out.println("1. Add food");
			System.out.println("2. Delete food");
			System.out.println("3. Edit food");
			System.out.println("4. View food");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 6:");
			num = input.nextInt();
			
			if (num == 1) {
				addFood(); // 1�� �Է��ϸ� public static void addFood() ���� ������ ������
			}
			if (num == 2) {
				deleteFood(); // 2�� �Է��ϸ� public static void deleteFood() ���� ������ ������
			}
			if (num == 3) {
				editFood(); // 3�� �Է��ϸ� public static void editFood() ���� ������ ������
			}
			if (num == 4) {
				viewFood(); // 4�� �Է��ϸ� public static void viewFood() ���� ������ ������
			}
			else { // 6���� while���� �̹� �����߱⿡ else���� 5���� ��츸 ���ԵǴµ� 5���� ��쿣 continue�� �����ϰ���
				continue;
			}
		}
	} 
	
	public static void addFood() { // addFood �Լ� ����
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentID = input.nextInt(); // studentID �� �Է¹���
		System.out.print("Student name:");
		String studentName = input.next(); // studentName �� �Է¹���
		System.out.print("Email address:"); 
		String studentEmail = input.next(); // studentEmail �� �Է¹���
		System.out.println(studentEmail);
		System.out.print("Phone number:"); 
		String studentPhone = input.next(); // studentPhone �� �Է¹���
		
	}
	
	public static void deleteFood() { // deleteFood �Լ� ����
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentID = input.nextInt();
	}
	
	public static void editFood() { // editFood �Լ� ����
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentID = input.nextInt();
	}
	
	public static void viewFood() { // viewFood �Լ� ����
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int studentID = input.nextInt();
	}
}
