package shape;

/**
 * The _09TriangularPrism class represents a triangular prism shape with a specified height and side length.
 * It extends the _07Prism class and provides implementations for calculating the base area and volume
 * of the triangular prism.
 */
public class _09TriangularPrism extends _07Prism
{
	/**
     * Constructs a triangular prism with the specified height and side length.
     * 
     * @param height The height of the triangular prism.
     * @param side   The side length of the triangular prism.
     */
	public _09TriangularPrism(double height, double side)
	{
		super(height, side);
	}

	/**
     * Calculates the base area of the triangular prism.
     * 
     * @return The base area of the triangular prism, which is the area of an equilateral triangle.
     */
	@Override
	public double calcBaseArea()
	{
		double side = getSide();
		return Math.pow(side, 2) * Math.sqrt(3) / 4.0;
	}	
	
	/**
     * Returns a string representation of the triangular prism, including its side length, height,
     * base area, and volume.
     * 
     * @return A string representation of the triangular prism.
     */
	@Override
	public String toString() {
	    return String.format("%-15s : Side   = %8.2f  ||  Height = %8.2f  ||  Area = %13.2f  ||  Volume = %18.2f",
	            "TriangularPrism", getSide(), getHeight(), calcBaseArea(), calcVolume());
	}
	
}