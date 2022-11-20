
public class ThirdProgram {

	public static void main(String[] args) {
		
		int namA=5;
		int namB=10;
		int namC=11;
//Note:- Whenever you have the increment and decrement before your variable or after the variable, How does it works?
//if you have before your variable (++numB) the operation will be taken first (++) then the value (numB) will be perform.
//if you have after your variable (numA++) the value will be taken first (numA) then the operation (++) will be perform.
		//I am doing to do some operation before and after printing this value
		int namE=++namB + namA++; // (10 PRE_INCREMENT (10 only) + (5 POST-INCREMENT) (5+1) 6) (10 + 6 = 16)
		
		//++namB (before the variable is called as PRE-INCREMENT)
	     System.out.println(namB); // (10 PRE-INCREMENT 10+1 = 11)
	     
	   //namA++ (after the variable is called as POST-INCREMENT)
	     System.out.println(namA); // (5 POST-INCREMENT 5+1 = 6)
	     
	     System.out.println(namE); // (10+6 = 16)
	}

}
