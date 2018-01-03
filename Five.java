package test;

public class Five {
    public static void main(String[] args) {
         Three three=new Three();
         three.oneout();
         three.twoout();
         
         FOUR four=new FOUR();
         four.oneout();
         four.twoout();
         
         FOUR five=new Three();
         five.oneout();
         five.twoout();
         System.out.println(three.name);
         System.out.println(four.name);
         System.out.println(five.name);
         System.out.println(three  instanceof FOUR);
    }
}
