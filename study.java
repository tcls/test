package test;
//�༭һ���������������
public class study {
	 study left;
	   study right;
	    int val;
	    study(int val){
	        this.val=val;
}
	    static int getDepth(study root){
	        if(root==null){
	            return 0;
	        }
	        int left=getDepth(root.left);
	        int right=getDepth(root.right);
	        return left>right?left+1:right+1;
	    }
	    static void scanNodes(study root){
	        if(root==null){
	            return;
	        }
	        System.out.println(root.val); //�������
	        scanNodes(root.left);
	        //System.out.println(root.val); �������
	        scanNodes(root.right);
	        //System.out.println(root.val); �������
	    }
	    
	    public static void main(String[] args) 
	    {
	        study root=new  study(1);
	        study b1=new  study(1);
	        study b2=new  study(2);
	        study c1=new  study(3);
	        study c2=new  study(4);
	        //����һ����
	        root.left=b1;
	        root.right=b2;
	        b1.right=c1;
	       c1.left=b2;
	        scanNodes(root);
	        System.out.println("��������ǣ�"+getDepth(root));
	         
	    }
	}   
	    
	    
	    
	    
	    
	    
	    