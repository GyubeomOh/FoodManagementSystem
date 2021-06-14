package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Food.FoodInput;
import Food.FoodKind;
import Food.KoreanFood;
import Food.ChineseFood;
import Food.JapaneseFood;
import Food.FastFood;
import Food.Food;

public class FoodManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4624797801763665630L;
	
	ArrayList<FoodInput> foods = new ArrayList<FoodInput>();	
	transient Scanner input;
	FoodManager(Scanner input){
		this.input= input;
	}
	
	public void addFood(String name, String restaurant, String phone, int price) {
		FoodInput foodInput = new KoreanFood(FoodKind.Korean);
	}
	
	public void addFood(FoodInput foodInput) {
		foods.add(foodInput);
	}
	
	public void addFood() { // addFood 함수 정의
		int kind = 0;
		FoodInput foodInput = null;
		while (kind < 1 || kind > 3) {
			try {
				showAddMenu();
				kind = input.nextInt();
				switch(kind) {
				case 1:
					getKoreanFood(foodInput);
					break;
				case 2:
					getChineseFood(foodInput);
					break;
				case 3:
					getJapaneseFood(foodInput);
					break;
				case 4:
					getFastFood(foodInput);
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 - 5!!!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	public void deleteFood() { // deleteFood 함수 정의
		System.out.print("Food name : ");
		String foodname = input.next();
		int index = findIndex(foodname);
		removefromFoods(index, foodname);
	}
	
	public void editFood() { // editFood 함수 정의
		System.out.print("Food name : ");
		String foodname = input.next();
		for(int i=0 ; i<foods.size(); i++) {
			FoodInput food = foods.get(i);
			if (food.getName().equals(foodname)) {
				int num = 0;
				while (num !=5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						food.setFoodName(input);
						break;
					case 2:
						food.setFoodRestaurant(input);
						break;
					case 3:
						food.setFoodPhone(input);
						break;
					case 4:
						food.setFoodPrice(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewFood() { // viewFood 함수 정의
		System.out.println("# of registered foods: " + foods.size());
		for(int i=0 ; i<foods.size(); i++) {
			foods.get(i).printInfo();
		}
	}
	
	public void getKoreanFood(FoodInput foodInput) {
		foodInput = new KoreanFood(FoodKind.Korean);
		foodInput.getFoodInput(input);
		foods.add(foodInput);
	}
	
	public void getChineseFood(FoodInput foodInput) {
		foodInput = new ChineseFood(FoodKind.Chinese);
		foodInput.getFoodInput(input);
		foods.add(foodInput);
		}
	
	public void getJapaneseFood(FoodInput foodInput) {
		foodInput = new JapaneseFood(FoodKind.Japanese);
		foodInput.getFoodInput(input);
		foods.add(foodInput);
	}
	
	public void getFastFood(FoodInput foodInput) {
		foodInput = new FastFood(FoodKind.Fast);
		foodInput.getFoodInput(input);
		foods.add(foodInput);
	}
	
	public int removefromFoods(int index, String foodname) {
		if (index >= 0) {
			foods.remove(index); // 반복문을 이용하여 찾은 배열의 인덱스 값에 있는 내용을 제거함
			System.out.println("the food" + foodname + "is deleted");
			return 1;
		}
		else {
			System.out.println("the food has not been registered");
			return -1;
		}
	}
	
	public int findIndex(String foodname) {
		int index = -1;
		for(int i=0 ; i<foods.size(); i++) { // 반복문을 이용하여 사용자가 입력한 값을 몇번째 인덱스에 있는 배열인지 찾아서 인덱스 값을 저장함
			if (foods.get(i).getName().equals(foodname)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void showAddMenu() {
		System.out.println("1 for Korean Food");
		System.out.println("2 for Chinese Food");
		System.out.println("3 for Japanese Food");
		System.out.println("4 for Fast Food");
		System.out.print("Select num for Food Kind between 1 and 4 : ");
	}
	
	public void showEditMenu() {
		System.out.println("1. edit name");
		System.out.println("2. edit restaurant");
		System.out.println("3. edit phone");
		System.out.println("4. edit price");
		System.out.println("5. EXIT");
		System.out.println("Choose 1 through 5");
	}
	
	public int size() {
		return foods.size();
	}
	
	public FoodInput get(int index) {
		return (Food) foods.get(index);
	}
	
}

