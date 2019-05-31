#include <stdio.h>
int main() {
  int i, n;
  scanf("%d", &n);
  for(i=1;i<=n;i++) {
  	printf("%d", i);
    if(i%3==0) printf(",");
  }
	return 0;
}