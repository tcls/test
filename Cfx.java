package test;

public class Cfx extends Shape {
    private double length;
    private double wide;
    public double circumference(){
        return length*wide;
    };
    public Cfx(String name,String color,double length,double wide){
        super(name, color);
        System.out.println("正在执行构造Cfx类。。。");       
        this.length=length;
        this.wide=wide;
    }; 
    public void setlength(double length){
        this.length=length;
    };
    public double getlength(){
        return length;
    };
    public void setwide(double wide){
        this.wide=wide;
    };
    public double getwide(){
        return wide;
    };
}
