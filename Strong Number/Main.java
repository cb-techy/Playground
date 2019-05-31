#include <stdio.h>
int fact(int n) {
  int mult=1, i;
  for(i=1;i<=n;i++) {
  	mult*=i;
  }
  return(mult);
}
int main() {
  int fin=0, sam, i, n;
  scanf("%d", &n);
  sam = n;
  while(sam!=0) {
  	fin+=fact(sam%10);
    sam/=10;
  }
  
  if(fin==n) printf("Yes");
  else printf("No");
	return 0;
}