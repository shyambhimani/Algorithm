/**
 * Copyright 2016-2017 Shyam Bhimani
 */

package searchingAlgorithms;

public class BubbleSort {
	private int[] theArray = new int[50];
	private int arraySize = 10;
	
	//Generate array with random value
	public void generateRandomArray(){
		for(int i = 0; i < arraySize; i++){
			theArray[i] = (int)(Math.random()*10)+10;
		}
	}

	// Printing array in every iteration 
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
				System.out.print(" ");
				
			}
			System.out.print(j);
			
						
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

	public void bubbleSorting(){
		for (int i = arraySize - 1; i > 1; i--){
			for(int j = 0; j < arraySize; j++){
				if (theArray[j] < theArray[j + 1]){
					swap(j, j+1);
					printArray(i,j);
				}
				
				
			}
		}
	}
	
	public void swap(int indexOne, int indexTwo){
		
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}
	public static void main(String[] args) {

		
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.generateRandomArray();
		bubbleSort.bubbleSorting();
		
		
	}

}
