package MainPackage;

public class Sort {
	public static void BubbleSort(int array[]) {
		for(int i = 0; i < array.length-1;i++){
			for(int j = 0; j < array.length-1;j++)
				if(array[j]>array[j+1])
					swap(j, j+1, array);
			for (int k = 0 ; k< array.length;k++)
				System.out.print(array[k] + " ");
			System.out.println();
		}
		
	}
	
	private static void swap(int one, int two, int array[]){
		int temp = array[one];
		array[one] = array[two];
		array[two] = temp;
	}
}
