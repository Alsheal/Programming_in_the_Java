package bikeproject;

public class BikeDriver {

	public static void main() {

		RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip",
								"comfort", 14, 25, 18);
		MountainBike bike3 = new MountainBike();
		Bike bike4 = new Bike();

		bike1.printDescription();
		bike2.printDescription();
		bike3.printDescription();
		bike4.printDescription();

		bike1.setPostHeight(20);

		System.out.println("\n--- After update ---");
		bike1.printDescription();
	}//end method main
}//end class BikeDriver