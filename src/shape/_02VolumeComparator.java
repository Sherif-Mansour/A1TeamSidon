package shape;

import java.util.Comparator;

/**
 * The _02VolumeComparator class compares two _03Shape objects based on their volumes.
 * It implements the Comparator interface to provide a custom comparison method.
 */
public class _02VolumeComparator implements Comparator<_03Shape>
{
	/**
     * Compares two _03Shape objects based on their volumes.
     * @param shape1 The first shape to compare.
     * @param shape2 The second shape to compare.
     * @return A negative integer, zero, or a positive integer if the volume of shape1
     *         is less than, equal to, or greater than the volume of shape2, respectively.
     */
	@Override
	public int compare(_03Shape shape1, _03Shape shape2)
	{
		if(shape1.calcVolume() > shape2.calcVolume())
			return 1;
		if(shape1.calcVolume() < shape2.calcVolume())
			return -1;
		return 0;
	}
}