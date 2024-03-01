package utility;

import java.util.Arrays;
import java.util.Comparator;

/**
 * The `Sort` class provides static methods for sorting arrays using various sorting algorithms.
 * It supports sorting in both ascending and descending order based on the provided comparator.
 */
public class Sort
{
	// 1 - BubbleSort
	/**
     * Sorts the specified array using the Bubble Sort algorithm in descending order.
     * 
     * @param array The array to be sorted.
     * @param <T>   The type of elements in the array.
     */
	public static <T extends Comparable<? super T>> void bubbleSort(T[] array)
	{
		bubbleSort(array, Comparator.reverseOrder());
	}
	
	/**
     * Sorts the specified array using the Bubble Sort algorithm with the given comparator.
     * 
     * @param array The array to be sorted.
     * @param c     The comparator to determine the order of elements.
     * @param <T>   The type of elements in the array.
     */
	public static <T> void bubbleSort(T[] array, Comparator<? super T> c)
	{
		int n = array.length;
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = 0; j < n - i - 1; j++)
			{
				if (c.compare(array[j],  array[j + 1]) < 0)
				{
					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
	// 2 - InsertionSort
	/**
	 * Sorts the specified array using the Insertion Sort algorithm in descending order.
	 * 
	 * @param array The array to be sorted.
	 * @param <T>   The type of elements in the array.
	 */
	public static <T extends Comparable<? super T>> void insertionSort(T[] array)
	{
		insertionSort(array, Comparator.reverseOrder());
	}
	
	/**
	 * Sorts the specified array using the Insertion Sort algorithm with the given comparator.
	 * 
	 * @param array The array to be sorted.
	 * @param c     The comparator to determine the order of elements.
	 * @param <T>   The type of elements in the array.
	 */
	public static <T> void insertionSort(T[] array, Comparator<? super T> c)
	{
		int n = array.length;
		for (int i = 1; i < n; i++)
		{
			T key = array[i];
			int j = i - 1;
			
			while (j >= 0 && c.compare(array[j], key) < 0)
			{
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}
	
	// 3 - SelectionSort
	/**
	 * Sorts the specified array using the Selection Sort algorithm in descending order.
	 * 
	 * @param array The array to be sorted.
	 * @param <T>   The type of elements in the array.
	 */
	public static <T extends Comparable<? super T>> void selectionSort(T[] array)
	{
		selectionSort(array, Comparator.reverseOrder());
	}
	
	/**
	 * Sorts the specified array using the Selection Sort algorithm with the given comparator.
	 * 
	 * @param array The array to be sorted.
	 * @param c     The comparator to determine the order of elements.
	 * @param <T>   The type of elements in the array.
	 */
	public static <T> void selectionSort(T[] array, Comparator<? super T> c)
	{
		int n = array.length;
		
		for (int i = 0; i < n - 1; i++)
		{
			int maxIndex = i;
			for (int j = i + 1; j < n; j++)
			{
				if (c.compare(array[j], array[maxIndex]) > 0)
				{
					maxIndex = j;
				}
			}
			
			T temp = array[maxIndex];
			array[maxIndex] = array[i];
			array[i] = temp;
		}
	}
	
	// 4 - MergeSort
	/**
	 * Sorts the specified array using the Merge Sort algorithm in descending order.
	 * 
	 * @param array The array to be sorted.
	 * @param <T>   The type of elements in the array.
	 */
	public static <T extends Comparable<? super T>> void mergeSort(T[] array)
	{
		mergeSort(array, Comparator.reverseOrder());
	}
	
	/**
	 * Sorts the specified array using the Merge Sort algorithm with the given comparator.
	 * 
	 * @param array The array to be sorted.
	 * @param c     The comparator to determine the order of elements.
	 * @param <T>   The type of elements in the array.
	 */
	public static <T> void mergeSort(T[] array, Comparator<? super T> c)
	{
		if (array == null || array.length == 0)
		{
			return;
		}
		T[] tempArray = Arrays.copyOf(array, array.length);
		mergeSort(array, tempArray, 0, array.length - 1, c);		
	}
	
	/**
	 * Recursively sorts the specified array using the Merge Sort algorithm with the given comparator.
	 * 
	 * @param array     The array to be sorted.
	 * @param tempArray An auxiliary array to store intermediate results.
	 * @param left      The index of the leftmost element of the subarray.
	 * @param right     The index of the rightmost element of the subarray.
	 * @param c         The comparator to determine the order of elements.
	 * @param <T>       The type of elements in the array.
	 */
	private static <T> void mergeSort(T[] array, T[] tempArray, int left, int right, Comparator<? super T> c)
	{
		if (left < right) 
		{
			int mid = left + (right - left) / 2;
			mergeSort(array, tempArray, left, mid, c);
			mergeSort(array, tempArray, mid + 1, right, c);
			merge(array, tempArray, left, mid, right, c);
		}
	}
	
	/**
	 * Merges two sorted subarrays into a single sorted subarray.
	 * 
	 * @param array     The array containing the subarrays to be merged.
	 * @param tempArray An auxiliary array to store intermediate results.
	 * @param left      The index of the leftmost element of the first subarray.
	 * @param mid       The index of the rightmost element of the first subarray.
	 * @param right     The index of the rightmost element of the second subarray.
	 * @param c         The comparator to determine the order of elements.
	 * @param <T>       The type of elements in the array.
	 */
	private static <T> void merge(T[] array, T[] tempArray, int left, int mid, int right, Comparator<? super T> c)
	{
		int i = left, j = mid + 1, k = left;
		while (i <= mid && j <= right)
		{
			if (c.compare(array[i], array[j]) >= 0)
			{
				tempArray[k++] = array[i++];
			}
			else
			{
				tempArray[k++] = array[j++];
			}
		}
		while (i <= mid)
		{
			tempArray[k++] = array[i++];
		}
		while (j <= right)
		{
			tempArray[k++] = array[j++];
		}
		for (int l = left; l <= right; l++ )
		{
			array[l] = tempArray[l];
		}
	}
	
	// 5 - QuickSort
	/**
	 * Sorts the specified array using the Quick Sort algorithm in descending order.
	 * 
	 * @param array The array to be sorted.
	 * @param <T>   The type of elements in the array.
	 */
	public static <T extends Comparable<? super T>> void quickSort(T[] array)
	{
		quickSort(array, Comparator.reverseOrder());
	}
	
	/**
	 * Sorts the specified array using the Quick Sort algorithm with the given comparator.
	 * 
	 * @param array The array to be sorted.
	 * @param c     The comparator to determine the order of elements.
	 * @param <T>   The type of elements in the array.
	 */
	public static <T> void quickSort(T[] array, Comparator<? super T> c)
	{
		if (array == null || array.length == 0)
		{
			return;
		}
		quickSort(array, 0, array.length - 1, c);
	}
	
	/**
	 * Recursively sorts the specified array using the Quick Sort algorithm with the given comparator.
	 * 
	 * @param array The array to be sorted.
	 * @param low   The index of the leftmost element of the subarray.
	 * @param high  The index of the rightmost element of the subarray.
	 * @param c     The comparator to determine the order of elements.
	 * @param <T>   The type of elements in the array.
	 */
	private static <T> void quickSort(T[] array, int low, int high, Comparator<? super T> c)
	{
		if (low < high)
		{
			int partitionIndex = partition(array, low, high, c);
			quickSort(array, low, partitionIndex - 1, c);
			quickSort(array, partitionIndex + 1, high, c);
		}
	}
	
	/**
	 * Partitions the array around a pivot element.
	 * 
	 * @param array The array to be partitioned.
	 * @param low   The index of the leftmost element of the subarray.
	 * @param high  The index of the rightmost element of the subarray.
	 * @param c     The comparator to determine the order of elements.
	 * @param <T>   The type of elements in the array.
	 * @return The index of the pivot element after partitioning.
	 */
	private static <T> int partition(T[] array, int low, int high, Comparator<? super T> c)
	{
		T pivot = array[high];
		int i = low - 1;
		for (int j = low; j < high; j++)
		{
			if (c.compare(array[j], pivot) > 0)
			{
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, high);
		return i + 1;		
	}
	
	/**
	 * Swaps two elements in the array.
	 * 
	 * @param array The array containing the elements to be swapped.
	 * @param i     The index of the first element.
	 * @param j     The index of the second element.
	 * @param <T>   The type of elements in the array.
	 */
	private static <T> void swap(T[] array, int i, int j)
	{
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	// 6 - HeapSort
	/**
	 * Sorts the specified array using the Heap Sort algorithm in descending order.
	 * 
	 * @param array The array to be sorted.
	 * @param <T>   The type of elements in the array.
	 */
	public static <T extends Comparable<? super T>> void heapSort(T[] array)
	{
		heapSort(array, Comparator.reverseOrder());
	}
	
	/**
	 * Sorts the specified array using the Heap Sort algorithm with the given comparator.
	 * 
	 * @param array The array to be sorted.
	 * @param c     The comparator to determine the order of elements.
	 * @param <T>   The type of elements in the array.
	 */
	public static <T> void heapSort(T[] array, Comparator<? super T> c)
	{
		if (array == null || array.length == 0)
		{
			return;
		}
		
		int n = array.length;
		
		for (int i = n / 2 - 1; i >= 0; i--)
		{
			heapify(array, n, i, c);
		}
		
		for (int i = n - 1; i > 0; i--)
		{
			swapElements(array, 0, i);
			heapify(array, i, 0, c);
		}
	}
	
	/**
	 * Adjusts the heap starting from the given index.
	 * 
	 * @param array The array representing the heap.
	 * @param n     The size of the heap.
	 * @param i     The index to start heapifying from.
	 * @param c     The comparator to determine the order of elements.
	 * @param <T>   The type of elements in the array.
	 */
	private static <T> void heapify(T[] array, int n, int i, Comparator<? super T> c)
	{
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		if (left < n && c.compare(array[left], array[largest]) < 0)
		{
			largest = left;
		}
		
		if (right < n && c.compare(array[right], array[largest]) < 0)
		{
			largest = right;			
		}
		
		if (largest != i)
		{
			swapElements(array, i, largest);
			heapify(array, n, largest, c);
		}
	}
	
	/**
	 * Swaps two elements in the array.
	 * 
	 * @param array The array containing the elements to be swapped.
	 * @param i     The index of the first element.
	 * @param j     The index of the second element.
	 * @param <T>   The type of elements in the array.
	 */
	private static <T> void swapElements(T[] array, int i, int j)
	{
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}	
}