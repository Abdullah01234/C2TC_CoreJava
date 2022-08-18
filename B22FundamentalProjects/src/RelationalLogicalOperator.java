import java.util.Random;
public class RelationalLogicalOperator {

	public static void main(String[] args) {
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