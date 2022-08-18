 	
public class TernaryOperator {

	public static void main(String[] args) {
		
		int v=1;
  //Whenever you have to question mark(?)and colon(:) together then that's a Ternary Operator
  //if your output is TRUE, before your question mark(?),Then Consider the value before a colon(:)
  //Output of the first printing statement is A. 
		System.out.println(v==1?"A":"B"); //T? //A
  //if your output is FALSE, after your question mark(?), Then consider the value after a colon(:)
		//Output of the Second printing statement is B.
		System.out.println(v==2?"A":"B"); //F? //B

	}

}
