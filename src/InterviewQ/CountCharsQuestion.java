package InterviewQ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
// to import ctrl + shift + O
public class CountCharsQuestion {

	public static void main(String[] args) {
		// count the number of each char in the string
				String str = "this is a test String";
				System.out.println(countChars(str));
				System.out.println("--------------------");
				System.out.println(countChar2(str));
			}
			public static Map<Character, Integer> countChars(String str) {
				Map<Character, Integer> tempMap = new HashMap<>();
				// add the chars to the map as keys = keys are set. they will be unique
				for (char c : str.toCharArray()) {
					// check to see if the char is already in the map
					if (tempMap.containsKey(c)) {
						// this is when the key is already in the map
						// increase count
						tempMap.put(c, tempMap.get(c) + 1);
					} else {
						// this is when char is not in the map
						// add char, add count 1
						tempMap.put(c, 1);
					}
				}
				return tempMap;
			}
			public static ArrayList<ArrayList<Character>> countChar2(String str) {
				ArrayList<ArrayList<Character>> temp = new ArrayList<>();
				Set<Character> chars = new HashSet<>();
				for (char c : str.toCharArray()) {
					chars.add(c);
				}
				
				return temp;
			}
		}
