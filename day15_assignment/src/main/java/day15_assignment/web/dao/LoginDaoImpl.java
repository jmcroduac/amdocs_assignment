package day15_assignment.web.dao;

import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import day15_assignment.LogIn;

public class LoginDaoImpl implements LoginDao{

	@Override
	public HashMap<String,String[]> getUser() {
		// Connect to the db, get the user info and return it
		EntityManagerFactory emFactoryObjj = Persistence.createEntityManagerFactory("LoginServlet");
        EntityManager entity = emFactoryObjj.createEntityManager();
        entity.getTransaction().begin();
        
        Query q = entity.createQuery ("SELECT count(*) FROM LogIn");
        int result = ((Long) q.getSingleResult()).intValue();
        
        HashMap<String,String[]> loginCreds = new HashMap<>();
        String[] userPwd = new String[2];
        
        for(int i = 53; i < (result + 53); i++) {
        	LogIn s = entity.find(LogIn.class,i);
        	userPwd[0] = s.getUserName();
        	userPwd[1] = s.getPassword();
            loginCreds.put(s.getUserType(), userPwd);
        }
        
        entity.getTransaction().commit();
        entity.close();
        emFactoryObjj.close();
        
		return loginCreds;
	}

}
