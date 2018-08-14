package cn.hzy.structurePattern.composite;

public class Tree {

	TreeNode root = null;
	
	public Tree(String name) {
		root = new TreeNode(name);
	}
	
	/**
	 * 在本例中
	 * 构建了一棵树tree 树有一个主干 root  root也是枝的一种
	 * 主干上有个分枝nodeB 
	 * 分支nodeB还有一个分支nodeC
	 * 
	 * 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
	 * @param args
	 */
	public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		
		nodeB.addChildren(nodeC);
		
		tree.root.addChildren(nodeB);
		
	}
	
	//使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。

}
