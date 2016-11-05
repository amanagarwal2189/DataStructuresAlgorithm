public class Rec1{
public static void main(String[] arr){
	Rec1 r= new Rec1();
	int a=5;
	int b=10;
	System.out.println("GCD is "+r.gcd(a,b));
}

public int gcd(int a, int b){
	int num = 0;
	if(a<b)
		return rec_gcd(a,b);
	else if(a>b)
		return rec_gcd(b,a);
	else
		return a;
}

public int rec_gcd(int s, int l){
	int rem=l%s;
	if(rem==0)
		return s;
	else
		return rec_gcd(rem, s);
}

}