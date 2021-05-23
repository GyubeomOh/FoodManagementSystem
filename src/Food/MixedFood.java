package Food;

import java.util.Scanner;

import Exception.PhoneFormatException;

public abstract class MixedFood extends Food {


	public abstract void getFoodInput(Scanner input);

	public MixedFood(FoodKind kind) {
		super(kind);
	}
	
	public void setFoodPhoneYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Phone number exist? (Y or N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer =='Y') {
					setFoodPhone(input);
					break;
				}
				else if (answer == 'n' || answer =='N') {
					this.setPhone("");
					break;
				}
				else {
					System.out.print("Phone number exist? (Y or N)");
				}
			}
			catch(PhoneFormatException e) {
				System.out.println("Incorrect Phone Format. Put the phone number that contains '-' !");
			}
		}
	}
}
