package yurilenzi.menu;

import jakarta.persistence.EntityManager;
import yurilenzi.dao.EventiDAO;
import yurilenzi.entities.Evento;
import yurilenzi.entities.tipoEvento;

import java.time.LocalDate;
import java.util.Scanner;

public class Inserimento {
    private Scanner scn;

    public Inserimento(Scanner scn) {
        this.scn = scn;
    }
    public void InserisciInEventi(EntityManager entityManager){
        while (true){
            try {
                System.out.println("Scrivi il titolo dell'evento ('esci' per uscire) ");
                String titolo = scn.nextLine();
                if(titolo.toLowerCase().equals("esci")) break;
                System.out.println("Inserisci il giorno");
                int giorno = Integer.parseInt(scn.nextLine());
                System.out.println("Inserisci il mese");
                int mese = Integer.parseInt(scn.nextLine());
                System.out.println("Inserisci il anno");
                int anno = Integer.parseInt(scn.nextLine());
                System.out.println("Scrivi descrizione dell'evento");
                String descrizione = scn.nextLine();
                System.out.println("Inserisci il massimo numero di partecipanti");
                int partecipanti = Integer.parseInt(scn.nextLine());
                EventiDAO eventiDAO = new EventiDAO(entityManager);
                Evento evento = new Evento(titolo, LocalDate.of(anno, mese, giorno), descrizione, tipoEvento.PRIVATO, partecipanti);
                eventiDAO.save(evento);
            }
            catch (Exception e) {
                System.out.println("Errore Generico");
            }






        }
    }
}


