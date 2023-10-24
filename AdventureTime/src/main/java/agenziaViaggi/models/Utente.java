package agenziaViaggi.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Utenti")
public class Utente {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_utente")
private long id;
private String nome, cognome, emailAddress, password;
private int eta, phoneNumber, promoCounter;
private boolean admin, enabled;
	
public Utente() {}

public Utente(String nome, String cognome, String emailAddress, String password, int eta, int phoneNumber) {
	this.nome = nome;
	this.cognome = cognome;
	this.emailAddress = emailAddress;
	this.password = password;
	this.eta = eta;
	this.phoneNumber = phoneNumber;
	this.admin = false;
	this.enabled = true;
	this.promoCounter = 0;
	
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
}

public String getEmailAddress() {
	return emailAddress;
}

public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}

public String getPassword() {
	return password;
}

public void changePassword(String password) {
	this.password = password;
}

public int getEta() {
	return eta;
}

public void setEta(int eta) {
	this.eta = eta;
}

public int getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public int getPromoCounter() {
	return promoCounter;
}

public void setPromoCounter(int promoCounter) {
	this.promoCounter = promoCounter;
}

public boolean isAdmin() {
	return admin;
}

public void setAdmin(boolean admin) {
	this.admin = admin;
}

public boolean isEnabled() {
	return enabled;
}

public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}

@Override
public int hashCode() {
	return Objects.hash(admin, cognome, emailAddress, enabled, eta, id, nome, password, phoneNumber, promoCounter);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Utente other = (Utente) obj;
	return admin == other.admin && Objects.equals(cognome, other.cognome)
			&& Objects.equals(emailAddress, other.emailAddress) && enabled == other.enabled && eta == other.eta
			&& id == other.id && Objects.equals(nome, other.nome) && Objects.equals(password, other.password)
			&& phoneNumber == other.phoneNumber && promoCounter == other.promoCounter;
}

@Override
public String toString() {
	return "Utente [nome=" + nome + ", cognome=" + cognome + "]";
}

public void enabled() {
	this.setEnabled(true);
}
public boolean isValidPassword(String password) {
	if (this.password == password)
		return true;
	return false;
}



}
