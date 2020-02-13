
public class InsertIntoBST {

	

	
	public class Node { 
		int value; 
		Node left, right; 

		public Node(int item) { 
			value = item; 
			left = right = null; 
		} 
	} 

	
	/* Binary search tree rootOrigin */
	Node rootOrigin; 

	 
	public InsertIntoBST() { 
		rootOrigin = null; 
	} 

		
	private void insert(int value) { 
		
		rootOrigin = addRecord(rootOrigin, value);
	
	} 
	
	
	private Node addRecord(Node rootOrigin, int value) { 

		
		if (rootOrigin == null) { 
			rootOrigin = new Node(value); 
			return rootOrigin; 
		} 


		if (value < rootOrigin.value) 
			rootOrigin.left = addRecord(rootOrigin.left, value); 
		else if (value > rootOrigin.value) 
			rootOrigin.right = addRecord(rootOrigin.right, value); 

		
		return rootOrigin; 
	} 

	
	private void inorder() { 
	orderedRecord(rootOrigin); 
	} 

	
	private void orderedRecord(Node rootOrigin) { 
		if (rootOrigin != null) { 
			orderedRecord(rootOrigin.left); 
			System.out.println(rootOrigin.value); 
			orderedRecord(rootOrigin.right); 
		} 
	} 

	
	
	
	public static void main(String[] args) {
		
		InsertIntoBST tree =  new InsertIntoBST();
		tree.insert(50); 
		tree.insert(30); 
		tree.insert(20); 
		tree.insert(40); 
		tree.insert(70); 
		tree.insert(60); 
		tree.insert(80); 
		tree.inorder(); 
	
	}

}
