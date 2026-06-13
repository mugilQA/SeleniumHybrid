
public class PrintTwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[][] a= {{2,3,5},{3,8}};
			for(int i=0;i<a.length;i++) {//0,1
				for(int j=0;j<a[i].length;j++) {//0
					System.out.print(a[i][j]+" ");//a[1][0]
				}
				System.out.println();
			}
		}


}
