
public class May20Removespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word= "Hello I am automation tester";
		String[] arr=word.split(" ");
		String reverse="";
		for (int i=0;i<arr.length;i++) {
		for (int j=arr[i].length()-1;j>=0;j--) {
			System.out.print(arr[i].charAt(j));
		}
		System.out.print(" ");

	}}

}
