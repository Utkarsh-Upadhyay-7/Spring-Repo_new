package in.utk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.utk.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	String path = "/in/utk/resources/applicationContext.xml";
       ApplicationContext context = new ClassPathXmlApplicationContext(path);
       
       Student std = (Student) context.getBean("stdId2");
       std.display();
    }
}
