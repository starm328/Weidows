/*
 * @Author: Weidows
 * @Date: 2020-07-29 23:06:22
 * @LastEditors: Weidows
 * @LastEditTime: 2020-10-20 22:13:16
 * @FilePath: \Weidows\Java\src\main\java\twenty\july\exception\LatestArrayIndex.java
 */
package twenty.july.exception;

//! 父类(throw SmallException)
public class LatestArrayIndex {
  public LatestArrayIndex() throws BigException {
  }

  public void f() throws BigException, SmallException {
  }
}

/// 异常类(小的)
class SmallException extends OpenException {
  private static final long serialVersionUID = 1L;
}

/// 异常类(大的)
class BigException extends Exception {
  private static final long serialVersionUID = 1L;
}

//! 子类(Override, throw BigException)
class NewClass extends LatestArrayIndex {
  /**
   * *子类重写函数,throws不能超过父类中对应函数throws的范围(编写时会报错提示)
   * *构造函数相反,子类构造函数必须throws父类构造函数的所有Exception
   */
  //! @Override 子类不能继承构造方法,不能Override
  public NewClass() throws BigException {
  }

  @Override
  public void f() throws SmallException {
  }
}

class Test {
  public static void main(String[] args) {
    try {
      //? NewClass可能有异常,向上造型(多态)
      LatestArrayIndex p = new NewClass();
      System.out.println(p);
    } catch (BigException e) {
      e.printStackTrace();
    }
  }
}
