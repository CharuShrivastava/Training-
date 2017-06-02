package program;

public class GetterSetter {
	
	String strColor;
	
	private void setColor(String color){
		strColor = color;
		
	}

	private String getColor(){
		System.out.println("My Color is " + strColor );
		return strColor;
	}
	
	public static void main(String args[]){
		GetterSetter objCar = new GetterSetter();
		objCar.setColor("Green");
		objCar.getColor(); 
	}
}
