import java.util.Scanner;

public class Main {
	public static void calculate(int x,int y,int op){
		int result;
		
		switch (op) {
			case 1:
				result = x + y;
				break;
			case 2:
				result = x - y;
				break;
			case 3:
				result = x * y;
				break;
			case 4:
				if (y == 0){
					System.out.println("Error: Cannot divide by zero!");
					return;
				}
				result = x/y;
				break;
			default:
				System.out.println("Invalid operation!");
				return;
		}
		System.out.println("Result: "+result);
	}
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int first_number = scanner.nextInt ();
		
		System.out.println("Enter the second number:");
		int second_number = scanner.nextInt ();
		
		System.out.println("Enter Operation:\n1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide");
		int operation = scanner.nextInt ();
		calculate(first_number,second_number,operation);
		scanner.close();
	}
}