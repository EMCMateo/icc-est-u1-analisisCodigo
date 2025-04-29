import java.util.Random;

public class Benchmarking {
    private MetodosOrdenamiento metodosOrdenamiento;
    public Benchmarking() {
        /*
        long inicioMillis = System.currentTimeMillis();
        long inicioNano = System.nanoTime();
    
        System.out.println("Inicio en milisegundos: " + inicioMillis);
        System.out.println("Inicio en nanosegundos: " + inicioNano);
        */
        metodosOrdenamiento = new MetodosOrdenamiento();
        int [] arreglo = geenerarArreglo(1000000);
        Runnable tarea = () -> metodosOrdenamiento.burbujaTradicional(arreglo);
        double tiempoC = medirConCurrentTime(tarea);
        double tiempoN = medirConNanoTime(tarea);

        System.out.println("Tiempo en milisegundos: " + tiempoC);
        System.out.println("Tiempo en nanosegundos: " + tiempoN);

        

        
    }

    private int[] geenerarArreglo(int i){
        int [] arreglo = new int[i];
        for (int j = 0; j < i; j++) {
            arreglo[j] = (int) (Math.random()*1000000);
        }
        return arreglo;
    }

    private int[] geenerarArregloAleatorio(int n){
        int [] arreglo = new int [n];
        Random random = new Random();
        for(int i=0; i<n;i++){
            arreglo[i]=random.nextInt(10000);
        }
        return arreglo;
    }
    

    public double medirConNanoTime(Runnable tarea){
        long inicio = System.nanoTime();
        tarea.run();
        long fin = System.nanoTime();
        return (fin-inicio)/1_000_000_000.0;
    }
    public double medirConCurrentTime(Runnable tarea){
        long inicio = System.currentTimeMillis();
        tarea.run();
        long fin = System.currentTimeMillis();
        return(fin-inicio)/1000;
    }
    
}
