package shape;

/**
 * The _07Prism class represents a prism shape with a specified height and side length.
 * It extends the _03Shape class and provides an abstract method to calculate the base area
 * of the prism. Subclasses of _07Prism are expected to implement the calcBaseArea() method.
 */
public abstract class _07Prism extends _03Shape
{
	private double side;
	
	/**
     * Constructs a prism with the specified height and side length.
     * 
     * @param height The height of the prism.
     * @param side   The side length of the prism.
     */
	public _07Prism(double height, double side)
	{
		super(height);
		this.side = side;
	}
	
	/**
     * Gets the side length of the prism.
     * 
     * @return The side length of the prism.
     */
	public double getSide()
	{
		return side;
	}
	
	/**
     * Sets the side length of the prism.
     * 
     * @param side The new side length of the prism.
     */
	public void setSide(double side)
	{
		this.side = side;
	}
	
	/**
     * Calculates the volume of the prism.
     * 
     * @return The volume of the prism, which is the product of the base area and height.
     */
	@Override
	public double calcVolume()
	{
		return calcBaseArea() * getHeight();
	}
}