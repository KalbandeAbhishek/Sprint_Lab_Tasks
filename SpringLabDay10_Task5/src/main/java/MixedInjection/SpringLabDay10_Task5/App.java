package MixedInjection.SpringLabDay10_Task5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("MixedInjection/SpringLabDay10_Task5/application-context.xml");
        Project bean = context.getBean("project", Project.class); 
        IO.println(bean);
    }
}
