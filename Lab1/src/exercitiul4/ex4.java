package exercitiul4;

import java.util.Random;

public class ex4 {
    public ex4() {
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(30);
        int b = rand.nextInt(30);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        while(a != b) {
            if (a > b) {
                a -= b;
            }
            else {
                b -= a;
            }
        }
        System.out.println("Cmmdc intre a si b este " + a);
    }
}

