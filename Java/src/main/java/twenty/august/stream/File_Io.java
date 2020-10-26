/*
 * @Author: Weidows
 * @Date: 2020-10-26 23:44:44
 * @LastEditors: Weidows
 * @LastEditTime: 2020-10-26 23:56:17
 * @FilePath: \Weidows\Java\src\main\java\twenty\august\stream\File_Io.java
 */
package twenty.august.stream;

import java.io.File;

/**
 * File类只能对文件层面进行操作,如果涉及到文件内容,就需要用到输入/输出流了
 */
public class File_Io {
  public static void main(String[] args) {
    //f就是实例化的1.txt
    File f_1 = new File("./Java/src/main/java/twenty/august/stream/1.txt");
    //第二种构造器,其实就是把路径分段了
    File f_2 = new File("./Java/src/main/java", "twenty/august/stream/1.txt");
    //这种不指定文件而是目录的话也可以,对象是这个目录
    File f_3 = new File("./Java/src/main/java/twenty/august/stream");

    System.out.println(f_1.getName() + "\t" + f_2.getName()+ "\t"+f_3.getName()); //Perfect!
  }
}
