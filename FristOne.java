package test;
import java.util.*;
import java.awt.Frame; 

public class FristOne extends Frame{  
    
    public void lunchFrame()  
    {  
        this.setLocation(200, 100);  
        this.setSize(800,600);  
        this.setVisible(true);
        Scanner scan=new Scanner(System.in);
        String trc=scan.nextLine();
    System.out.println(trc);
        this.setVisible(false);
        System.exit(0);
    
    }  
  
    private boolean isEmpty(String trc) {
        // TODO Auto-generated method stub
        return false;
    }

    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        FristOne win = new FristOne();  
        win.lunchFrame(); 
     
    }  
  
}  
/*public class FristOne {
    public static void main(String [] args)
    {
        @SuppressWarnings("resource")
        Scanner scan=new Scanner(System.in);
        String trc=scan.nextLine();
    System.out.println(trc);
    }
}*/
