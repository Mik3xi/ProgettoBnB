import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Dbprenotazioni {
    //Mappa con key=> Id utente e Treset Di prenotazioni
    // SPunto da concordare =>Treset di prenotazioni per ordinare in base alla Data
    //  OK treSet RICORDA di utilizzare iterator per implementazione
    private HashMap<Integer, TreeSet<Prenotazione>> prenotazioni=new HashMap<>();
    //GETTER && SETTER
    public HashMap<Integer, TreeSet<Prenotazione>> getPrenotazioni() { return prenotazioni; }
    public void setPrenotazioni(HashMap<Integer, TreeSet<Prenotazione>> prenotazioni) { this.prenotazioni = prenotazioni; }
    //CRUD
    public void aggiungiprenotazione(Integer id,Prenotazione prenotazione){

        TreeSet<Prenotazione> pren=new TreeSet<>();
        Iterator<Prenotazione>iter=pren.iterator();
        //crea nuova prenotazione
        Prenotazione pre= new Prenotazione ();
        //getPrenotazioni().put(id,pren.add(prenotazione));
    }

}
