package MainPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Converter {
	ArrayList<String> units;
	
	public Converter(){
		units = new ArrayList<String>(Arrays.asList("Bit","Byte","Kilobyte","Megabyte","Gigabyte","Terabyte","Petabyte"));
	}
	
	public double convert(double value, String fromUnit, String toUnit){
		Double result;
		if(fromUnit.equals(toUnit)){
			return 1 * value;
		}
		
		int fromIndex = units.indexOf(fromUnit);
		int toIndex = units.indexOf(toUnit);
		
		if(fromIndex>toIndex){
			// Higher to Lower conversion eg Gb ---> Mb
			
			if(fromIndex < 2) // case for Byte ---> Bit
				return value * 8;
			
			result = 1024 * convert(value, units.get(fromIndex-1), units.get(toIndex));
		}		
		else{
			// Lower to higher conversion eg Mb ---> Gb
			if(fromIndex < 2) // case for Bit ---> Byte
				return value / 8;
			
			result = convert(value, units.get(fromIndex), units.get(toIndex-1)) / 1024;
		}
		
		return result.longValue();
	}
	
}
