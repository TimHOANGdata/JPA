/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe20221107.poe20221107.demojpa.clientOrder;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author NghiemHOANG
 */
public class OrderDAO {
    
    public static List<Order> findAll(){
          EntityManager entityManager = EntityManagerSingleton.getEntityManager();
          Query query = entityManager.createQuery("SELECT o FROM Order o");
          List<Order> orders = query.getResultList();
          return orders;
      }
}

