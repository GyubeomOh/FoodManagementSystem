package Food;

import java.util.Scanner;

import Exception.PhoneFormatException;

public class JapaneseFood extends MixedFood {
	
	protected String phone;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) throws PhoneFormatException {
		if(!phone.contains("-") && !phone.equals("")){
			throw new PhoneFormatException();
		}
		this.phone = phone;
	}
	
	public JapaneseFood(FoodKind kind) {
		super(kind);
	}
	
	public void getFoodInput(Scanner input) {
		setFoodName(input);
		setFoodRestaurant(input);
		setFoodPhoneYN(input);
		setFoodMobilePhoneYN(input);		
		setFoodPrice(input);
	}
	
	public void setFoodMobilePhoneYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Phone number exist? (Y or N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer =='Y') {
				String phone = "";
				while(!phone.contains("-")) {
					System.out.print("Mobile phone number : ");
					phone = input.next();
					try {
						super.setPhone(phone);
					} catch (PhoneFormatException e) {
						System.out.println("Incorrect Phone Format. Put the phone number that contains '-' !");
					}
				}
			}
			else if (answer == 'n' || answer =='N') {
				break;
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind:" + skind + " name:" + name + " restaurant:" + restaurant + " phone:" + this.phone + " price:" + price + "¿ø mobile phone:" + super.phone);
	}
}
