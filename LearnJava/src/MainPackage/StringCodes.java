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

}
