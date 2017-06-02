package program;

public class Planet {
	String name ;
	String shape ;
	double distance ;


	public void setPlanetProperty(String strName ){
		name = strName;

	}
	public void setPlanet( String strShape){
		shape = strShape ;

	}
	public void setPlanetProperty( double dis){
		distance = dis;
	}
	public String getPlanetName(){
		return name;
	}

	public double getPlanetDistance(){
		return distance ;
	}
	
	public static void main (String args[]){
		
	Planet Mars =new Planet();
	Planet Earth =new Planet();
	
	Mars.setPlanet("Round");
	Mars.setPlanetProperty("Mars");
	Mars.setPlanetProperty(10.4);
	
	System.out.println("This is Mars planet property : " +Mars.name+" "+Mars.shape+" "+Mars.distance );
	
	Earth.setPlanet("Spherical");
	Earth.setPlanetProperty("Earth");
	Earth.setPlanetProperty(80.5);
	
	System.out.println("This is Earth planet property : " +Earth.name+" "+Earth.shape+" "+Earth.distance );
	

	
}
}
