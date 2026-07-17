package SetterInjectionWithReferenceType.SpringLabDay10_Task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SetterInjectionWithReferenceType/SpringLabDay10_Task2/application-context.xml");
        Employee bean = context.getBean("employee", Employee.class); 
        IO.println(bean);
    }
}
