import java.util.*;


public class FindMissingDigit{

	public static void main(String s[]){
		
		MyScanner sc = new MyScanner();

		int loops = sc.readInt();

		for(int i=0;i<loops;i++){
			int digits = sc.readInt();
			int[] arr = sc.getStringArrayAsNums();
			
			int expSum = (digits * (digits + 1)) / 2;
			int arraySum = 0;
			for(int j = 0;j<arr.length;j++){
				arraySum += arr[j];
			}			
			System.out.println(expSum - arraySum);
		}		
	
	}

}


