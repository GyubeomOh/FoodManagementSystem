package Food;

import java.util.Scanner;

public class Food { // protected 를 사용함으로써 자신의 서브 클래스가 아니면 다른 클래스에서는 접근하지 못하도록 합니다.
	protected FoodKind kind = FoodKind.Korean;	
	protected String name;
	protected String restaurant;
	protected String phone;
	protected int price;
	
	public Food() {
	}

	public Food(String name, String restaurant, String phone, int price) {
		this.name = name;
		this.restaurant = restaurant;
		this.phone = phone;
		this.price = price;
	}
	// getters 와 setters 를 사용하여 
	public FoodKind getKind() {
		return kind;
	}

	public void setKind(FoodKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("name:" + name + " restaurant:" + restaurant + " phone:" + phone + " price:" + price);
	}
	
	public void getFoodInput(Scanner input) {
		System.out.print("Food name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("restaurant name : ");
		String restaurant = input.next();
		this.setRestaurant(restaurant);
		
		System.out.print("Phone number : ");
		String phone = input.next();
		this.setPhone(phone);
		
		System.out.print("Food price : "); 
		int price = input.nextInt();
		this.setPrice(price);
	}
}
