
public class MakeTree2{
	public TreeDS makeTreeInput(){
		TreeDS root = new TreeDS();
		TreeDS node1 = new TreeDS();
		TreeDS node2 = new TreeDS();
		TreeDS node3 = new TreeDS();
		TreeDS node4 = new TreeDS();
		TreeDS node5 = new TreeDS();
		TreeDS node6 = new TreeDS();
		TreeDS node7 = new TreeDS();
		TreeDS node8 = new TreeDS();
/*		TreeDS node9 = new TreeDS();
		TreeDS node10 = new TreeDS();*/
		TreeDS node13 = new TreeDS();
		root.setData(3);
		root.setLeft(node1);
		root.setRight(node2);
		node1.setData(5);
		node1.setLeft(node3);
		node1.setRight(node4);
		node2.setData(2);
		node2.setLeft(node5);
		node2.setRight(node6);
		node3.setData(1);
		node3.setLeft(node7);
		node3.setRight(node8);
		node4.setData(4);
/*		node4.setLeft(node9);
		node4.setRight(node10);*/
		node5.setData(6);
		node6.setData(7);
		node6.setLeft(node13);
		/*node6.setRight(node14);*/
		node7.setData(10);
		node8.setData(9);
		/*node8.setLeft(node13);
		node8.setRight(node14);*/
		node13.setData(8);
		/*node13.setLeft(node13);
		node13.setRight(node14);*/
		/*node9.setData(7);
		node9.setLeft(node13);
		node9.setRight(node14);*/


		return root;
	}
}