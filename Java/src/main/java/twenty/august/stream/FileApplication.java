/*
 * @Author: Weidows
 * @Date: 2020-10-29 00:01:05
 * @LastEditors: Weidows
 * @LastEditTime: 2020-10-29 00:11:58
 * @FilePath: \Weidows\Java\src\main\java\twenty\august\stream\FileApplication.java
 */
package twenty.august.stream;

import java.io.File;

/**
 * 递归获取目录下所有文件名
 */
public class FileApplication {
  public static void run(File file) {
    if (file.isFile()) {
      System.out.println(file.getAbsolutePath() + "\t" + file.getPath());
    } else {
      File[] files = file.listFiles(); //获取目录下的东西
      if (files != null && files.length > 0) {
        for (File f : files) {
          run(f);
        }
      }
    }
  }

  public static void main(String[] args) {
    File file = new File("./Java/src/main/java/twenty/august/stream");
    run(file);
  }
}
