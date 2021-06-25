import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DbHost {
    Map<Integer, Host> dbHost = new HashMap<>();

    public DbHost(Map<Integer, Host> dbHost) {
        this.dbHost = dbHost;
    }

    public Map<Integer, Host> getDbHost() {
        return dbHost;
    }

    public void setDbHost(Map<Integer, Host> dbHost) {
        this.dbHost = dbHost;
    }

    public void aggiungihost(Host host) {
        if (getDbHost().containsKey(host.getId())) {
            System.out.println("utente esistente");
        } else {
            getDbHost().put(host.getId(), host);
        }
    }

    public Host ricercahost(Integer id) {
        Host host = null;
        if (getDbHost().containsKey(id)) {
            host = getDbHost().get(id);
            System.out.println("Host trovato");
        } else
            System.out.println("Host non trovato");


        return host;
    }


    public Set<Abitazione> stampaAbitazioniHost(Integer idHost){ return getDbHost().get(idHost).getAbitazioni(); }

    public Set<Host> ricercaSuperHost() {
        Set<Host> superHostALL = new HashSet<>();
        for (Integer key : getDbHost().keySet()) {
            if(getDbHost().get(key).getTipo()==tipoHost.SUPER)
                superHostALL.add(getDbHost().get(key));
        }
        return superHostALL;
    }


    public Host majorHostPrenotazioni(DbAbitazione db){
      db.getPrenot
    } // host con più prenotazioni
}



