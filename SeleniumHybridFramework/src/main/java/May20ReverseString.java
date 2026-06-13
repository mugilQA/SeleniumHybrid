
public class May20ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Tester";
		char[] arr=name.toCharArray();
		String reversename="";
		for (int i=arr.length-1;i>=0;i--) {
			reversename+=arr[i];
			
		}
		System.out.println(reversename);
	}

}
