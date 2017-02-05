import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Solution {

	public static void main(String[] args){
		Solution s= new Solution();
		System.out.println(s.solution1(10002));
	}
	
	public int solution(int N) {

		if (N > 99999999) {
			return -1;
		}
		// initialize an array which will store count of each digit in the
		// number. each index corresponds to a digit 0 - 9.
		int[] arr1 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		while (N > 0) {
			int temp = N % 10;
			N = N / 10;
			arr1[temp] = arr1[temp] + 1;
		}
		StringBuilder sb = new StringBuilder();
		for (int j = 9; j >= 0; j--) {
			if (arr1[j] > 0) {
				for (int i = 0; i < arr1[j]; i++) {
					sb.append(j);
				}
			}
		}
		return Integer.parseInt(sb.toString());
	}
	
	
	 public int solution1(int N) {
		 String st= new Integer(N).toString();
		 char[] num=st.toCharArray();
		 Arrays.sort(num);
		 String str2 = new String(num);
		 str2 = new StringBuilder(str2).reverse().toString();
		 int x  = Integer.parseInt(str2);
		 return x;
	 }
}
