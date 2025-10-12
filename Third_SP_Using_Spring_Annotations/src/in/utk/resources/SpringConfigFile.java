package in.utk.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.utk.beans")
// @ComponentScan({"in.utk.beans"})  to provide array of values
// @ComponentScan(basePackages = {"in.utk.beans"})
public class SpringConfigFile {
	

}


