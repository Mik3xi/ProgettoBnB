import java.util.HashMap;

public class DbAbitazione {
    HashMap<String, Abitazione> databaseAbitazione = new HashMap<String, Abitazione>();

    public DbAbitazione(HashMap<String, Abitazione> databaseAbitazione) {
        this.databaseAbitazione = databaseAbitazione;
    }

    public HashMap<String, Abitazione> getDatabaseAbitazione() {
        return databaseAbitazione;
    }

    public void setDatabaseAbitazione(HashMap<String, Abitazione> databaseAbitazione) {
        this.databaseAbitazione = databaseAbitazione;
    }

    public void rilevaAbitazione(String key){
        databaseAbitazione.get(key);
    }
}
