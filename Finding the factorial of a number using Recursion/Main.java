#include<stdio.h>
int func(int x) {
  if(x==1) return 1;
  else x*=func(x-1);
  return x;
}

int main(){
  int n;
  scanf("%d", &n);
  n = func(n);
  printf("%d", n);
  return 0;
}