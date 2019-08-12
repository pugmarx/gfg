import java.util.*;

public class Sort_012_Array{


	public static void main(String a[]) throws Exception{
	
		Scanner s = new Scanner(System.in);
	//	System.out.println(s.nextLine());
	
		int tcCount = s.nextInt();
		s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int loops = 0;
		while(loops < tcCount){
		
			sortTheArray(s);			
			loops++;
		}
	
	}

	public static void sortTheArray(Scanner s){
	
		int N = s.nextInt();
		s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


		String numsCStr = s.nextLine();
		String[] numsC = numsCStr.split(" ");

//		print(numsC);

		int[] arr = new int[numsC.length];

		for(int i = 0;i< numsC.length;i++){
			arr[i] = Integer.valueOf(numsC[i]);
		}	
		
			
		int mid = 0;
		int low = 0;
		int high = N-1;
		
		while(mid < high){
			if(arr[mid] == 0){
				swap(arr, mid, low);
				low++;
				mid++;
				continue;
			}
			if(arr[mid] == 2){
				swap(arr, mid, high);
				high--;
				continue;
			}
			mid++;
		}
	//	System.out.println("----"+arr.length);
		print(arr);
		System.out.println();
	}
	
	public static int[] swap(int[] arr, int fromIndex, int toIndex){
		int tmp = arr[toIndex];
		arr[toIndex] = arr[fromIndex];
		arr[fromIndex] = tmp;
		return arr;
	}

	public static void print(int[] arr){
		Arrays.stream(arr).forEach(e->System.out.print(e + " "));
	}

	public static void print(String[] arr){
		Arrays.stream(arr).forEach(e->System.out.print(e + " "));
	}
}

