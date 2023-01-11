package bubbleSort;

public class bubble {
	public static void main(String[] args) {
		 
		//bubble sort algoritmasını uygulamak için dizi oluşturuldu.
		int intArray[] = new int[]{54,910,305,45,10,35};
		 
		//sıralama öncesi dizinin görünümünü ekrana yazma.
		System.out.println("Sıralama öncesi dizi: ");
		for(int i=0; i < intArray.length; i++){
		System.out.print(intArray[i] + " ");
		}
		 
		//Sıralama işlemin için yazdığımız java metodunu çağırıp sıralama yaptırdık.
		bubbleSort(intArray);
		 
		System.out.println("");
		 
		//sıralama sonrasi ekran görüntüsü.
		System.out.println("Sıralama sonrasi ekran görüntüsü.");
		for(int i=0; i < intArray.length; i++){
		System.out.print(intArray[i] + " ");
		}
		 
	}
	private static void bubbleSort(int[] intArray) {
		 
		/*
		* Kabarcık sıralaması dizinin başından başlar ve dizi elemanlarını sırayla seçer. 
		* Seçilen dizi elemanı kendinden sonra gelen elemandan büyükse bu iki elemanın yerleri değiştirilir.
		* Bu işlem sonucunda dizinin en büyük elemanı dizi sonuna yerleştirildiğinden bir sonraki adımda arama sınırı bir eleman geri çekilir. 
		* Bu işlem, dizinin sonundaki elemanın karşılaştırılmasına kadar yinelenerek sürdürülür.
		* 
		*/
		 
		int n = intArray.length;
		int temp = 0;
		 
		for(int i=0; i < n; i++){
		  for(int j=1; j < (n-i); j++){
		 
		   if(intArray[j-1] < intArray[j]){
		      //elemanları yerdeğiştiriyoruz.
		      temp = intArray[j-1];
		      intArray[j-1] = intArray[j];
		     intArray[j] = temp;
		   }
		 
		 }
		}
	}

}



