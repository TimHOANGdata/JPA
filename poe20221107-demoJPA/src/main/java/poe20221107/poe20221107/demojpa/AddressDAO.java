
package poe20221107.poe20221107.demojpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class AddressDAO {
     public static void create(Address address){
       EntityManager entityManager = EntityManagerSingleton.getEntityManager();
       //entitymanager permet de creer et sauvegarder et lire des entity
       //elle represent la connection avec la base de donnees
       
       EntityTransaction tx = entityManager.getTransaction();
       tx.begin();
       
       entityManager.persist(address);
       //sauvergarder person dans la base de donnees
       
       tx.commit();
       //transaction permet de modifier la base de donnees
    }
      public static Address findById(Long id){
            EntityManager entityManager = EntityManagerSingleton.getEntityManager();
            Address address = entityManager.find(Address.class,id);
            return address;
        }
      
      public static void delete(Address addressToBeDeleted){
          EntityManager entityManager = EntityManagerSingleton.getEntityManager();
          EntityTransaction tx = entityManager.getTransaction();
          tx.begin();
          entityManager.remove(addressToBeDeleted);
          tx.commit();
      }
      public static void update(Address addressToUpdate){
          EntityManager entityManager = EntityManagerSingleton.getEntityManager();
          EntityTransaction tx = entityManager.getTransaction();
          tx.begin();
          entityManager.merge(addressToUpdate);
          tx.commit();
      }
      public static List<Address> findAll(){
          EntityManager entityManager = EntityManagerSingleton.getEntityManager();
          Query query = entityManager.createQuery("SELECT a FROM Address a");
          List<Address> addresses = query.getResultList();
          return addresses;
      }
      
      public static void deleteById(Long id){
          EntityManager entityManager = EntityManagerSingleton.getEntityManager();
          EntityTransaction tx = entityManager.getTransaction();
          tx.begin();
          
          Query query = entityManager.createQuery("DELETE FROM Address a WHERE a.id = :id");
          query.setParameter("id",id);
          query.executeUpdate();
          
          tx.commit();
      }
}
