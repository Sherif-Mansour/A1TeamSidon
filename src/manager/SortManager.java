package manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Comparator;

import shape.*;
import utility.Sort;

/**
 * The SortManager class handles sorting of shapes based on various criteria.
 * It reads shapes from a file, sorts them using different sorting algorithms,
 * and prints the sorted shapes according to user-specified options.
 */
public class SortManager
{
	private _03Shape[] shapes;
	private String fileName;
	private char sortType;
	private char compareType;

	/**
     * Constructs a SortManager object with command-line arguments.
     * Parses the arguments, reads shapes from file, performs sorting, and prints results.
     * @param args The command-line arguments specifying file name, sort type, and compare type.
     */
	public SortManager(String[] args) {
		parseArguments(args);
		if (fileName != null) {
			readShapesFromFile();
			benchmarkAndSort();
			printSortedShapes();
		}
    }

	/**
     * Retrieves the comparator object based on the comparison type of area or volume. 
     * @return The comparator object used for sorting shapes.
     */
	private Comparator<_03Shape> getComparator() {
		switch (compareType) {
			case 'a':
				return new shape._01BaseAreaComparator();
			case 'v':
				return new shape._02VolumeComparator();
			default:
				return null;
		}
	}
		
	/**
     * Parses the command-line arguments and sets the file name, sort type, and compare type.
     * Prints error messages if any argument is missing or invalid.
     * @param args The array of command-line arguments.
     */
    private void parseArguments(String[] args) {
        boolean fFlag = false;
        boolean tFlag = false;
        boolean sFlag = false;

        for (String arg : args) {
            String lowerCaseArg = arg.toLowerCase();
            switch (lowerCaseArg.substring(0, 2)) {
                case "-f":
                    if (arg.length() > 2) {
                        fileName = arg.substring(2);
                        fFlag = true;
                    } else {
                        System.out.println("Missing file name after -f option.");
                        return;
                    }
                    break;
                case "-t":
                    if (arg.length() > 2) {
                        char type = arg.toLowerCase().charAt(2);
                        if (type == 'v' || type == 'h' || type == 'a') {
                            compareType = type;
                            tFlag = true;
                        } else {
                            System.out.println("Invalid compare type after -t option.");
                            return;
                        }
                    } else {
                        System.out.println("Missing compare type after -t option.");
                        return;
                    }
                    break;
                case "-s":
                    if (arg.length() > 2) {
                        char type = arg.toLowerCase().charAt(2);
                        if (type == 'b' || type == 'i' || type == 's' || type == 'm' || type == 'q' || type == 'z') {
                            sortType = type;
                            sFlag = true;
                        } else {
                            System.out.println("Invalid sort type after -s option.");
                            return;
                        }
                    } else {
                        System.out.println("Missing sort type after -s option.");
                        return;
                    }
                    break;
            }
        }

        if (!(fFlag && tFlag && sFlag)) {
            System.out.println("Insufficient command line arguments.");
            return;
        }
    }

