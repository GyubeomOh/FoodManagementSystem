import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0, choice = 0;
		Scanner input = new Scanner(System.in);
		/* struct go{
			studentId[10] = {}
			studentName[10] = {}
		}
		C���� struct go �� �̿��Ͽ� ����ü�� �����س��µ� �ڹٿ����� �迭�� �����س��� ����� �������? */
		while (num !=6) {
			System.out.println("1. Add food");
			System.out.println("2. Delete food");
			System.out.println("3. Edit food");
			System.out.println("4. View food");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 6:");
			num = input.nextInt();
			switch(num) {				
				case 1:
					System.out.println("1�� : �ѽ�");
					System.out.println("2�� : �߽�");
					System.out.println("3�� : �Ͻ�");
					System.out.println("4�� : �н�ƮǪ��");
					System.out.println("1������ 4�� �߿��� �ϳ��� �Է��ϼ���. : ");
					Scanner ac = new Scanner(System.in);
					choice = ac.nextInt();
					
					switch(choice) {
						case 1:
							System.out.print("student ID:");  
							int studentID1 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
						case 2:
							System.out.print("student ID:");  
							int studentID2 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
						case 3:
							System.out.print("student ID:");  
							int studentID3 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
						case 4:
							System.out.print("student ID:");  
							int studentID4 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
					}
					
				case 2:
					System.out.println("1�� : �ѽ�");
					System.out.println("2�� : �߽�");
					System.out.println("3�� : �Ͻ�");
					System.out.println("4�� : �н�ƮǪ��");
					System.out.println("1������ 4�� �߿��� �ϳ��� �Է��ϼ���. : ");
					Scanner bc = new Scanner(System.in);
					choice = bc.nextInt();
					
					switch(choice) {
						case 1:
							System.out.print("student ID:");  
							int studentID1 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
						case 2:
							System.out.print("student ID:");  
							int studentID2 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
						case 3:
							System.out.print("student ID:");  
							int studentID3 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
						case 4:
							System.out.print("student ID:");  
							int studentID4 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
					}
					
				case 3:
					System.out.println("1�� : �ѽ�");
					System.out.println("2�� : �߽�");
					System.out.println("3�� : �Ͻ�");
					System.out.println("4�� : �н�ƮǪ��");
					System.out.println("1������ 4�� �߿��� �ϳ��� �Է��ϼ���. : ");
					Scanner cc = new Scanner(System.in);
					choice = cc.nextInt();
					
					switch(choice) {
						case 1:
							System.out.print("student ID:");  
							int studentID1 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
						case 2:
							System.out.print("student ID:");  
							int studentID2 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
						case 3:
							System.out.print("student ID:");  
							int studentID3 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
						case 4:
							System.out.print("student ID:");  
							int studentID4 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
							
					}
					
				case 4:
					System.out.println("1�� : �ѽ�");
					System.out.println("2�� : �߽�");
					System.out.println("3�� : �Ͻ�");
					System.out.println("4�� : �н�ƮǪ��");
					System.out.println("1������ 4�� �߿��� �ϳ��� �Է��ϼ���. : ");
					Scanner dc = new Scanner(System.in);
					choice = dc.nextInt();
					
					switch(choice) {
						case 1:
							System.out.print("student ID:");  
							int studentID1 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
						case 2:
							System.out.print("student ID:");  
							int studentID2 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
						case 3:
							System.out.print("student ID:");  
							int studentID3 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
						case 4:
							System.out.print("student ID:");  
							int studentID4 = input.nextInt(); // ���⼭ student ID�� �Է¹ް� ���ٱ����� ���� ��� �ش� ī�װ��� �̿��� �� �ֵ��� �� ����
							break;
					}	
		 	}
		}
	} 
}
