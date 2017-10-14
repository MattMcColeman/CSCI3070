public class Heap {
	//Takes an arbitrary array and builds it into a max heap
	public static void buildMaxHeap(int array[], int length){
		for(int i = size/2-1; i >= 0; i--){
			maxHeapify(array, size, i);
		}
	}
	//Takes an almost-heap with one violation, and fixes the violation
	public static void maxHeapify(int array[], int length, int x){
		int largest = x;
		int l = 2*x+1;
		int r = 2*x+2;
		if (l<length && array[l] > array[x]){
			largest = l;
		}else{
			largest = x;
		}
		if(r<length && array[r] > array[largest]){
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
	public static void heapMaximum(int array[]){
		System.out.println(array[0]);
	}
	//Removes and returns the largest element in the max heap
	public static void heapExtractMax(int array[], int length){
		size = length-1;
		if (size < 0){
			System.out.println("error \"heap underflow\"");
		}
		int max = array[0];
		array[0] = array[size];
		array[size] = max;
		buildMaxHeap(array, size);
		size = size-1;
	}
	//Inserts a new element into the heap, preserving the heap property
	public static void maxHeapInsert(int array[], int length, int num){
		TotArr[size] = num;
		size++;
		//swap top and bottom nodes
		int temp = TotArr[0];
		TotArr[0] = TotArr[size-1];
		TotArr[size-1] = temp;
		buildMaxHeap(TotArr, size); 
	}
	//Prints the array representation (e.g. [16,14,10,8,7,3,9,1,4,2])
	public static void printAsArray(int array[]){
		for(int i = 0; i < size; i++){
			System.out.print(array[i]+"|");
		}
		System.out.println();
	}
	//Prints the heap as a sideways tree
	public static void printAsTree(int array[], int length){
		int Q = 0;
		//System.out.print(array[0]+"|");

		for(int i = 0; i<Math.sqrt(length); i++){
			for(int j = (int)Math.pow(2,i); j > 0; j--){
				if(Q>=length){
					//System.out.println(TotArr[Q]);
					System.out.println();
					return;
				}
				System.out.print(array[Q]+"|");
				Q++;
			}
			System.out.println();
		}
		System.out.println(TotArr[Q]);

	}
	//takes an arbitrary array, and sorts it using a heap
	public static void heapSort(int array[]){
		for(int i = size; i > 0; i--){
			heapExtractMax(array, i);
		}
		size = array.length;
	}

	public static int TotArr[] = new int[100];
	public static int array[] = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
    public static int size = array.length;

    public static void main(String[] args) {

    	for(int i = size-1; i >= 0; i--){
			TotArr[i] = array[i];
		}
    	
    	printAsTree(TotArr, size);
    	printAsArray(TotArr);
    	buildMaxHeap(TotArr, size);
    	heapMaximum(TotArr);
    	//heapExtractMax(array, size);
    	heapSort(array);
    	maxHeapInsert(array, size, 18);
    	maxHeapInsert(array, size, 19);
    	printAsTree(TotArr, size);
    	printAsArray(TotArr);
    	

        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }

}
