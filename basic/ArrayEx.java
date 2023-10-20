package basic;

public class ArrayEx {

	public static void main(String[] args) {
		int i,j;
		/*int num[]= {20,21,22,23};
		System.out.println(num.length);
		for(i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		for(i=0;i<=10;i++) {
			System.out.println(i);
		}
		for(i=10;i>0;i--) {
			System.out.println(i);
		}*/
		int a[][]= {{1,2},{3,4}};
		//System.out.println(a[0][0]);
		//System.out.println(a[0][1]);
		//System.out.println(a[1][0]);
		//System.out.println(a[1][1]);
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.println(a[i][j]);
				
			}
		}
			
	}

}
