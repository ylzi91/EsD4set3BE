package yurilenzi.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import yurilenzi.entities.Location;
import yurilenzi.entities.Persona;

public class LocationDAO {
    public final EntityManager entityManager;

    public LocationDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Location nuovaLocation){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(nuovaLocation);
        transaction.commit();
        System.out.println("La persona" + nuovaLocation.getNome() + "SALVATA");
    }
}
