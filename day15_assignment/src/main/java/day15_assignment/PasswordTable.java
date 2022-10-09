package day15_assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PasswordTable {
	public void insertEntity() {
        EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("LoginServlet");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();

        LogIn l1 = new LogIn("Jennie","BPJennie");
        entity.persist(l1);
        LogIn l2 = new LogIn("Lisa","BPLalisa");
        entity.persist(l2);
        LogIn l3 = new LogIn("Rose","BPRose");
        entity.persist(l3);
        LogIn l4 = new LogIn("Jisoo","BPJisoo");
        entity.persist(l4);
        LogIn l5 = new LogIn("Nayeon","TwiceNY");
        entity.persist(l5);
        LogIn l6 = new LogIn("Jihyo","TwiceJH");
        entity.persist(l6);
        
        entity.getTransaction().commit();
        entity.close();
        emFactoryObj.close();
    }
	
	public boolean findEntity(String username, String password) {
        EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("LoginServlet");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();
        
        boolean retVal;

        for(int i = 1; i <= 6; i++){
            LogIn s = entity.find(LogIn.class,i);
            if(s.getUserName().compareTo(username) == 0 && s.getPassword().compareTo(password) == 0){
            	retVal = true;
            }
        }
        retVal = false;

        entity.getTransaction().commit();
        entity.close();
        emFactoryObj.close();
        
        return retVal;
    }
}
