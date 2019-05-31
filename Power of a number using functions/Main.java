#include<stdio.h>
int power(int a, int b) {
  int i, an=a;	
  for(i=1;i<b;i++) {
    	an=an*a;
    }
  return(an);
}
int main(){
  int ans, n, p;
  scanf("%d%d", &n, &p);
  ans = power(n, p);
  printf("%d", ans);
  return 0;
}