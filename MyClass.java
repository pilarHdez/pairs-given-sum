import java.util.HashMap; 

public class MyClass {
    
   public static int getPairsCount(int[] array, int x){
    	HashMap<Integer, Integer> map = new HashMap<>();
    	int count = 0;
    
    	for(int i=0; i<array.length; i++){
    		map.put(array[i], 1);
    	}
    
    	for(int i=0; i<array.length; i++){
    		count = map.get(x-array[i]) != null ? count + map.get(x-array[i]) : count  + 0;
    	}
    	
    	return count/2; 
    }
    
    public static void main(String args[]) {
        /*
        * Input  :  array[] = {1, 5, 7, 4, 2}, x = 6
          Output :  2
        */

        int[] array = {1, 5, 7, 4, 2}; 
        int x = 6;
        
        int count = getPairsCount(array, x);
        
        System.out.println(count);
    }
}
