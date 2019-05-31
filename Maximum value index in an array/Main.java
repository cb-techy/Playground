#include <stdio.h>
int main(){
  int i, n, max=0, ind;
  scanf("%d", &n);
  int arr[n];
  for(i=0;i<n;i++) {
  	scanf("%d", &arr[i]);
    if(arr[i]>max) {
      max=arr[i];
      ind=i;
    }
  }
  printf("%d", ind);  
  return 0;
}