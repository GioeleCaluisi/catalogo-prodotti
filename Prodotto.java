import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prodotto {
    
    
    private String nome;
    private double prezzo;

 public Prodotto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        }


 public String getNome() {
    return nome;
}

    public void setNome(String nome) {
        this.nome = nome;
    }

  

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public static void visualizzaProdotti(List<Prodotto> p){

        for(int i=0; i<p.size(); i++){

            System.out.println("nome prodotto: " + p.get(i).getNome());
            System.out.println("prezzo: " + p.get(i).getPrezzo());
        }

    }

     static void aggiungiProdotti(List<Prodotto> p){

        Scanner sc= new Scanner(System.in);

        System.out.println("insierisci il nome: ");
        String no = sc.nextLine();
        
        System.out.println("insierisci il prezzo: ");
        double pr = sc.nextDouble();


        for(int i=0; i<p.size(); i++){
            if(p.get(i) == null){
                p.add(new Prodotto(no, pr));
            }
        }
    }

    public static void rimuoviProdotto(List<Prodotto> p){

        Scanner sc = new Scanner(System.in);

        System.out.println("inserisci il nome del prodotto da rimuovere");

        String rim = sc.nextLine();

        for(int i=0 ; i<p.size(); i++){
        
            if (rim.equalsIgnoreCase(p.get(i).getNome())){
                p.remove(p.get(i));
            
            }
        }
    

    }
    
}
