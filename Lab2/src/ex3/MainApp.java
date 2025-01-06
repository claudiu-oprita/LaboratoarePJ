
package ex3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
      String sir,sir_inserat;
      int pozitie;
      Scanner scanner = new Scanner(System.in);
        System.out.println("Dati un sir de caractere: ");
        sir = scanner.nextLine();
        System.out.println("Ce sir doriti sa inserati?");
        sir_inserat= scanner.nextLine();
        System.out.println("Pozitia de la care vreti sa inserati: ");
        pozitie = scanner.nextInt();
        StringBuilder sb = new StringBuilder(sir);
        sb.insert(pozitie,sir_inserat);
        System.out.println("Noul sir: " + sb);
        int pozitie_stergere,nr_caractere;
        System.out.println("De la ce pozitie doriti sa stergeti?");
        pozitie_stergere = scanner.nextInt();
        System.out.println("Ce numar de caractere doriti sa stergeti?");
        nr_caractere = scanner.nextInt();
        sb.delete(pozitie_stergere, pozitie_stergere+nr_caractere);
        System.out.println("Noul sir:" + sb);

    }
}
