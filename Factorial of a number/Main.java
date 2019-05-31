#include <stdio.h>
int main() {
  int mult=1, i, n;
  scanf("%d", &n);
  for(i=1;i<=n;i++) {
  	mult*=i;
  }
  printf("%d", mult);
	return 0;
}