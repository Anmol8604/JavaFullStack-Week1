import java.util.Scanner;
public class lecture2 {
	 public static void main(String[] args) {
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("+ve");
		}
		else if (num < 0) {
			System.out.println("-ve");
		}
		else {
			System.out.println("neutral");
		}
	 }
}

