/*
* @Author: Weidows
* @Date: 2020-10-14 23:55:07
 * @LastEditors: Weidows
 * @LastEditTime: 2020-10-15 09:17:54
 * @FilePath: \Github\Weidows\Java\src\main\java\twenty\october\template_pattern\Template.java
*/

package twenty.october.template_pattern;

public abstract class Template {
  public abstract void code();

  public final void getTime() {
    long start = System.currentTimeMillis();
    code();
    long end = System.currentTimeMillis();

    System.out.println("code执行时间:" + (end - start));
  }
  public static void main(String[] args) {
    Template template;
  }
}
