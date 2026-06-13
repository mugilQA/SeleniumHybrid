import java.util.Scanner;

public class May19AverageMark {
	
	public static void studentmark (int mark1,int mark2,int mark3,int mark4,int mark5){
		int average=(mark1+mark2+mark3+mark4+mark5)/5;
		System.out.println("Average : "+ average);
		if (average>50) {
			System.out.println("You are Pass");
		if (average>90) {
			System.out.println("your grade: A");
		}else if (average >= 80 && average < 90 ) {
			System.out.println("your grade: B");
		}else if (average >= 70 && average < 80 ) {
			System.out.println("your grade: C");
		}else if (average >= 50 && average < 70 ) {
			System.out.println("your grade: D");
		}}
		
		else  {
			System.out.println("your are Fail");
			System.out.println("your grade: U");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Student mark for English/Physics/Chemistry/Maths/Biology: ");
		int mark1=scan.nextInt();
		int mark2=scan.nextInt();
		int mark3=scan.nextInt();
		int mark4=scan.nextInt();
		int mark5=scan.nextInt();
		System.out.println(mark1+" "+mark2+" "+mark3+" "+mark4+ " "+mark5);
		
		
		studentmark(mark1,mark2,mark3,mark4,mark5);
			

	}

}