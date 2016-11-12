public class TreeDS{
	private int data;
	private TreeDS left;
	private TreeDS right;

	public int getData(){
		return this.data;
	}

	public TreeDS getLeft(){
		return this.left;
	}

	public TreeDS getRight(){
		return this.right;
	}

	public void setData(int data){
		this.data = data;
	}

	public void setLeft(TreeDS left){
		this.left = left;
	}

	public void setRight(TreeDS right){
		this.right = right;
	}
}