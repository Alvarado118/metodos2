import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.print("Ingrese el número a buscar: ");
        int objetivo = scanner.nextInt();


        int resultadoLineal = Busqueda.busquedaLineal(numeros, objetivo);
        System.out.println(resultadoLineal != -1 ? "Encontrado en la posición (Lineal): " + resultadoLineal : "No encontrado (Lineal)");


        Arrays.sort(numeros);
        int resultadoBinario = Busqueda.busquedaBinaria(numeros, objetivo);
        System.out.println(resultadoBinario != -1 ? "Encontrado en la posición (Binaria): " + resultadoBinario : "No encontrado (Binaria)");
    }
}
