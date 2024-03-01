package shape;

public class _00TestShape
{

	public static void main(String[] args)
	{
		System.out.println("Testing Cylinder Comparable:");
		_04Cylinder cylinder1 = new _04Cylinder(5, 3);
		System.out.println("Cylinder1: " + cylinder1);
		_04Cylinder cylinder2 = new _04Cylinder(6, 4);
		System.out.println("Cylinder2: " + cylinder2);
		System.out.println("Cylinder1 vs Cylinder2: " + cylinder1.compareTo(cylinder2));
		System.out.println("Cylinder2 vs Cylinder1: " + cylinder2.compareTo(cylinder1) + "\n");
		
		System.out.println("Testing Cone Comparable:");
		_05Cone cone1 = new _05Cone(4, 2);
		System.out.println("Cone1: " + cone1);
		_05Cone cone2 = new _05Cone(5, 2);
		System.out.println("Cone2: " + cone2);
		System.out.println("Cone1 vs Cone2: " + cone1.compareTo(cone2));
		System.out.println("Cone2 vs Cone1: " + cone2.compareTo(cone1) + "\n");
		
		System.out.println("Testing Pyramid Comparable:");
		_06Pyramid pyramid1 = new _06Pyramid(7, 3);
		System.out.println("Pyramid1: " + pyramid1);
		_06Pyramid pyramid2 = new _06Pyramid(8, 2);
		System.out.println("Pyramid2: " + pyramid2);
		System.out.println("Pyramid1 vs Pyramid2: " + pyramid1.compareTo(pyramid2));
		System.out.println("Pyramid2 vs Pyramid1: " + pyramid2.compareTo(pyramid1) + "\n");
		
		System.out.println("Testing SquarePrism Comparator:");
		_08SquarePrism sqPrism1 = new _08SquarePrism(2, 3);
		System.out.println("SquarePrism1: " + sqPrism1);		
		_08SquarePrism sqPrism2 = new _08SquarePrism(3, 4);
		System.out.println("SquarePrism2: " + sqPrism2);
		System.out.println("SquarePrism1 vs SquarePrism2: " + sqPrism1.compareTo(sqPrism2));
		System.out.println("SquarePrism2 vs SquarePrism1: " + sqPrism2.compareTo(sqPrism1) + "\n");
		
		System.out.println("Testing TriangularPrism Comparator:");
		_09TriangularPrism triPrism1 = new _09TriangularPrism(2, 3);
		System.out.println("TriangularPrism1: " + triPrism1);		
		_09TriangularPrism triPrism2 = new _09TriangularPrism(3, 4);
		System.out.println("TriangularPrism2: " + triPrism2);
		System.out.println("TriangularPrism1 vs TriangularPrism2: " + triPrism1.compareTo(triPrism2));
		System.out.println("TriangularPrism2 vs TriangularPrism1: " + triPrism2.compareTo(triPrism1) + "\n");
		
		System.out.println("Testing PentagonalPrism Comparator:");
		_10PentagonalPrism pentaPrism1 = new _10PentagonalPrism(2, 3);
		System.out.println("PentagonalPrism1: " + pentaPrism1);		
		_10PentagonalPrism pentaPrism2 = new _10PentagonalPrism(3, 4);
		System.out.println("PentagonalPrism2: " + pentaPrism2);
		System.out.println("PentagonalPrism1 vs PentagonalPrism2: " + pentaPrism1.compareTo(pentaPrism2));
		System.out.println("PentagonalPrism2 vs PentagonalPrism1: " + pentaPrism2.compareTo(pentaPrism1) + "\n");
		
		System.out.println("Testing OctagonalPrism Comparator:");
		_11OctagonalPrism octaPrism1 = new _11OctagonalPrism(2, 3);
		System.out.println("OctagonalPrism1: " + octaPrism1);		
		_11OctagonalPrism octaPrism2 = new _11OctagonalPrism(3, 4);
		System.out.println("OctagonalPrism2: " + octaPrism2);
		System.out.println("OctagonalPrism1 vs OctagonalPrism2: " + octaPrism1.compareTo(octaPrism2));
		System.out.println("OctagonalPrism2 vs OctagonalPrism1: " + octaPrism2.compareTo(octaPrism1) + "\n");

	}

}
