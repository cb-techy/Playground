#include <stdio.h>
int main() {
  int n, i, j, k, v1, v2;
  scanf("%d", &n);
  for(i=0;i<n;i++) {
    	if((i+1)%2 != 0) {
        	for(k=0;k<n-1;k++) {
            	printf("%d", i+1);
            }
          printf("%d\n", i+2);
        } else {
          printf("%d", i+2);
        	for(k=0;k<n-1;k++) {
            	printf("%d", i+1);
            }
          printf("\n");
        }
  }
	return 0;
}