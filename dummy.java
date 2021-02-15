/**
 * @author Diego Perdomo 
 */

import java.lang.reflect.Array;
import java.util.HashMap;



public class dummy {


    //Clase main en donde se ejecuta el programa integrador y comparativo de sorts
    public static void main(String[] args) 
    {
        archiveManager am = new archiveManager();
        sorts2 s = new sorts2();
        am.generate();
        int[] numeros = am.read();
        System.out.println(numeros.length);
        double n = Math.round(numeros.length / 5)-1;
        System.out.println(n);
        int acu = 0;
        HashMap<Integer, int[]> arreglos = new HashMap<Integer, int[]>();
        for (int i = 0; i < 5; i++)
        {
            int[] temp = new int[(int)n];
            arreglos.put(i, temp);
        }

        for(int i: arreglos.keySet())
        {
            for(int j = 0; j < arreglos.get(i).length; j++)
            {
                arreglos.get(i)[j] = numeros[j+acu];
            }
            acu += (int)n;
        }


        for(int i = 0; i < 5; i++)
        {
            int[] tarreglo;
            long begin;
            long end;
            long time;
            switch (i+1) {
                
                case 1:
                System.out.println("\nGnome Sort");

                System.out.println("\n");

                System.out.println("\n");
                System.out.println("\n");
                break;
                
                case 2:
                System.out.println("\nMerge Sort");

                System.out.println("\n");

                System.out.println("\n");
                System.out.println("\n");
                break;
                
                case 3:
                System.out.println("\nQuick Sort");

                tarreglo = arreglos.get(i);
                for(int k:tarreglo)
                {
                    System.out.println(k);
                }
                begin = System.nanoTime();
                s.quicksort(tarreglo, 0, (tarreglo.length - 1));
                end = System.nanoTime();
                time = end - begin;
                System.out.println("\nTiempo de ejecución en un arreglo sin ordenar: " + time + " nanosegundos\n");
                begin = System.nanoTime();
                s.quicksort(tarreglo, 0, (tarreglo.length - 1));
                end = System.nanoTime();
                time = end - begin;
                System.out.println("\nTiempo de ejecución en un arreglo ordenado: " + time + " nanosegundos\n");


                for(int k:tarreglo)
                {
                    System.out.println(k);
                }
                System.out.println("\n");
                System.out.println("\n");
                break;
                
                case 4:
                System.out.println("\nRadix Sort");

                begin = System.nanoTime();

                end = System.nanoTime();
                time = end - begin;
                System.out.println("\nTiempo de ejecución en un arreglo sin ordenar: " + time + " nanosegundos\n");

                begin = System.nanoTime();

                end = System.nanoTime();
                time = end - begin;
                System.out.println("\nTiempo de ejecución en un arreglo ordenado: " + time + " nanosegundos\n");
                System.out.println("\n");
                System.out.println("\n");
                break;

                case 5:
                System.out.println("\nBubble Sort");
                tarreglo = arreglos.get(i);
                for(int k:tarreglo)
                {
                    System.out.println(k);
                }
                begin = System.nanoTime();
                s.bubble(tarreglo);
                end = System.nanoTime();
                time = end - begin;
                System.out.println("\nTiempo de ejecución en un arreglo sin ordenar: " + time + " nanosegundos\n");
                for(int k:tarreglo)
                {
                    System.out.println(k);
                }
                begin = System.nanoTime();
                s.bubble(tarreglo);
                end = System.nanoTime();
                time = end - begin;
                System.out.println("\nTiempo de ejecución en un arreglo ordenado: " + time + " nanosegundos\n");
                System.out.println("\n");
                System.out.println("\n");
                break;
            }
        
        
        
        
        }

    }
    
}
