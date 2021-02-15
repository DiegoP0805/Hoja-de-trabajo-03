/**
 * @author Stefan Quintana
 * @file Test.java
 */


import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;

public class Test extends TestCase{
	
	//Instancia la clase de Sorts
	private Sorts sort;
	
	public void escenario() {
		sort = new Sorts();
	}
	
	//Variable con el arreglo desordenado tipo ArrayList
	ArrayList<Integer> arreglo = new ArrayList<Integer>(Arrays.asList(10,128,10008,34,56,78,43,21,39,11,13));
	//Variable con el arreglo ordenado tipo ArrayLisr
	ArrayList<Integer> arreglo_ordenado = new ArrayList<Integer>(Arrays.asList(10,11,13,21,34,39,43,56,78,128,10008));
	
	//Variable con el arreglo desordenado tipo array
	Integer[] arreglo2 = {10,128,10008,34,56,78,43,21,39,11,13};
	//Variable con el arreglo ordenado tipo array
	Integer[] arreglo2_ordenado = {10,11,13,21,34,39,43,56,78,128,10008};
	
	/**
	 * Método para comparar el arreglo ordenado con el desordenado, ordenando el último con merge_sort
	 */
	public void testMerge() {
		escenario();
		assertEquals(arreglo_ordenado, sort.merge_sort(arreglo));
	}
	
	/**
	 * Método para comparar el arreglo ordenado con el desordenado, ordenando el último con gnome_sort
	 */
	public void testGnome() {
		escenario();
		
		//Loop para revisar si cada elemento del arreglo ordenado es igual al ordenamiento que genera gnome
		for(int i = 0; i<arreglo2_ordenado.length; i++) {
			assertEquals(arreglo2_ordenado[i], sort.gnome_sort(arreglo2)[i]);
		}
	}

}
