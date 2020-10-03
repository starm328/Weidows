/*
 * @Author: Weidows
 * @Date: 2020-09-25 19:40:22
 * @LastEditors: Weidows
 * @LastEditTime: 2020-09-25 19:42:23
 * @FilePath: \Weidows\C++\homework\ing\两个自符串的连接.c
 */
#include <stdio.h>

char *str_combine(char *str1, char *str2)
{
  char *ret = NULL;
  char pointer = str1[0];
  int length = 0;

  for (int length; pointer != '\0'; length++)
  {
    ret[length] = pointer;
    pointer++;
  }

  pointer = str2[0];
  for (int length; pointer != '\0'; length++)
  {
    ret[length] = pointer;
    pointer++;
  }

  return ret;
}

int main()
{
  char *string_1, *string_2, *string_combine;
  scanf("输入两组字符串：%s %s", &string_1, &string_2);

  string_combine = str_combine(string_1, string_2);

  printf("%s", string_combine);
  return 0;
}