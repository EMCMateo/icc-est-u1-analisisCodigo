import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado: Devuelve un arreglo vacio. Sin ningun valor.
    // Solucion: Cambiar el retorno del arreglo vacio por el arreglo ordenado
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        //return new int[] {};
        return arreglo;
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: El metodo es descendente.
    // Solucion: Cambiar el operador de comparacion de mayor a menor

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                //if (arreglo[i] > arreglo[j]) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado: El rango del bucle no es correcto, se sale de los limites del vector
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: No retorrna un arreglo, siendo que el metodo no retorna nada pese a que el tipo del metodo es un arreglo de enteros
    // El arreglo que retorna es un arreglo vacio, por lo que no se puede ver el resultado
    //Solucion : return el arreglo.
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }

        return arreglo;


    }

    // Método de selección con errores
    // Error encontrado: El contador j se decrementa en lugar de incrementar, lo que hace que no recorra ninguna posicion
    // Solucion: Cambiar el incremento del contador j por un decremento
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;

            //for (int j = i + 1; j < arreglo.length; j--) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: Al cambiar los elemetnos se guarda el valor del indice minimio en otro lado del arreglo, pero no se intercambia con el valor de la poscion i
    // Solucion: Cambiar el valor de la posicion i por el valor del indice minimo, y el valor del indice minimo por el valor de la posicion i
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            /*
            int smallerNumber = arreglo[i];
            //AQUI arreglo[indiceMinimo] = arreglo[i];
            arreglo[indiceMinimo] = smallerNumber;
            */
            int smallerNumber = arreglo[i];
            arreglo[i] = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = smallerNumber;
        }

        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: El signo el cual se compara el valor de la posicion i con el valor de la posicion j es incorrecto, ya que no se puede comparar un valor menor a otro, 
    //el condicional de que i sea mayor a cero tambein esta mal
    // Solucion: Cambiar el signo de menor a mayor, y poner >= 0 en el condicional de i
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i+1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: El condicional del arreglo esta mal, ya que al seleccionar el valor de la posicion j, se selecciona el valor de la posicion i, y no el valor de la posicion j
    // Solucion: Cambiar el valor de la posicion j por el valor de la posicion i, y cambiar el signo de menor a mayor
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];
            int i = j - 1;
            
            /*for (; j <= 0 && arreglo[j] < actual; j--) {
                arreglo[j + 1] = arreglo[j];
            }
                */
            for (; i>= 0 && arreglo[i] > actual; i--) {
                arreglo[i + 1] = arreglo[i];
            }
            arreglo[i + 1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: EL arreglo devuelto no es el correcto, ya que esta predefinido el arreglo que se va a retornar.
    // Hay varios errores más, la pocision i si es igual al velor j no se compara nunca porque se decrementa, y el valor de la posicion j no se guarda en ningun lado
    //El valor de i no deberia incrementar, si no decrementar, ya que se busca el valor menor al valor de la posicion j
    // Solucion: Cambiar el valor de la posicion j por el valor de la posicion i, y cambiar el signo de menor a mayor, y cambiar el valor del arreglo que se retorna por el arreglo ordenado

    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j-1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        //return new int[] { 15, 34, 1, 2, 5, 6, 7, 10 };
        return arreglo;
    }

}
