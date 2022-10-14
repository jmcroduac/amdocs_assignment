package day15_assignment;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PasswordTable {
	
	public void insertEntity(String username, String password, String userType) {
        EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("LoginServlet");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();

        LogIn l1 = new LogIn(username, password, userType);
        entity.persist(l1);
        
        entity.getTransaction().commit();
        entity.close();
        emFactoryObj.close();
        
    }
	
	public boolean findEntity(String username, String password) {
        EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("LoginServlet");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();
        
        boolean retVal = false;
        
        LogIn s = entity.find(LogIn.class,username);
        if(s != null) {
        	if(s.getUserName().compareTo(username) == 0 && s.getPassword().compareTo(password) == 0){
            	retVal = true;
            }
        }
        
        entity.getTransaction().commit();
        entity.close();
        emFactoryObj.close();
        
        return retVal;
    }
	
	public ArrayList<LogIn> returnAllEntity() {
        EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("LoginServlet");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();
        
        Query q = entity.createQuery ("SELECT count(*) FROM LogIn");
        int result = ((Long) q.getSingleResult()).intValue();

        ArrayList<LogIn> userList = new ArrayList<>();
        
        for(int i = 53; i < (53 + result); i++) {
            LogIn l = entity.find(LogIn.class, i);
            userList.add(l);
        }
        
        entity.getTransaction().commit();
        entity.close();
        emFactoryObj.close();
        return userList;

    }
}
