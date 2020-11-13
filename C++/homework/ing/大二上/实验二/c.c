/*
 * @Author: Weidows
 * @Date: 2020-11-13 14:34:42
 * @LastEditors: Weidows
 * @LastEditTime: 2020-11-14 00:13:30
 * @FilePath: \Weidows\C++\homework\ing\大二上\实验二\c.c
 * @Description:实验二
 */

#include <stdio.h>
#include <stdlib.h>

//全局变量
const int set1[] = {3, 8, 5, 11},
          set2[] = {22, 6, 8, 3, 15, 11, 20};

void main()
{
  // 获取两组大小
  int size1 = sizeof(set1) / sizeof(set1[0]),
      size2 = sizeof(set2) / sizeof(set2[0]),
      size3 = 0,
      size4 = 0;

  /*定义与或组 + 两组大小.set3是或,set4是与 */
  int set3[sizeof(set1) / sizeof(set1[0])] = {0},
                          set4[sizeof(set1)] = {0};

  //求交集,开始遍历
  for (int i = 0; i < size1; i++)
  {
    for (int j = 0; j < size2; j++)
    {
      if (set1[i] == set2[j])
      {
        set4[size4++] = set2[j];
      }
    }
  }

  /* 求并集 */
  for (int i = 0; i < size1; i++)
  {
    for (int j = 0; j < size3; j++)
    {
      if (set1[i] == set3[j])
      {
        break;
      }
      else
      {
        set3[size3++] = set1[i];
      }
    }
  }

  // for (int i = 0; i < size4; i++)
  // {
  //   printf("%d ", set4[i]);
  // }
  for (int i = 0; i < size3; i++)
  {
    printf("%d ", set3[i]);
  }
}
