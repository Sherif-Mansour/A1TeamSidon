package shape;

/**
 * Abstract class representing a geometric shape with a height.
 * Subclasses must implement methods to calculate base area
 * and volume. Implements Comparable interface to compare 
 * shapes based on height.
 */
public abstract class _03Shape implements Comparable<_03Shape>
{
	private double height;
	
	/**
	 * Constructs a new shape with the specified height.
	 * 
	 * @param height	The height of the shape.
	 */
	public _03Shape(double height)
	{
		super();
		this.height = height;
	}
	
	/**
	 * Gets the height of the shape.
	 * 
	 * @return	The height of the shape.
	 */
	public double getHeight()
	{
		return height;
	}
	
	/**
	 * Sets the height of the shape.
	 * 
	 * @param height	The new height of the shape.
	 */
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	/**
	 * Compares the height of a Shape with the height of another Shape for ordering.
	 * 
	 * @param other 	The other height of the shape to compare.
	 * @return 			A negative integer, zero, or a positive integer indicating whether the 
	 * 					height of this shape is less than, equal to, or greater than the height 
	 * 					of the other shape, respectively.
	 */
	@Override
	public int compareTo(_03Shape other)
	{
		if (this.height < other.height) {
	        return 1;
	    } else if (this.height > other.height) {
	        return -1;
	    } else {
	        return 0;
	    }
	}
	
	/**
	 * Calculates the base area of the shape.
	 * 
	 * @return	The base area of the shape.
	 */
	public abstract double calcBaseArea();
	
	/**
	 * Calculates the volume of the shape.
	 * 
	 * @return The volume of the shape.
	 */
	public abstract double calcVolume();
}