
import java.time.*;
import java.util.Date;
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

	public LocalDate getDataprenotazione() {
		return dataprenotazione;
	}

	public void setDataprenotazione(LocalDate dataprenotazione) {
		this.dataprenotazione = dataprenotazione;
	}

	private LocalDate dataprenotazione;
		private Date dataInizio,dataFine;
		private Abitazione home;
		private Host host;
		


	public Prenotazione(String idPrenotazione, Date dataInizio,Date dataFine,Abitazione home,Host host) {
		setAbitazione(home);
		setIdPrenotazione(idPrenotazione);
		setDataFine(dataFine);
		setDataInizio(dataInizio);
		setHost(host);


	}

	public String getIdPrenotazione() {
			
			return this.idPrenotazione;
		}
		
		

public Utente getHost() {
		
		return this.host;
	}




public Date getDataInizio() {

		return this.dataInizio;
	}
		




public Date getDataFine() {

		return this.dataFine;
	}



public Abitazione getAbitazione() {
		
		return this.home;
	}




public void setIdPrenotazione(String id) {
		 this.idPrenotazione = id;
	}




public void setDataInizio(Date data) {

		
		this.dataInizio = data;
	}




	public void setDataFine(Date data) {
		
		this.dataFine = data;
	}




	public void setAbitazione(Abitazione ab) {
		
		this.home = ab; 
	}



	public void setHost(Host host) {
		
		this.host = host;
	}
//POTENZIALE PROBLEMA CONTROLLARE EQUALS
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
	     if(this.getDataprenotazione().isAfter(o.getDataprenotazione()))
	     	return 1;
	     else
	     	return -1;
	}
}


