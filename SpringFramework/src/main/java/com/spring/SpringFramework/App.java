package com.spring.SpringFramework;

import java.io.ObjectInputStream.GetField;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
//    	Vehicle obj = (Vehicle)context.getBean("Car");
//        obj.drive();
       
//       Tyre t = (Tyre)context.getBean("tyre");
//       System.out.println(t);
//       
//      Student student = context.getBean("student", Student.class);
//      student.displayStudentInfo();
      
      Login login = context.getBean("login",Login.class);
      login.display();
      login.loginGoogle();
    }
}
