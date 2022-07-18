package AspirationTakeHomeAssessment;

/*Given an unsorted array that contains an even number of occurrences for all numbers except two numbers. Find the two numbers which have odd occurrences in O(n) time complexity and O(1) extra space.
Input: {10, 20} 
Output: 10 and 20*/

public class OddOccurences {
	static void printOddOccurences(int arr[], int size){
		 /* Will hold XOR of two odd occurring elements */   
	      int xorele= arr[0];
	      
	      /* Will have only single set bit of xorele */
	      int set_bit_no; 
	      int i, x = 0, y = 0;
	      
	      /* Get the xor of all elements in arr[]. The xor will basically be xor of two
	         odd occurring elements */
	      for(i = 1; i < size; i++)
	    	  xorele = xorele ^ arr[i];
	      
	      /* Get one set bit in the xorele. We get rightmost set bit in the following
	         line as it is easy to get */
	      set_bit_no = xorele & ~(xorele-1);
	      
	      /* Now divide elements in two sets:
          1) The elements having the
             corresponding bit as 1.
          2) The elements having the
             corresponding bit as 0.  */
	      for(i = 0; i < size; i++)
	      {
	    	  /* XOR of first set is finally going
          	to hold one odd occurring number x */
	    	  if((arr[i] & set_bit_no)>0)
	    		  x = x ^ arr[i];
	          /* XOR of second set is finally going
	            to hold the other odd occurring number y */
	        else
	          y = y ^ arr[i];
	      }
	      System.out.println("The two ODD elements are "+
                  x + " & " + y);
	      }
	   // main function
    public static void main (String[] args)
    {
        int arr[] = {10, 20};
        int arr_size = arr.length;
        printOddOccurences(arr, arr_size);
    }

}
