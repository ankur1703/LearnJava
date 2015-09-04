package MainPackage;

public class NumbersCode {
	
	public static int FindDuplicateNumber(int [] arr){
		
		for(int i = 0; i < arr.length; i++){
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i]==arr[j])
					return arr[i];
			}
		}
		
		return -1;
		
	}
	
	public static int findMiddleIndex(int[] numbers){
		int sum = 0;
		for(int i = 0; i < numbers.length; i++){
			sum = sum + numbers[i];
		}
		
		int sumPart = 0, i = 0;
		while (sumPart <= sum/2){			
				sumPart = sumPart + numbers[i];
				if (sumPart == sum/2)
					return i;
				i++;			
		}
		
		return -1;
		
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
	
	public static int ReverseNumber(int number){
		int reversed=0;
		
		while (number !=0){
			reversed = reversed*10 + number%10;
			number = number/10;
		}
		return reversed;
	}
	
	public static String DecimalToBinary(int number){
        String binary="";
		
		while (number !=0){
			binary = number%2 + binary ;
			number = number/2;
		}
		return binary;
	}
}
