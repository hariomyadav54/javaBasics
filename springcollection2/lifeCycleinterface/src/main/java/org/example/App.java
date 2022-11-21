package org.example;

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
        Appliction2 app1= (Appliction2) context.getBean("app1");
        System.out.println(app1 );
    }
}
