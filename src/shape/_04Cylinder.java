package shape;

/**
 * The _04Cylinder class represents a cylinder shape with a specified
 * height and radius. It extends the abstract class _03Shape and 
 * implements methods to calculate the base area and volume of a 
 * cylinder.
 */
public class _04Cylinder extends _03Shape
{
	private double radius;

	/**
	 * Constructs a new cylinder with the specified height and radius.
	 * 
	 * @param height	The height of the cylinder.
	 * @param radius	the radius of the cylinder
	 */
	public _04Cylinder(double height, double radius)
	{
		super(height);
		this.radius = radius;
	}

	/**
	 * Gets the radius of the cylinder.
	 * 
	 * @return The radius of the cylinder.
	 */
	public double getRadius()
	{
		return radius;
	}

	/**
	 * Sets the radius of the cylinder.
	 * 
	 * @param radius	The new radius of the cylinder.
	 */
	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	/**
	 * Calculates the base area of the cylinder.
	 * 
	 * @return the base area of the cylinder. 
	 */
	@Override
	public double calcBaseArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	/**
	 * Calculate the volume of the cylinder.
	 * 
	 * @return The volume of the cylinder.
	 */
	@Override
	public double calcVolume()
	{
		return calcBaseArea() * getHeight();
	}

	/**
	 * Returns a string representation of the cylinder.
	 * 
	 * @return A string describing the cylinder's radius, height, base area, and volume.
	 */
	@Override
	public String toString() {
	    return String.format("%-15s :  Radius = %15.2f  ||  Height = %15.2f  ||  Area = %20.2f  ||  Volume = %25.2f",
	            "Cylinder", getRadius(), getHeight(), calcBaseArea(), calcVolume());
	}
}