package basic;

public class intArray {

	public static void main(String[] args) {
		int intArray[]= {20,30,40,50}; //single dimension
		int cloneArray[]=intArray.clone();
		System.out.println(intArray==cloneArray);
		for(int i=0;i<cloneArray.length;i++) {
		System.out.println(cloneArray[i]);
		}
		
		int a[][]={{0,1,2,3,4},{5,6,7,8,9}}; //multidimentional
		int clonea[][]=a.clone();
		System.out.println(a==clonea);
		for(int i=0;i<clonea.length;i++) {
			for(int j=0;j<5;j++) {
			System.out.println("=>"+clonea[i][j]);
			}
		}
	}

}
