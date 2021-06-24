import java.util.HashSet;
import java.util.Set;

public class Host extends Utente{

    private static int codiceHostProgressivo = 1;
    private int codiceHost;
    private tipoHost tipo;
    private Set<Abitazione> abitazioni;

    //COSTRUTTORE
    public Host(String nome, String cognome, String indirizzoEmail, String username, String password) {
        super(nome, cognome, indirizzoEmail,username,password);
        setCodiceHost();
        setTipo(tipoHost.SEMPLICE); //Di default un nuovo Host ha 0 prenotazioni
        setAbitazioni();
    }

    public int getCodiceHost() { return codiceHost; }
    public void setCodiceHost() { this.codiceHost = codiceHostProgressivo++; }

    public tipoHost getTipo() { return tipo; }
    public void setTipo(tipoHost tipo) { this.tipo = tipo; }

    public Set<Abitazione> getAbitazioni() { return abitazioni; }
    public void setAbitazioni() { this.abitazioni = new HashSet<Abitazione>();}

}

enum tipoHost{
    SEMPLICE,SUPER;
}