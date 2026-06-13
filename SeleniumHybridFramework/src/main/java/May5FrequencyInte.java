
public class May5FrequencyInte {

	public static void main(String[] args) {
		
		int[] a= {2,4,6,1,2,7,2,4,6,4};
		
		boolean visited=false;
		
		
		for (int i=0;i<a.length;i++) {
			int count=1;
			for (int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j] ) {
					count++;
					continue;
				}
				
				visited=true;
				
			}
			System.out.println(a[i] +  " count"+count);
		}

	}

}



public static void main(String[] args) {
	int[] a= {2,4,2,6,1,2,7,2,4,4};
	boolean[] temp=new boolean[a.length];//{f,f,t,f,f,f,f,t,f,f}
	for(int i=0;i<a.length;i++) {//0
		if(temp[i]) {
			continue;
		}
		int count=1;
		for(int j=i+1;j<a.length;j++) {//1,2
			if(a[i]==a[j]) {
				temp[j]=true;
				count++;//
			}
		}
		System.out.println(a[i]+"-"+count);
	}

}