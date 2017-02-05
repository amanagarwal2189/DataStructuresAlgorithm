
public class Solution3 {

	public static void main(String[] args) {
		Solution3 s= new Solution3();
		s.solution("1000000");
			
	}

	 public int solution(String S) {
	        int count = 0;
	        int v = Integer.parseInt(S,2);
	        System.out.println(v);
	        //int v=0;
	        while(v>0){
	        	if (v%2==1)
	        		v=v/2;
	        	else
	        		v=v-1;
	        	count++;
	        }
	        System.out.println(count);
	        return count;
	    }
}
