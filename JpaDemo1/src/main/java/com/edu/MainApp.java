package com.edu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu1");
	    EntityManager em=emf.createEntityManager();
	    
	    MyStudent sob=em.find(MyStudent.class,1);
	    System.out.println(sob); 
	    
	    MyStudent ob=new MyStudent();
	    ob.setSid(3);
	    ob.setSname("maha");
	    em.getTransaction().begin();
	   
	    em.persist(ob);
	   em.getTransaction().commit();
	  

	}

}
