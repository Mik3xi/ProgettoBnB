
public class Utente {

    //ATTRIBUTI
    private String id;
    private String nome;
    private String cognome;
    private String indirizzoEmail;




    //GETTER AND SETTER
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

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
