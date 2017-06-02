package program;

public class Mul extends SumDiff {

	public void multiplication(int c , int d){
		
		int m = c*d ;
		System.out.println("multiplication is :" +m);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mul onj =new Mul();
		
		onj.multiplication(10, 20);
		onj.add(10,20);
		onj.diff(300, 100);
		onj.division(200, 100);
		
			
		
	}

}
