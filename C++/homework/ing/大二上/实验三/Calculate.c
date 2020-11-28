/*
 * @Author: Weidows
 * @Date: 2020-11-27 11:21:34
 * @LastEditors: Weidows
 * @LastEditTime: 2020-11-27 11:27:46
 * @FilePath: \Weidows\C++\homework\ing\大二上\实验三\Calculate.c
 * @Description:
 */
#include <assert.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>

#define INITSIZE 20
#define INCREMENT 10
#define MAXBUFFER 20
#define LEN sizeof(Elemtype)

/*栈的动态分配存储结构*/
typedef double Elemtype;
typedef struct
{
  Elemtype *base;
  Elemtype *top;
  int StackSize;
} SqStack;

/*初始化栈*/
void InitStack(SqStack *S)
{
  S->base = (Elemtype *)malloc(LEN * INITSIZE);
  assert(S->base != NULL);
  S->top = S->base;
  S->StackSize = INITSIZE;
}

/*压栈操作*/
void PushStack(SqStack *S, Elemtype c)
{
  if (S->top - S->base >= S->StackSize)
  {
    S->base = (Elemtype *)realloc(S->base, LEN * (S->StackSize + INCREMENT));
    assert(S->base != NULL);
    S->top = S->base + S->StackSize;
    S->StackSize += INCREMENT;
  }
  *S->top++ = c;
}
/*求栈长*/
int StackLength(SqStack *S)
{
  return (S->top - S->base);
}
/*弹栈操作*/
int PopStack(SqStack *S, Elemtype *c)
{
  if (!StackLength(S))
  {
    return 0;
  }
  *c = *--S->top;
  return 1;
}

void CalFunction(SqStack *S, char str[])
{ /*实现浮点型数据后缀表达式的加减乘除*/
  Elemtype number, e, d;
  char arr[MAXBUFFER];
  int i = 0, j = 0;

  InitStack(S);

  while (str[i] != '\0')
  {
    while (isdigit(str[i]) || str[i] == '.') //过滤数字
    {
      arr[j++] = str[i++];
      arr[j] = '\0';

      if (j >= MAXBUFFER)
      {
        printf("输入单个数据过大！\n");
        return;
      }
      if (str[i] == ' ')
      {
        number = atof(arr);   //利用atof函数将数字字符串转化为double型数据
        PushStack(S, number); //将转换的数进行压栈
        j = 0;                //这里不要忘记将j重新初始化进行下个数据的转化
        break;
      }
    }
    /*如果遇到操作运算符则，弹出两个数据进行运算，然后将得出的结果重新入栈*/
    switch (str[i])
    {
    case '+':
      PopStack(S, &e);
      PopStack(S, &d);
      PushStack(S, d + e);
      break;
    case '-':
      PopStack(S, &e);
      PopStack(S, &d);
      PushStack(S, d - e);
      break;
    case '*':
      PopStack(S, &e);
      PopStack(S, &d);
      PushStack(S, d * e);
      break;
    case '/':
      PopStack(S, &e);
      PopStack(S, &d);
      if (e == 0)
      {
        printf("输入出错，分母为零！\n");
        return;
      }
      PushStack(S, d / e);
      break;
    }
    i++; //继续遍历直到遍历字符串结束
  }

  PopStack(S, &e);
  printf("计算结果为：%lf", e);
}

int main()
{
  char str[100];
  SqStack S;

  CalFunction(&S, gets(str));
  return 0;
}

// 输入：5 8 6 7 + * - 9 4 / +

// 输出： - 96.750000
