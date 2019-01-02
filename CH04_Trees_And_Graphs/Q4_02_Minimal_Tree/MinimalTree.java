class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int x) {val = x;}
}

class MinimalTree {
	public static TreeNode createMinimalBST(int[] array) {
		return createMinimalBST(array,0,array.length-1);
	}
	public static TreeNode createMinimalBST(int[] array, int start, int end) {
		if (end < start) return null;
		int mid = (start + end)/2;
		TreeNode root = new TreeNode(array[mid]);
		root.left = createMinimalBST(array,start,mid-1);
		root.right = createMinimalBST(array,mid+1,end);
		return root;
	}
}