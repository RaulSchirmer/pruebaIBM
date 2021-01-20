package com.rsj.hibernate;


import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class InformeManager {
	
	protected SessionFactory sessionFactory;
	 
    public void setup() {
    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
    	        .configure() // configures settings from hibernate.cfg.xml
    	        .build();
    	try {
    	    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    	} catch (Exception ex) {
    	    System.out.println("Error: no se ha podido conectar a la base de datos. " + ex);
    		StandardServiceRegistryBuilder.destroy(registry);
    	    
    	}
    }
 
    public void exit() {
    	sessionFactory.close();
    }
 
     
    public List <Proveedores> read(Long idCliente) {
    	Session session = sessionFactory.openSession();
    	List <Proveedores> listProveedores = null;
    	Query hqlQuery = session.createQuery("from Proveedores where idCliente = :idCliente");
    	hqlQuery.setParameter("idCliente",  idCliente );
        listProveedores = (List <Proveedores>)hqlQuery.getResultList();
    	return listProveedores;
    }
 
  
 

}
