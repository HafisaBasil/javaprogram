package programs;

import java.util.HashMap;

public class StringOccurance_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String string="java";
        int count;
        char ch;
        HashMap<Character, Integer> hashmap=new HashMap<Character, Integer>();
        for(int i=0;i<string.length();i++) {
        	ch=string.charAt(i);
        	if(hashmap.containsKey(ch)) {
        		count=hashmap.get(ch);
        		count++;
        		hashmap.replace(ch, count);
        	}
        	else {
        		hashmap.put(ch, 1);
        	}
        }
        for(Character key: hashmap.keySet()) {
        System.out.println(key+" = "+hashmap.get(key));	
        }

	}

}
