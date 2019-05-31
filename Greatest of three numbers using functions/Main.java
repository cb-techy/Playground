#include <stdio.h>
int grt(int, int);
int main(){
  int a, b, c, great;
  scanf("%d%d%d", &a, &b, &c);
  great = grt(a,b);
  great = grt(great, c);
  printf("%d", great);
  return 0;
}
int grt(int a, int b) {
	return(a>b?a:b);
}