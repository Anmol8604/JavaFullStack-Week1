import java.util.Scanner;
/**
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
**/

public class lecture2 {
	 public static void main(String[] args) {
		  System.out.println("Enter Basic Pay: ");
		  Scanner sc = new Scanner(System.in);
		  double basicpay = sc.nextInt();
		  double hra = 0, da = 0;
		  if(basicpay >= 5000) {
			   hra = 0.15 * basicpay;
			   da = 0.25 * basicpay;
		  }
		  else {
			   hra = 0.2 * basicpay;
			   da = 0.3 * basicpay;
		  }
		  System.out.println(hra + " " + da);
		  System.out.println(hra + da + basicpay);
	 }
}
