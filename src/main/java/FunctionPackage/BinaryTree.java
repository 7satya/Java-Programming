package FunctionPackage;

class Node
{
    public int key;
    public Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

public class BinaryTree {
    public Node root;

    // Constructors
    BinaryTree(int key)
    {
        root = new Node(key);
    }

    public BinaryTree()
    {
        root = null;
    }

    public void createBinaryTree() {
        BinaryTree btree = new BinaryTree();
        btree.root = new Node(1);
        btree.root.left = new Node(2);
        btree.root.right = new Node(3);

        btree.root.left.left = new Node(4);
    }
}
