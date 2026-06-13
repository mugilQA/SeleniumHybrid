
public class DigitorAlphabet {

	public static void main(String[] args) {
		char ch='&';
		if(Character.isDigit(ch)) {
			System.out.println(ch+ " is a digit");
		}else if (Character.isLetter(ch)) {
			System.out.println(ch+ " is a alphabet");
		}else {
			System.out.println(ch+ " is a special character");
		}

	}

}
