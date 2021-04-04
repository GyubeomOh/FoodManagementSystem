import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FoodManager foodManager = new FoodManager(input);
		int num = 0;
		while (num !=5) { // 5번이 아니면 실행하도록 유도
			System.out.println("1. Add food");
			System.out.println("2. Delete food");
			System.out.println("3. Edit food");
			System.out.println("4. View food");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5:");
			num = input.nextInt();
			
			if (num == 1) {
				foodManager.addFood(); // 1을 입력하면 public void addFood() 에서 내용을 가져옴
			}
			if (num == 2) {
				foodManager.deleteFood(); // 2을 입력하면 public void deleteFood() 에서 내용을 가져옴
			}
			if (num == 3) {
				foodManager.editFood(); // 3을 입력하면 public void editFood() 에서 내용을 가져옴
			}
			if (num == 4) {
				foodManager.viewFood(); // 4을 입력하면 public void viewFood() 에서 내용을 가져옴
			}
			else { 
				continue;
			}
		}
	} 	
}
