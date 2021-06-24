import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DbAbitazione {
    Map<Integer, Set<Prenotazione>> databaseAbitazione = new HashMap<Integer, Set<Prenotazione>>();

    public DbAbitazione(Map<Integer, Set<Prenotazione>> databaseAbitazione) {
        this.databaseAbitazione = databaseAbitazione;
    }

    public Map<Integer, Set<Prenotazione>> getDatabaseAbitazione() {
        return databaseAbitazione;
    }

    public void setDatabaseAbitazione(Map<Integer, Set<Prenotazione>> databaseAbitazione) {
        this.databaseAbitazione = databaseAbitazione;
    }

    public int numeroPrenotazioni(Integer key){
        return databaseAbitazione.get(key).size();
    }


    public int abitazioneGettonata(){
        int maxprenotazioni=0;
        int idgettonato=0;
            for (Integer integer : databaseAbitazione.keySet()) {
                if (numeroPrenotazioni(integer)>maxprenotazioni) {
                    maxprenotazioni = numeroPrenotazioni();
                    idgettonato = integer;
                }
            }
            return idgettonato;
        }
    }





}
