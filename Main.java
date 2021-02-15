import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sorts m_sort = new Sorts();
		ArrayList<Integer> arreglo2 = new ArrayList<Integer>(Arrays.asList(10,128,10008,34,56,78,43,21,39,11,13));
		
		// starting time 
        long start = System.currentTimeMillis(); 
       
        // start of function 
  
        m_sort.merge_sort(arreglo2); 
  
        // end of function 
  
        // ending time 
        long end = System.currentTimeMillis(); 
        System.out.println((end - start) + "ms"); 
    } 
}
