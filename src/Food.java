public class Food {
	// ����, �Ĵ��̸�, ��ȭ��ȣ, ����
	String name[] = new String[3]; // name �� �迭 ����
	String restaurant[] = new String[3]; // restaurant �� �迭 ����
	Integer phone[] = new Integer[3]; // phone �� �迭 ����
	Integer price[] = new Integer[3]; // price �� �迭 ����
	
	public Food() {
	}

	public Food(String name[], String restaurant[], int phone[], int price[]) {
		for (int i = 0; i<name.length; i++) {
			this.name[i] = name[i];
			this.restaurant[i] = restaurant[i];
			this.phone[i] = phone[i];
			this.price[i] = price[i];
		}
	}
	
	public void printInfo() {
		for (int i = 0; i<name.length; i++) {
			System.out.println((i+1) +"�� name:" + name[i] + " restaurant:" + restaurant[i] + " phone:" + phone[i] + " price:" + price[i] + "\n");
		}
	}
}
