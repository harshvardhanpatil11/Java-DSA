public class preorder 
{
    public static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class createTree
    {
        public static int idx = -1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx] == -1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        public static void preorderDisplay(Node root)
        {
            if( root == null)
            {
                return;
            }

            System.out.print(root.data + " ");
            preorderDisplay(root.left);
            preorderDisplay(root.right);
        }
    }
    public static void main(String arg[])
    {
        int[] nodes = {1, 2, 3, -1, -1, 4, -1, -1,5, -1, 6, 7, -1, -1, -1};
        createTree.idx = -1;

        Node root = createTree.buildTree(nodes);

        System.out.println("Root Of Tree: " + root.data);   

        createTree.preorderDisplay(root);
    }
}
