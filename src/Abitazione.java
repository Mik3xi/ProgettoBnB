import java.util.Objects;
import java.util.UUID;

public class Abitazione{

    //ATTRIBUTI
    private int id;
    private String nome;
    private String indirizzi;
    private int numeroLocali;
    private int numeroPostiLetto;
    private int numeroPiano;

    private static int idProgressivo = 1;


    //COSTRUTTORE
    public Abitazione(String nome, String indirizzi, int numeroLocali, int numeroPostiLetto, int numeroPiano) {
        this.id = id;
        this.nome = nome;
        this.indirizzi = indirizzi;
        this.numeroLocali = numeroLocali;
        this.numeroPostiLetto = numeroPostiLetto;
        this.numeroPiano = numeroPiano;
    }

 //GETTER E SETTER
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = idProgressivo++;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abitazione that = (Abitazione) o;
        return id == that.id && numeroLocali == that.numeroLocali && numeroPostiLetto == that.numeroPostiLetto && numeroPiano == that.numeroPiano && Objects.equals(nome, that.nome) && Objects.equals(indirizzi, that.indirizzi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, indirizzi, numeroLocali, numeroPostiLetto, numeroPiano);
    }
}
