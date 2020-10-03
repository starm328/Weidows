/*
 * @Author: Weidows
 * @Date: 2020-07-25 18:49:05
 * @LastEditors: Weidows
 * @LastEditTime: 2020-07-25 19:33:24
 * @FilePath: \Weidows\Java\src\main\java\twenty\july\class_schedule\kcb\KCB.java
 */ 
package twenty.july.class_schedule.kcb;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * !MVC设计模式:Model模型+View表现+Control控制
 * *这里TableModel就是Model,JTable是View+Control
 */
public class KCB {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JTable table = new JTable(new KCBData());
    JScrollPane pane = new JScrollPane(table);
    frame.add(pane);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}