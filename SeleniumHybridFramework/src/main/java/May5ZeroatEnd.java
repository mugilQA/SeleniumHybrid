
public class May5ZeroatEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,3,0,1,4,0,4,6,0,8};
		/*
		 * int[] b= new int[a.length]; int k=0; for (int i=0;i<a.length;i++) {
		 * 
		 * if(a[i]!=0) { b[k]=a[i]; k++; }
		 * 
		 * 
		 * }
		 */
		/* Another method
		 * for (int i=0;i<a.length;i++) { for (int j=i+1;j<a.length;j++) { if(a[i]<a[j])
		 * { int temp=a[j]; a[i]=a[j]; a[j]=temp; } } }
		 */
		
		//Sorting Array
		
		for (int i=0;i<a.length;i++) {
			if(a[i]<a[i+1]){
				int temp=a[i];
				a[i]=a[i+1];
				a[i]=temp;
			}
		}
		
		for (int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}

}
