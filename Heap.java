public class Heap {
	//Takes an arbitrary array and builds it into a max heap
	public static void buildMaxHeap(int array[], int x){

	}
	//Takes an almost-heap with one violation, and fixes the violation
	public void maxHeapify(int array[]){

	}
	//Returns the largest element in the max heap
	public int heapMaximum(int array[]){
		return 1;
	}
	//Removes and returns the largest element in the max heap
	public int heapExtractMax(int array[]){
		return 1;
	}
	//Inserts a new element into the heap, preserving the heap property
	public void maxHeapInsert(int array[]){

	}
	//Prints the array representation (e.g. [16,14,10,8,7,3,9,1,4,2])
	public void printAsArray(int array[]){

	}
	//Prints the heap as a sideways tree
	public void printAsTree(int array[]){

	}
	//takes an arbitrary array, and sorts it using a heap
	public void heapSort(){

	}

    public static void main(String[] args) {

    	int array[] = {1, 4, 92, 34, 8, 9};
    	int len = array.length/2;
    	buildMaxHeap(array, len);
    	printAsTree(array);
    	printAsArray(array);
    	heapSort();
    	printAsTree(array);
    	printAsArray(array);

        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World" + n);
    }

}
