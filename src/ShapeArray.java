// Driver class Shape Array
public class ShapeArray {
	public static void main(String[] args) {
		// Instantiate one Sphere
		Sphere sphere = new Sphere(5.0);
		//Instantiate one cylinder
		Cylinder cylinder = new Cylinder(3.0, 7.0);
		//Instantiate one cone
		Cone cone = new Cone(4.0, 6.0);
		
		// Store instances into an array
		Shape[] shapeArray = {sphere, cylinder, cone};
		
		// Loop through the array and print instance data
		for (Shape shape : shapeArray) {
			System.out.println(shape.toString());
		}
 	}
}