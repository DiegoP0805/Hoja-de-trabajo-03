/**
 * @author Diego Perdomo 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import jdk.vm.ci.code.site.Site;

public class archiveManager 
{
    //String que obtiene la dirección del escritorio de la máquina 
    String s = System.getProperty("user.home") + "\\Desktop";


    /**
     * Constructor de la clase archiveManager
     */
    public archiveManager()
    {

    }

    /**
     * Método que genera un documento de texto con una cantidad de números entre 0 y 3000
     * 
     */
    public void generate()
    {
        try 
        {
            Random rnd = new Random();
            int n = rnd.nextInt(10) + 10;
            String name = "\\nums.txt";

            //se establece el path donde se creará el archivo
            s = s + name;
            File f = new File(s);

            //Par de arreglos para almacenar los datos generados 
            int[] inums = new int[n];
            String[] data = new String[n];
            if(!f.exists())
            {
                //condicional que sirve para ver si ya existe un archivo bajo el mismo nombre en la dirección
                //En caso de hacerlo, se reemplaza con el nuevo
                f.createNewFile();
            }

            //elementos para administrar el manejo de es critura en un archivo 
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);

            //Ciclo para agregar números dentro del arreglo de enteros
            for(int i = 0; i < n; i++)
            {
                int num = rnd.nextInt(3000);
                inums[i] = num;
            }
            //ciclo para escribir cada uno de los datos dentro del archivo
            for(int i = 0; i < n; i++)
            {
                data[i] = String.valueOf(inums[i]);
                bw.write(data[i]+"\n");
            }

            //cerrado
            bw.close();
            w.close();
        } 
        catch (Exception e) 
        {
            System.err.println("Ocurrió un error inesperado.");
        }
    }


    
    /** 
     * Función que lee el archivo creado por la función generate de esta clase
     * 
     * @return int[]
     */
    public int[] read()
    {
        try 
        {
            //elementos de manejo para abrir y leer el archivo 
            File archivo = new File(s);
            BufferedReader texto =  new BufferedReader(new FileReader(archivo));
            String line = "";
            //lista para almacenar los datos del archivo
            ArrayList<String> lista = new ArrayList<>();
            //ciclo para guardar todo en la lista
            while((line = texto.readLine()) != null)
            {
                lista.add(line);
            }
            //arreglo que servirá para regresar todos los datos en un arreglo entero
            int[] nums = new int[lista.size()];
            //traslación de los datos de la lista al arreglo de retorno
            for(int i = 0; i < lista.size(); i++)
            {
                nums[i] = Integer.parseInt(lista.get(i));
            }
            //cierre del lector de un archivo
            texto.close();
            return nums;
        } 
        catch (Exception e) 
        {
            return null;
        }
    }
}
