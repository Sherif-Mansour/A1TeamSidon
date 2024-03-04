package shape;

/**
 * The _10PentagonalPrism class represents a pentagonal prism shape with a specified height and side length.
 * It extends the _07Prism class and provides implementations for calculating the base area and volume
 * of the pentagonal prism.
 */
public class _10PentagonalPrism extends _07Prism
{
	/**
     * Constructs a pentagonal prism with the specified height and side length.
     * 
     * @param height The height of the pentagonal prism.
     * @param side   The side length of the pentagonal prism.
     */
	public _10PentagonalPrism(double height, double side)
	{
		super(height, side);
	}

	/**
     * Calculates the base area of the pentagonal prism.
     * 
     * @return The base area of the pentagonal prism, which is the area of a regular pentagon.
     */
	@Override
	public double calcBaseArea()
	{
		double side = getSide();
		double degrees = 54;
		double radians = Math.toRadians(degrees);
		return 5 * Math.pow(side, 2) * Math.tan(radians) / 4;
	}

	/**
     * Returns a string representation of the pentagonal prism, including its side length, height,
     * base area, and volume.
     * 
     * @return A string representation of the pentagonal prism.
     */
	@Override
	public String toString() {
	    return String.format("%-15s : Side   = %8.2f  ||  Height = %8.2f  ||  Area = %13.2f  ||  Volume = %18.2f",
	            "PentagonalPrism", getSide(), getHeight(), calcBaseArea(), calcVolume());
	}
	
}