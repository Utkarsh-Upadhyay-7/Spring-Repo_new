package in.utk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.utk.beans.Student;
import in.utk.resources.SpringConfigFile;

public class Main { 
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std = (Student) context.getBean("student");
		std.display();
	}

}
