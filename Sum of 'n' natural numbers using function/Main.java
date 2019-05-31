#include<stdio.h>
int func(int a) {
	return(a*(a+1)/2);
}
int main() {
  int ans, x;
  scanf("%d", &x);
  ans = func(x);
  printf("%d", ans);
  	return 0;
}