
/**
 * @author Romeo Bahoumda
 * @version 2071.02.12
 *
 */
public class Rectangle implements Shape {
    private double width;
    private double length;
    
    /**
     * No args constructor
     */
    public Rectangle(){
    	this.width = 0;
    	this.length = 0;
    }
    /**
     * args constructor
     * @param width of 
     * @param length of
     */
    public Rectangle(double width, double length) {
    	this.width = width;
    	this.length = length;
    }
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	@Override
	public double Area() {
		return this.getLength() * this.getWidth();
	}
	@Override
	public double Perimeter() {
		return 2 * (this.getLength() + this.getWidth());
	}
}
