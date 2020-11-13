/*
 * @Author: Weidows
 * @Date: 2020-09-25 19:40:22
 * @LastEditors: Weidows
 * @LastEditTime: 2020-10-18 00:02:57
 * @FilePath: \Weidows\C++\homework\ing\Data_Struct.c
 * @Description:main()里面一次性调用所有函数有点混乱,都给注释掉了,想用哪个消掉注释就好,函数间无干扰
 */

//!库
#include <math.h>
#include <stdio.h>
#include <stdlib.h> //*system,malloc...
#include <string.h>

//!函数 && struct && typedef
//2.里面的整数个数
#define SIZE 3

//3.里的结构体
typedef struct
{
  int year;
  int month;
  int day;
} Date;

//1.
char *str_combine(char *s1, const char *s2)
{
  char *s3 = (char *)malloc(strlen(s1) + strlen(s2) + 1);
  char *pointer = s3;
  while (*s1 != '\0')
  {
    *pointer++ = *s1++;
  }
  while (*s2 != '\0')
  {
    *pointer++ = *s2++;
  }
  *pointer = '\0';
  return s3;
}

//2.
void sort(int *args)
{
  for (int i = 0; i < SIZE - 1; i++)
  {
    for (int j = i + 1; j < SIZE; j++)
    {
      if (args[i] > args[j])
      {
        int tran = args[j];
        args[j] = args[i];
        args[i] = tran;
      }
    }
  }
}

//3.
int calculate_days(Date date)
{
  int ret = 0;
  int length_of_month[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  for (int i = 0; i < date.month - 1; i++)
  {
    ret += length_of_month[i];
  }
  return (date.year % 4 == 0 && date.year % 100 == 0 && date.year % 400 == 0) ? ret++ : ret;
}

/**
 * 思考
 * 只有一个for循环,时间复杂度为 O(n)
 */
int calculate(int n)
{
  int ret = 0;
  for (int i = 1; i <= n; i++)
  {
    ret += i;
  }
  return ret;
}

//main
int main()
{
  // 1.
  // char *s1 = "Hello", *s2 = "World";
  // printf("%s\n", str_combine(s1, s2));

  //2.
  // int args[SIZE];
  // printf("请输入%d个数字:", SIZE);
  // for (int i = 0; i < SIZE; i++)
  // {
  //   scanf("%d", &args[i]);
  // }
  // sort(args);
  // for (int i = 0; i < SIZE; i++)
  // {
  //   printf("%d\t", args[i]);
  // }

  //3.
  // Date date;
  // printf("按照格式输入: 年-月-日:");
  // scanf("%d-%d-%d", &date.year, &date.month, &date.day);
  // printf("第%d天", calculate_days(date));

  //思考
  // int n = 0;
  // printf("输入n:");
  // scanf("%d", &n);
  // printf("f(n) = %d", calculate(n));

  return 0;
}
