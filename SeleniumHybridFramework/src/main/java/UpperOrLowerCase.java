import java.util.Scanner;

public class UpperOrLowerCase {

	public void checkCharacter(char ch) {
		if(Character.isLowerCase(ch)) System.out.println(ch + " is lowercase");
		if(Character.isUpperCase(ch)) System.out.println(ch + " is uppercase");
		if(Character.isDigit(ch)) System.out.println(ch+" is digit");
		else System.out.println(ch+ " is a special character");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='8';
UpperOrLowerCase ul=new UpperOrLowerCase();


ul.checkCharacter(ch);
	}

}
