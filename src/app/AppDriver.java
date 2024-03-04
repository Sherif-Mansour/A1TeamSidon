package app;

import manager.SortManager;

/**
 * The AppDriver class serves as the entry point for the application.
 * It initializes a SortManager object with command-line arguments and triggers sorting operations based on the provided options.
 * 
 * @author Fortune Agbone, Tyler Galea, Sherif Mansour, Asenai Shiberim, Jubril Somide
 */
public class AppDriver
{
	/**
     * The main method of the application.
     * It creates a SortManager object with the provided command-line arguments.
     * 
     * @param args The command-line arguments passed to the application.
     */
	public static void main( String[] args )
	{
		new SortManager(args);
	}
}