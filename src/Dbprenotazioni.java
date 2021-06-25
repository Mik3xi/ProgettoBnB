import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Dbprenotazioni {
    //Mappa con key=> Id utente e Treset Di prenotazioni
    // CAMBIO DA TREESET A HASHSET
    // PER ACCEDERE ALL ULTIMA PRENOTAZIONE DELL'UTENTE UTILIZIAMO IL SUO ATTRIBUTO CODA
    private HashMap<Integer, HashSet<Prenotazione>> prenotazioni=new HashMap<>();
    //GETTER && SETTER
    public HashMap<Integer, HashSet<Prenotazione>> getPrenotazioni() { return prenotazioni; }
    public void setPrenotazioni(HashMap<Integer, HashSet<Prenotazione>> prenotazioni) { this.prenotazioni = prenotazioni; }
    //CRUD
    public void aggiungiprenotazione(Integer id,Abitazione abitazione) throws ParseException {
        LocalDate datadiprenotazione = LocalDate.now();
        System.out.println("Inserisci la data di Arrivo");
        Scanner sc=new Scanner(System.in);
        String arrivo=sc.nextLine();
        Date datapartenza= new SimpleDateFormat("dd/MM/yyyy").parse(arrivo);
        System.out.println("Inserisci la data di Partenza");
        Scanner sc1=new Scanner(System.in);
        String partenza=sc1.nextLine();
        Date dataarrivo= new SimpleDateFormat("dd/MM/yyyy").parse(partenza);
        //NB data arrivo e partenza sono Tipo DATE
        System.out.println("inserisci id prenotazione");
        Scanner sc12=new Scanner(System.in);
        String id_Prenotazione= sc12.nextLine();

        //se non esiste una chiave quindi l'utente in prenotazini allora mi crei tutto
        if(! getPrenotazioni().containsKey(id))
        {
          HashSet<Prenotazione> pren = new HashSet<>();
          //crea nuova prenotazione
            //Data partenza data arrivo e ID OK
            //Come accedere ad Abitazione da affitare?
             Prenotazione pre = new Prenotazione(id_Prenotazione, dataarrivo, datapartenza,abitazione,datadiprenotazione);
          pren.add(pre);
          getPrenotazioni().put(id, pren);
          System.out.println("Utente "+id+" ha nuova prenotazione");
        }
        else
        {
          Prenotazione pre = new Prenotazione(id_Prenotazione, dataarrivo, datapartenza,abitazione,datadiprenotazione);;
           getPrenotazioni().get(id).add(pre);

      }

    }

}
