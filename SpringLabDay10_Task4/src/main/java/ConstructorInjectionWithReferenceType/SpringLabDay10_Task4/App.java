package ConstructorInjectionWithReferenceType.SpringLabDay10_Task4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjectionWithReferenceType/SpringLabDay10_Task4/application-context.xml");
        Patient bean = context.getBean("patient", Patient.class); 
        IO.print(bean);
    }
}
