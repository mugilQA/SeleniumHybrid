
public class StaticKeyword {
	
	int x=10;
	static int y=20;
	
	public static void calling() {
		System.out.println("Static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword sc=new StaticKeyword();
		
System.out.println(sc.x);
System.out.println(y);
calling();
	}

}
