package program;

public class ArrayProgramwithGS {

	int numColor;
	String strColour1 ;
	String strColour2 ;
	String[] arrColour;	
	String[] arrVal ;



	
	private void setColor (String[] arr){
		arrColour =arr;
	}
	
private void getArrayColor(){
	for (int i=0;i<arrColour.length;i++){
		
		System.out.print( arrColour[i]);
		
	}
}
	
	
	public static void main(String[] args) {
		
		String[] arr = {"Red " , "Green ", "Yellow " , "Blue " };

		ArrayProgramwithGS obj =new ArrayProgramwithGS();		

		obj.setColor(arr);
		obj.getArrayColor();
	}


}
