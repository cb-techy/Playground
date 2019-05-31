#include <stdio.h>
int main() {
  int n, i, j;
  scanf("%d", &n);
  for(i=0;i<(n/2);i++) {
  	for(j=0;j<i;j++) {
    	printf(" ");
    }
    printf("*");
    
    for(j=n-(2*(i+1)); j>0;j--) {
    	printf(" ");
    }
    
    printf("*");
    for(j=0;j<i;j++) {
    	printf(" ");
    }
    printf("\n");
  }
  for(i=0;i<n/2;i++) {
  	printf(" ");
  }
  printf("*\n");
  
  for(i=n/2;i>0;i--) {
  	for(j=0;j<i-1;j++) {
    	printf(" ");
    }
    printf("*");
    for(j=n-(2*(i+1))+1; j>=0;j--) {
    	printf(" ");
    }
    printf("*\n");
  }
  
  return 0;
}