import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DbAbitazione {
    private Map<Integer, Set<Prenotazione>> PrenotazioniPerAbitazione = new HashMap<Integer, Set<Prenotazione>>();  // key id abitazione value: set prenotazioni
    private Map<Integer, Abitazione> databaseAbitazioni = new HashMap<>(); // key: id abitazione value: abitazione

    public DbAbitazione( Map<Integer, Abitazione> databaseAbitazioni) {
        this.databaseAbitazioni = databaseAbitazioni;
    }


    // getters and setters
    public Map<Integer, Set<Prenotazione>> getPrenotazioniPerAbitazione() {
        return PrenotazioniPerAbitazione;
    }

    public void setPrenotazioniPerAbitazione(Map<Integer, Set<Prenotazione>> databaseAbitazione) {
        this.PrenotazioniPerAbitazione = databaseAbitazione;
    }

    public Map<Integer, Abitazione> getDatabaseAbitazioni() {
        return databaseAbitazioni;
    }

    public void setDatabaseAbitazioni(Map<Integer, Abitazione> databaseAbitazioni) {
        this.databaseAbitazioni = databaseAbitazioni;
    }

    public int numeroPrenotazioni(Integer key){ // ritorna il numero di prenotazioni totali di un abitazioni
        return PrenotazioniPerAbitazione.get(key).size();
    }

    public ArrayList<Abitazione> abitazioneGettonataDelMese(){ // ritorna l'abitazione gettonata del mese corrente

        ArrayList<Prenotazione> prenotazioniLastMonth = new ArrayList<>();
        int maxprenotazioni = 0;
        ArrayList<Integer> idgettonato = new ArrayList<>();
        ArrayList<Abitazione> abitazioneGettonata = new ArrayList<>();
            for (Integer integer : PrenotazioniPerAbitazione.keySet()) {
            for (Prenotazione prenotazione : PrenotazioniPerAbitazione.get(integer)) {
                if(prenotazione.getDataprenotazione().getMonth().equals(LocalDate.now().getMonth())) // controllo del mese
                        prenotazioniLastMonth.add(prenotazione);
            }
            if(prenotazioniLastMonth.size()>=maxprenotazioni && maxprenotazioni!=0) {
                maxprenotazioni = prenotazioniLastMonth.size();
                idgettonato.add(integer);
            } else prenotazioniLastMonth.clear();
            }

            for (Integer integer : idgettonato)
            abitazioneGettonata.add(getDatabaseAbitazioni().get(idgettonato));
            return abitazioneGettonata;
    }

    public int mediaPostiLetto(){
        int sum=0;
        int cont=0;
        int media; // non float perché mezzo letto non mi piace
        for (Integer key : getDatabaseAbitazioni().keySet()) {
            sum+=getDatabaseAbitazioni().get(key).getNumeroPostiLetto();
            cont++;
        }
        return media=sum/cont;
    }




}








