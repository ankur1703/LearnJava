package MainPackage;

import java.util.Arrays;

public class MyArrayList {
	
	private final int CONSTANT_SIZE = 10;
	
	private Object array[];
	private int current_index=0;
	
	public MyArrayList(){
		array = new Object[CONSTANT_SIZE];
	}
	
	public MyArrayList(int size){
		array = new Object[size];
	}
	
	
	public void add(int element){
		if(current_index < size()){
			array[current_index] = element;
			current_index++;
		}
		else{
			grow();
			add(element);
		}
	}
	
	public Object get(int index){
		if (index >=0 && index < size())
	       return array[index];
		else{
			System.out.println("Arrays index out of bound");
			return -1;
		}
	}
	
	private void grow(){
		array = Arrays.copyOf(array, size() * 2);
	}
	
	public int size(){
		return array.length;
	}
	
	public Object remove(int index){
		Object temp = null;
		if(index < current_index){
			temp = array[index];
			for (int i = index; i < current_index; i++){
				array[i] = array[i+1];
			}
			current_index--;
			return temp;
		}
		else
			throw new ArrayIndexOutOfBoundsException();
		
	}
	
}
