
public class Jun1NonRepeatingCharacterSTring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Automation";
		
	String	str=str1.toLowerCase();
		
		for (int i=0;i<str.length();i++) {
			int temp=0;
			/*
			 * if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
			 * System.out.println(str.charAt(i)); }
			 */
			for (int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					temp++;
				}
			}
			//all non repeating characters
			
		//	if (temp==1) {
			//	System.out.println(str.charAt(i));
			//}
			
			//repeating characters
			
			if (temp>1) {
				System.out.println(str.charAt(i));
				}

	}

	}}
