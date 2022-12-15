
package poe20221107.poe20221107.demojpa.tigre;

import poe20221107.poe20221107.demojpa.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class TigreDAO {
    public static void create(Tigre tigre){
       EntityManager entityManager = EntityManagerSingleton.getEntityManager();
       //entitymanager permet de creer et sauvegarder et lire des entity
       //elle represent la connection avec la base de donnees
       
       EntityTransaction tx = entityManager.getTransaction();
       tx.begin();
       
       entityManager.persist(tigre);
       //sauvergarder person dans la base de donnees
       
       tx.commit();
       //transaction permet de modifier la base de donnees
    }
      public static Tigre findById(Long id){
            EntityManager entityManager = EntityManagerSingleton.getEntityManager();
            Tigre tigre = entityManager.find(Tigre.class,id);
            return tigre;
        }
      
      public static void delete(Tigre tigreToBeDeleted){
          EntityManager entityManager = EntityManagerSingleton.getEntityManager();
          EntityTransaction tx = entityManager.getTransaction();
          tx.begin();
          entityManager.remove(tigreToBeDeleted);
          tx.commit();
      }
      public static void update(Tigre tigreToUpdate){
          EntityManager entityManager = EntityManagerSingleton.getEntityManager();
          EntityTransaction tx = entityManager.getTransaction();
          tx.begin();
          entityManager.merge(tigreToUpdate);
          tx.commit();
      }
      public static List<Tigre> findAll(){
          EntityManager entityManager = EntityManagerSingleton.getEntityManager();
          Query query = entityManager.createQuery("SELECT t FROM Tigre t");
          List<Tigre> tigres = query.getResultList();
          return tigres;
      }
      
      public static void deleteById(Long id){
          EntityManager entityManager = EntityManagerSingleton.getEntityManager();
          EntityTransaction tx = entityManager.getTransaction();
          tx.begin();
          
          Query query = entityManager.createQuery("DELETE FROM Tigre t WHERE t.id = :id");
          query.setParameter("id",id);
          query.executeUpdate();
          
          tx.commit();
      }
   
}
