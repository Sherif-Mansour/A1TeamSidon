package shape;

/**
 * The _05Cone class represents a cone shape with a specified
 * height and radius. It extends the abstract class _03Shape and 
 * implements methods to calculate the base area and volume of a 
 * cone.
 */
public class _05Cone extends _03Shape
{
	private double radius;

	/**
	 * Constructs a cone with the specified height and radius.
	 * 
	 * @param height	The height of the cone. 
	 * @param radius	The radius of the cone. 
	 */
	public _05Cone(double height, double radius)
	{
		super(height);
		this.radius = radius;
	}
	
	/**
     * Gets the radius of the cone.
     * 
     * @return 	The radius of the cone.
     */
	public double getRadius()
	{
		return radius;
	}

	/**
     * Sets the radius of the cone.
     * 
     * @param radius 	The new radius of the cone.
     */
	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	/**
     * Calculates the base area of the cone.
     * 
     * @return 	The base area of the cone.
     */
	@Override
	public double calcBaseArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	/**
     * Calculates the volume of the cone.
     * 
     * @return The volume of the cone.
     */
	@Override
	public double calcVolume()
	{
		return 1 / 3.0 * calcBaseArea() * getHeight();
	}

	/**
     * Returns a string representation of the cone.
     * 
     * @return 	A string containing details about the cone, 
     * 			including its radius, height, base area, and volume.
     */
	@Override
	public String toString() {
	    return String.format("%-15s : Radius = %8.2f  ||  Height = %8.2f  ||  Area = %13.2f  ||  Volume = %18.2f",
	            "Cone", getRadius(), getHeight(), calcBaseArea(), calcVolume());
	}
}