/* This Program implements following points
1. Create binary search tree using clases and objects in java
2. Insert element in BST 
3. Delete element from BST */
package binarysearchtree;

class  Node{
    char key;
    Node left, right;

    Node(char key){
        this.key=key;
    }
}
class BinarySolution{
    Node root;
    void insertkey(char key) {
        root = insertInTree(root,key);
    }
    Node insertInTree(Node root,char key) {
        if (root==null) {
            root = new Node(key);
            return root;

        }
        if (key< root.key) {
            root.left = insertInTree(root.left,key);
        } else if (key>root.key) {
            root.right = insertInTree(root.right,key);
        }
        return root;

    }
    void preordertraversal(Node root) {
        if (root!=null) {
            System.out.print(root.key+ " ");
            preordertraversal(root.left);
            preordertraversal(root.right);
        }
    }
}

public class BST {
    public static void main(String[] args) {
      BinarySolution t1 = new BinarySolution();
      t1.insertkey('C');
      t1.insertkey('I');
      t1.insertkey('B');
      t1.insertkey('G');
      t1.insertkey('M');
      t1.insertkey('A');

      t1.preordertraversal(t1.root);



    }
}
