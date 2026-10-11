import java.util.LinkedList;
import java.util.Queue;

public class sumsOfNodes
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
    public static class buildTree
    {
        public static int idx = -1;
        public static Node build(int nodes[])
        {
            idx++;
            if( nodes[idx] == -1)
            {
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }
        public static void levelorderDisplay(Node root)
        {
            if( root == null)
            {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty())
            {
                Node curr = q.remove();
                if( curr == null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curr.data + " ");

                    if(curr.left != null)
                    {
                        q.add(curr.left);
                    }

                    if(curr.right != null)
                    {
                        q.add(curr.right);
                    }
                }
            }
        }
        public static int sumsNodes(Node root)
        {
            if( root == null)
            {
                return 0;
            }

            int leftNodes = sumsNodes(root.left);
            int rightNodes = sumsNodes(root.right);
            int sum = leftNodes + rightNodes + root.data;

            return sum;
        }
    }
    public static void main(String arg[])
    {
        int[] node = {1,2,4,9,-1,-1,-1,5,-1,-1,3,6,10,-1,-1,-1,7,11,-1,-1,12,-1,-1};
        buildTree.idx = -1;
        Node root = buildTree.build(node);
        buildTree.levelorderDisplay(root);

        int sum = buildTree.sumsNodes(root);
        System.out.println("Sums Of All Nodes In Tree :"+sum);
    }     
}
