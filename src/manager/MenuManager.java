package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FoodManager foodManager = getObject("foodmanager.ser");
		if(foodManager == null) {
			foodManager = new FoodManager(input);	
		}
	
		WindowFrame frame = new WindowFrame(foodManager);
		selectMenu(input, foodManager);
		putObject(foodManager, "foodmanager.ser");
	}
	
	public static void selectMenu(Scanner input, FoodManager foodManager) {
		int num = -1;
		while (num !=5) { // 5번이 아니면 실행하도록 유도
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					foodManager.addFood(); // 1을 입력하면 public void addFood() 에서 내용을 가져옴
					logger.log("add a food");
					break;
				case 2:
					foodManager.deleteFood(); // 2을 입력하면 public void deleteFood() 에서 내용을 가져옴
					logger.log("delete a food");
					break;
				case 3:
					foodManager.editFood(); // 3을 입력하면 public void editFood() 에서 내용을 가져옴
					logger.log("eidt a food");
					break;
				case 4:
					foodManager.viewFood(); // 4을 입력하면 public void viewFood() 에서 내용을 가져옴
					logger.log("view a food");
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
	
	public static FoodManager getObject(String filename) {
		FoodManager foodManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			foodManager = (FoodManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return foodManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return foodManager;
	}
	
	public static void putObject(FoodManager foodManager, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(foodManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
