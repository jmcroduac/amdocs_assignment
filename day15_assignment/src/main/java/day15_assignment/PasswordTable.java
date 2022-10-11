package day15_assignment;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PasswordTable {
	int entityCount = 0;
	
	public void insertEntity() {
        EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("LoginServlet");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();

        entityCount++;
        LogIn l1 = new LogIn(entityCount, "Jennie","JJJorena");
        entity.persist(l1);
        entityCount++;
        LogIn l2 = new LogIn(entityCount,"Lisa","MMMaika");
        entity.persist(l2);
        entityCount++;
        LogIn l3 = new LogIn(entityCount, "Rose","CCCalinog");
        entity.persist(l3);
       
        
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
	
	public HashMap<String,String> returnAllEntity() {
        EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("LoginServlet");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();
        HashMap<String, String> userNamePwd = new HashMap<>();
        
        for(int i = 1; i <= 3; i++) {
            LogIn l = entity.find(LogIn.class, i);
            userNamePwd.put(l.getUserName(), l.getPassword());
        }
        
        entity.getTransaction().commit();
        entity.close();
        emFactoryObj.close();
        return userNamePwd;

    }
}
