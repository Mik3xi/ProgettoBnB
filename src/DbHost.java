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



}
