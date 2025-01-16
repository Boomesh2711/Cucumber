package InterviewPrograms;

public class SwapNumber {
	
	
	
	
	public void WiththirdVariable() {
		
		int CTSCTC=450000;
		int TCSCTC=900000;
		System.out.println("Swapping two values using temp variable");
		System.out.println("Before swapping CTSCTC:"+CTSCTC+ " Before Swappping TSCCTC:"+TCSCTC);
		int temp=CTSCTC;
		
		CTSCTC=TCSCTC;
		TCSCTC=temp;
		
		System.out.println("After swapping CTSCTC:"+CTSCTC+" After Swappping TSCCTC:"+TCSCTC);
			
		
	}
	public void WithoutThirdVariable() {
		
		int first=10;
		int second=20;
		System.out.println("Using add and sub Before swapping First:"+first+" Second:"+second);
		first=first+second;  	 //first=10+20
		second=first-second; 	//second=30-20
		first=second-first;	   //first=10-30
		
		System.out.println("Using add and sub After swapping First:"+first+" Second:"+second);
		
		int third=10;
		int fourth=20;
		System.out.println("Using add and sub Before swapping third:"+third+" fourth:"+fourth);
		third=third*fourth;  	 //third=10*20=200
		fourth=third/fourth; 	//fourth=200/20=10
		third=third/fourth;	   //third=200/10=20
		
		System.out.println("Using add and sub After swapping third:"+third+" fourth:"+fourth);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwapNumber swap=new SwapNumber();
		swap.WithoutThirdVariable();
		swap.WiththirdVariable();
		
		
		

	}

}
