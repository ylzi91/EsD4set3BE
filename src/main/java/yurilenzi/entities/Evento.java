package yurilenzi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "eventi")
public class Evento {
    @Id
    @GeneratedValue()
    private long id;
    private String titolo;
    @Column(name = "data_evento", nullable = false)
    private LocalDate dataEvento;
    private String descrizione;
    @Column(name = "tipo_evento", nullable = false)
    @Enumerated(EnumType.STRING)
    private tipoEvento tipoEvento;
    @Column(name = "massimo_partecipanti")
    private int massimoPartecipanti;

    public Evento(){

    }

    public Evento(String titolo, LocalDate dataEvento, String descrizione, tipoEvento tipoEvento, int massimoPartecipanti) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.massimoPartecipanti = massimoPartecipanti;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public yurilenzi.entities.tipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(yurilenzi.entities.tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getMassimoPartecipanti() {
        return massimoPartecipanti;
    }

    public void setMassimoPartecipanti(int massimoPartecipanti) {
        this.massimoPartecipanti = massimoPartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", massimoPartecipanti=" + massimoPartecipanti +
                '}';
    }
}
