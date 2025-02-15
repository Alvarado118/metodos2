public class Busqueda {

    public static int busquedaLineal(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return i;
            }
        }
        return -1;
    }


    public static int busquedaBinaria(int[] arreglo, int objetivo) {
        int inicio = 0, fin = arreglo.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (arreglo[medio] == objetivo) {
                return medio;
            }
            if (arreglo[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }
}
