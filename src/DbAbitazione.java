import java.util.HashMap;
import java.util.Set;

public class DbAbitazione {
    HashMap<String, Set<Prenotazione>> databaseAbitazione = new HashMap<String, Set<Prenotazione>();

    public DbAbitazione(HashMap<String, Set<Prenotazione>> databaseAbitazione) {
        this.databaseAbitazione = databaseAbitazione;
    }

    public HashMap<String, Set<Prenotazione>> getDatabaseAbitazione() {
        return databaseAbitazione;
    }

    public void setDatabaseAbitazione(HashMap<String, Set<Prenotazione>> databaseAbitazione) {
        this.databaseAbitazione = databaseAbitazione;
    }

    public void rilevaPrenotazioni(String key){
        databaseAbitazione.get(key);
    }
}
