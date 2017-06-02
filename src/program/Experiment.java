package program;

class Experiment extends abc {

	public static void main(String[] args) {

		abc obj = new abc();
		obj.add(100,200);
		obj.multiplication(10, 20);
	}
}

class abc  {

	public void multiplication(int c , int d){

		int m = c*d ;
		System.out.println("multiplication is :" +m);
	}
	public void add(int a , int b){

		int sum = a+b ;
		System.out.println("Addition is :" +sum);
	}

}

