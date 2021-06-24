import java.util.HashMap;
import java.util.Map;

public class DbUtente {
    Map<String,Utente> databaseUtente = new HashMap<>();

    public DbUtente(Map<String, Utente> databaseUtente) {
        this.databaseUtente = databaseUtente;
    }

    public Map<String, Utente> getDatabaseUtente() {
        return databaseUtente;
    }

    public void setDatabaseUtente(Map<String, Utente> databaseUtente) {
        this.databaseUtente = databaseUtente;
    }

    public Utente rilevaUtente(String key){
        return databaseUtente.get(key);
    }





}
