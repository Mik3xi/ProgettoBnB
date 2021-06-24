import java.util.UUID;

public class Host extends Utente{

    private String codiceHost;
    private tipoHost tipo;

    //COSTRUTTORE
    public Host(String nome, String cognome, String indirizzoEmail) {
        super(nome, cognome, indirizzoEmail);
        setCodiceHost();
        setTipo(tipoHost.SEMPLICE); //Di default un nuovo Host ha 0 prenotazioni
    }

    public String getCodiceHost() { return codiceHost; }
    public void setCodiceHost() { this.codiceHost = UUID.randomUUID().toString(); }

    public tipoHost getTipo() { return tipo; }
    public void setTipo(tipoHost tipo) { this.tipo = tipo; }

}
enum tipoHost{
    SEMPLICE,SUPER;
}