import java.util.*;

public class MyScanner{
	Scanner s = new Scanner(System.in);

	public MyScanner(){
		s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	}

	public String readLine(){
		return  s.nextLine();
	}

	public int readInt(){
		int i = s.nextInt();
		s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		return i;
	}

	public int[] getStringArrayAsNums(){
		String[] arr =  readLine().split(" ");
		int[] nums = new int[arr.length];

		for(int i=0;i<arr.length;i++){
			nums[i] = Integer.valueOf(arr[i]);
		}
		return nums;
	}

}
