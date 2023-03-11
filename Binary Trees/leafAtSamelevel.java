public class leafAtSamelevel{
    static class Node{
        Node left;
        Node right;
        int data;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;

        }


    }

     
    public static boolean islevel(Node root, int level)
    {
        int levelOfLeaf=0;
        if(root==null)
	{
	    return true;    
	
    }
    if(root.left==null && root.right==null )
    {
        if(levelOfLeaf==0)
        {
            levelOfLeaf=level;
            return true;
        }
        else
        return levelOfLeaf==level;
    }
    return islevel(root.left, level+1) && islevel(root.right, level+1);
    }

    public static void main(String args[])
    {
        // int levelOfLeaf;
        Node root = new Node(1);
        root.left= new Node(2);
        root.right = new Node(3);
        root.left.left= new Node(4);
        // root.left.right = new Node(5);
        root.right.left= new Node (6);
        // root.right.left.left= new Node (62);
        
        root.right.right= new Node(7);
        // islevel(root, 1);
        System.out.println(islevel(root, 1));

    }
    
}
