package test;

public abstract class Shape {
    {
        System.out.println("正在初始化Shape类。。。");
    }
        public String name;
        public String color;
        public  Shape(){};
        public  Shape(String name,String color){
            System.out.println("正在执行构造Shape类。。。");
            this.color=color;
            this.name=name;
        };
        public void setname(String name){
          this.name=name;
         };
        public String getname(){
           return this.name;
        };
        public void setcolor(String color){
            this.color=color;
           };
        public String getcolor(){
            return this.color;
         };
         public abstract double circumference();
}
