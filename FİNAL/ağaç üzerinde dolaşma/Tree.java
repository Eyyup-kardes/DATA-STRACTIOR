public class Tree 
{
    Node root;
   
    Node newNode(int data){
        root=new Node(data);
        return root;

    }
    Node insert( Node root,int data )
    {
        if( root != null )
        {
            if( data< root.data )
            root.left = insert (root.left,data );
            else 
                root.right = insert( root.right,data );

                

        }
        else 
            root  = newNode(data);
             
        return root;
    
        
     }     


     void preOrder(Node root)
     {
        if(root != null )
        {
            System.out.println (root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
     }



     void postOrder(Node root)
     {
        if(root != null )
        {
            System.out.println (root.data + " ");
            postOrder(root.left);
            postOrder(root.right);
        }
     }

     void inOrder(Node root)
     {
        if(root != null )
        {
            System.out.println (root.data + " ");
            inOrder(root.left);
            inOrder(root.right);
        }
     }
    }




   

