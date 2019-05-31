#include <stdio.h>
int main() {
  int n,i, val=1;
  scanf("%d", &n);
  for(i=1;val<=n;i++){
  	if(i%2==1) {
      val++;
      printf("%d\n", i);
    }
  }
  return 0;
}