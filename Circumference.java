package test;

public class Circumference {
public static void main(String[]args){
    Cfx cfx=new Cfx("������","green",5,4);
    Zfx zfx=new Zfx("������","green",4);
    System.out.println("�������ܳ��ǣ�"+cfx.circumference());
    System.out.println("�������ܳ��ǣ�"+zfx.circumference());
    System.out.println(cfx.getcolor()+cfx.getname());
    System.out.println(zfx.getcolor()+zfx.getname());
}
}
