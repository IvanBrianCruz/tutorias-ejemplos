
import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // ----------------- Ejemplo de if simple -----------------
        if (edad >= 18) {
            System.out.println("Eres un adulto.");
        }

        System.out.println("----------------------------------------");

        // ----------------- Ejemplo de if anidados -----------------
        if (edad < 18) {
            System.out.println("Eres menor de edad.");

            // El if anidado se ejecuta solo si el if externo es verdadero
            if (edad <= 12) {
                System.out.println("Eres un niño.");
            } else {
                System.out.println("Eres un adolescente.");
            }
        } else {
            // Si el if externo es falso, se ejecuta este bloque 'else'
            System.out.println("Eres un adulto.");
        }

        scanner.close();
    }
}
