package yurilenzi.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import yurilenzi.entities.Partecipazione;
import yurilenzi.entities.Persona;

public class PartecipazioneDAO {
    public final EntityManager entityManager;

    public PartecipazioneDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Partecipazione nuovaPartecipazione){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(nuovaPartecipazione);
        transaction.commit();
        System.out.println("La persona" + nuovaPartecipazione.getPartecipazioneId() + "SALVATA");
    }
}
