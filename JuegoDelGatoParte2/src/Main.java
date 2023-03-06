import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena de nueve cararteres:");
        String cadena = sc.nextLine();
        sc.close();

        System.out.println("Cadena ingresada: " + cadena);
        System.out.println("-----");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                int index = i*3 + j;
                char c = cadena.charAt(index);
                System.out.print(c);
            }
            System.out.print("|");
            System.out.print("\n");



        }
        System.out.println("-----");
    }

}