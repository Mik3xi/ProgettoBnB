import java.util.HashMap;
import java.util.Map;

public class DbHost {
    Map<Integer,Host> dbHost = new HashMap<>();

    public DbHost(Map<Integer, Host> dbHost) {
        this.dbHost = dbHost;
    }

    public Map<Integer, Host> getDbHost() {
        return dbHost;
    }

    public void setDbHost(Map<Integer, Host> dbHost) {
        this.dbHost = dbHost;
    }

    public void aggiungihost(Host host){
        if (getDbHost().containsKey(host.getId())){
            System.out.println("utente esistente");
        }
        else {
            getDbHost().put(host.getId(), host);
        }
    }
    public Host ricercahost(Integer id){
        Host host= null;
        if(getDbHost().containsKey(id)){
             host= getDbHost().get(id);
            System.out.println("Host trovato");
        }
        else
            System.out.println("Host non trovato");


        return host;

    }



}
