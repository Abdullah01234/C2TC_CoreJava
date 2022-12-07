import java.util.Random;
public class RelationalLogicalOperator {

	public static void main(String[] args) {	
		
	
//Ques:Write a Program to understand how that Operator doing to work?
//Ques:Have you heard about class called Random?
//Ans:Now we are creating classes saying FirstProgram, TernaryOperator, RelationalLogicalOperator. Same way there is inbuilt class called Random. So, I am going to called that class Random; 
//Random rand = new Random();after that for which class you want to create object, you will be telling the (new) keyword Create a object.This two word (new Random();) alone with create object, after creating object you are giving a variable to integrate object, that can be any variable name I will give (rand) and that variable should be same as your class I will be giving (Random);
          Random rand = new Random(); //object creation
//Ques:what are doing here upper in 10 line program;
//In upper 11 line we are creating an object.So,java is going to be an object oriented programming language.So for each every class we will be creating object.
//How will be create object is?(new) keyword will help you to create object.
// Random obj = new Random();after that for which class you want to create object, you will be telling the (new) keyword Create a object.This two word (new Random(); alone with create object, after creating object you are giving a variable to integrate object, that can be any variable name I will give (obj), and that variable should be same as your class I will be giving (Random);
        int i =rand.nextInt(100); //flexibility number will be automatically changed 
		int j =rand.nextInt(100); //flexibility number will be automatically changed
		System.out.println("i:" + i); //35
		System.out.println("j:" + j); //70
		System.out.println(i>j); //False (Greater than Operator)
		System.out.println(i<j); //True  (Lesser than Operator)
		System.out.println(i>=j); //False (Greater than Equal Operator)
		System.out.println(i<=j); //True  (Lesser than Equal Operator)
		System.out.println(i==j); //False  (equal to equal Operator)
		System.out.println(i!=j); //True    (Not equal to Operator)
		
		System.out.println((i<10) && (j<10)); //F && F = F 
		System.out.println((i<10) || (j<10)); //F || F = F

	}

}