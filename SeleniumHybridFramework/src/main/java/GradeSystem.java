import java.util.Scanner;

public class GradeSystem {
	
	public static void  gradesystem(int mark) {
		if(mark > 90)System.out.println("Grade A");
		else if (mark >80 && mark<90) System.out.println("Grade B");
		else if (mark >70 && mark <80) System.out.println("Grade C");
		else if (mark >35 && mark <70) System.out.println("Grade D");
		else System.out.println("Not Passed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1= new Scanner(System.in);
		System.out.println("Enter your mark for grading system");
		int mark=scan1.nextInt();
		gradesystem(mark);
		
		

	}

}
