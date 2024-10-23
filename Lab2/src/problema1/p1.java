package problema1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) throws IOException {
        String linie, judetCautat;
        ArrayList<String> judete = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader("src/problema1/judete.txt"));
        while((linie = reader.readLine()) != null) {
            judete.add(linie);
        }
        reader.close();

        String[] judeteArray = judete.toArray(new String[0]);
        Arrays.sort(judeteArray);
        System.out.println("Județele ordonate alfabetic: " + Arrays.toString(judeteArray));
        System.out.println("Judetul cautat: ");
        judetCautat = scanner.next();
        int pozitie = Arrays.binarySearch(judeteArray, judetCautat);
        if (pozitie >= 0) {
            System.out.println("Județul " + judetCautat + " a fost gasit pe poziția " + (pozitie + 1));
        } else {
            System.out.println("Judetul cautat nu a fost gasit.");
        }
        scanner.close();
    }
}