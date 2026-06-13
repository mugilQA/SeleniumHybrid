import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the year:");
int year=scan.nextInt();
if(year%4==0) {
	System.out.println(year+" This is leap year");
}else {
	System.out.println(year+ " This is not leap year");
}
	}

}
