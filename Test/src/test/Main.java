package test;

import java.util.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            if(isValid(line))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
    public static boolean isValid(String s) {
		boolean isValid = true;
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('[', ']');
		map.put('{', '}');
		map.put('(', ')');
		
		
		Stack<Character> stack = new Stack<Character>();
		
		char stackArray[] = s.toCharArray();
		
		for (char c : stackArray) {
			
			if(c == '(' || c == '{' || c == '['){
				stack.push(c);
			}
			
			else if(c == ')' || c == '}' || c == ']'){
				if(!stack.isEmpty()&& map.get(stack.peek()) == c){
					stack.pop();
				}
				else{
					return false;
				}
					
			}
			
			
		}
		
		
		
		return stack.isEmpty();        
    }
}
