import java.util.Random;
public class RelationalLogicalOperator {

	public static void main(String[] args) {
		//You are creating an object.So,java is going to be a object oriented programming language.So for each every class we will be creating object.
		//How will be create object? new keyword will help you to create object.
		Random rand = new Random();
		
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