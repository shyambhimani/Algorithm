/**
 * Copyright 2016-2017 Shyam Bhimani
 */

package arrays;

import java.util.Scanner;


public class ArrayStructures {
	private int[] theArray = new int[50];

	private int arraySize = 10;
	
	// Method to print random Array with index
	public void generateRandomArray() {

		for (int i = 0; i < arraySize; i++) {

			theArray[i] = (int) (Math.random() * 10) + 10;

		}
	}
	

	// Print Array
	public void printArray() {

		System.out.println("----------");

		for (int i = 0; i < arraySize; i++) {

			System.out.println("----------");
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
			System.out.println("----------");

		}

	}

	// Check what element is at given Index
	public int elementAtIndex(int index) {

		if (index < arraySize)
			return theArray[index];

		return 0;

	}

	// Check is given value is exist in Array
	public boolean isValueInArray(int value) {

		boolean searchValue = false;

		for (int i = 0; i < theArray.length; i++) {
			if (theArray[i] == value)
				searchValue = true;

		}

		return searchValue;
	}

	// Delete value at Index
	public void deleteElementFromArray(int index) {

		if (index < arraySize) {

			for (int i = index; i <= (arraySize - 1); i++) {

				theArray[i] = theArray[i + 1];

			}

			arraySize--;

		}

	}

	// Insert value at last index
	public void insertValue(int value) {

		if (arraySize < 50) {

			theArray[arraySize] = value;

			arraySize++;
		}
	}

	// Linear search for value in Array
	/**
	 * @param value
	 * @return
	 */
	public String linearSearchForValue(int value) {

		boolean valueInArray = false;

		String indexWithValue = "";

		System.out.print("Values are found in following indexes: ");

		for (int i = 0; i < arraySize; i++) {

			if (theArray[i] == value) {

				valueInArray = true;

				System.out.print(i + " ");

				indexWithValue += i + " ";

			}
		}

		if (!valueInArray) {

			indexWithValue = "Given value is not found in Array";

			System.out.println(indexWithValue);

		}
		return indexWithValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayStructures newArray = new ArrayStructures();

		newArray.generateRandomArray();
		newArray.printArray();
		System.out.println(newArray.elementAtIndex(4));
		System.out.println(newArray.isValueInArray(12));

		newArray.deleteElementFromArray(5);
		newArray.printArray();

		newArray.insertValue(53);
		newArray.printArray();

		newArray.linearSearchForValue(15);

	}

}
