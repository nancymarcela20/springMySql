package com.namar.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.namar.beans.Marca;
import com.namar.service.ServiceMarca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Marca mar= new Marca();
        mar.setId(2);
        mar.setNombre("Marca2");
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/namar/xml/beans.xml");
    
        ServiceMarca sm = (ServiceMarca) appContext.getBean("serviceMarcaImpl");
        Marca mar3 = (Marca) appContext.getBean("marca3");        
        
        try {
        	sm.registrar(mar3);
        }catch(Exception e){
        	System.out.println(e.getMessage());
        }
        
    }
}
