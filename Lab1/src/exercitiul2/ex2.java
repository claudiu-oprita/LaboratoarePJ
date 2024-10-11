package exercitiul2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex2 {
    public ex2() {
    }

    public static void main(String[] args) throws IOException {
        Scanner inputScanner = new Scanner(new File("src/exercitiul2/in.txt"));
        FileWriter outputScanner = new FileWriter("src/exercitiul2/out.txt");
        int suma = 0;
        int nr_citite = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        float media;
        for(media = 0.0F; inputScanner.hasNext(); media = (float)suma / (float)nr_citite) {
            int nr = inputScanner.nextInt();
            suma += nr;
            ++nr_citite;
            if (nr < min) {
                min = nr;
            }
            if (nr > max) {
                max = nr;
            }
        }
        System.out.println("Suma este: " + suma);
        System.out.println("Media este: " + media);
        System.out.println("Valoarea minima este: " + min);
        System.out.println("Valoarea maxima este: " + max);
        outputScanner.write("Suma este: " + suma + "\n");
        outputScanner.write("Media este: " + media + "\n");
        outputScanner.write("Valoarea minima este: " + min + "\n");
        outputScanner.write("Valoarea maxima este: " + max + "\n");
        outputScanner.close();
    }
}
