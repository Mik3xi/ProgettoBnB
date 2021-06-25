import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainBnb {

    public static Scanner scan = new Scanner(System.in);
    private static int UoH; //Per riconoscere se sono autenticato come utente o host

    private static DbUtente dbUtenti;
    private static DbHost dbHost;
    private static DbAbitazione dbAbitazioni;


    public static void main(String[] args) {

        dbUtenti = new DbUtente(popolaDbUtenti());
        dbHost = new DbHost(popolaDbHost());
        dbAbitazioni = new DbAbitazione(popolaDbAbitazioni());

        System.out.println("--------- Benvenuto in RoomOneBnb! --------- ");
        System.out.println("\nCosa vuoi fare? \n1. Effettua il Login\n2. Registrati\n3. Esci");  //Login come utente,host, admin(?) per la varie funzioni.
        int scelta;
        Scanner scan1 = new Scanner(System.in);
        scelta = scan1.nextInt();


        switch(scelta) {
            case 1:
                autenticazione();
                break;
            case 2:
                registraNuovoUtente();
                break;
            case 3:
                System.out.println("Arrivederci!");
                break;
        }

        if(UoH == 1){
            //Switch con quello che può fare un utente
        }
        else if(UoH == 2){
            //Switch con quello che può fare un host

        }

    }


    public static HashMap<Integer,Utente> popolaDbUtenti(){

        Utente u1 = new Utente("Michele","Liccardo","mik3xi@live.it","Mik3xi","treeschool50");
        Utente u2 = new Utente("Agostino","Nicotra","agonick@gmail.com","agonick","treeschool51");
        Utente u3 = new Utente("Ange","Kadja","ange237@live.it","ange237","treeschool52");
        Utente u4 = new Utente("Ruben","La Rocca","quelbaffobastardo@yahoo.it","quelbaffo","treeschool53");
        Utente u5 = new Utente("Michela","D'avino","mikadd@hotmail.it","mikadd","treeschool54");

        Integer id1 = u1.getId();
        Integer id2 = u2.getId();
        Integer id3 = u3.getId();
        Integer id4 = u4.getId();
        Integer id5 = u5.getId();

        HashMap<Integer,Utente> insiemeDiUtenti= new HashMap<>();

        insiemeDiUtenti.put(id1,u1);
        insiemeDiUtenti.put(id2,u2);
        insiemeDiUtenti.put(id3,u3);
        insiemeDiUtenti.put(id4,u4);
        insiemeDiUtenti.put(id5,u5);

        return insiemeDiUtenti;
    }

    public static HashMap<Integer,Host> popolaDbHost(){

        Host h1 = new Host("Melvin","Massotti","melvmass@live.it","Melvmass","treeschool55");
        Host h2 = new Host("Riccardo","Pozzati","riccpozz@gmail.com","Riccpozz","treeschool56");
        Host h3 = new Host("Andrea","Rosati","andreros@gmail.com","Jaeger","treeschool57");

        Integer id1 = h1.getId();
        Integer id2 = h2.getId();
        Integer id3 = h3.getId();

        HashMap<Integer,Host> insiemeDiHost= new HashMap<>();

        insiemeDiHost.put(id1,h1);
        insiemeDiHost.put(id2,h2);
        insiemeDiHost.put(id3,h3);

        return insiemeDiHost;
    }

    public static HashMap<Integer,Abitazione> popolaDbAbitazioni(){

        HashMap<Integer,Abitazione> insiemeDiAbitazioni = new HashMap<>();

        Abitazione a1 = new Abitazione("Casa stupenda","Via Napoli 45",3,4,2);
        Abitazione a2 = new Abitazione("Casa stupendissima","Via Lazio 12",2,3,1);
        Abitazione a3 = new Abitazione("Casa bruttina","Via Roma 23",1,2,1);
        Abitazione a4 = new Abitazione("Casa da paura","Via Napoli 2",4,6,3);

        Integer id1 = a1.getId();
        Integer id2 = a2.getId();
        Integer id3 = a3.getId();
        Integer id4 = a4.getId();

        insiemeDiAbitazioni.put(id1,a1);
        insiemeDiAbitazioni.put(id2,a2);
        insiemeDiAbitazioni.put(id3,a3);
        insiemeDiAbitazioni.put(id4,a4);

        return insiemeDiAbitazioni;
    }


    public static void registraNuovoUtente(){

        System.out.println("Inserisci il tuo nome: ");
        String nome = scan.nextLine();
        System.out.println("Inserisci il tuo cognome: ");
        String cognome = scan.nextLine();
        System.out.println("Inserisci il tuo indirizzo e-mail: ");
        String email = scan.nextLine();
        System.out.println("Scegli il tuo username: ");  //Andrebbe gestito il formato, ma soprattutto se è gia presente quell'username
        String username = scan.nextLine();
        System.out.println("Scegli una password: ");  //Andrebbe gestito il formato (Minuscola,maiuscola,numero,min 8 char)
        String password = scan.nextLine();
        System.out.println("Vuoi registrarti come utente o come host?");
        String scelta = scan.nextLine();
        if(scelta.equals("utente")){
            Utente u = new Utente(nome,cognome,email,username,password);
            dbUtenti.aggiungiutente(u);
            System.out.println("Complimenti, ti sei registrato con successo come utente!");
        }
        else if (scelta.equals("host")){
            Host h = new Host(nome,cognome,email,username,password);
            dbHost.aggiungihost(h);
            System.out.println("Complimenti, ti sei registrato con successo come host!");
        }
    }

    public static boolean autenticazione(){

        Utente u = null;
        Boolean flag = false;

        while(!flag) {

            System.out.println("Inserisci l'username: ");
            String username = scan.nextLine();

            //RICERCA DB UTENTI
            for (Map.Entry<Integer, Utente> entry : dbUtenti.getDatabaseUtente().entrySet()) {
                if (entry.getValue().getUsername().equals(username)) {
                    u = entry.getValue();
                    flag = true;
                    UoH = 1;
                    break;
                }
            }

            //RICERCA DB HOST
            for (Map.Entry<Integer, Host> entry : dbHost.getDbHost().entrySet()) {
                if (entry.getValue().getUsername().equals(username)) {
                    u = entry.getValue();
                    flag = true;
                    UoH = 2;
                    break;
                }
            }

            if(!flag){
                System.out.println("Username inesistente!");
            }

        }


        System.out.println("Inserisci la password: ");
        String psw = scan.nextLine();
        while(!(u.getPassword().equals(psw))){
            System.out.println("Password errata! Riprova: ");
            psw = scan.nextLine();
        }
        System.out.println("Bentornato " + u.getNome() + "!");
        return true;
    }

    public static void effettuaPrenotazione(){

        //Inserisci data inizio e fine che ti interessa
        //Mostra le abitazioni disponibili per quell'intervallo (prezzo etc.)
        //Dare la possibilità di sceglierne una e confermare
        //A questo punto crea l'oggetto prenotazione
        //Aggiungi la prenotazione nel set dell'utente che ha prenotato
        //Aggiungi la prenotazione al Db delle prenotazioni

    }

}


