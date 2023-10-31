import java.util.Scanner;

public class Utente {

    private String nome;
    private String password;

    public Utente(String nome, String password){
        this.nome=nome;
        this.password=password;

    }

    public void accedi(){

        Scanner sc= new Scanner(System.in);

        System.out.println("inserisci il nome");
        String n = sc.nextLine();

        System.out.println("inserisci la password");
        String pass = sc.nextLine();

        if(this.nome.equalsIgnoreCase(n) && this.password.equals(pass)){
            System.out.println("benvenuto");
        }else{
            System.out.println("credenziali errate");
        }
    }
    
}
