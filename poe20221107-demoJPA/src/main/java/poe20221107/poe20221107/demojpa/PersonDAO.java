
package poe20221107.poe20221107.demojpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class PersonDAO {
    public static void create(Person person){
       EntityManager entityManager = EntityManagerSingleton.getEntityManager();
       //entitymanager permet de creer et sauvegarder et lire des entity
       //elle represent la connection avec la base de donnees
       
       EntityTransaction tx = entityManager.getTransaction();
       tx.begin();
       
       entityManager.persist(person);
       //sauvergarder person dans la base de donnees
       
       tx.commit();
       //transaction permet de modifier la base de donnees
    }
      public static Person findById(Long id){
            EntityManager entityManager = EntityManagerSingleton.getEntityManager();
            Person person = entityManager.find(Person.class,id);
            return person;
        }
      
      public static void delete(Person personToBeDeleted){
          EntityManager entityManager = EntityManagerSingleton.getEntityManager();
          EntityTransaction tx = entityManager.getTransaction();
          tx.begin();
          entityManager.remove(personToBeDeleted);
          tx.commit();
      }
      public static void update(Person personToUpdate){
          EntityManager entityManager = EntityManagerSingleton.getEntityManager();
          EntityTransaction tx = entityManager.getTransaction();
          tx.begin();
          entityManager.merge(personToUpdate);
          tx.commit();
      }
      public static List<Person> findAll(){
          EntityManager entityManager = EntityManagerSingleton.getEntityManager();
          Query query = entityManager.createQuery("SELECT p FROM Person p");
          List<Person> persons = query.getResultList();
          return persons;
      }
      
      public static void deleteById(Long id){
          EntityManager entityManager = EntityManagerSingleton.getEntityManager();
          EntityTransaction tx = entityManager.getTransaction();
          tx.begin();
          
          Query query = entityManager.createQuery("DELETE FROM person p WHERE p.id = :id");
          query.setParameter("id",id);
          query.executeUpdate();
          
          tx.commit();
      }
   
}
