package exercitiul3;

import java.util.Scanner;

    public class ex3 {
        public ex3() {
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti numarul: ");
            int nr = scanner.nextInt();
            for(int i = 1; i <= nr; ++i) {
                if (nr % i == 0) {
                    System.out.println(i);
                }
            }
            boolean prim = true;
            for(int d = 2; d <= nr / 2; ++d) {
                if (nr % d == 0) {
                    prim = false;
                    break;
                }
            }
            if (prim) {
                System.out.println("Numarul " + nr + " este prim");
            } else {
                System.out.println("Numarul " + nr + " nu este prim");
            }
        }
    }

