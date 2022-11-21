package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
          AbstractApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
          context.registerShutdownHook();
            Appliction3 app3= (Appliction3) context.getBean("app3");
        System.out.println(app3);
    }
}
