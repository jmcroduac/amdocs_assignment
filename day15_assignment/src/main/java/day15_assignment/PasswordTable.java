package day15_assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PasswordTable {
	public void insertEntity() {
        EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("LoginServlet");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();

        LogIn l1 = new LogIn("Jorena","JJJorena");
        entity.persist(l1);
        LogIn l2 = new LogIn("Maika","MMMaika");
        entity.persist(l2);
        LogIn l3 = new LogIn("Calinog","CCCalinog");
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
}
