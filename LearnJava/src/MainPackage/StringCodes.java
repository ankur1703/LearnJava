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
	
	public static String ReverseStringRecursively(String toReverse){
		String reversed = "";
		
		if(toReverse.length()==1){
			return toReverse;
		}
		else{
			reversed += toReverse.charAt(toReverse.length()-1) + ReverseStringRecursively(toReverse.substring(0, toReverse.length()-1));
		}
		
		return reversed;
	}
	
	public static void FindDuplicatedCharacters(String str){
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(int i = 0; i< str.length(); i++){
			char ch = str.charAt(i);
			for(int j = i; j< str.length(); j++){
				if (ch==str.charAt(j)){
					if(charMap.containsKey(ch))
						charMap.put(ch, charMap.get(ch)+1);
					else
						charMap.put(ch, 1);
				}
					
			}
		}
		
		for (char key: charMap.keySet()){
			int value = charMap.get(key);
			if(value>1)
				System.out.println("Repeated Characters are: " + key + " ");
		}
		
	}
	
	
}
