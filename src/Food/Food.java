package Food;

import java.util.Scanner;

public class Food { // protected �� ��������ν� �ڽ��� ���� Ŭ������ �ƴϸ� �ٸ� Ŭ���������� �������� ���ϵ��� �մϴ�.
	protected FoodKind kind = FoodKind.Korean;
	protected String name;
	protected String restaurant;
	protected String phone;
	protected int price;
	
	public Food() {
	}
	
	public Food(FoodKind kind) {
		this.kind = kind;
	}
	
	public Food(String name, String restaurant) {
		this.name = name;
		this.restaurant = restaurant;
	}

	public Food(String name, String restaurant, String phone, int price) {
		this.name = name;
		this.restaurant = restaurant;
		this.phone = phone;
		this.price = price;
	}
	
	public Food(FoodKind kind, String name, String restaurant, String phone, int price) {
		this.kind = kind;
		this.name = name;
		this.restaurant = restaurant;
		this.phone = phone;
		this.price = price;
	}
	
	// getters �� setters �� ����Ͽ� private ������ ���� �ٸ� Ŭ�������� �� �� �ְ� �ϰų� ���� �Է¹޾� ��ų� �����ϴµ� �����
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
		String skind = "none";
		switch(this.kind) {
		case Korean:
			skind = "KOR";
			break;
		case Chinese:
			skind = "CNA";
			break;
		case Japanese:
			skind = "JAV";
			break;
		case Fast:
			skind = "FAST"; 
			break;
		default:				
		}
		System.out.println("Kind:" + skind + " name:" + name + " restaurant:" + restaurant + " phone:" + phone + " price:" + price);
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
