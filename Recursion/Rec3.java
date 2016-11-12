public class Rec3{
	public static void main(String[] arr){
		Rec3 r= new Rec3();
		int X=110;
		int pow=2;
		int minSq=(int)Math.pow(X,(1/pow));
		int count = counter(minSq, X, pow);
	}

	public int counter(int minSq, int X, int pow){
		int count = 0;
		if(summer(0, minSq, X, pow)){
			count++;
		}
		return count;
	}

	public boolean summer(int sum, int n, int X, int pow){
		if(n>0){
			sum=+Math.pow(n,pow);
			if(sum<X){
				summer(sum, n-1, X, pow);
			}
		}
	}


}