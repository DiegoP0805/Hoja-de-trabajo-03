/**
 * @author Diego Perdomo
 */

public class sorts2 {


    /**
     * Constructor de la clase
     */
    public sorts2()
    {
        
    }


    /** 
     * Función que sirve para realizar un quicksort
     * El código está inspirado en un antiguo código de mi propiedad que se encontraba en C#
     * @param lista
     * @param p
     * @param f
     */
    public void quicksort(int[] lista, int p, int f )//quicksort
    {   
        int i = p;//posición final postiza
        int j = f;//posición inicial postiza
        int pivot = (lista[i] + lista[j])/2;
        //pivote que me da una referencia del valor medio en función del último y el primer elemento
                                        
        
        while(i < j)
        {
            while (lista[i] < pivot)
            {
                i++;
            }
            while (lista[j] > pivot)
            {
                j--;
            }
            if(i <= j)
            {
                //intercambio de posiciones en caso de que i > j
                int x = lista[j];
                lista[j] = lista[i];
                lista[i] = x;
                i++;
                j--;
            }


            //recursión en caso de que el sort siga desordenado, que probablemente ocurra
            if(p < j)
            {
                quicksort(lista, p, j);

            }
            if(f > i)
            {
                quicksort(lista, i , f);
            }
        }
    }

    /** 
     * Función para realizar un bubblesort
     * El código está inspirado en un antiguo código de mi propiedad que se encontraba en C#
     * @param l
     */
    public void bubble(int[] l)
    {
        int n = l.length;
        for (int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(l[i] < l[j])
                {
                    int x = l[i];
                    int y = l[j];
                    l[i] = y;
                    l[j] = x;
                }
            }
        }
    }

    
}
