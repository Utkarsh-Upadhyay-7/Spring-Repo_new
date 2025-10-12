package in.Utkarsh.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.Utkarsh.beans.Student;
import in.Utkarsh.resources.SpringConfigFile;

public class Main {
   public static void main(String[] args) {
	   
	   ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
	   
	   Student std = (Student) context.getBean("stdId1");
	   std.display();
	
}

}
