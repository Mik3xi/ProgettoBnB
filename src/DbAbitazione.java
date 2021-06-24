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
        int maxprenotazioni=0;
        int idgettonato=0;
            for (Integer integer : databasePrenotazione.keySet()) {
                if (numeroPrenotazioni(integer)>maxprenotazioni) {
                    maxprenotazioni = numeroPrenotazioni();
                    idgettonato = integer;
                }
            }
            return databaseAbitazioni.get(idgettonato);
        }

    }





}
