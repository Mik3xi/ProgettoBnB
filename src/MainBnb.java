import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainBnb {

    public static Scanner scan = new Scanner(System.in);
    private static DbUtente dbUtenti;
    private static DbHost dbHost;

    public static void main(String[] args) {

        dbUtenti = new DbUtente(popolaDbUtenti());
        dbHost = new DbHost(popolaDbHost());

        System.out.println("------ Benvenuto in RoomOneBnb! ------ ");
        System.out.println("1. Effettua il Login\n2. Registrati\n3. Esci");  //Login come utente,host, admin(?) per la varie funzioni.

        registraNuovoUtente();


    }


    public static HashMap<Integer,Utente> popolaDbUtenti(){

        Utente u1 = new Utente("Michele","Liccardo","mik3xi@live.it","Mik3xi","treeschool55");
        Utente u2 = new Utente("Agostino","Nicotra","agonick@gmail.com","agonick","treeschool55");
        Utente u3 = new Utente("Ange","Kadja","ange237@live.it","ange237","treeschool55");
        Utente u4 = new Utente("Ruben","La Rocca","quelbaffobastardo@yahoo.it","quelbaffo","treeschool55");
        Utente u5 = new Utente("Michela","D'avino","mikadd@hotmail.it","mikadd","treeschool55");

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
        Host h2 = new Host("Riccardo","Pozzati","riccpozz@gmail.com","Riccpozz","treeschool55");
        Host h3 = new Host("Andrea","Rosati","andreros@gmail.com","Jaeger","treeschool55");

        Integer id1 = h1.getId();
        Integer id2 = h2.getId();
        Integer id3 = h3.getId();

        HashMap<Integer,Host> insiemeDiHost= new HashMap<>();

        insiemeDiHost.put(id1,h1);
        insiemeDiHost.put(id2,h2);
        insiemeDiHost.put(id3,h3);

        return insiemeDiHost;
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

}


