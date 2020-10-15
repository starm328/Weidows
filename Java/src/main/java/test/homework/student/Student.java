/*
 * @Author: Weidows
 * @Date: 2020-10-07 18:48:40
 * @LastEditors: Weidows
 * @LastEditTime: 2020-10-07 19:33:52
 * @FilePath: \Github\Weidows\Java\src\main\java\test\homework\student\Student.java
 */
package test.homework.student;

public class Student {
  private String name;
  private int score;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public Student() {

  }

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public static void main(String[] args) {
    Student stu_1 = new Student();
    stu_1.setName("张三");
    stu_1.setScore(1);

    Student stu_2 = new Student("李四", 2);

    System.out.println("stu_1\tName:" + stu_1.getName() + "\tscore:" + stu_1.getScore() + "\nstu_2\tName:"
        + stu_2.getName() + "\tscore:" + stu_2.getScore());
  }
}
