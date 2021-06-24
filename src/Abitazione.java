import java.util.UUID;

public class Abitazione {

    //ATTRIBUTI
    private String id;
    private String nome;
    private String indirizzi;
    private int numeroLocali;
    private int numeroPostiLetto;
    private int numeroPiano;


    //COSTRUTTORE
    public Abitazione(String id, String nome, String indirizzi, int numeroLocali, int numeroPostiLetto, int numeroPiano) {
        this.id = id;
        this.nome = nome;
        this.indirizzi = indirizzi;
        this.numeroLocali = numeroLocali;
        this.numeroPostiLetto = numeroPostiLetto;
        this.numeroPiano = numeroPiano;
    }

 //GETTER E SETTER
    public String getId() {
        return id;
    }

    public void setId() {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getIndirizzi() {
        return indirizzi;
    }

    public void setIndirizzi(String indirizzi) {
        this.indirizzi = indirizzi;
    }


    public int getNumeroLocali() {
        return numeroLocali;
    }

    public void setNumeroLocali(int numeroLocali) {
        this.numeroLocali = numeroLocali;
    }


    public int getNumeroPostiLetto() {
        return numeroPostiLetto;
    }

    public void setNumeroPostiLetto(int numeroPostiLetto) {
        this.numeroPostiLetto = numeroPostiLetto;
    }


    public int getNumeroPiano() {
        return numeroPiano;
    }

    public void setNumeroPiano(int numeroPiano) {
        this.numeroPiano = numeroPiano;
    }

    @Override
    public String toString() {
        return "Abitazione{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", indirizzi='" + indirizzi + '\'' +
                ", numeroLocali=" + numeroLocali +
                ", numeroPostiLetto=" + numeroPostiLetto +
                ", numeroPiano=" + numeroPiano +
                '}';
    }
}
