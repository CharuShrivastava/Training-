package program;

class Car1 {

	public static void main(String[] args) {
		VolvoCar obj = new VolvoCar();
		obj.drivingType();
	}
}

class VolvoCar{
	String colour;
	int modelNum;
	public void drivingType(){
		System.out.println("I am in Driving type Method");
	}

}