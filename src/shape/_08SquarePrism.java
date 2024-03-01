package shape;

/**
 * The _08SquarePrism class represents a square prism shape with a specified height and side length.
 * It extends the _07Prism class and provides implementations for calculating the base area and volume
 * of the square prism.
 */
public class _08SquarePrism extends _07Prism
{
	/**
     * Constructs a square prism with the specified height and side length.
     * 
     * @param height The height of the square prism.
     * @param side   The side length of the square prism.
     */
	public _08SquarePrism(double height, double side)
	{
		super(height, side);
	}
	
	/**
     * Calculates the base area of the square prism.
     * 
     * @return The base area of the square prism, which is the square of the side length.
     */
	@Override
	public double calcBaseArea()
	{
		double side = getSide();
		return Math.pow(side,  2);
	}
	
	/**
     * Calculates the volume of the square prism.
     * 
     * @return The volume of the square prism, which is the product of the base area and height.
     */
	@Override
	public double calcVolume()
	{
		double side = getSide();
		return Math.pow(side, 2) * getHeight();
	}

	/**
     * Returns a string representation of the square prism, including its side length, height,
     * base area, and volume.
     * 
     * @return A string representation of the square prism.
     */
	@Override
	public String toString() {
	    return String.format("%-15s :  Side   = %15.2f  ||  Height = %15.2f  ||  Area = %20.2f  ||  Volume = %25.2f",
	            "SquarePrism", getSide(), getHeight(), calcBaseArea(), calcVolume());
	}
}