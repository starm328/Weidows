/*
 * @Author: Weidows
 * @Date: 2020-07-25 22:03:37
 * @LastEditors: Weidows
 * @LastEditTime: 2020-07-25 23:11:26
 * @FilePath: \Weidows\Java\src\main\java\twenty\july\exception\ArrayIndex.java
 */ 
package twenty.july.exception;

public class ArrayIndex {
  public static void f() {
    int[] a = new int[10];
    a[10] = 10; //!异常产生处
    System.out.println("hello");
  }

  public static void g() {
    f();
  }

  public static void h() {
    int i = 10;
    if (i < 100) {
      g();
    }
  }

  public static void k() {
    try{  //检测h()是否存在异常
      h();
    }catch(NullPointerException e){
      System.out.println("错误的异常");
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("正确的异常");
      throw e;  //?抛出异常,也就是令程序仍存在这个异常状态
    }
  }
  public static void main(String[] args) {
    /**
     * ?try-catch异常捕捉
     * *捕捉到catch对应的异常后执行catch后面的指令
     * *若异常无对应的catch,则try-catch也判定异常
     * !try所有异常都得到对应catch才能判定无异常,除非在catch中throw出异常
     */
    try{
      k();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("caught");
      System.out.println(e.getMessage());
      System.out.println(e);
      e.printStackTrace();
    }
    System.out.println("Over");
  }
}
