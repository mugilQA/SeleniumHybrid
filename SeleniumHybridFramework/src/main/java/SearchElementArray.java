
public class SearchElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chr= {'a','s','t','y','o'};
		char a='e';
		boolean found=false;
		
		for (int i=0;i<chr.length;i++) {
			if(a==chr[i]) {
				System.out.println("Match found at:"+i);
				found=true;
				break;
			}
				
		}
			if (!found)System.out.println("Match not found for :"+a);
			
	}

}
