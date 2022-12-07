
public class SecondProgram {

	public static void main(String[] args) {
		
		int namA=5;
		int namB=10;
		int namC=0;
//Note:- Whenever you have the increment and decrement before your variable or after the variable, How does it works?
//if you have before your variable (--numC) the operation will be taken first (--) then the value (numC) will be perform.
//if you have after your variable (numB--) the value will be taken first (numB) then the operation (--) will be perform.   
//I am doing to do some operation before and after printing this value.
		int namD=--namC + namB--; // (--0 PRE-DECREMENT (0-1) =-1) + (10-- POST-DECREMENT= 10only)(-1 + 10 = 9)
		
//--namC (before variable is called as PRE-DECREMENT)
		System.out.println(namC); // (--0 PRE-DECREMENT (0-1) =-1))
		
//namB-- (after variable is called as POST-DECREMENT)
		System.out.println(namB); // (10-- POST-DECREMENT (10-1) = 9))
		
		System.out.println(namD); // (-1 + 10 = 9)
//Note:- Whenever you have the increment and decrement before your variable or after the variable, How does it works?
//if you have before your variable (++numB) the operation will be taken first (++) so, then the value (numB) will be perform.
//if you have after your variable (numA++) the value will be taken first (numA) then the operation (++) will be perform.
//I am doing to do some operation before and after printing this value.
		int namE=++namB + namA++; // (9 is the updated value before So it become 9+1(PRE_INCREMENT) = 10) + (5 POST-INCREMENT) = 5) (10+5 = 15)
		
//++namB (before the variable is called as PRE-INCREMENT)
		System.out.println(namB); // (10 PRE-INCREMENT =10 only)
		
//namA++ (after the variable is called as POST-INCREMENT)
		System.out.println(namA); // (5 POST-INCREMENT 5+1=6)
		
		System.out.println(namE); // (10+5 = 15)
		
//Output
//-1
//9
//9
//10
//6
//15

	}

}
