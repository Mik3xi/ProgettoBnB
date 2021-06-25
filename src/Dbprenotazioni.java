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
        if(check(dataarrivo,datapartenza)) {

            //se non esiste una chiave quindi l'utente in prenotazini allora mi crei tutto
            if (!getPrenotazioni().containsKey(id)) {
                HashSet<Prenotazione> pren = new HashSet<>();
                //crea nuova prenotazione
                //Data partenza data arrivo e ID OK
                //Come accedere ad Abitazione da affitare?
                Prenotazione pre = new Prenotazione(id_Prenotazione, dataarrivo, datapartenza, abitazione, datadiprenotazione);
                pren.add(pre);
                getPrenotazioni().put(id, pren);
                System.out.println("Utente " + id + " ha nuova prenotazione");
            } else {
                Prenotazione pre = new Prenotazione(id_Prenotazione, dataarrivo, datapartenza, abitazione, datadiprenotazione);
                ;
                getPrenotazioni().get(id).add(pre);

            }
        }
        else
            System.out.println("Abitazione non disponibile per quel periodo");
        aggiungiprenotazione(id,abitazione);
    }
    public boolean check(Date dataarrivo,Date datapartenza){
        //immagina di avere la chiave id come se fosse l'utente
        Iterator<Map.Entry<Integer,HashSet<Prenotazione>>> itr1=getPrenotazioni().entrySet().iterator();
        boolean flag=false;
        while ((itr1.hasNext())){
            Map.Entry<Integer,HashSet<Prenotazione>> entry=itr1.next();
            Iterator<Prenotazione> itr2=entry.getValue().iterator();
            while (itr2.hasNext()){
                Date dArrivo= itr2.next().getDataInizio();//data arrivo ricavato dalla mappa
                Date dPartenza= itr2.next().getDataFine();//data partenza ricavato dalla mappa
                if(datapartenza.equals(dPartenza)&& dataarrivo.equals(dArrivo) && dataarrivo.after(dArrivo)&&datapartenza.before(dPartenza) && datapartenza.before(dArrivo))
                    return flag=false;
                else
                    return flag=true;



            }

        }
        return flag;

    }
    public void utentipiuattivi() {
        //chiave giorni valore utente
        TreeMap<Integer,Integer> classificautentiattivi=new TreeMap<>();
        //immagina di avere la chiave id come se fosse l'utente
        Iterator<Map.Entry<Integer, HashSet<Prenotazione>>> itr1 = getPrenotazioni().entrySet().iterator();
        //creo oggetto iterator
        boolean flag = false;
        while ((itr1.hasNext())) {
            Map.Entry<Integer, HashSet<Prenotazione>> entry = itr1.next();
            Iterator<Prenotazione> itr2 = entry.getValue().iterator();
            while (itr2.hasNext()) {
                Calendar dArrivo = new GregorianCalendar();
                Calendar dpartenza = new GregorianCalendar();
                dArrivo.setTime(itr2.next().getDataInizio());
                dpartenza.setTime(itr2.next().getDataFine());
                int giorni = dpartenza.get(Calendar.DAY_OF_MONTH) - dArrivo.get(Calendar.DAY_OF_MONTH);
                classificautentiattivi.put(giorni, itr1.next().getKey());
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(classificautentiattivi.lastEntry());
                classificautentiattivi.remove(classificautentiattivi.lastKey());
            }
        }

    }

}
//fine