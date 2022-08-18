
public class SecondProgram {

	public static void main(String[] args) {
		
		int namA=5;
		int namB=10;
		int namC=0;
		
		//I am going to do some operation before printing this value
		int namD=--namC + namB--; // (--0 PRE-DECREMENT =-1) + (10++POST-DECREMENT= 10 only)=9
		System.out.println(namC); // (--0 PRE-DECREMENT =-1)
		//--namC (before variable is called as PRE-DECREMENT)
		System.out.println(namB); // (10++ POST-DECREMENT 10-1=9)
		//namB-- (after variable is called as POST-DECREMENT)
		System.out.println(namD); // 9

	}

}
