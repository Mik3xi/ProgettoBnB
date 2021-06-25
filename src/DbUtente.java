import java.util.HashMap;
import java.util.Map;

public class DbUtente {
    Map<Integer,Utente> databaseUtente = new HashMap<>();


    public DbUtente(Map<Integer, Utente> databaseUtente) {
        this.databaseUtente = databaseUtente;
    }

    public Map<Integer, Utente> getDatabaseUtente() {
        return databaseUtente;
    }

    public void setDatabaseUtente(Map<Integer, Utente> databaseUtente) {
        this.databaseUtente = databaseUtente;
    }

    public Utente rilevaUtente(Integer key){
        return databaseUtente.get(key);
    }
    public void aggiungiutente(Utente ut){
        getDatabaseUtente().put(ut.getId(),ut);
    }






}
