Sorting Program ReadMe

Installation Instructions:

1.	Ensure that you have Java JDK 8 or higher installed on your system.

2.	Download the sorting program files from GitHub or BrightSpace submission.

3.	Extract files from A1TeamSidon.zip file to your desired location and import
	into your worksapce using Eclipse IDE.

4.	Open a command prompt/terminal window and navigate to the res folder 
	directory where the Sort.jar file is located. 'shapes1.txt', 'shapes2.txt',
	'shapes3.txt', or 'shapesBig.txt' files need to be in the same res folder
	for the commands to execute from the command-line.

Usage Instructions:

1.	To run the sorting program, execute the following command: 
	
		java -jar Sort.jar -f[fileName] -t[compareType] -s[sortType]

	Replace '[fileName]', '[compareType]', '[sortType]' with the appropriate 
	command-line options. See below for available options.
	
	Note: the '-f', '-t', and '-s' are case-insensitive and order-insensitive.

2.	Command-line Options:
	
	-	'[fileName]':		Enter after '-f' (no spaces) any of:
								-	'shapes1.txt',
								-	'shapes2.txt', 
								-	'shapes3.txt', or 
								-	'shapesBig.txt'.
							
	- 	'[compareType]':	Enter after '-t' (no spaces) any of:
								-	'v' for volume,
								-	'a' for area, or 
								-	'h' for height.
	
	-	'[sortType]':		Enter after '-s' (no spaces) any of:
								-	'b' for Bubble Sort, 
								-	'i' for Insertion Sort, 
								-	's' for Selection Sort, 
								-	'm' for Merge Sort, 
								-	'q' for Quick Sort, or
								-	'z' for Heap Sort.

3.	Example Usage:
		
		java -jar Sort.jar -fshapes1.txt -ta -sb
	
	This command sorts the data in the file `shapes1.txt` based on area using 
	the Bubble Sort algorithm.
	
4.	To run the program from the Console within Eclipse:
	
	-	In the Main class of the AppDriver, navigate to: 
			
			Run Configurations>Arguments>Program Arguments
	
	-	Apply the chosen program arguments similar to following example: 
			
			-fres/shapes1.txt -ta -sb