#include <stdio.h>
int main() {
  int i,a;
  scanf("%d", &a);
  int sum=a%10;
  while(a/10!=0) {
    a/=10;
  }
  sum+=a%10;
  printf("%d", sum);
  return 0;
}