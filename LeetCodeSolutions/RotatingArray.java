
public class RotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotatingArray r= new RotatingArray();
		r.sol(new int[]{3,4,5,6,7,8}, 7);
	}

	public int[] sol(int[] A, int k) {
		int len = A.length;
		int[] newArr = new int[len];
		int index = 0;
		for (int i = 0; i < len; i++) {
			index = (i + k) % len;
			newArr[index] = A[i];
		}
		for (int a : newArr) {
			System.out.println(a);
		}
		return null;
	}

}
