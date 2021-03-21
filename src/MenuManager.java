import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0, choice = 0;
		Scanner input = new Scanner(System.in);
		/* struct go{
			studentId[10] = {}
			studentName[10] = {}
		}
		C언어에는 struct go 를 이용하여 구조체를 저장해놓는데 자바에서는 배열로 저장해놓는 방법이 없을까요? */
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
					System.out.println("1번 : 한식");
					System.out.println("2번 : 중식");
					System.out.println("3번 : 일식");
					System.out.println("4번 : 패스트푸드");
					System.out.println("1번부터 4번 중에서 하나를 입력하세요. : ");
					Scanner ac = new Scanner(System.in);
					choice = ac.nextInt();
					
					switch(choice) {
						case 1:
							System.out.print("student ID:");  
							int studentID1 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
						case 2:
							System.out.print("student ID:");  
							int studentID2 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
						case 3:
							System.out.print("student ID:");  
							int studentID3 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
						case 4:
							System.out.print("student ID:");  
							int studentID4 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
					}
					
				case 2:
					System.out.println("1번 : 한식");
					System.out.println("2번 : 중식");
					System.out.println("3번 : 일식");
					System.out.println("4번 : 패스트푸드");
					System.out.println("1번부터 4번 중에서 하나를 입력하세요. : ");
					Scanner bc = new Scanner(System.in);
					choice = bc.nextInt();
					
					switch(choice) {
						case 1:
							System.out.print("student ID:");  
							int studentID1 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
						case 2:
							System.out.print("student ID:");  
							int studentID2 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
						case 3:
							System.out.print("student ID:");  
							int studentID3 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
						case 4:
							System.out.print("student ID:");  
							int studentID4 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
					}
					
				case 3:
					System.out.println("1번 : 한식");
					System.out.println("2번 : 중식");
					System.out.println("3번 : 일식");
					System.out.println("4번 : 패스트푸드");
					System.out.println("1번부터 4번 중에서 하나를 입력하세요. : ");
					Scanner cc = new Scanner(System.in);
					choice = cc.nextInt();
					
					switch(choice) {
						case 1:
							System.out.print("student ID:");  
							int studentID1 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
						case 2:
							System.out.print("student ID:");  
							int studentID2 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
						case 3:
							System.out.print("student ID:");  
							int studentID3 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
						case 4:
							System.out.print("student ID:");  
							int studentID4 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
							
					}
					
				case 4:
					System.out.println("1번 : 한식");
					System.out.println("2번 : 중식");
					System.out.println("3번 : 일식");
					System.out.println("4번 : 패스트푸드");
					System.out.println("1번부터 4번 중에서 하나를 입력하세요. : ");
					Scanner dc = new Scanner(System.in);
					choice = dc.nextInt();
					
					switch(choice) {
						case 1:
							System.out.print("student ID:");  
							int studentID1 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
						case 2:
							System.out.print("student ID:");  
							int studentID2 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
						case 3:
							System.out.print("student ID:");  
							int studentID3 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
						case 4:
							System.out.print("student ID:");  
							int studentID4 = input.nextInt(); // 여기서 student ID를 입력받고 접근권한이 있을 경우 해당 카테고리를 이용할 수 있도록 할 예정
							break;
					}	
		 	}
		}
	} 
}
