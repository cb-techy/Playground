#include<stdio.h>
#include <stdbool.h>
bool isPrime(int n);
int main(){
  int n, i;
  scanf("%d", &n);
  for(i=2;i<=n;i++) {
  	if(isPrime(i)) {
    	printf("%d\n", i);
    }
  }
  return 0;
}
 bool isPrime(int n) {
   int i, is=1;
   for(i=2;i<n;i++) {
   	if(n%i==0) is=0;
   }
   if(is==0) return false;
   return true;
 }