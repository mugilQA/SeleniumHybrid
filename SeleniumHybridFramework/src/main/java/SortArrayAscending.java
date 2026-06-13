
public class SortArrayAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {34,56,89,12,0,34,45};
		int[] ascend= {};
		for (int i=0;i<a.length-1;i++) {
			for (int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
			
		}
		
		for(int num: a)
		System.out.println(num);
		

	}

}
