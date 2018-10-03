package main.java.di_with_setter;

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
    	log.info("program starts");
    	ApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring/META-INF/app-context.xml");
    	TextEditor td = (TextEditor) app.getBean("textEditor");
    	td.spellChecking();
        log.info("program exits");
    	
    }
}
