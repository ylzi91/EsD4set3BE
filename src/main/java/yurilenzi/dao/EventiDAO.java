package yurilenzi.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import yurilenzi.entities.Evento;
import yurilenzi.exception.NullException;

import java.util.ArrayList;
import java.util.List;

public class EventiDAO {
    private final EntityManager entityManager;

    public EventiDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Evento nuovoEvento){
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(nuovoEvento);
        transaction.commit();
        System.out.println("L'evento '" + nuovoEvento.getTitolo() + "' è stato salvato correttamente");
    }

    public Evento findById(long idEvento){
        Evento found = entityManager.find(Evento.class, idEvento);
        if (found == null) throw new NullException(idEvento);
        return found;
    }

    public void deleteById(long idEvento){
        Evento found = this.findById(idEvento);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(found);
        transaction.commit();
        System.out.println("L'evento '" + found.getTitolo() + "' è stato cancellato");
    }

}
