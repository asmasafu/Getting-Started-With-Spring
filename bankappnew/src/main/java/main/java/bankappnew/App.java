package main.java.bankappnew;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger log = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	log.info("started1");
    	
    	log.error("started2");
    	
    	ApplicationContext app = new ClassPathXmlApplicationContext("classpath:META-INF/spring/appContext.xml");
    	
    	EmployeeService empService = (EmployeeService)app.getBean("employeeService");
    	empService.displayName();
    }
}
