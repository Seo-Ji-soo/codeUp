import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=0;i<=100000000;i++) {
			sum+=i;
			if(num<=sum) {
				System.out.println(sum);
				break;
			}
			
		}
			
		
	}
}	
	