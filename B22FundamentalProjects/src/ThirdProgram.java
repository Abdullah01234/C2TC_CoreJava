
public class ThirdProgram {

	public static void main(String[] args) {
		
		int namA=5;
		int namB=10;
		int namC=11;
	
		//I am going to do some operation before printing this value
		int namE=++namB + namA++; // (10 PRE_INCREMENT (10+1)=11) + (5 POST-INCREMENT)= 16))
		
		//++namB (before the variable is called as PRE-INCREMENT)
	     System.out.println(namB); // (10 PRE-INCREMENT (10+1)=11)
	     
	   //namA++ (after the variable is called as POST-INCREMENT)
	     System.out.println(namA); // (5 POST-INCREMENT 5+1=6)
	     
	     System.out.println(namE); //16 (10+6)

	}

}
