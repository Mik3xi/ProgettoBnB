import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DbAbitazione {
    private Map<Integer, Set<Prenotazione>> prenotazioniSuAbitazione = new HashMap<Integer, Set<Prenotazione>>();
    private Map<Integer, Abitazione> databaseAbitazioni = new HashMap<>();

    public DbAbitazione(Map<Integer, Set<Prenotazione>> databasePrenotazione, Map<Integer, Abitazione> databaseAbitazioni) {
        this.prenotazioniSuAbitazione = databasePrenotazione;
        this.databaseAbitazioni = databaseAbitazioni;
    }

    // getters and setters
    public Map<Integer, Set<Prenotazione>> getDatabaseAbitazione() {
        return prenotazioniSuAbitazione;
    }

    public void setDatabaseAbitazione(Map<Integer, Set<Prenotazione>> databaseAbitazione) {
        this.prenotazioniSuAbitazione = databaseAbitazione;
    }

    public Map<Integer, Abitazione> getDatabaseAbitazioni() {
        return databaseAbitazioni;
    }

    public void setDatabaseAbitazioni(Map<Integer, Abitazione> databaseAbitazioni) {
        this.databaseAbitazioni = databaseAbitazioni;
    }

    public int numeroPrenotazioni(Integer key){ // ritorna il numero di prenotazioni totali di un abitazioni
        return prenotazioniSuAbitazione.get(key).size();
    }

    public ArrayList<Abitazione> abitazioneGettonataDelMese(){ // ritorna l'abitazione gettonata del mese corrente

        ArrayList<Prenotazione> prenotazioniLastMonth = new ArrayList<>();
        int maxprenotazioni = 0;
        ArrayList<Integer> idgettonato = new ArrayList<>();
        ArrayList<Abitazione> abitazioneGettonata = new ArrayList<>();
            for (Integer integer : prenotazioniSuAbitazione.keySet()) {
            for (Prenotazione prenotazione : prenotazioniSuAbitazione.get(integer)) {
                if(prenotazione.getDataInizio().getMonth().equals(LocalDate.now().getMonth())) // controllo del mese
                        prenotazioniLastMonth.add(prenotazione);
            }
            if(prenotazioniLastMonth.size()>=maxprenotazioni && maxprenotazioni!=0) {
                maxprenotazioni = prenotazioniLastMonth.size();
                idgettonato.add(integer);
            } else prenotazioniLastMonth.clear();
            }

            for (Integer integer : idgettonato)
            abitazioneGettonata.add(getDatabaseAbitazioni().get(idgettonato));
            return abitazioneGettonata;
    }




}








