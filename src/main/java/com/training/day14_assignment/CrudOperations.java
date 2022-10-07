package com.training.day14_assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CrudOperations {

    public void insertEntity() {
        EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();

        Student s1 = new Student("Jennie","B+");
        entity.persist(s1);
        Student s2 = new Student("Lisa","A");
        entity.persist(s2);
        Student s3 = new Student("Jisoo","D");
        entity.persist(s3);
        Student s4 = new Student("Rose","B+");
        entity.persist(s4);
        entity.getTransaction().commit();
        entity.close();
        emFactoryObj.close();
    }

    public void updateEntity() {
        EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();

        Student student = entity.find(Student.class, 2);
        student.setGrade("A+");
        entity.getTransaction().commit();
        entity.close();
        emFactoryObj.close();

    }

    public void findEntity() {
        EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();

        for(int i = 1; i <= 4; i++){
            Student s = entity.find(Student.class,i);
            if(s.getGrade().compareTo("B+") == 0){
                System.out.println("Student ID: " + s.getStudentId() + "\nName: " + s.getStudentName() + "\nGrade: " + s.getGrade() +"\n");
            }
        }

        entity.getTransaction().commit();
        entity.close();
        emFactoryObj.close();

    }

    public void removeEntity() {
        EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
        EntityManager entity = emFactoryObj.createEntityManager();
        entity.getTransaction().begin();

        for(int i = 1; i <= 4; i++){
            Student s = entity.find(Student.class,i);
            if(s.getGrade().compareTo("D") == 0){
                entity.remove(s);
            }
        }
        entity.getTransaction().commit();
        entity.close();
        emFactoryObj.close();

    }

}
