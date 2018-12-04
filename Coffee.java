package realinheritenceexample;

class Coffee extends Beverage { // the extends is the inheritence; allows this Coffee class to use functions defined in the Beverage Class
	
	public Coffee() {

	}
	
	public void addSugar(int cubes) {

		System.out.println("You added " + cubes + " sugar cubes.");

	}

	public static void main(String[] args) {
            
            Coffee myOrder = new Coffee(); // creating an object, yes you can create multiple objects like this
            Coffee jacobOrder = new Coffee(); // ta-da!

            myOrder.addSugar(2); // calling the addSugar method on the myOrder object with passed integer value
            myOrder.isFull(); // calling a method from a different class! Inheritence!
                 
	}
}
