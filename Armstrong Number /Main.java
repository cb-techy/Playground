#include <stdio.h>
int main() {
  int i, n, sum=0, sam;
  scanf("%d", &n);
  sam = n;
  while(sam!=0){
  	sum+=((sam%10)*(sam%10)*(sam%10));
    sam/=10;
  }
  if(sum==n) {
  	printf("Armstrong Number");
  } else {
  	printf("Not an Armstrong Number", sum);
  }
	return 0;
}