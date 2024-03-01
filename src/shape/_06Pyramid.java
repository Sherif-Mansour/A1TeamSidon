package shape;

/**
 * The _06Pyramid class represents a pyramid shape with a specified height and side length.
 * It extends the _03Shape class and implements methods to calculate the base area
 * and volume of the pyramid.
 */
public class _06Pyramid extends _03Shape
{
	private double side;

	/**
     * Constructs a pyramid with the specified height and side length.
     * 
     * @param height The height of the pyramid.
     * @param side   The side length of the pyramid.
     */
	public _06Pyramid(double height, double side)
	{
		super(height);
		this.side = side;
	}

	/**
     * Gets the side length of the pyramid.
     * 
     * @return The side length of the pyramid.
     */
	public double getSide()
	{
		return side;
	}

	/**
     * Sets the side length of the pyramid.
     * 
     * @param side The new side length of the pyramid.
     */
	public void setSide(double side)
	{
		this.side = side;
	}

	/**
     * Calculates the base area of the pyramid.
     * 
     * @return The base area of the pyramid.
     */
	@Override
	public double calcBaseArea()
	{
		return Math.pow(side, 2);
	}

	/**
     * Calculates the volume of the pyramid.
     * 
     * @return The volume of the pyramid.
     */
	@Override
	public double calcVolume()
	{
		return 1 / 3.0 * calcBaseArea() * getHeight();
	}

	/**
     * Returns a string representation of the pyramid.
     * 
     * @return A string containing details about the pyramid, including its side length, height,
     *         base area, and volume.
     */
	@Override
	public String toString() {
	    return String.format("%-15s :  Side   = %15.2f  ||  Height = %15.2f  ||  Area = %20.2f  ||  Volume = %25.2f",
	            "Pyramid", getSide(), getHeight(), calcBaseArea(), calcVolume());
	}
}