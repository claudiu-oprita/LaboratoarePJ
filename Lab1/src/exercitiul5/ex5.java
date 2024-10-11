package exercitiul5;

import java.util.Random;

public class ex5 {
    public ex5() {
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int nr = rand.nextInt(20);
        System.out.println("Numar=" + nr);
        int a = 0;
        int b = 1;
        boolean f = false;
        for(int i = 0; i < 9; ++i) {
            if (i == 0 && a == nr) {
                f = true;
                break;
            }
            if (i == 1 && b == nr) {
                f = true;
                break;
            }
            int c = a + b;
            a = b;
            b = c;
            if (c == nr) {
                f = true;
                break;
            }
        }
        if (f) {
            System.out.println("Numarul " + nr + " apartine sirului Fibonacci");
        }
        else {
            System.out.println("Numarul " + nr + " nu apartine sirului Fibonacci");
        }
    }
}

