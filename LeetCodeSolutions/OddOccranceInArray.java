import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class OddOccranceInArray {
	
	public static void main(String[] arr){
		OddOccranceInArray oc = new OddOccranceInArray();
		System.out.println(oc.sol());
	}
	public int sol(){
		int[] a={3,4,4,5,2,6,6,5,2};
		HashMap<Integer, Boolean> h= new HashMap<>();
		for(int n:a){
			if(!h.containsKey(n)){
				h.put(n, true);
			}
			else{
				if(h.get(n))
					h.put(n, false);
				else
					h.put(n, true);
			}
		}
		Iterator it= h.entrySet().iterator();
		while(it.hasNext()){
			 Map.Entry pair = (Map.Entry)it.next();
			 if((boolean) pair.getValue()){
				 return (int) pair.getKey();
			 }
		}
		return 0;
	}

}
