/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeinverse;

public class Treeinverse {
    node root;
class node
{
    int key;
    node left,right;
    node(int key)
    {
    this.key=key;
    right=left=null;
    }
}
 void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
   
    node insertRec(node root, int key) { 
  
      
        if (root == null) { 
            root = new node(key); 
            return root; 
        } 
  
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        return root; 
    } 
public void print()
{
   printn(root);
}
void printn(node root)
{
  node f=root;
    if(f.left!=null)
    {
        System.out.println(f.key);
        printn(f.left);
    }
    else if(f.right!=null)
    {
        System.out.println(f.key);
        printn(f.left);
    }
}

    public static void main(String[] args) {
        Treeinverse tree=new Treeinverse();
        tree.insert(40); 
        tree.insert(20); 
        tree.insert(35); 
        tree.insert(30); 
        tree.insert(80); 
        tree.insert(50); 
        tree.insert(70);                             
        tree.print();
    }
    
}
