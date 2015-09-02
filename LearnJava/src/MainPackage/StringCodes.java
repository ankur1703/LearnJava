package MainPackage;


import java.util.HashMap;

public class StringCodes {
	
	public static char FindFirstNonRepeatingCharacter(String str){
		HashMap<Character, Integer> occurances = new HashMap<Character, Integer>();		
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(occurances.containsKey(c)){
				occurances.put(c, occurances.get(c) + 1);
			}
			else{
				occurances.put(c, 1);
			}
		}
		
		for (int i = 0; i < str.length(); i++){
			char key = str.charAt(i);
			if(occurances.get(key) == 1)
				return key;
		}
		
		return 1;
		
	}
	
	public static void rotateArray(int [] arrayToRotate, int order){
		/*
		 *  Complexity = O(k*n)
		 */
		while(order>0){
			order--;
			int lastElement = arrayToRotate[arrayToRotate.length-1];
			for(int i = arrayToRotate.length-1; i > 0; i--){
				arrayToRotate[i] = arrayToRotate[i-1];
			}
			arrayToRotate[0]=lastElement;
		}
				
	}
	
	public static void rotateArrayDivAndConq(int[] arr, int order) {
		/*
		 *  Complexity = O(n)
		 */
		
		order = order % arr.length;
	 
		if (arr == null || order < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
	 
		//length of first part
		int a = arr.length - order; 
	 
		reverse(arr, 0, a-1);
		reverse(arr, a, arr.length-1);
		reverse(arr, 0, arr.length-1);
	 
	}
	 
	public static void reverse(int[] arr, int left, int right){
		if(arr == null || arr.length == 1) 
			return;
	 
		while(left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}	
	}
	
}
