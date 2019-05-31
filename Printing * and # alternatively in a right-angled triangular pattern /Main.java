#include <stdio.h>
int main(){
  int i, j, n, c=1;
  scanf("%d", &n);
  for(i=0;i<n;i++) {
  	for(j=0;j<=i;j++){
    	if(c++%2==0) printf("#");
      else printf("*");
    }
    printf("\n");
  }
  	return 0;
}