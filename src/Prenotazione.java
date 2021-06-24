
import java.time.*;
public class Prenotazione {
	
	
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
		private Utente user;
		
		
		
public String getIdPrenotazione() {
			
			return this.idPrenotazione;
		}
		
		

public Utente getUtente() {
		
		return this.user;
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



	public void setUtente(Utente ut) {
		
		this.user = ut;
	}

	}


