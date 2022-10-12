package day15_assignment;

import java.util.ArrayList;
import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CourseOperations {
	public void insertEntity() {
        EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("LoginServlet");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();

        Course c1 = new Course("Algebra",10,5000);
        entity.persist(c1);
        Course c2 = new Course("Chemistry",11,4000);
        entity.persist(c2);
        Course c3 = new Course("World History",10,6000);
        entity.persist(c3);
        Course c4 = new Course("English",11,5000);
        entity.persist(c4);
       
        entity.getTransaction().commit();
        entity.close();
        emFactoryObj.close();  
	}
	
	public ArrayList<Course> returnAllEntity() {
        EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("LoginServlet");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();
        
        ArrayList<Course> courseArr = new ArrayList<>();
        
        for(int i = 49; i <= 52; i++) {
            Course c = entity.find(Course.class, i);
            courseArr.add(c);
        }
        
        entity.getTransaction().commit();
        entity.close();
        emFactoryObj.close();
        return courseArr;

    }
}
