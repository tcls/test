package test;
//创建一个小窗口，在小窗口可以输入输出，可以结束窗口
//可以以此为模版，写一个计算器
import java.awt.*;
import java.awt.event.*;
public class TestTextField {
 public static void main(String[] args) {
  MyTestField mtf = new MyTestField();
  }
 }
class MyTestField extends Frame {
 TextField tf1,tf2;
 MyTestField() {
  super("test");
    tf1 = new TextField(10);
    tf2 = new TextField(10);
  Button b1 = new Button("确定");
  b1.addActionListener(new Monitor());
  Label lb1 = new Label("输入");
  Button b2 = new Button("结束");
  b2.addActionListener(new Stoper());
  add(lb1);add(tf1);add(b1);add(b2);add(tf2);
  pack();
  setLayout(new FlowLayout());
  setSize(200,200);
  setVisible(true);
  }
 class Stoper implements ActionListener{
     public void actionPerformed(ActionEvent e) {
         setVisible(false);
         System.exit(0);
         }
 }
  class Monitor implements ActionListener {
   public void actionPerformed(ActionEvent e) {
    tf2.setText(tf1.getText());
    tf1.setText("");
    }
 }  
  
}