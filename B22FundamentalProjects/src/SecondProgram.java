
public class SecondProgram {

	public static void main(String[] args) {
		
		int namA=5;
		int namB=10;
		int namC=0;
		
		//I am going to do some operation before printing this value
		int namD=--namC + namB--; // (--0 PRE-DECREMENT (0-1) =-1) + (10++POST-DECREMENT= 10)(-1 + 10)= 9
		
		//--namC (before variable is called as PRE-DECREMENT)
		System.out.println(namC); // (--0 PRE-DECREMENT (0-1) =-1))
		
		//namB-- (after variable is called as POST-DECREMENT)
		System.out.println(namB); // (10++ POST-DECREMENT (10-1)=9))
		
		System.out.println(namD); // 9; (-1 + 10)
		
		int namE=++namB + namA++; // (9PRE_INCREMENT (9+1)=10)+(5 POST-INCREMENT)= 15)
		
		//++namB (before the variable is called as PRE-INCREMENT)
		System.out.println(namB); // (10 PRE-INCREMENT =10 only)
		
		//namA++ (after the variable is called as POST-INCREMENT)
		System.out.println(namA); // (5 POST-INCREMENT 5+1=6)
		
		System.out.println(namE); //15; (10+5)

	}

}
