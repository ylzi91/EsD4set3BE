package yurilenzi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import yurilenzi.dao.EventiDAO;
import yurilenzi.entities.Evento;
import yurilenzi.entities.tipoEvento;

import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("EsD2set3BE");

    public static void main(String[] args) {
        System.out.println("Hello World!");
        EntityManager em = emf.createEntityManager();
        EventiDAO eventiDAO = new EventiDAO(em);
        // Evento evento = new Evento("Festa di tutti", LocalDate.of(2024,9,22), "Bello", tipoEvento.PRIVATO, 20);
        // eventiDAO.save(evento);
        System.out.println(eventiDAO.findById(1));

    }
}
