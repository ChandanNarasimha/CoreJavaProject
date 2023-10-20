package com.maven.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String args[]) {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	  Session s=sf.openSession(); //database operation
	  Transaction t=s.beginTransaction(); //
	 
	/* Student s1=new Student(); //inserting
 	 s1.setName("shilpa");
 	 
     Student s2=new Student();
 	  s2.setName("mahesh");

 	  s.save(s1);
 	  s.save(s2);
 	  System.out.println("Record inserted");
	  t.commit();
	  s.close();*/
	
	/* Query query = s.createQuery("from Student"); //This line creates an HQL (Hibernate Query Language) query to retrieve all records from the "Student" entity (table).
	  
      List<Student> arr = query.list(); // to get all the data from table

       for(int i=0;i<arr.size();i++)
       {
       	System.out.println("Id :"+arr.get(i).getId() +"\nName : "+arr.get(i).getName());
       }
       s.close(); */
	  
	  /*Student s4=new Student(); //update

	    s4.setId(2);

	    s4.setName("pooji");

	    s.update(s4);

	    System.out.println("record has been updated");

	    t.commit();

	    s.close();*/
	  
	  Student s5= new Student(); //delete
	  s5.setId(2);
	  s5.setName("pooji");
	  s.delete(s5);
	  s.save(s5);
	  System.out.println("record has been deleted");
	  t.commit();
	  s.close();
}
}
