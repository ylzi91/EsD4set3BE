package yurilenzi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "partite_di_calcio" )
public class PartitaDiCalcio extends Evento{

    @Column(name = "squadra_di_casa")
    private String squadraDiCasa;
    @Column(name = "squadra_ospite")
    private String squadraOspite;
    @Column(name = "squadra_vincente")
    private String squadraVincente;
    @Column(name = "gol_squadra_casa")
    private int golSquadraCasa;
    @Column(name = "gol_squadra_ospite")
    private int golSquadraospite;

    public PartitaDiCalcio(){

    }
    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, yurilenzi.entities.tipoEvento tipoEvento, int massimoPartecipanti, String squadraDiCasa, String squadraOspite, String squadraVincente, int golSquadraCasa, int golSquadraospite) {
        super(titolo, dataEvento, descrizione, tipoEvento, massimoPartecipanti);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.golSquadraCasa = golSquadraCasa;
        this.golSquadraospite = golSquadraospite;
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getGolSquadraCasa() {
        return golSquadraCasa;
    }

    public void setGolSquadraCasa(int golSquadraCasa) {
        this.golSquadraCasa = golSquadraCasa;
    }

    public int getGolSquadraospite() {
        return golSquadraospite;
    }

    public void setGolSquadraospite(int golSquadraospite) {
        this.golSquadraospite = golSquadraospite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", golSquadraCasa=" + golSquadraCasa +
                ", golSquadraospite=" + golSquadraospite +
                '}';
    }
}
