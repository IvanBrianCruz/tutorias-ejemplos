public class while1 {
     
    public static void main(String[] args) {
        int contador = 1; // Inicializamos el contador en 1

        // Usamos un bucle while para repetir mientras el contador sea menor o igual a 5
        while (contador <= 5) {
            System.out.println("Contador: " + contador); // Imprimimos el valor actual del contador
            contador=contador+1; // Incrementamos el contador en 1m ++
        }

        System.out.println("¡Bucle terminado!");
    }
}
