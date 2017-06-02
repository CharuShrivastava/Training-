package program;

public class Exceptionhandled {

	public static void main(String[] args) {

		int[] arrNum ={1,3,5,6,};
		int i=1;
		try {
			System.out.println("Print "+arrNum[3]);
			System.out.println(i/0);			
		}						
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Trying to get the value which is not present");
		}
		catch (ArithmeticException e){
			System.out.println("Trying to devide by Zero which is not possible");
		}

		finally {
			System.out.println("This is finally block");
		}
	}


}


