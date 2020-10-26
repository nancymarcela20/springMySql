package com.namar.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.namar.beans.Equipo;
import com.namar.beans.Jugador;
import com.namar.beans.Marca;
import com.namar.service.ServiceJugador;
import com.namar.service.ServiceMarca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
             
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/namar/xml/beans.xml");
    
        ServiceJugador sm = (ServiceJugador) appContext.getBean("serviceJugadorImpl");
        Marca mar3 = (Marca) appContext.getBean("marca3");   
        Equipo eq1 = (Equipo) appContext.getBean("equipo1");
        Jugador jugador = (Jugador) appContext.getBean("jugador1");
        
        try {
        	//sm.registrar(mar3);
        	sm.registrar(jugador);
        }catch(Exception e){
        	System.out.println(e.getMessage());
        }
        
    }
}
