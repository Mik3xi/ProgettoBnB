import java.util.Deque;
import java.util.UUID;

public class Utente{

    //ATTRIBUTI
    private int id;
    private static int idProgressivo = 1;
    private String nome;
    private String cognome;
    private String indirizzoEmail;
    //private Deque<Prenotazione> prenotazioni; //Possiamo accedere così in politica LIFO con PeekLast

    //COSTRUTTORE
    public Utente(String nome, String cognome, String indirizzoEmail) {
        setId();
        setNome(nome);
        setCognome(cognome);
        setIndirizzoEmail(indirizzoEmail);
    }

    //GETTER AND SETTER
    public int getId() { return id; }
    public void setId() { this.id = idProgressivo++; }

    public String getNome() { return nome; }
    public void setNome(String nome) {
        //Gestire eccezioni formato non valido (null/simboli/numeri)
        this.nome = nome;
    }

    public String getCognome() { return cognome; }
    public void setCognome(String cognome) {
        //Gestire eccezioni formato non valido (null/simboli/numeri)
        this.cognome = cognome;
    }

    public String getIndirizzoEmail() { return indirizzoEmail;}
    public void setIndirizzoEmail(String indirizzoEmail) {
        //Gestire eccezioni formato non valido (null/ formati diversi da ******@*****.it/com/org ...etc)
        this.indirizzoEmail = indirizzoEmail;
    }

}
