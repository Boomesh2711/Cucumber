package InterviewPrograms;

public class WarmUpAdvaced {
/*
1. Given a string and a non-negative int n, return a larger string that is n copies of the original string.
        stringTimes("Hi", 2) → "HiHi"
        stringTimes("Hi", 3) → "HiHiHi"
        stringTimes("Hi", 1) → "Hi"
 */
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;  // could use += here
        }
        System.out.println(result);
        return result;
    }
    /* 2. Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
    or whatever is there if the string is less than length 3. Return n copies of the front;

        frontTimes("Chocolate", 2) → "ChoCho"
        frontTimes("Chocolate", 3) → "ChoChoCho"
        frontTimes("Abc", 3) → "AbcAbcAbc"
    */
    public String frontTimes(String str, int n) {
        String result="";
        if(str.length()>3){
            String first3=str.substring(0,3);
            for(int i=0;i<n;i++){
                result=result+first3;
            }
            System.out.println(result);
            return result;

        }else if(str.length()<=3){
            for (int i=0;i<n;i++){
                result=result+str;
            }
            System.out.println(result);
            return result;
        }
        System.out.println(result);
        return result;
    }

    /* 3. Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
        countXX("abcxx") → 1
        countXX("xxx") → 2
        countXX("xxxx") → 3
    */

    int countXX(String str) {
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.substring(i,i+2).equals("xx"))
                count++;
        }
        System.out.println(count);
        return count;
    }

    /* 4. Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
        doubleX("axxbb") → true
        doubleX("axaxax") → false
        doubleX("xxxxx") → true
    */

    boolean doubleX(String str) {
        if((str.contains("x"))){
            int xindex= str.indexOf("x");
            if(str.indexOf("x",xindex+1)==xindex+1) { //
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
    /*
    5. Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

        stringBits("Hello") → "Hlo"
        stringBits("Hi") → "H"
        stringBits("Heeololeo") → "Hello"
    */

    public String stringBits(String str) {
        String results="";
        for(int i=0;i<str.length();i++){
            results=results+String.valueOf(str.charAt(i));
            i++;
        }
        System.out.println(results);
        return results;
    }

/* 6. Given a non-empty string like "Code" return a string like "CCoCodCode".

        stringSplosion("Code") → "CCoCodCode"
        stringSplosion("abc") → "aababc"
        stringSplosion("ab") → "aab"
 */

    public String stringSplosion(String str) {
        String results="";
        for(int i=0;i<str.length();i++){
            String sub=(str.substring(0,i+1));
            results=results+sub;
        }
        System.out.println(results);
        return results;
    }

    /*
    7. Given a string, return the count of the number of times that a substring length 2 appears in the string
        and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

            last2("hixxhi") → 1
            last2("xaxxaxaxx") → 1
            last2("axxxaaxx") → 2
     */

    public int last2(String str) {
        int count=0;
        String first="";
        if(str.length()<2){
            return 0;
        }
        String last=str.substring(str.length()-2);
        for(int i=0;i<str.length()-2;i++){

            if(str.substring(i,i+2).equals(last)){
                count++;
            }


        } System.out.println(count);
        return count;
    }

    /* 8. Given an array of ints, return the number of 9's in the array.
            arrayCount9([1, 2, 9]) → 1
            arrayCount9([1, 9, 9]) → 2
            arrayCount9([1, 9, 9, 3, 9]) → 3
     */

    public int arrayCount9(int[] nums) {
        int count=0;

        for (int i=0; i<nums.length;i++){
            if(nums[i]==9){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    /* 9. Given an array of ints, return true if one of the first 4 elements in the array is a 9.
        The array length may be less than 4.

        arrayFront9([1, 2, 9, 3, 4]) → true
        arrayFront9([1, 2, 3, 4, 9]) → false
        arrayFront9([1, 2, 3, 4, 5]) → false
     */

    public boolean arrayFront9(int[] nums) {
        if(nums.length==0){
            return false;
        }
        if(nums.length>=3){
            for(int i=0;i<nums.length-1;i++)
                if(nums[i]==9){
                    System.out.println(true);
                    return true;
                }
        }else
            for(int n=0;n<nums.length;n++)
                if(nums[n]==9){
                    System.out.println(true);
                    return true;
                }
        System.out.println(false);
            return false;
    }

    /* 10. Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

        array123([1, 1, 2, 3, 1]) → true
        array123([1, 1, 2, 4, 1]) → false
        array123([1, 1, 2, 1, 2, 3]) → true
     */
    public boolean array123(int[] nums) {
        if(nums.length<2){
            System.out.println(false);
            return false;
        }
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

    /* 11. Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. 
           So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
		
		stringMatch("xxcaazz", "xxbaaz") → 3
		stringMatch("abc", "abc") → 2
		stringMatch("abc", "axc") → 0
     */
    
    public int stringMatch(String a, String b) {
    	  int count=0;
    	 int length=Math.min(a.length(),b.length());
    	  for(int i=0;i<length-1;i++){
    	   String one=a.substring(i,i+2);
    	   String two=b.substring(i,i+2);
    	   if(one.equals(two)){
    	     count++;
    	   }
    	 }
    	  System.out.println(count);
    	 return count;
    	 
    	 }

/* 12. Given a string, return a version where all the "x" have been removed. 
    Except an "x" at the very start or end should not be removed.

		stringX("xxHxix") → "xHix"
		stringX("abxxxcd") → "abcd"
		stringX("xabxxxcdx") → "xabcdx"
		
		Reference: 
		
    Iteration 2 (i = 1):
    	Character: 'a'
    	Condition: !(1 > 0 && 1 < 6 && "a".equals("x")) → !(true && true && false) → true
    	Action: Add 'a' to result → result = "xa"
    	Iteration 3 (i = 2):
    	Character: 'x'
    	Condition: !(2 > 0 && 2 < 6 && "x".equals("x")) → !(true && true && true) → false
    	Action: Skip 'x'
    
  */
    
    
    public String stringX(String str) {
    	  String result="";
    	for(int i=0;i<str.length();i++){
    	  if(!(i>0 && i<(str.length()-1) && str.substring(i,i+1).equals("x"))){
    	    result =result+str.substring(i,i+1);
    	  }
    	}
    	System.out.println(result);
    	return result;
    	  
    	}
      
 /*13. Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
		
		altPairs("kitten") → "kien"
		altPairs("Chocolate") → "Chole"
		altPairs("CodingHorror") → "Congrr"
		
			Iteration 1 (i = 0):
				end = 0 + 2 = 2
				Substring: str.substring(0, 2) → "ki"
				result = "ki"
			Iteration 2 (i = 4):
				end = 4 + 2 = 6
				Substring: str.substring(4, 6) → "en"
				result = "kien"
  * 
  */
    public String altPairs(String str) {
    	  String result="";
    	  for(int i=0;i<str.length();i+=4){
    	  int end=i+2;
    	  if(end>str.length()){
    	    end=str.length();
    	  }
    	   result=result+str.substring(i,end);
    	  }
    	  System.out.println(result);
    	  return result;
    	}

    /*14 . Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, 
     * but the "a" can be any char. The "yak" strings will not overlap.

		stringYak("yakpak") → "pak"
		stringYak("pakyak") → "pak"
		stringYak("yak123ya") → "123ya"
     * 
     */
    
    public String stringYak(String str) {
    	  String result="";
    	  String b="yaknashyak";
    	  for(int i=0;i<str.length();i++){
    	   if((i<=(str.length()-3) && str.substring(i,i+3).equals("yak"))){
    	     i+=2;
    	      
    	   }else{
    	    	    result =result+str.substring(i,i+1);
    	   }
    	}
    	  System.out.println(result);
    	return result;
    	}

    
    
    /* 15. Given an array of ints, return the number of times that two 6's are next to each other in the array.
     *  Also count instances where the second "6" is actually a 7.

		array667([6, 6, 2]) → 1
		array667([6, 6, 2, 6]) → 1
		array667([6, 7, 2, 6]) → 1
    */
    
    public int array667(int[] nums) {
    	  int count=0;
    	  for(int i=0;i<nums.length-1;i++)
    	  if((nums[i]==6&&nums[i+1]==6||nums[i]==6&&nums[i+1]==7)){
    	    count++;
    	  }
    	  System.out.println(count);
    	  return count;
    	  
    	}
    /*16. Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
     *  Return true if the array does not contain any triples.

				noTriples([1, 1, 2, 2, 1]) → true
				noTriples([1, 1, 2, 2, 2, 1]) → false
				noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     */
    public boolean noTriples(int[] nums) {
    	  int count=0;
    	  for(int i=0;i<nums.length-2;i++)
    	  if(nums[i]==nums[i+1]&&nums[i+2]==nums[i]){
    		  System.out.println(false);
    	    return false;
    	  }
    	  System.out.println(true);
    	  return true;
    	  
    	}
    
    /* 17. Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value,
     *  followed by the value plus 5, followed by the value minus 1. Additionally the 271 
     *  counts even if the "1" differs by 2 or less from the correct value.
		
		has271([1, 2, 7, 1]) → true
		has271([1, 2, 8, 1]) → false
		has271([2, 7, 1]) → true
     */

    public boolean has271(int[] nums) {
    	  int count=0;
    	  for(int i=0;i<nums.length-1;i++)
    	  if((nums[i]==nums[i]&&nums[i+1]==nums[i]+5&&(nums[i+2]==nums[i]-1 ||nums[i+2]==nums[i]-2||nums[i+2]==nums[i]+1||nums[i+2]==nums[i]-3))){
    	    System.out.println(true);
    		  return true;
    	  }
    	  System.out.println(false);
    	  return false;
    	}

   
    
    


    public static void main(String[] args) {
        WarmUpAdvaced warmUpAdvaced=new WarmUpAdvaced();
        warmUpAdvaced.stringTimes("Boom ", 2);
        warmUpAdvaced.frontTimes("Chocolate", 2);
        warmUpAdvaced.countXX("abcxx");
        warmUpAdvaced.doubleX("xaxbb");
        warmUpAdvaced.stringBits("Hello");
        warmUpAdvaced.stringSplosion("Code");
        warmUpAdvaced.last2("hihihihixxhi");
        warmUpAdvaced.arrayCount9(new int[]{1, 9,9,7,9,8,99,6,6, 9});
        warmUpAdvaced.arrayFront9(new int[]{1, 2, 9, 3, 4});
        warmUpAdvaced.array123(new int[]{1, 1, 2, 3, 1});
        warmUpAdvaced.stringMatch("xxxcxc", "xcvxcv");
        warmUpAdvaced.stringX("xboomxxeshx");
        warmUpAdvaced.altPairs("abcdefghijkl");
        warmUpAdvaced.stringYak("booyakmensghgfhgsdc");
        warmUpAdvaced.array667(new int[] {6,6,7,1});
        warmUpAdvaced.noTriples(new int[] {1,1,1,2,3,2});
        warmUpAdvaced.has271(new int[] {2,7,0 ,3,8,2});
        
        
        
    }

}
