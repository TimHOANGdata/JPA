package poe20221107.poe20221107.demojpa.tigre;

import poe20221107.poe20221107.demojpa.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerSingleton {

    private static EntityManager entityManager;

    public static EntityManager getEntityManager() {
        if (entityManager == null) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa");
            entityManager = emf.createEntityManager();
        }
        return entityManager;
    }    
}
