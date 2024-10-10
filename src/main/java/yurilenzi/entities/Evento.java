package yurilenzi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "eventi")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_evento")
public abstract class Evento {
    @Id
    @GeneratedValue()
    protected long id;
    protected String titolo;
    @Column(name = "data_evento", nullable = false)
    protected LocalDate dataEvento;
    protected String descrizione;
    @Column(name = "tipo_evento", nullable = false)
    @Enumerated(EnumType.STRING)
    private tipoEvento tipoEvento;
    @Column(name = "massimo_partecipanti")
    protected int massimoPartecipanti;
    @ManyToOne
    @JoinColumn(name = "location_id")
    protected Location location;

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
