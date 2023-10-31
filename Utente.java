import java.util.Scanner;

public class Utente {

    private String nome;
    private String password;

    public Utente(String nome, String password){
        this.nome=nome;
        this.password=password;

    }

    public boolean accedi(){

        boolean ok= false;
        Scanner sc= new Scanner(System.in);

        System.out.println("inserisci il nome");
        String n = sc.nextLine();

        System.out.println("inserisci la password");
        String pass = sc.nextLine();

        if(this.nome.equalsIgnoreCase(n) && this.password.equals(pass)){
            System.out.println("benvenuto");

            ok=true;
        }else{
            System.out.println("credenziali errate");
        }

        return ok;
    }
    
}
