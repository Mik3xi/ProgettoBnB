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

    private String titolo;
    private String id;
    private String testo;
    private Valutazione valutazione;

    public Feedback(String titolo, String id, String testo) {

        setId(id);
        setTesto(testo);
        //setValutazione(valutazione);
        setTitolo(titolo);
    }

    private enum Valutazione {
        //valutazione che prenderea in ingresso sempre un int(1-5) restituira valore del feedback
        PESSIMO(1), SCARSO(2), DISCRETO(3), BUONO(4), OTTIMO(5);
        private final int value;

        private Valutazione(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }
}


