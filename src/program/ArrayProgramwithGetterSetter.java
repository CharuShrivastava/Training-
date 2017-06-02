package program;

public class ArrayProgramwithGetterSetter {

	int numColor;
	String strColour1 ;
	String strColour2 ;
	String[] arrColour;	
	String[] arrVal ;


	private void setColor (int num){
		numColor =num;
	}
	
	private void setColor (String colour , int num){
		numColor =num;
		strColour1 = colour;
		
	}
	
	private void setColor (String[] arr){   //Array.toStting()
		arrColour =arr;
	}
	
	private void getColorprice (){
		System.out.println("My color is " + strColour1 + "  and its Price is : " +numColor );
		
	}


	private void getColor (){
		System.out.println("integet color is " + numColor);
		
	}

	private void setColor(String color1 , String color2){
		strColour1 = color1;
		strColour2 = color2;
	}

	private void getStringColor(){
		
		System.out.println("String color is " + strColour1 +strColour2);
		
	
	}
	
private void getArrayColor(){
	for (int i=0;i<arrColour.length;i++){
		
		System.out.print( arrColour[i]);
		
	}
}
	/*public String[] getArrayColorwithreturn(){
		
			return  ;
			
		}
	}*/
	
	public static void main(String[] args) {
		
		String[] arr = {"Red " , "Green ", "Yellow " , "Blue " };

		ArrayProgramwithGetterSetter obj =new ArrayProgramwithGetterSetter();		

		obj.setColor(100);
		obj.getColor();
		
		obj.setColor("Green :", " Red");
		obj.getStringColor();

		
	   obj.setColor("Red", 100);
		obj.getColorprice();
		
		obj.setColor(200);
		obj.getColor();
		
		obj.setColor(arr);
		obj.getArrayColor();
	}


}
