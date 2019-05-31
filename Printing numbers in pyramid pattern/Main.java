#include <stdio.h>
int main() {
  int i, j, n, v=1;
  scanf("%d", &n);
  for(i=0;i<n;i++) {
  	for(j=0;j<n-i-1;j++) {
    	printf(" ");
    }
    for(j=0;j<=i;j++) {
    	printf("%d ", v++);
    }
    printf("\n");
  }
	return 0;
}