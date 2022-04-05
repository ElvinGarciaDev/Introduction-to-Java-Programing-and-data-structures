package garcia.elvin;

public class Shapes {

    public static void main(String[] args) {
	// write your code here
        Rectangle rec1 = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle(3.5, 35.9);

        System.out.print("Width of rectangle #1 is " + rec1.getWidth());
        System.out.print("\nHeight of rectangle #1 is " + rec1.getHeight());
        System.out.print("\nArea of rectangle #1 is " + rec1.getArea());
        System.out.print("\nPerimeter of rectangle #1 is " + rec1.getPerimeter());

        System.out.println();

        System.out.print("\nWidth of rectangle #1 is " + rec2.getWidth());
        System.out.print("\nHeight of rectangle #1 is " + rec2.getHeight());
        System.out.print("\nArea of rectangle #1 is " + rec2.getArea());
        System.out.print("\nPerimeter of rectangle #1 is " + rec2.getPerimeter());
    }
}
