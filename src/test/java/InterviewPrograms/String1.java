package InterviewPrograms;

public class String1 {
	
	
	/* 1. Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

			right2("Hello") → "loHel"
			right2("java") → "vaja"
			right2("Hi") → "Hi"
	 */
	
    public String right2(String str) {
  	  if(str.length()>2){
  		  String result=str.substring(str.length()-2,str.length())+str.substring(0,str.length()-2);
  		  System.out.println(result);
  	    return str.substring(str.length()-2,str.length())+str.substring(0,str.length()-2);
  	    
  	  }System.out.println(str);
  	  return str; 
  	}
    
    /*2. Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.

		theEnd("Hello", true) → "H"
		theEnd("Hello", false) → "o"
		theEnd("oh", true) → "o"
     */
    
    
    public String theEnd(String str, boolean front) {
    	  if(front==true){
    	  return str.substring(0,1);
    	  }
    	else{
    	  return str.substring(str.length()-1,str.length());
    	}
    	  
    	}

    /* 3. Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

		middleTwo("string") → "ri"
		middleTwo("code") → "od"
		middleTwo("Practice") → "ct"
     * 
     */
    
    public String middleTwo(String str) {
    	  int a=0;
    	  a=str.length()/2;
    	  return str.substring(a-1,a+1);
    	  

    	  
    	}
    
    /*4. Given a string, return true if it ends in "ly".

		endsLy("oddly") → true
		endsLy("y") → false
		endsLy("oddy") → false
     * 
     */
    
    
    public boolean endsLy(String str) {
    	  if(str.length()>=2){
    	    String result=str.substring(str.length()-2,str.length());
    	    if(result.equals("ly"))
    	    return true;
    	  }return false;
    	  
    	}

    /* 5. Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

		nTwice("Hello", 2) → "Helo"
		nTwice("Chocolate", 3) → "Choate"
		nTwice("Chocolate", 1) → "Ce"
     * 
     * The function nTwice takes a string and an integer n, and returns a new string made up of the first n characters and
     the last n characters of the original string. Here’s a step-by-step explanation:

		Input: A string and an integer n.
		Output: A new string consisting of the first n characters and the last n characters of the input string.
		Examples:
		nTwice(“Hello”, 2):
		First n characters: “He”
		Last n characters: “lo”
		Result: “Helo”

     */
    public String nTwice(String str, int n) {
    	  if(str.length()>=n){
    	    return str.substring(0,n)+str.substring(str.length()-n,str.length());
    	  }

    	  return str;  
    	}
/* 6. Given a string and an index, return a string length 2 starting at the given index.
If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.

		twoChar("java", 0) → "ja"
		twoChar("java", 2) → "va"
		twoChar("java", 3) → "ja
 */


	public String twoChar(String str, int index) {
		  if(index+2<=str.length() && index>=0){
			  System.out.println(str.substring(index,index+2));
		      return str.substring(index,index+2);
		  }
		  System.out.println(str.substring(0,2));
		  return str.substring(0,2);
		}
/* 7.	Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
		 */

	public boolean hasBad(String str) {
		if((str.length()==3) && str.equals("bad"))
		{
			System.out.println("true");
			return true;
		}
		if(str.length()>3)
			if((str.substring(0,3).equals("bad"))|| ((str.substring(1,4).equals("bad"))))
			{
				System.out.println("true");
				return true;
			}
		System.out.println("false");
		return false;
	}

	/*  8. Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
		atFirst("hello") → "he"
		atFirst("hi") → "hi"
		atFirst("h") → "h@"
	 */


	public String atFirst(String str) {
		if(str.length()>=2){
			return str.substring(0,2);
		}else if(str.length()>=1){
			return str+"@";
		}return"@@";

	}

	public boolean arrayjk(int[] nums) {

		if(nums.length>2){
			for(int i=0;i<nums.length-1;i++)
				if(nums[i]==1&&nums[i+1]==2&&nums[i+2]==3){
					System.out.println(true);
					return true;
				}
		}
		System.out.println(false);
		return false;
	}


	public static void main(String[] args) {
		String1 obj=new String1();
		obj.right2("Hello boomi");
		obj.theEnd("Boom", false);
		obj.middleTwo("boomi");
		obj.endsLy("oddly");
		obj.nTwice("Hello", 2);
		obj.twoChar("java", 3);
		obj.hasBad("badxx");
		obj.atFirst("h");



	}

}
