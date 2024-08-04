package matematicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {

            System.out.println("=================================================== <[Entrada]> ==================================================");
            System.out.print("Ingrese un numero: ");
            int num = scan.nextInt();

            if (num > 0) {

                System.out.println("=================================================== <[Multiplos]> =================================================");
                for (int i = 1; i < num; i++) {
                    if (num % i == 0) {
                        System.out.println(num + "/" + i + "=" + (num / i));
                    }
                }
                System.out.println(num + "/" + num + "=1");
                System.out.println("==================================================================================================================");
            } else {
                System.out.println("=================================================== <[Error]> ====================================================");
                System.err.println("Error, solo numeros positivos");
                System.out.println("==================================================================================================================");
            }

        } catch (InputMismatchException e) {
            System.out.println("=================================================== <[Error]> ====================================================");
            System.err.println("Error, solo se admiten numeros");
            System.out.println("==================================================================================================================");
        }
    }
}
