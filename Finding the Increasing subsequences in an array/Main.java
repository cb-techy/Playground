#include<stdio.h>
int main(){
  int i, j, n;
  scanf("%d", &n);
  int arr[n];
  for(i=0;i<n;i++) {
  	scanf("%d", &arr[i]);
  }
  for(i=0;i<n;i++) {
  	for(j=i;j<n;j++) {
    	if(arr[j]>arr[i]) {
        	printf("%d,%d\n", arr[i], arr[j]);
        }
    }
  }
  return 0;
}