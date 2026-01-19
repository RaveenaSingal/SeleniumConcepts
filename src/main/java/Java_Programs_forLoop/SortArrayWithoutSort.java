package Java_Programs_forLoop;

import java.util.Arrays;

public class SortArrayWithoutSort {

	public static void main(String[] args) {
		// sort Array Without sort
		int[] arr = {4,8,1,9,3,5,2};
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
			
					
				}
			}
		}
		
System.out.println(Arrays.toString(arr));
	}

}
