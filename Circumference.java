package test;

public class Circumference {
public static void main(String[]args){
    Cfx cfx=new Cfx("长方形","green",5,4);
    Zfx zfx=new Zfx("正方形","green",4);
    System.out.println("长方形周长是："+cfx.circumference());
    System.out.println("正方形周长是："+zfx.circumference());
    System.out.println(cfx.getcolor()+cfx.getname());
    System.out.println(zfx.getcolor()+zfx.getname());
}
}
