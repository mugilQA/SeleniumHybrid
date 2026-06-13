
public class ArrayDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={2,3,5,5,4,6,7,8,2,5};
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			boolean visited=true;
			count=0;
			
			for(int k=0;k<i;k++) {
				if(arr[i]==arr[k]) {
					visited =false;
					break;
				}
			}
			if(visited=false)
				continue;
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
				{
					 
					count++;
					}
				} 
			System.out.println(arr[i]+"  "+count);}
				
		}

	}


