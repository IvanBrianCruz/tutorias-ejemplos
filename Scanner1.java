import java.util.Scanner;


public class Scanner1 {
    public static void main(String[] args) {
        //int int = 25;

        Scanner scanner = new Scanner(System.in);

     // Conductor conductor = new Conductor();

        System.out.print("Ingresa tu nombre: ");
        //ESCRIBIR 
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        //int edadDeSueno = edad *3;

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        scanner.close();
    }
    
}
