import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FoodManager foodManager = new FoodManager(input);
		selectMenu(input, foodManager);
	}
	
	public static void selectMenu(Scanner input, FoodManager foodManager) {
		int num = -1;
		while (num !=5) { // 5���� �ƴϸ� �����ϵ��� ����
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					foodManager.addFood(); // 1�� �Է��ϸ� public void addFood() ���� ������ ������
					break;
				case 2:
					foodManager.deleteFood(); // 2�� �Է��ϸ� public void deleteFood() ���� ������ ������
					break;
				case 3:
					foodManager.editFood(); // 3�� �Է��ϸ� public void editFood() ���� ������ ������
					break;
				case 4:
					foodManager.viewFood(); // 4�� �Է��ϸ� public void viewFood() ���� ������ ������
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 - 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("1. Add food!");
		System.out.println("2. Delete food!");
		System.out.println("3. Edit food!");
		System.out.println("4. View food!");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}
}
