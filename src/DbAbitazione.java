import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DbAbitazione {
    Map<String, Set<Prenotazione>> databaseAbitazione = new HashMap<String, Set<Prenotazione>>();

    public DbAbitazione(Map<String, Set<Prenotazione>> databaseAbitazione) {
        this.databaseAbitazione = databaseAbitazione;
    }

    public Map<String, Set<Prenotazione>> getDatabaseAbitazione() {
        return databaseAbitazione;
    }

    public void setDatabaseAbitazione(Map<String, Set<Prenotazione>> databaseAbitazione) {
        this.databaseAbitazione = databaseAbitazione;
    }

    public void rilevaPrenotazioni(String key){
        databaseAbitazione.get(key);
    }


}
