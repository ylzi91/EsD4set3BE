package yurilenzi.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "partecipazione")
public class Partecipazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partecipazione_id")
    private long partecipazioneId;
    @Enumerated(EnumType.STRING)
    private Stato stato;
    @ManyToOne
    @JoinColumn(name = "id_evento")
    private Evento evento;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Persona persona;

    public Partecipazione(){

    }
    public Partecipazione(Stato stato, Evento evento, Persona persona) {
        this.stato = stato;
        this.evento = evento;
        this.persona = persona;
    }

    public long getPartecipazioneId() {
        return partecipazioneId;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "partecipazioneId=" + partecipazioneId +
                ", stato=" + stato +
                ", evento=" + evento +
                '}';
    }
}
