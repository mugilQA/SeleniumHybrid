
public class LargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 40, 689, 90, 12, 0, 5 };
		int max = 0;

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];

			}
		}
		System.out.println(max);

	}

}
