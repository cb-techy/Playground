#include<stdio.h>
int func(int a) {
	return(a*a);
}
int main() {
  int sq, x;
  scanf("%d", &x);
  sq = func(x);
  printf("%d", sq);
   return 0;
}