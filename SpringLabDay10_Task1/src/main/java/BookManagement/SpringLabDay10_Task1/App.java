package BookManagement.SpringLabDay10_Task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("BookManagement/SpringLabDay10_Task1/application-context.xml");
        Books bean = context.getBean("book", Books.class); 
        IO.println(bean);
    }
}
