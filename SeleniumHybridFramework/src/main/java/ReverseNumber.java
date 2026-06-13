
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=435;
int reversed=0;
while (num!=0) {
	int digit=num%10;//3 /4
	 reversed=reversed*10+digit; //5 - 53 =534
	num =num/10; //4 //53
}

System.out.println("reversed: "+reversed);



	}

}
