package test.java;

import java.util.Scanner;

public class SubarrayWithSub {

	
public static void main(String[] args) {
	
    Scanner in = new Scanner(System.in); 
    
    int no = in.nextInt();
    int res = 0;
    String[] result = new String[no];
    
    while(res != no) {
    	
    	int count= in.nextInt();
    	int sum = in.nextInt();
    	int[] arr = new int[count]; 
    	
    	for(int i = 0; i<count; i++) {
    		arr[i] = in.nextInt();
    	}
    	
    	SubarrayWithSub ss = new SubarrayWithSub();
    	result[res] = ss.calculateWindow(arr,sum);
    	res++;
    }
    
    for (int i = 0; i < result.length; i++) {
		System.out.println(result[i]);
	}

}
	
	private String calculateWindow(int[] arr, int sum) {
		
		int start = 0;
		int end =0;
		int num=0;
		
		for(int i=0; i< arr.length; i++) {
			end = i;
			num += arr[i];
			if(num == sum) {
				end = i;
				return ++start + " " + ++end;
			}

			while(num > sum) {
				num -= arr[start];
				start++;
				if(num == sum) {
					return ++start + " " + ++end;
				}
			}
	} 
		return "No substring found";

}
}
