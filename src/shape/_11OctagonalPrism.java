package shape;

/**
 * The `_11OctagonalPrism` class represents an octagonal prism shape with a specified height and side length.
 * It extends the `_07Prism` class and provides implementations for calculating the base area and volume
 * of the octagonal prism.
 */
public class _11OctagonalPrism extends _07Prism
{
	/**
     * Constructs an octagonal prism with the specified height and side length.
     * 
     * @param height The height of the octagonal prism.
     * @param side   The side length of the octagonal prism.
     */
	public _11OctagonalPrism(double height, double side)
	{
		super(height, side);
	}
	
	/**
     * Calculates the base area of the octagonal prism.
     * 
     * @return The base area of the octagonal prism.
     */
	@Override
	public double calcBaseArea()
	{
		double side = getSide();
		return 2 * (1 + Math.sqrt(2)) * Math.pow(side, 2);
	}
	
	/**
     * Returns a string representation of the octagonal prism, including its side length, height,
     * base area, and volume.
     * 
     * @return A string representation of the octagonal prism.
     */
	@Override
	public String toString() {
	    return String.format("%-15s : Side   = %8.2f  ||  Height = %8.2f  ||  Area = %13.2f  ||  Volume = %18.2f",
	            "OctagonalPrism", getSide(), getHeight(), calcBaseArea(), calcVolume());
	}	
}