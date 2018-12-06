import java.util.Scanner;

public class Point {
	
    public int x = 0;
    public int y = 0;
    public static Rectangle A;
    
    //constructor
    public Point(int a, int b) {
        x = a;
        y = b;
    }
    
   
    
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	System.out.println("Type a height then a width.");
    	int h = input.nextInt();
    	int w = input.nextInt();
    	
    	A = new Rectangle(h,w);
    	System.out.println("Area = " + A.getArea());
	}
}
