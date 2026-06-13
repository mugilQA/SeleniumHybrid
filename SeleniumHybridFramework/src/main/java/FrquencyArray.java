
public class FrquencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]  arr= {'a','u','i','u','h','d','k','i','f'};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[i]==arr[j+1]) {
					continue;
				}
				count++;
			}
			System.out.println(arr[i]+" "+count);
		}
		
		

	}

}
