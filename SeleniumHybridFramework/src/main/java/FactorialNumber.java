import java.util.Scanner;

public class FactorialNumber {
	
	public static void factorial(int num) {
		int numb=1;
		int total=1;
		while(numb<=num) {
			total*=numb;
			numb++;
			
		}
		System.out.println("Total factorial "+total );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
		factorial(num);

	}

}
