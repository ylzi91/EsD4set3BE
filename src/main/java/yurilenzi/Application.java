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

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("EsD4Set3BE");

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello World!");
        EntityManager em = emf.createEntityManager();

        EventiDAO eventiDAO = new EventiDAO(em);
        PersonaDAO personaDAO = new PersonaDAO(em);
        PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO(em);


    }
}
