/*
 * @Author: Weidows
 * @Date: 2020-09-12 13:10:29
 * @LastEditors: Weidows
 * @LastEditTime: 2020-09-18 23:27:51
 * @FilePath: \Weidows\Java\src\main\java\twenty\september\jvm_model\Instanceof.java
 */
package twenty.september.jvm_model;

public class Instanceof {
  public static void main(String[] args) {
    /**
     * instanceof操作符,判断对象是否由某个类(或子类,不能是父类)实例化
     */
    Student s = new Student();
    Person p = new Person();
    //正常判断
    System.out.println(s instanceof Student);
    System.out.println(p instanceof Person);
    
    //s由Student实例化,Student是Person的子类,没问题.
    System.out.println(s instanceof Person);
    //Person是Student的父类,不对劲.
    System.out.println(p instanceof Student);

    /**
     * .equals()判断的是对象在堆内存中是否是同一数据
     * 创造对象时每new一次会在堆内存创建新对象数据
     * 而像是Person pr = pp这种是栈数据的复制,所指对象相同
     */
    Person pp = new Person();
    Person pe = new Person();
    Person pr = pp;
    System.out.println("pp是否与pe是同一个对象:" + pp.equals(pe));
    System.out.println("pp是否与pr是同一个对象:" + pp.equals(pr));
  }
}
