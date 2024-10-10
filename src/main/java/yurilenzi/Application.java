package yurilenzi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import yurilenzi.dao.EventiDAO;
import yurilenzi.dao.PartecipazioneDAO;
import yurilenzi.dao.PersonaDAO;
import yurilenzi.entities.*;
import yurilenzi.menu.Inserimento;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("EsD2set3BE");

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello World!");
        EntityManager em = emf.createEntityManager();


        EventiDAO eventiDAO = new EventiDAO(em);
        PersonaDAO personaDAO = new PersonaDAO(em);
        PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO(em);


       Persona persona1 = new Persona("Mario", "Rossi", "mario@rossi.it", LocalDate.now(), Sesso.M);
        Persona personaFromDB = em.find(Persona.class, 1);
        Partecipazione partecipazione1 = new Partecipazione(Stato.NON_CONFERMATO, eventiDAO.findById(1), personaFromDB);

        //partecipazioneDAO.save(partecipazione1);
        System.out.println(personaFromDB.getPartecipazioni().get(0));
       // System.out.println(partecipazione1);
        // Evento evento = new Evento("Festa di tutti", LocalDate.of(2024,9,22), "Bello", tipoEvento.PRIVATO, 20);
       // eventiDAO.save(evento);

    }
}
