import java.util.HashMap;

public class DbUtente {
    HashMap <String,Utente> databaseUtente = new HashMap<>();

    public DbUtente(HashMap<String, Utente> databaseUtente) {
        this.databaseUtente = databaseUtente;
    }

    public HashMap<String, Utente> getDatabaseUtente() {
        return databaseUtente;
    }

    public void setDatabaseUtente(HashMap<String, Utente> databaseUtente) {
        this.databaseUtente = databaseUtente;
    }

    public Utente rilevaUtente(String key){
        return databaseUtente.get(key);
    }


}
