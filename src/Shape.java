


abstract class Shape {
	// Methods for surface area and volume
	abstract double surface_area();
	abstract double volume();
}

class Sphere extends Shape {
	// Attributes
	private double radius;
	
	// Parameterized constructor
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	// Method to compute surface area
	public double surface_area() {
		return 4 * Math.PI * Math.pow(radius,  2);
	}
	
	// Methods to compute volume 
	public double volume() {
		return (4.0/3.0) * Math.PI * Math.pow(radius,  3);
	}
	
	// toString method to print surface area and volume 
	public String toString() {
		return "Sphere: Surface Area = " + surface_area() + ", Volume = " + volume();
	}
 }



class Cylinder extends Shape {
	// Attributes
	private double radius;
	private double height;
	
	// Parameterized constructor
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	// Method to compute surface area
	public double surface_area() {
		return 2 * Math.PI * radius * (radius + height);
	}
	
	// Method to compute volume
	public double volume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	// toString method to print surface area and volume
	public String toString() {
		return "Cylinder: Sureface Area = " + surface_area() + ", Volume: " + volume();
	}
}

// Cone class extending Shape
class Cone extends Shape {
	//Attributes
	private double radius;
	private double height;
	
	// Parameterized constructor
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	// Method to compute surface area
	public double surface_area() {
		return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
	}
	
	// Mehtod to compute volume
	public double volume() {
		return (1.0/3.0) * Math.PI * Math.pow(radius,  2) * height;
	}
	
	// toString method to print surface area and volume
	public String toString() {
		return "Cone: Surface Area: " + surface_area() + ", volume =" + volume();
	}
}





























