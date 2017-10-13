public class Heap {
	//Takes an arbitrary array and builds it into a max heap
	public static void buildMaxHeap(int array[], int length, int x){
		int largest = x;

		int l = 2*x+1;
		int r = 2*x+2;

		if(x>=length/2-1 || x<0){
			return;
		}

		if(array[x] < array[l]){
			int temp = array[largest];
			array[largest] = array[l];
			array[l] = temp;
		}
		else if(array[x] < array[r]){
			int temp = array[largest];
			array[largest] = array[r];
			array[r] = temp;
		}
		else{
			buildMaxHeap(array, length, (x-1)/2);
			buildMaxHeap(array, length, (x-2)/2);
		}
	}
	//Takes an almost-heap with one violation, and fixes the violation
	public void maxHeapify(int array[], int length, int x){
		int largest = x;
		int l = 2*x+1;
		int r = 2*x+2;
		if (l<=length && array[l] > array[x]){
			largest = l;

		}else{
			largest = x;
		}
		if(r<=length && array[r] > array[largest]){
			largest = r;
		}
		if(largest != x){
			int temp = array[largest];
			array[largest] = array[x];
			array[x] = temp;
			maxHeapify(array, length, largest);
		}
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
	public static void printAsArray(int array[]){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]+"|");
		}
		System.out.println();
	}
	//Prints the heap as a sideways tree
	public static void printAsTree(int array[]){

	}
	//takes an arbitrary array, and sorts it using a heap
	public static void heapSort(){

	}

    public static void main(String[] args) {

    	int array[] = {1, 4, 92, 34, 8, 9};
    	int len = array.length/2;
    	
    	printAsTree(array);
    	printAsArray(array);
    	buildMaxHeap(array, array.length, len);
    	printAsTree(array);
    	printAsArray(array);
    	heapSort();

        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }

}
