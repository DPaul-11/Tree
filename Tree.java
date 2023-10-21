package Binarysearchtree;
import javax.swing.tree.TreeNode;
import java.util.*;

public class Tree {

    public TreeNode root;
    public class TreeNode
    {
        public TreeNode left;
        public TreeNode right;
        public int data;
        public TreeNode(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public void BinaryTree()
    {
        TreeNode first=new TreeNode(7);
        TreeNode second=new TreeNode(5);
        TreeNode third=new TreeNode(3);
        TreeNode fourth=new TreeNode(2);
        TreeNode fifth=new TreeNode(6);

        root=first;
        root.left=second;
        root.right=third;
        second.left=fourth;
        second.right=fifth;
    }
    public void preOrder_display(TreeNode root)
    {
        TreeNode curr_root=root;
        System.out.print(curr_root.data);
        if(curr_root.left!=null)
        {
            preOrder_display(curr_root.left);
        }
        if(curr_root.right!=null)
        {
            preOrder_display(curr_root.right);
        }
    }
    public void postOrder_display(TreeNode root)
    {
        TreeNode curr_root=root;

        if(curr_root.left!=null)
        {
            postOrder_display(curr_root.left);
        }
        if(curr_root.right!=null)
        {
            postOrder_display(curr_root.right);
        }
        System.out.print(curr_root.data);
    }
    public void inOrder_display(TreeNode root)
    {
        TreeNode curr_root=root;

        if(curr_root.left!=null)
        {
            inOrder_display(curr_root.left);
        }
        System.out.print(curr_root.data);
        if(curr_root.right!=null)
        {
            inOrder_display(curr_root.right);
        }

    }


    public static void main(String[] args) {
        Tree ob=new Tree();
        TreeNode root=null;
        ob.BinaryTree();
        ob.preOrder_display(root);
        ob.postOrder_display(root);
        ob.inOrder_display(root);
    }
}
