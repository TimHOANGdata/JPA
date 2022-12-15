/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe20221107.poe20221107.demojpa.clientOrder;

import poe20221107.poe20221107.demojpa.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author NghiemHOANG
 */
public class ClientDAO {
    public static List<Client> findAll(){
          EntityManager entityManager = EntityManagerSingleton.getEntityManager();
          Query query = entityManager.createQuery("SELECT c FROM Client c");
          List<Client> clients = query.getResultList();
          return clients;
      }
}
