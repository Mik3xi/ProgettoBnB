
import java.time.*;
import java.util.Objects;

public class Prenotazione implements Comparable<Prenotazione>{
	
	
	/**
	 * id
	 * datainizio
	 * datafine
	 * utente
	 * abitazione
	 *
	 */
		private String idPrenotazione;
		private LocalDate dataInizio,dataFine;
		private Abitazione home;
		private Host host;
		
		
		
public String getIdPrenotazione() {
			
			return this.idPrenotazione;
		}
		
		

public Utente getHost() {
		
		return this.host;
	}




public LocalDate getDataInizio() {

		return this.dataInizio;
	}
		




public LocalDate getDataFine() {

		return this.dataFine;
	}



public Abitazione getAbitazione() {
		
		return this.home;
	}




public void setIdPrenotazione(String id) {
		 this.idPrenotazione = id;
	}




public void setDataInizio(LocalDate data) {
		
		this.dataInizio = data;
	}




	public void setDataFine(LocalDate data) {
		
		this.dataFine = data;
	}




	public void setAbitazione(Abitazione ab) {
		
		this.home = ab; 
	}



	public void setHost(Host host) {
		
		this.host = host;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Prenotazione)) return false;
		Prenotazione that = (Prenotazione) o;
		return Objects.equals(idPrenotazione, that.idPrenotazione) && Objects.equals(dataInizio, that.dataInizio) && Objects.equals(dataFine, that.dataFine) && Objects.equals(home, that.home) && Objects.equals(host, that.host);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPrenotazione, dataInizio, dataFine, home, host);
	}

	@Override
	public int compareTo(Prenotazione o) {
	     if(this.getDataInizio().isAfter(o.getDataInizio()))
	     	return 1;
	     else
	     	return -1;
	}
}


