package yurilenzi.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import yurilenzi.entities.Persona;

public class PersonaDAO {
    public final EntityManager entityManager;

    public PersonaDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Persona nuovaPersona){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(nuovaPersona);
        transaction.commit();
        System.out.println("La persona" + nuovaPersona.getNome() + "SALVATA");
    }
}
