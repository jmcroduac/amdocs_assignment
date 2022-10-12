package day15_assignment.web.dao;

import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import day15_assignment.LogIn;

public class LoginDaoImpl implements LoginDao{

	@Override
	public HashMap<String,String> getUser() {
		// Connect to the db, get the user info and return it
		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("LoginServlet");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();
        
        HashMap<String,String> loginCreds = new HashMap<>();
        
        for(int i = 1; i <= 3; i++) {
        	LogIn s = entity.find(LogIn.class,i);
            loginCreds.put(s.getUserName(), s.getPassword());
        }
        
        entity.getTransaction().commit();
        entity.close();
        emFactoryObj.close();
        
		return loginCreds;
	}

}
