/**
 * Copyright 2016-2017 Shyam Bhimani
 */

package searchingAlgorithms;

public class LinearSearch {

	private int[] theArray = new int[50];
	private int arraySize = 10;
	
	//Generate array with random value
	public void generateRandomArray(){
		for(int i = 0; i < arraySize; i++){
			theArray[i] = (int)(Math.random()*10)+10;
		}
	}

	
	public void printArray(int i, int j){
		
		for (int n = 0; n < arraySize; n++){
			System.out.print("-----");
			
		}
		System.out.println();
		for (int n = 0; n < arraySize; n++){
			System.out.print("| " + n + "  ");
		}
		System.out.println("|");
		for (int n = 0; n < arraySize; n++){
			System.out.print("-----");
		}
		
		System.out.println();
		for (int n = 0; n < arraySize; n++){
			System.out.print("| " + theArray[n] + " ");
		}
		System.out.println("|");
		
		if(j != -1){
			for (int k = 0; k < ((j*5)+2); k++){
				System.out.print(j);
			}
						
		}
		if(i != -1){
			for (int k = 0; k < (5*(i - j)-2); k++){
				System.out.print(" ");
			}
			
			System.out.print(i);
			System.out.println();
		}
		
		System.out.println();
	}
	
	public String linearSearchForValue(int value){
		boolean valueInArray = false;
		String indexWithValue = "";
		for(int i = 0; i < arraySize; i++){
			if (theArray[i] == value){
				valueInArray = true;
				indexWithValue += i + " ";
			}
			
			printArray(i, -1);
		}
		
		if(!valueInArray){
			indexWithValue = "None";
		}
		System.out.println("The value was Found in the following: " + indexWithValue);
		System.out.println();
		return indexWithValue;
		
		
	}
	
	public static void main(String[] args) {
		
		LinearSearch linearSearch = new LinearSearch();
		linearSearch.generateRandomArray();
		linearSearch.linearSearchForValue(15);
		
	}

}
