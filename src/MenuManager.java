import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FoodManager foodManager = new FoodManager(input);
		int num = 0;
		while (num !=5) { // 5���� �ƴϸ� �����ϵ��� ����
			System.out.println("1. Add food");
			System.out.println("2. Delete food");
			System.out.println("3. Edit food");
			System.out.println("4. View food");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5:");
			num = input.nextInt();
			
			if (num == 1) {
				foodManager.addFood(); // 1�� �Է��ϸ� public void addFood() ���� ������ ������
			}
			if (num == 2) {
				foodManager.deleteFood(); // 2�� �Է��ϸ� public void deleteFood() ���� ������ ������
			}
			if (num == 3) {
				foodManager.editFood(); // 3�� �Է��ϸ� public void editFood() ���� ������ ������
			}
			if (num == 4) {
				foodManager.viewFood(); // 4�� �Է��ϸ� public void viewFood() ���� ������ ������
			}
			else { 
				continue;
			}
		}
	} 	
}
