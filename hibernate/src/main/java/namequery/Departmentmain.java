package namequery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Departmentmain {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		  Session s=sf.openSession(); //database operation
		  Transaction t=s.beginTransaction();
		  Department d=new Department(1, "IT", "Bangalore");
		  s.save(d);
		  Department d1=new Department(2,"Sales","Pune");
		  s.save(d1);
		  Department d2=new Department(3,"HR","Bangalore");
		  s.save(d2);
		  t.commit();
		  System.out.println("Record Inserted");
		
		  }
		  sf.close();
		  }


