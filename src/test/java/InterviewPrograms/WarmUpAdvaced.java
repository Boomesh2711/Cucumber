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

    }

}
