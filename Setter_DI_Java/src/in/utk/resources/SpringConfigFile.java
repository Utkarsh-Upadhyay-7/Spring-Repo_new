package in.utk.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.utk.beans.Address;
import in.utk.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj()
	{
		Address addr = new Address();
		addr.setHouseno(101);
		addr.setCity("Sultanpur");
		addr.setPincode(1234);
		return addr;
	}
	
	@Bean
	public Student createObj()
	{
		Student std = new Student();
		
		std.setRollno(10);
		std.setName("Utkarsh");
	//	std.setAddress(createAddrObj());
		return std;
	}

}
