package basic;

public class StringOperation {

	public static void main(String[] args) {
		/*String str="abcdef";
		String str1="klmno";
		String str2="wxyz";
		System.out.println("Length is: "+str.length());
		System.out.println("Uppercase is: "+str.toUpperCase());
		System.out.println("Lowercase is: "+str.toLowerCase());
		System.out.println("Concate is: "+str.concat(" "+(str1 +" "+(str2))));
		System.out.println("Ignorecase is: "+str.compareToIgnoreCase(str2));
		System.out.println("Index is: "+str.indexOf('e'));
		System.out.println("Strings are equals: "+str.equals(str1));
		
		String str4 = "How are you?";
		String arrStr[] = str4.split(" ", 3);
		System.out.println("Splited Elements:");
		for(int i=0;i<arrStr.length;i++) {
			System.out.print(arrStr[i] + " ");
		}
		System.out.println();
		System.out.println("Splited Elements using for each loop:");
			for (String str5 : arrStr) {		
				System.out.print(str5 + " ");
			}
			
			String str6=" ";
			System.out.println("\nLength is: "+str6.length());
			System.out.println("Is String is Empty: "+str6.isEmpty());
			System.out.println("Is String is Blank: "+str6.isBlank());
		 		*/
String str = "Welcome to edubridge    ";
        
        //convert string into character array
        char[] arr = str.toCharArray();   
        String tempStr = "";
        for(char c:arr){
            
            if(c != ' '){
                tempStr += c;
            }
           //System.out.println(c);
            System.out.println("Temp"+tempStr);
        }
         str = tempStr;
        System.out.println(str);
	}
}
