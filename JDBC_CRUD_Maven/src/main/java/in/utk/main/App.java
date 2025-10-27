package in.utk.main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.utk.beans.Student;
import in.utk.mappers.StudentRowMapper;
import in.utk.resources.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//       String roll_no = "10";
//       String name = "Abhishek";
//       float marks = 86.2f;
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
       
       JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//      
//      // Insertion Operation
//      
//      String inseret_sql_qwery = "INSERT INTO student VALUES(?,?,?)";
//       
//      int count = jdbcTemplate.update(inseret_sql_qwery,roll_no, name, marks);
//      if(count>0)
//      {
//    	  System.out.println("INsertion Successful");
//      }
//      else
//      {
//    	  System.out.println("Insertion failed");
//      }
      
      //Update Operation
//      float marks =98.7f;
//      int roll_no = 101;
//      String update_qwery = "UPDATE student SET marks=? WHERE roll_no = ?";
//      int count = jdbcTemplate.update(update_qwery, marks, roll_no);
//    if(count>0)
//    {
//  	  System.out.println("Update Successful");
//    }
//    else
//    {
//  	  System.out.println("Update failed");
//    }
      
      
//      Delete Operation
//      
//      int roll_no = 102;
//      String delete_qwery = "DELETE FROM student WHERE roll_no = ?";
//    int count = jdbcTemplate.update(delete_qwery, roll_no);
//  if(count>0)
//  {
//	  System.out.println("Deletion Successful");
//  }
//  else
//  {
//	  System.out.println("Deletion failed");
//  }
    	
    	
    	// SELECT Operation 1
    	
//    	String select_qwery = "SELECT * FROM STUDENT";
//    	List<Student> std_List = jdbcTemplate.query(select_qwery, new StudentRowMapper());
//    	
//    	for(Student std : std_List)
//    	{
//    		
//    		System.out.println("rollno. : "+ std.getRollno());
//    		System.out.println("Name : "+ std.getMarks());
//    		System.out.println("Marks : "+ std.getMarks());
//    		System.out.println("------------------------------");
//
//    	}
       
       // SELECT OPERATION 2
       int rollno =101;
       String select_qwery = "SELECT * FROM STUDENT WHERE roll_no = ?";
   	   Student std = jdbcTemplate.queryForObject(select_qwery, new StudentRowMapper(), rollno);   // queryForObject only returns one value in object
   	
   		System.out.println("rollno. : "+ std.getRollno());
   		System.out.println("Name : "+ std.getMarks());
   		System.out.println("Marks : "+ std.getMarks());
   		System.out.println("------------------------------");

    	
      
    }
}
