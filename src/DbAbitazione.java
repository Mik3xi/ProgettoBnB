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

    public void rilevaPrenotazioni(Integer key){
        databaseAbitazione.get(key);
    }


}
