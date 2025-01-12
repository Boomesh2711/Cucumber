package InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseString {
	
	public void buffer() {
String given="boomi";
		
		StringBuffer string = new StringBuffer();
		string.append(given);
		string.reverse();
		System.out.print(string);
		
	}
	
	public void usinglogic() {
		String given="samy";
		
		String reversed="";
		char[] reverse=given.toCharArray();
		
		for (int i =reverse.length-1;i>=0;i--) {
			
			reversed= reversed+reverse[i];
			
		}	
	}
	
	public void collections() {
		String given="moon";
		char[] array=given.toCharArray();
		List <Character> list=new ArrayList<Character>();
		for (Character character : list) {
			list.add(character);
		}
		Collections.reverse(list);
		
		Iterator iterator=list.listIterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given="boomi";
		
		String reversed="";
		char[] reverse=given.toCharArray();
		
		for (int i =reverse.length-1;i>=0;i--) {
			
			reversed= reversed+reverse[i];
			
		}
		System.out.print(reversed);
		
		ReverseString astring=new ReverseString();
		astring.buffer();
		astring.usinglogic();
		astring.collections();
		
	}

}
