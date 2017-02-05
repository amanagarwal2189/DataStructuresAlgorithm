
public class Solution2 {

	public static void main(String[] args) {
		int[] arr1 = {-8,3,0,5,-3,12,6}; 
		Solution2 s= new Solution2();
		s.solution(arr1);

	}
	 public int solution(int[] A) {
	      
		 int sum =0, highest = 0;
		 for (int i=0;i<A.length;i++){
			 if(A[i]>=0){
				 sum=sum+A[i];
			 }
			 else{
				 if(highest<sum){
					 highest=sum;
					 sum=0;	
				 }
			 }
		 }
		 if(highest<sum){
			 highest=sum;
			 sum=0;	
		 }
		 System.out.println(highest);
		 return highest;
	    }

}
