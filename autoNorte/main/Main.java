package autoNorte.main;
// package ejercio5.main;
import autoNorte.model.Auto; // Importa la clase Auto desde el paquete model
// import ejercio5.model.Persona;  // Importa la clase Auto desde el paquete model
import java.time.LocalDate; // Importa la clase para manejar fechas DD/MM/AAAA

public class Main {
    public static void main(String[] args) { 
        // Objeto 1: Usando el constructor por defecto
        System.out.println("Construcción con el constructor por defecto:");
        Auto auto1 = new Auto();
        auto1.setPatente("AB 123 CD");// creado el objeto auto1
        auto1.setMarca("Toyota");
        auto1.setFechaFabricacion(LocalDate.of(2015, 5, 20));
        auto1.setProvinciaOrigen("Buenos Aires");
        auto1.mostrarDatos();
        System.out.println("\n");

        // Objeto 2: Usando el constructor parametrizado
        System.out.println("Construcción con el constructor parametrizado:");
        Auto auto2 = new Auto("EF 456 GH", "Ford", LocalDate.of(1998, 11, 15), "Córdoba");
        auto2.mostrarDatos();
        System.out.println("\n");

        // Objeto 3: Usando el constructor parcial
        System.out.println("Construcción con el constructor parcial:");
        Auto auto3 = new Auto("IJ 789 KL", "Chevrolet", LocalDate.of(1985, 2, 10));
        auto3.mostrarDatos();
        System.out.println("\n");
    }
}
