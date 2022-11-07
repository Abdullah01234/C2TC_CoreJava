
public class ExampleProgram {

	public static void main(String[] args) {
		int numA=15;
		int numB=7;
		int numC=4;
		
	   int numD =--numC + numB--; // 3+7 = 10
	   System.out.println(numC); //4-1=3
	   System.out.println(numB); //7-1=6
	   System.out.println(numD); //10
	   int numE =++numC + numA++; // 4+15 =19
		System.out.println(numC); //5-1 =4
		System.out.println(numA); //15+1=16
		System.out.println(numE); //19
	   
	   
		

	}

}
