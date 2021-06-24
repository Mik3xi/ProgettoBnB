import java.util.Objects;

/*
    SPUNTI :
    1)ogni feedback sara lasicato da un utente
    2)Ogni feedback e' sara' associato ad un abitazione =>ID abitazione => id Utente
    3)Quindi Utente avra una collections dei suoi Feedback
 */
public class Feedback {
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public int getValutazione() {
        return valutazione.getValue();
    }
    public void setValutazione(Valutazione valutazione) {
        this.valutazione = valutazione;
    }
    //fine get/setter
    public Feedback aggiungivalutazione(String titolo, String id, String testo,Valutazione valutazione){

        return new Feedback( titolo,id, testo,valutazione);

    }
    //metodi to string e equals e compare to


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feedback)) return false;
        Feedback feedback = (Feedback) o;
        return Objects.equals(titolo, feedback.titolo) && Objects.equals(id, feedback.id) && Objects.equals(testo, feedback.testo) && valutazione == feedback.valutazione;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "titolo='" + titolo + '\'' +
                ", id='" + id + '\'' +
                ", testo='" + testo + '\'' +
                ", valutazione=" + valutazione +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(titolo, id, testo, valutazione);
    }

    private String titolo;
    private String id;
    private String testo;
    private Valutazione valutazione;


    public Feedback(String titolo, String id, String testo, Valutazione valutazione) {

        setId(id);
        setTesto(testo);
        setValutazione(valutazione);
        setTitolo(titolo);
    }

    enum Valutazione {
        //valutazione che prenderea in ingresso sempre un int(1-5) restituira valore del feedback
        PESSIMO(1), SCARSO(2), DISCRETO(3), BUONO(4), OTTIMO(5);
        private final int value;

        Valutazione(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }
}


