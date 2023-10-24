package agenziaViaggi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Prenotazioni")
public class Prenotazione {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name = "id_prenotazione")
private long id;
private int numPartecipanti;
@ManyToOne
@JoinColumn(name = "id_utente")
private Utente utente;
@ManyToOne
@JoinColumn(name = "id_pacchetto")
private Pacchetto pacchetto;
private boolean convalida;
private double prezzoFinale;
public Prenotazione() {
}

public Prenotazione(int numPartecipanti, Utente utente, Pacchetto pacchetto, boolean convalida, double prezzoFinale) {
	super();
	this.numPartecipanti = numPartecipanti;
	this.utente = utente;
	this.pacchetto = pacchetto;
	this.convalida = convalida;
	this.prezzoFinale = pacchetto.getCosto()*numPartecipanti;
}

public int getNumPartecipanti() {
	return numPartecipanti;
}
public void setNumPartecipanti(int numPartecipanti) {
	this.numPartecipanti = numPartecipanti;
}
public Utente getUtente() {
	return utente;
}
public void setUtente(Utente utente) {
	this.utente = utente;
}
public Pacchetto getPacchetto() {
	return pacchetto;
}
public void setPacchetto(Pacchetto pacchetto) {
	this.pacchetto = pacchetto;
}
public boolean isConvalida() {
	return convalida;
}
public void setConvalida(boolean convalida) {
	this.convalida = convalida;
}
public double getPrezzoFinale() {
	return prezzoFinale;
}
public void setPrezzoFinale(double prezzoFinale) {
	this.prezzoFinale = prezzoFinale;
}
public long getId() {
	return id;
}


}
