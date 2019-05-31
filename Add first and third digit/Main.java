#include<stdio.h>
int main()
{
  int a, f, t;
  scanf("%d", &a);
  f=a/100;
  t=a%10;
  printf("%d", f+t);
  return 0;
}