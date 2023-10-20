package collectioex;

class DatabaseConnection{
	private	static  DatabaseConnection dob;
	private DatabaseConnection() {
	
	}
	public static DatabaseConnection getDatabaseConnectionObject() {
		if(dob==null) {
			dob = new DatabaseConnection();
		}
		return dob; 
	}
	void retriveData() {
		System.out.println("Records from table");
	}
}
public class Singleton {
	public static void main(String[] args) {
		//DatabaseConnection dob = new DatabaseConnection();
		DatabaseConnection dob = DatabaseConnection.getDatabaseConnectionObject();
	   dob.retriveData();
	}
}