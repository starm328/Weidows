/*
 * @Author: Weidows
 * @Date: 2020-07-29 23:06:22
 * @LastEditors: Weidows
 * @LastEditTime: 2020-08-06 11:39:56
 * @FilePath: \Weidows\Java\src\main\java\twenty\july\exception\LatestArrayIndex.java
 */
package twenty.july.exception;

public class LatestArrayIndex {
  public LatestArrayIndex() throws OpenException { // !构造函数

  }

  public void f() throws OpenException {
  }
}

class NewCloseException extends OpenException {

  /**
   *
   */
  private static final long serialVersionUID = 1L;
}

class NewException extends Exception {

  /**
   *
   */
  private static final long serialVersionUID = 1L;
}

class NewClass extends LatestArrayIndex {
  /**
   * *子类重写函数,throws不能超过父类中对应函数throws的范围
   * *构造函数相反,子类构造函数必须throws父类构造函数的所有Exception
   */
  public NewClass() throws OpenException {//!子类构造函数throws范围大
  }

  public void f() throws NewCloseException {//*比父类throws范围小
  }

  public static void main(String[] args) {
    // ? 向上造型,p调用的是子类NewClass中的函数(多态)
    try {
      LatestArrayIndex p = new NewClass();//*NewClass可能有异常
      System.out.println(p);  //默认toString输出p的package和内存ID
    } catch (OpenException e) {
      e.printStackTrace();
    }
  }
}