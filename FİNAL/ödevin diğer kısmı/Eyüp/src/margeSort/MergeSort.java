package margeSort;

public class MergeSort {
	public static void main(String[] args) {
		 
		//marge sort algoritmasını uygulamak için dizi oluşturuldu.
		int intArray[] = new int[]{54,910,305,45,10,35};
		 
		//sıralama öncesi dizinin görünümünü ekrana yazma.
		System.out.println("Sıralama öncesi dizi: ");
		for(int i=0; i < intArray.length; i++){
		System.out.print(intArray[i] + " ");
		}
		 
		//Sıralama işlemin için yazdığımız java metodunu çağırıp sıralama yaptırdık.
		intArray = sort(intArray);
		 
		System.out.println("");
		 
		//sıralama sonrasi ekran görüntüsü.
		System.out.println("Sıralama sonrasi ekran görüntüsü.");
		for(int i=0; i < intArray.length; i++){
		System.out.print(intArray[i] + " ");
		}
		 
	}
	
	
	
	public static int[] sort(int[] whole){
		if(whole.length==1)
	        return whole;
		else{
			int[] left=new int[whole.length/2];
	        System.arraycopy(whole,0,left,0,left.length);
	        int[] right=new int[whole.length-left.length];
	        System.arraycopy(whole,left.length,right,0,right.length);
	        left=sort(left);
	        right=sort(right);
	        merge(left,right,whole);
	        return whole;
		}
	}
	public static void merge(int[] left, int[] right, int[] result){
		int[] rest; 
		int restIndex;
		int x=0;int y=0;int k=0;
        while( x<left.length&&y<right.length){
            if(left[x]<right[y]){ 
               result[k]=left[x];
               x++; 
             } 
             else{
               result[k]=right[y];
               y++;  
             } 
           k++;
        } 
		 
		if(x>=left.length){
			rest=right;	 	 
			restIndex=y;
		}	 	 
		else{	
			rest=left;	 	 
			restIndex=x;	 	 
		}	 	 
		for(int i=restIndex; i<rest.length;i++){	 	 
			result[k]=rest[i];	 	 
			k++;	 	 
		}
	}
}
