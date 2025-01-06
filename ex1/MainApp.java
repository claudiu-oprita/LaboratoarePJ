package ex1;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        String linie, judet_cautat;
        String[] judete = new String[10];
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader =  new BufferedReader(new FileReader("src/ex1/judete.txt"));
        while((linie=bufferedReader.readLine())!=null)
        {
            judete[i]=linie;
            i++;
        }

        Arrays.sort(judete);
        System.out.println("Lista judetelor ordonate alfabetic: "+ Arrays.toString(judete));
        System.out.println("Ce judet doriti sa cautati? ");
        judet_cautat=scanner.nextLine();
        int pozitie = Arrays.binarySearch(judete,judet_cautat);
        if(pozitie>=0)
        {
            int pozitia_din_sir=pozitie+1;
            System.out.println("Judetul " + judet_cautat + " se afla pe pozitia " + pozitia_din_sir + ".");
        }
        else
            System.out.println("Judetul nu a fost gasit.");

    }
}
