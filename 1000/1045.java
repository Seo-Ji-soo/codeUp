import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		double a = sc.nextInt();
        double b= sc.nextInt();
        
		System.out.println(Math.round(a+b));
		System.out.println(Math.round(a-b));
		System.out.println(Math.round(a*b));
		System.out.println(Math.round(a/b));
		System.out.println(Math.round(a%b));
		System.out.printf("%.2f", a/b);
			

	}
}

