import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DbAbitazione {
    private Map<Integer, Set<Prenotazione>> databasePrenotazione = new HashMap<Integer, Set<Prenotazione>>();
    private Map<Integer, Abitazione>  databaseAbitazioni = new HashMap<>();

    public DbAbitazione(Map<Integer, Set<Prenotazione>> databaseAbitazione) {
        this.databasePrenotazione = databaseAbitazione;
    }

    public Map<Integer, Set<Prenotazione>> getDatabaseAbitazione() {
        return databasePrenotazione;
    }

    public void setDatabaseAbitazione(Map<Integer, Set<Prenotazione>> databaseAbitazione) {
        this.databasePrenotazione = databaseAbitazione;
    }

    public Map<Integer, Abitazione> getDatabaseAbitazioni() {
        return databaseAbitazioni;
    }

    public void setDatabaseAbitazioni(Map<Integer, Abitazione> databaseAbitazioni) {
        this.databaseAbitazioni = databaseAbitazioni;
    }

    public int numeroPrenotazioni(Integer key){
        return databasePrenotazione.get(key).size();
    }


    public Abitazione abitazioneGettonata(){
        ArrayList<Prenotazione> prenotazioniLastMonth = new ArrayList<>();
        int maxprenotazioni=0;
        ArrayList<Integer> idgettonato= new ArrayList<>();
            for (Integer integer : databasePrenotazione.keySet()) {
            for (Prenotazione prenotazione : databasePrenotazione.get(integer)) {
                if(prenotazione.getDataInizio().getMonth().equals(LocalDate.now().getMonth())) // controllo del mese
                        prenotazioniLastMonth.add(prenotazione);
            }
            if(prenotazioniLastMonth.size()>=maxprenotazioni && maxprenotazioni!=0) {
                maxprenotazioni = prenotazioniLastMonth.size();
                idgettonato.add(integer);
            } else prenotazioniLastMonth.clear();
            }
            return databaseAbitazioni.get(idgettonato);
    }





}
