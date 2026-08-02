package ConstructorInjectionWithPrimitiveType.SpringLabDay10_Task3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    		ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjectionWithPrimitiveType/SpringLabDay10_Task3/application-context.xml");
    		Teacher bean = context.getBean("teacher", Teacher.class); 
    		IO.println(bean);
    }
}
