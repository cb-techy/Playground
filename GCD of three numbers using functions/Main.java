#include <stdio.h>
int gcd(int, int);
int main() {
  int a, b, c, gc;
  scanf("%d%d%d", &a, &b, &c);
  gc = gcd(a, b);
  gc = gcd(gc, c);
  printf("%d", gc);
  return 0;
}
int gcd(int a, int b) {
	int i, gc;
  for(i=1;i<=a;i++) {
  	if(a%i==0 && b%i==0) gc = i;
  }
  return(gc);
}