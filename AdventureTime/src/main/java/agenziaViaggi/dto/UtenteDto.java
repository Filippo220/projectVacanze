package agenziaViaggi.dto;

import java.util.Objects;

public class UtenteDto {
	private String nome, cognome, emailAddress, password;
	private int eta, phoneNumber, promoCounter;
	private boolean admin, enabled;
	public UtenteDto() {
	}
	public UtenteDto(String nome, String cognome, String emailAddress, String password, int eta, int phoneNumber,
			int promoCounter, boolean admin, boolean enabled) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.emailAddress = emailAddress;
		this.password = password;
		this.eta = eta;
		this.phoneNumber = phoneNumber;
		this.promoCounter = promoCounter;
		this.admin = admin;
		this.enabled = enabled;
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
	public void setPassword(String password) {
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
		return Objects.hash(admin, cognome, emailAddress, enabled, eta, nome, password, phoneNumber, promoCounter);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UtenteDto other = (UtenteDto) obj;
		return admin == other.admin && Objects.equals(cognome, other.cognome)
				&& Objects.equals(emailAddress, other.emailAddress) && enabled == other.enabled && eta == other.eta
				&& Objects.equals(nome, other.nome) && Objects.equals(password, other.password)
				&& phoneNumber == other.phoneNumber && promoCounter == other.promoCounter;
	}
	@Override
	public String toString() {
		return "UtenteDto [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
	
}
