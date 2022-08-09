package day1;

class PEN2 {
	static String Bname;
	String color, type;
	int price;

	public void writing() // Method Declaration
	{
		System.out.println("PEN is Writing");
	}

	public void getDetails() {
		System.out.println("Brand NAme is " + Bname);
		System.out.println("COlor is " + color);
		System.out.println("Type is " + type);
		System.out.println("Price is " + price);
	}
}

class MarkerPEN extends PEN2 {
	
	
}

public class PenRunner {

	public static void main(String[] args) { // HUman prem=new Human()

		PEN2.Bname = "Natraj";
		PEN2 p1 = new PEN2();
		// p1.Bname="Natraj";
		p1.color = "Black";
		p1.type = "Ball Pen";
		p1.price = 5;

		p1.writing();
		p1.getDetails();

		PEN2 p2 = new PEN2();
		// p2.Bname="Natraj";
		p2.color = "Blue";
		p2.type = "Ball Pen";
		p2.price = 5;

		p2.writing();
		p2.getDetails();
	}

}
