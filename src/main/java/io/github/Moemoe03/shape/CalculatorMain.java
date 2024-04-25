package io.github.Moemoe03.shape;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
    	rectangle.setWidth(5.0);
    	rectangle.setLength(2.0);
    	System.out.println(rectangle.area());

    	Square square = new Square();
    	square.setSide(2.0);
    	System.out.println(square.area());
	}

}
