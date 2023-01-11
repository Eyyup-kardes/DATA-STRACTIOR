package quickSort;

public class QuickSort {

	/* Bu fonksiyon son elemanı pivot olarak alır,
	pivot elemanını doğru konumuna yerleştirir
	sıralanmış dizideki konum ve hepsini yerleştirir
	solundan daha küçük (pivottan daha küçük)
	pivot ve tüm büyük öğeler sağa
	pivotun */
	int partition(int arr[], int low, int high){
		int pivot = arr[high]; 
		int i = (low-1); // daha küçük elemanın dizini
		for (int j=low; j<high; j++){ 
			// Geçerli öğe pivottan küçükse 
			if (arr[j] < pivot){ 
				i++; 
				// arr[i] ve arr[j]'yi değiştir
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 
	
		// arr[i+1] ve arr[high] (veya pivot) yer değiştir
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 
		return i+1; 
	} 


	/* QuickSort()'u uygulayan ana işlev
	arr[] --> Sıralanacak dizi,
	düşük --> Başlangıç ​​dizini,
	yüksek --> Bitiş dizini */
	void sort(int arr[], int low, int high){ 
		if (low < high){ 
			/* pi bölümleme indeksidir, arr[pi]
		      şimdi doğru yerde */
			int pi = partition(arr, low, high); 
		
			// Önce öğeleri yinelemeli sırala
		    // bölüm ve bölüm sonrası
			sort(arr, low, pi-1); 
			sort(arr, pi+1, high); 
		} 
	} 

	/* n boyutunda bir diziyi yazdırmak için bir yardımcı işlev */
	static void printArray(int arr[]){ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

		
	public static void main(String args[]){ 
		int arr[] = {10, 7, 8, 9, 1, 5}; 
		int n = arr.length; 
		System.out.println("sıralanmamış array");
		printArray(arr);
		QuickSort ob = new QuickSort(); 
		ob.sort(arr, 0, n-1); 
		System.out.println("sıralanmış array"); 
		printArray(arr); 
	} 

}
