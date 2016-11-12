/*
2.	Refer to the tree below:
     3
   /   \
  5     2
 / \   / \
1   4 6   7
 \       /
  9     8

	Write a method to print the top view.
	O/P 1 5 3 2 7
*/
import java.util.*;
import java.lang.Integer;
public class Trees2{

	public static void main(String[] arr){
		Trees2 t2= new Trees2();
		MakeTree m= new MakeTree();
		TreeDS d = m.makeTreeInput();
		ArrayList<Integer> a = t2.getTopView(d);
		t2.print(a);
	}

	public ArrayList<Integer> getTopView(TreeDS root){
		TreeDS node=root.getLeft();
		Stack<Integer> s = new Stack<Integer>();
		ArrayList<Integer> a= new ArrayList<Integer>();
		while (null!=node){
			s.push(node.getData());
			node=node.getLeft();
		}
		while(!s.empty()){
			a.add(s.pop());
		}
		a.add(root.getData());
		node=root.getRight();
		while (null!=node){
			a.add(node.getData());
			node=node.getRight();
		}
		return a;
	}

	public void print(ArrayList<Integer> a){
		String s="";
		for(int num: a){
			s=s+num + " ";
		}
		System.out.println(s);
	}
}