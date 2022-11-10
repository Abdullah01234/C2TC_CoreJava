import java.util.Random;
public class RelationalLogicalOperator {

	public static void main(String[] args) {	
		
		//How will be create object? new keyword will help you to create object.
		//Ques:Write a Program to understand how that Operator going to work?
		//Ans:Before we are creating classes saying that like FirstProgram, TernaryOperator, same way creating class is ReationalLogicalOperator, there is inbuilt class called Random. So, I am saying that class: -
          Random rand = new Random(); //object creation
		//Ques:So, what are doing here upper in line program;
		//We are creating an object.So,java is going to be a object oriented programming language.So for each every class we will be creating object.
		//new Random (); these are two-word line will be creating your object. After creating object,
          
		int i =rand.nextInt(100);
		int j =rand.nextInt(100);
		System.out.println("i:" + i); //35
		System.out.println("j:" + j); //70
		System.out.println(i>j); //False
		System.out.println(i<j); //True
		System.out.println(i>=j); //False
		System.out.println(i<=j); //True
		System.out.println(i==j); //False
		System.out.println(i!=j); //True
		
		System.out.println((i<10) && (j<10)); //F && F = F 
		System.out.println((i<10) || (j<10)); //F || F = F

	}

}