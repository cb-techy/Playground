#include <stdio.h>
int main() {
  int i,a;
  scanf("%d", &a);
  int sum=0, val = a;
  while(val!=0) {
  	sum+=(val%10);
    val/=10;
  }
  printf("%d", sum);
  return 0;
}