package collectioex;

public class Employee{

	 private int eid;

	 private String ename;

	 

	Employee(int eid, String ename){

	   this.eid=eid;

	    this.ename=ename;

	}
	void display(int i) {
		System.out.println("integer value: "+i);
	}
	void display(byte i) {
		System.out.println("byte value: "+i);
	}
	void display(float i) {
		System.out.println("float value: "+i);
	}
	void display(double i) {
		System.out.println("double value: "+i);
	}
	 

	public static void main(String a[]){

//	   Employee eob = new Employee();

	  Employee eob1 = new Employee(1111,"Swetha");
	  

//	   System.out.println(eob.eid);  //0
//
//	   System.out.println(eob.ename); //null

	    System.out.println(eob1.eid);  //1111

	   System.out.println(eob1.ename); //Swetha
	   eob1.display(29);//integer
		  eob1.display((byte)5);//byte
		  eob1.display(5.6f);//byte
		  eob1.display(53.5);//byte
	    }

	}