    /**
     * Reads shapes data from the specified file and creates corresponding shape objects.
     * Stores the created shapes in the 'shapes' array.
     * Prints error messages for invalid shape types or file format errors.
     */
	private void readShapesFromFile() {
	    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	        int numShapes = Integer.parseInt(reader.readLine());
	        shapes = new _03Shape[numShapes];
	        for (int i = 0; i < numShapes; i++) {
	            String[] line = reader.readLine().trim().split("\\s+");
	            String shapeName = line[0];
	            double height = Double.parseDouble(line[1]);
	            double parameter = Double.parseDouble(line[2]);
	            _03Shape shape = createShape(shapeName, height, parameter);
	            if (shape != null) {
	                shapes[i] = shape;
	            } else {
	                System.out.println("Invalid shape type: " + shapeName);
	            }
	        }
	    } catch (IOException | NumberFormatException e) {
	        e.printStackTrace();
	    }
	}

	/**
     * Creates a shape object based on the shape name and parameters.
     * Uses reflection to instantiate the appropriate shape class dynamically.
     * @param shapeName The name of the shape.
     * @param height The height of the shape.
     * @param parameter Additional parameter (e.g., radius, side length) depending on the shape.
     * @return The created shape object, or null if the shape type is invalid.
     */
	private _03Shape createShape(String shapeName, double height, double parameter) {
	    String className;
	    switch (shapeName) {
	        case "Cylinder":
	            className = "_04Cylinder";
	            break;
	        case "Cone":
	            className = "_05Cone";
	            break;
	        case "Pyramid":
	            className = "_06Pyramid";
	            break;
	        case "SquarePrism":
	            className = "_08SquarePrism";
	            break;
	        case "TriangularPrism":
	            className = "_09TriangularPrism";
	            break;
	        case "PentagonalPrism":
	            className = "_10PentagonalPrism";
	            break;
	        case "OctagonalPrism":
	            className = "_11OctagonalPrism";
	            break;
	        default:
	            return null;
	    }

	    try {
	        Class<?> clazz = Class.forName("shape." + className);
	        Constructor<?> constructor = clazz.getConstructor(double.class, double.class);
	        return (_03Shape) constructor.newInstance(height, parameter);
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}
    
	/**
     * Benchmarks and performs sorting of shapes based on the chosen sorting algorithm.
     * Prints the time taken for sorting using the selected algorithm.
     * If the comparison type is 'h', the sorting algorithms are performed using natural ordering
     * based on shape height; otherwise, the sorting algorithms use custom comparators for
     * comparing shapes by base area or volume.
     */
	private void benchmarkAndSort() {
        long startTime, endTime, duration;
        System.out.println("Benchmarking sorting algorithms:");

        startTime = System.currentTimeMillis();
        switch (sortType) {
	        case 'b':
	            if (compareType == 'h') Sort.bubbleSort(shapes); 
	            else Sort.bubbleSort(shapes, getComparator()); 
	            break;
	        case 'i':
	            if (compareType == 'h') Sort.insertionSort(shapes); 
	            else Sort.insertionSort(shapes, getComparator());
	            break;
	        case 's':
	            if (compareType == 'h') Sort.selectionSort(shapes);
	            else Sort.selectionSort(shapes, getComparator());
	            break;
	        case 'm':
	            if (compareType == 'h') Sort.mergeSort(shapes);
	            else Sort.mergeSort(shapes, getComparator());
	            break;
	        case 'q':
	            if (compareType == 'h') Sort.quickSort(shapes);
	            else Sort.quickSort(shapes, getComparator());
	            break;
	        case 'z':
	            if (compareType == 'h') Sort.heapSort(shapes);
	            else Sort.heapSort(shapes, getComparator());
	            break;
	        default:
	            System.out.println("Invalid sort type.");
	            return;
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Time taken for " + getSortAlgorithmName() + ": " + duration + " milliseconds");
    }

	/**
     * Retrieves the name of the sorting algorithm based on the selected sort type.
     * @return The name of the selected sorting algorithm.
     */
	private String getSortAlgorithmName() {
        switch (sortType) {
            case 'b':
                return "Bubble Sort";
            case 'i':
                return "Insertion Sort";
            case 's':
                return "Selection Sort";
            case 'm':
                return "Merge Sort";
            case 'q':
                return "Quick Sort";
            case 'z':
                return "Heap Sort";
            default:
                return "Unknown Sort Algorithm";
        }
    }
	
	/**
     * Prints the sorted shapes according to the specified format.
     * Prints the first, every thousandth, and last sorted shapes.
     * Also, provides an option to print all sorted shapes.
     */
	private void printSortedShapes() {
	    if (shapes != null && shapes.length > 0) {
	        System.out.println("Sorted Shapes:");

	        System.out.println("First sorted value: " + shapes[0]);

	        for (int i = 999; i < shapes.length - 1; i += 1000) {
	            System.out.println("Value @ " + (i + 1) + "    : " + shapes[i]);
	        }

	        System.out.println("Last sorted value : " + shapes[shapes.length - 1]);

	        // Uncomment the following to print all sorted shapes
	        // for (int i = 0; i < shapes.length; i++) {
	        //     System.out.println(shapes[i]);
	        // }
	    }
	}
}