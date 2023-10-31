import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoProdotti{

public static void main(String[] args) {
    

List<Prodotto> p = new ArrayList<>();
Utente u = new Utente("gioele", "123456789");

p.add(new Prodotto("cocacola", 2.00));
p.add(new Prodotto("pane", 1.20));
p.add(new Prodotto("fanta", 2.50));
p.add(new Prodotto("acqua", 0.30));




System.out.println("--------------------------------");
System.out.println("che operazione vuoi effettuare?");
System.out.println("          1-accedi            ");
System.out.println("          2-esci              ");
System.out.println("--------------------------------");

Scanner sc=new Scanner(System.in);

int scelta =sc.nextInt();

switch (scelta) {
    case 1:
        u.accedi();

        System.out.println("-------------------------------");
        System.out.println("       1-visualizza prodotti    ");
        System.out.println("       2-esci                    ");
        System.out.println("-------------------------------");

        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();

        if(s == 1){

                Prodotto.visualizzaProdotti(p);
        }else {

            System.out.println("arrivederci");
        }

        break;

    case 2:
        System.out.println("arrivederci");
        break;



        
        
}

    }
}