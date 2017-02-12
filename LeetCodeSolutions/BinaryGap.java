
public class BinaryGap {
	public static void main(String[] arr){
		BinaryGap g= new BinaryGap();
		g.sol();
	}

	
	public void sol(){
		int n = 190;
		String binaryIntInStr = Integer.toBinaryString(n);
		System.out.println(binaryIntInStr);
		char[] c_arr= binaryIntInStr.toCharArray();
		int count=0, max=0;
		for(char c: c_arr){
			if(c == '0'){
				count++;
			}
			else{
				if(max<count){
					max=count;
				}
				count=0;
			}
		}
		System.out.println(max);
	}
}
