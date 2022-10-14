package day15_assignment.web.dao;

import java.util.ArrayList;
import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import day15_assignment.LogIn;

public class LoginDaoImpl implements LoginDao{

	@Override
	public ArrayList<LogIn> getUser() {
		// Connect to the db, get the user info and return it
		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("LoginServlet");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();
        
        Query q = entity.createQuery ("SELECT count(*) FROM LogIn");
        int result = ((Long) q.getSingleResult()).intValue();
        
        ArrayList<LogIn> loginCreds = new ArrayList<>();
        
        for(int i = 53; i < (result + 53); i++) {
        	LogIn s = entity.find(LogIn.class,i);
            loginCreds.add(s);
        }
        
        entity.getTransaction().commit();
        entity.close();
        emFactoryObj.close();
        
		return loginCreds;
	}

}
