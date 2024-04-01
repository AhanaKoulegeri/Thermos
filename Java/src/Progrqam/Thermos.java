package Progrqam;

public class Thermos {
	private double availableVolume;
	private String brand;
	private String liquid;
	
	public Thermos(String brand) {
		this.availableVolume=0.0;
		this.brand=brand;
		this.liquid="";
	}
	public void addLiquid(String liquidName, double volume) {
		if (volume<= 0) {
			System.out.println("Volume should be greater than 0.");
			return;
		}
		if (availableVolume + volume > 1.0) {
			System.out.println("Thermos capacity exceeded. Cannot add more liquid.");
			return;
		}
		this.liquid=liquidName;
		this.availableVolume += volume;
		System.out.println(volume + "litres or " + liquidName + " added to the thermos.");
	}
	public void pourliquid(double volume) {
		if (volume <=0) {
			System.out.println("Volume should be greater than 0.");
			return;
		}
		if (volume > availableVolume) {
			System.out.println("Volume should be greater than 0.");
			return;
		}
		availableVolume -= volume;
		System.out.println(volume + " litres of " + liquid + " poured out of the thermos.");
	}
	public void displayDetails() {
		System.out.println("Thermos Brand: " + brand);
		System.out.println("Available Volume: " + availableVolume + " litres");
		if(!liquid.isEmpty()) {
			System.out.println("Liquid: " + liquid);
		}
		else {
			System.out.println("Liquid: Thermos is empty");
		}
	}
	public static void main(String[] args) {
		Thermos myThermos=new Thermos("Godrej");
		myThermos.displayDetails();
		
		myThermos.addLiquid("Orange juice", 0.5);
		myThermos.displayDetails();
		myThermos.addLiquid("water", 0.7);
		myThermos.displayDetails();
	}
	

}



