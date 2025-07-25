package Tree_4;
//complexity - O(n)
 class Traversal_Pre_Post_InOrder {
     static class Node {
         int data;
         Node left;
         Node right;

         Node(int data) {
             this.data = data;
             this.left = null;
             this.right = null;
         }
     }
         static class BinaryTree {
             static int idx = -1;

             public static Node buildTree(int nodes[]) {
                 idx++;
                 if (nodes[idx] == -1) {
                     return null;
                 }
                 Node newNode = new Node(nodes[idx]);
                 newNode.left = buildTree(nodes);
                 newNode.right = buildTree(nodes);
                 return newNode;
             }
         }
 //Traversal preorder tree
     public static void preorder(Node root) {
         if(root == null) {
             return;
         }
         System.out.print(root.data+" ");
         preorder(root.left);
         preorder(root.right);
     }
//Traversal Inorder tree
public static void inorder(Node root) {
    if(root == null) {
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}
//Traversal Postorder tree
public static void postorder(Node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    public static void main(String[] args) {
         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
         BinaryTree tree = new BinaryTree();

         Node root = tree.buildTree(nodes);
         preorder(root);
         System.out.println();

         inorder(root);
         System.out.println();

         postorder(root);
        System.out.println();
     }
}
